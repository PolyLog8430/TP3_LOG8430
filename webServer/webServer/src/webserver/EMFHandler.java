package webserver;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import modelWebserver.ModelWebserverFactory;
import modelWebserver.impl.ModelWebserverFactoryImpl;

public class EMFHandler extends AbstractHandler {

	private final EObject root;

	public EMFHandler(EObject root) {
		this.root = root;
	}

	/**
	 * Check authorization credentials
	 * @param httpReq request
	 * @return is authorized or not
	 */
	private boolean getAuthenticateUser(HttpServletRequest httpReq){
		String authorization = httpReq.getHeader("Authorization");
		
		if(authorization != null && authorization.startsWith("Custom")){
			String username = authorization.substring("Custom".length()).trim();
			
			//TODO compare username with resource ...
			Activator.getDefault().getLog().log(new Status(Status.INFO,Activator.PLUGIN_ID,"User to authorized : "+username));
		}
		
		return true;
	}

	/**
	 * Handle GET request
	 * @param path URI 
	 * @param httpReq request
	 * @param httpResp response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void getRequest(String path, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {

		if(!getAuthenticateUser(httpReq)){
			writeResponse(httpResp, "Error -> Unauthorized", HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}
		
		String[] fragments = path.split("/");
		Object context = root;

		for (int i = 0; i < fragments.length; i++) {
			String fragment = fragments[i];
			if (fragment.isEmpty())
				continue;
			// should be avoided. inefficient
			int position;
			try {
				position = Integer.parseInt(fragment);
			} catch (Exception e) {
				position = Integer.MIN_VALUE;
			}

			if (position == Integer.MIN_VALUE) {
				// match feature
				EObject eobject = (EObject) context;
				// find the feature
				EStructuralFeature feature = eobject.eClass().getEStructuralFeature(fragment);
				if(feature == null){
					writeResponse(httpResp, "Error -> Classe specifie dans l'url non disponible dans le modele ", HttpServletResponse.SC_NOT_FOUND);
					return;
				}
				
				// call reflexively
				Activator.getDefault().getLog().log(new Status(Status.INFO,Activator.PLUGIN_ID,"Requested feature Name  : "+feature.getName()));
				context = eobject.eGet(feature);

				// Get filtering parameters and apply it to feature
				if (context instanceof EList) {
					String filterURL = httpReq.getQueryString();
					if (filterURL != null) {
						String[] args = filterURL.split("&");
						String[][] filters = new String[args.length][2];
						
						// Extarct filters from query string into an array
						int j = 0;
						for (String filter : args) {
							String[] a = filter.split("=");
							filters[j][0] = a[0];
							filters[j][1] = (a.length == 2) ? a[1] : "";
							j++;
						}
						
						// Apply on list
						EList list = (EList) context;
						EList listFiltered = new BasicEList<>();
						for (Object o : list) {
							EObject eo = (EObject) o;
							boolean add = true;
							for (String[] filter : filters) {
								EStructuralFeature method = eo.eClass().getEStructuralFeature(filter[0]);
								if (method != null) {
									add &= (filter[1].equals(eo.eGet(method)));
								}
							}
							if (add) {
								listFiltered.add(o);
							}
						}

						context = listFiltered;
					}
				}

			} else if (context instanceof EList) {
				EList list = (EList) context;
				if(position >= 0 && position < list.size()){
					context = list.get(position);
				}
				else{
					writeResponse(httpResp, "Error -> Position specifie dans l'url est non disponible dans le modele ", HttpServletResponse.SC_NOT_FOUND);
					return;
				}
			}

		}
		
		// Format output into JSON format
		Object json;
		if(context instanceof EList){
			json = new JSONArray(((EList) context).toArray());
		}
		else{
			json = new JSONObject(context);
		}
		
		httpResp.setStatus(HttpServletResponse.SC_OK);
		httpResp.getWriter().print(json);

		httpResp.flushBuffer();
	}

	/**
	 * Handle POST request
	 * @param path URI
	 * @param httpReq request
	 * @param httpResp response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void postRequest(String path, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {

		if(!getAuthenticateUser(httpReq)){
			writeResponse(httpResp, "Error -> Unauthorized", HttpServletResponse.SC_UNAUTHORIZED);
			return;
		}
		
		String[] fragments = path.split("/");
		Object context = root;

		// Feature to add
		EStructuralFeature feature = null;
		EReference eRef = null;

		String allBody = "";
		String body;

		// Get body content
		while ((body = httpReq.getReader().readLine()) != null) {
			allBody += body;
		}
		System.out.println(allBody);

		if (allBody.equals("")) {
			// No body, send error
			writeResponse(httpResp, "Error -> Body vide", HttpServletResponse.SC_PRECONDITION_FAILED);
			return;
		} else {
			// Get Post information

			String fragment = fragments[1];
			if (fragment.isEmpty()) {

				// No url indication regarding the model fragment to add
				writeResponse(httpResp, "Error -> Le type d'ajout desire n'a pas ete specifie dans l'url",
						HttpServletResponse.SC_BAD_REQUEST);
				return;
			}

			// match feature
			EObject eobject = (EObject) context;

			// find the class named "fragment" in the model
			feature = eobject.eClass().getEStructuralFeature(fragment);

			if (feature == null) {
				writeResponse(httpResp, "Error -> Classe specifie dans l'url non disponible dans le modele",
						HttpServletResponse.SC_BAD_REQUEST);
				return;
			}

			eRef = (EReference) feature;
			// call reflexively
			Activator.getDefault().getLog().log(new Status(Status.INFO,Activator.PLUGIN_ID,"Requested feature Name  : "+feature.getName()));
			context = eobject.eGet(feature);

			ModelWebserverFactory modelFactory = ModelWebserverFactoryImpl.eINSTANCE;

			// Instantiate object of requested class
			EObject eObject = modelFactory.create(eRef.getEReferenceType());
			Activator.getDefault().getLog().log(new Status(Status.INFO,Activator.PLUGIN_ID,"Instanciated  : "+eObject.toString()));

			// Parse json body and find keys
			JSONObject json = null;
			try {
				json = new JSONObject(allBody);
			} catch(JSONException e) {
				writeResponse(httpResp, "Erreur de parsage du json. Le json : " + allBody + " est incorrect !", HttpServletResponse.SC_BAD_REQUEST);
				return;
			}
			
			String availableFeatures = new String();
			for (EStructuralFeature e : eObject.eClass().getEStructuralFeatures()) {
				availableFeatures += e.getName() + " of type " + e.getEType().getName() + "\n";
			}

			Iterator<String> iterator = json.keys();
			LinkedList<String> validVariables = new LinkedList<String>(); 
			
			// Iterate over json variable and find equivalent in the class
			while (iterator.hasNext()) {
				String next = iterator.next();
				
				// No corresponding variable in the model class, exit
				if(eObject.eClass().getEStructuralFeature(next) == null) {
					writeResponse(httpResp, "Error -> Variable Json : " +  next + " is not a variable of : " + eObject.eClass().getInstanceClassName() +
							"\nAvailable variables are : \n" + availableFeatures, HttpServletResponse.SC_BAD_REQUEST);
					return;
				} else {
					validVariables.add(next);
				}
			}
			
			// Fill object with json values
			for(String var : validVariables) {
				try {
					eObject.eSet(eObject.eClass().getEStructuralFeature(var), json.getString(var));
				} catch (JSONException e) {
					Activator.getDefault().getLog().log(new Status(Status.WARNING,Activator.PLUGIN_ID,"Unexpected error in json",e));
				}
			}
			
			// Everything ok, add object to model
			
			EObject mainDoc = (EObject) root;
			EStructuralFeature listFeature = mainDoc.eClass().getEStructuralFeature(fragment);
			EList list = (EList) mainDoc.eGet(listFeature);
			list.add(eObject);
			
			writeResponse(httpResp, "Posted with success", HttpServletResponse.SC_CREATED);
		}
	}

	/**
	 * Write a response with message and status code back to the client
	 * @param httpResp response
	 * @param message string
	 * @param statusCode int
	 * @throws IOException
	 */
	private void writeResponse(HttpServletResponse httpResp, String message, int statusCode) throws IOException {
		Activator.getDefault().getLog().log(new Status(Status.INFO,Activator.PLUGIN_ID,"Sending : " + message + "  with Status : " + statusCode));

		httpResp.setStatus(statusCode);
		httpResp.getWriter().print(message);
		httpResp.flushBuffer();
	}

	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {
		String method = httpReq.getMethod();

		if (method.equalsIgnoreCase("GET")) {
			getRequest(path, httpReq, httpResp);
		} else if (method.equalsIgnoreCase("POST")) {
			postRequest(path, httpReq, httpResp);
		}
		else{
			writeResponse(httpResp, "Error -> La méthode "+method+" n'est pas supporté.",
					HttpServletResponse.SC_BAD_REQUEST);
		}
	}

}