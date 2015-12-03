package webserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.json.JSONException;
import org.json.JSONObject;

import modelWebserver.ModelWebserverFactory;
import modelWebserver.impl.ModelWebserverFactoryImpl;

public class EMFHandler extends AbstractHandler {

	private final EObject root; 
	
	private Activator plugin;
	private HashMap<String, EObject> userModels;
	
	public EMFHandler(EObject root, Activator plugin) {
		this.root = root;
		this.plugin = plugin;
		
		userModels = new HashMap<>();
		userModels.put("public", root);
	}

	/**
	 * Check authorization credentials
	 * @param httpReq request
	 * @return is authorized or not
	 */
	private String getAuthenticateUser(HttpServletRequest httpReq){
		String authorization = httpReq.getHeader("Authorization");
		
		if(authorization != null && authorization.startsWith("Custom")){
			String username = authorization.substring("Custom".length()).trim();
			
			//TODO compare username with resource ...
			logToOSGI("User authorized : " + username);
			return username;
		}
		
		return null;
	}
	
	/**
	 * Search for a model associated to a username from the local hashmap, disc or create
	 * an empty one if there is no model for the user
	 * @param username
	 * @return Model associated with username 
	 */
	private EObject getUserModel(String username) {
		
		if (userModels.containsKey(username)) { // Model already loaded in the hashmap 
			logToOSGI("Modèle trouvé pour : " + username);
		}
		else if (plugin.getBundle().getEntry(username + ".modelwebserver") != null) { // Model present in the bundle 
			
			XMIResource xmiResource = new XMIResourceImpl();
			
			URL modelEntry = plugin.getBundle().getEntry(username + ".modelwebserver");
			try{
				InputStream in = modelEntry.openStream();
				
				xmiResource.load(in, Collections.emptyMap());
				in.close();
				logToOSGI("Modèle trouvé à : " + modelEntry.getPath());
				
				userModels.put(username, xmiResource.getContents().get(0));
			}
			catch(IOException e){
				
			}
		}
		else if (plugin.getStateLocation().append(username + ".modelwebserver").toFile().exists()) { // Model in plugin local storage from previous session
			
			File localStorageModel = plugin.getStateLocation().append(username + ".modelwebserver").toFile();
			
			XMIResource xmiResource = new XMIResourceImpl();
			
			try{
				FileInputStream in = new FileInputStream(localStorageModel);
				
				xmiResource.load(in, Collections.emptyMap());
				in.close();
				logToOSGI("Modèle trouvé à : " + localStorageModel.getPath());
				
				userModels.put(username, xmiResource.getContents().get(0));
			}
			catch(IOException e){
				
			}
		}
		else {	// No existant model for the user, create empty one 
			
			logToOSGI("Pas de modèle pour le user " + username + " trouvé, création d'un modèle vide");
			userModels.put(username, ModelWebserverFactory.eINSTANCE.createModel());
		}
		
		return userModels.get(username);
	}

	/**
	 * Handle GET request
	 * @param path URI 
	 * @param httpReq request
	 * @param httpResp response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void getRequest(String path, HttpServletRequest httpReq, HttpServletResponse httpResp, EObject model)
			throws IOException, ServletException {
		
		String[] fragments = path.split("/");
		
		Object requestedFeature = null;
		
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
				EObject eobject = (EObject) model;
				// find the feature
				EStructuralFeature feature = eobject.eClass().getEStructuralFeature(fragment);
				if(feature == null){
					writeResponse(httpResp, "Error -> Classe specifie dans l'url non disponible dans le modele ", HttpServletResponse.SC_NOT_FOUND);
					return;
				}
				
				// call reflexively
				logToOSGI("Requested feature Name  : " + feature.getName());
				requestedFeature = eobject.eGet(feature);

				// Get filtering parameters and apply it to feature
				if (requestedFeature instanceof EList) {
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
						EList list = (EList) requestedFeature;
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

						requestedFeature = listFiltered;
					}
				}

			} else if (requestedFeature instanceof EList) {
				EList list = (EList) requestedFeature;
				if(position >= 0 && position < list.size()){
					requestedFeature = list.get(position);
				}
				else{
					writeResponse(httpResp, "Error -> Position specifie dans l'url est non disponible dans le modele ", HttpServletResponse.SC_NOT_FOUND);
					return;
				}
			}

		}
		
		// Format output into JSON format
		String json = "";
		if(requestedFeature instanceof EList){
			
			for (Object o : (EList)requestedFeature) {
				
				EObject eo = (EObject) o;
				//json += eo.getClass().getName() + " : ";
				json += eo;
			}
			//json += json = new JSONArray(((EList) requestedFeature).toArray()).toString();
		}
		else{
			json = new JSONObject(requestedFeature).toString();
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
	 * @return 
	 * @throws IOException
	 * @throws ServletException
	 */
	private boolean postRequest(String path, HttpServletRequest httpReq, HttpServletResponse httpResp, EObject model)
			throws IOException, ServletException {
		
		String[] fragments = path.split("/");
		Object requestedFeature;

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
			return false;
		} else {
			// Get Post information

			String fragment = fragments[1];
			if (fragment.isEmpty()) {

				// No url indication regarding the model fragment to add
				writeResponse(httpResp, "Error -> Le type d'ajout desire n'a pas ete specifie dans l'url",
						HttpServletResponse.SC_BAD_REQUEST);
				return false;
			}

			// match feature
			EObject eobject = (EObject) model;

			// find the class named "fragment" in the model
			feature = eobject.eClass().getEStructuralFeature(fragment);

			if (feature == null) {
				writeResponse(httpResp, "Error -> Classe specifie dans l'url non disponible dans le modele",
						HttpServletResponse.SC_BAD_REQUEST);
				return false;
			}

			eRef = (EReference) feature;
			// call reflexively
			logToOSGI("Requested feature Name  : " + feature.getName());
			requestedFeature = eobject.eGet(feature);

			ModelWebserverFactory modelFactory = ModelWebserverFactoryImpl.eINSTANCE;

			// Instantiate object of requested class
			EObject eObject = modelFactory.create(eRef.getEReferenceType());
			logToOSGI("Instanciated  : " + eObject.toString());

			// Parse json body and find keys
			JSONObject json = null;
			try {
				json = new JSONObject(allBody);
			} catch(JSONException e) {
				writeResponse(httpResp, "Erreur de parsage du json. Le json : " + allBody + " est incorrect !", HttpServletResponse.SC_BAD_REQUEST);
				return false;
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
					return false;
				} else {
					validVariables.add(next);
				}
			}
			
			// Fill object with json values
			for(String var : validVariables) {
				try {
					eObject.eSet(eObject.eClass().getEStructuralFeature(var), json.getString(var));
				} catch (JSONException e) {
					logToOSGI("Unexpected error in json" + e);
				}
			}
			
			// Everything ok, add object to model
			
			EObject mainDoc = (EObject) model;
			EStructuralFeature listFeature = mainDoc.eClass().getEStructuralFeature(fragment);
			EList list = (EList) mainDoc.eGet(listFeature);
			list.add(eObject);
			
			writeResponse(httpResp, "Posted with success", HttpServletResponse.SC_CREATED);
		}
		return true;
	}

	/**
	 * Write a response with message and status code back to the client
	 * @param httpResp response
	 * @param message string
	 * @param statusCode int
	 * @throws IOException
	 */
	private void writeResponse(HttpServletResponse httpResp, String message, int statusCode) throws IOException {
		logToOSGI("Sending : " + message + " with Status : " + statusCode);

		httpResp.setStatus(statusCode);
		httpResp.getWriter().print(message);
		httpResp.flushBuffer();
	}

	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {
		String method = httpReq.getMethod();
		
		EObject model;
		String username;
		
		if((username = getAuthenticateUser(httpReq)) != null) {
			model = getUserModel(username);
			logToOSGI("Accès par utilisateur authentifié : " + username);
		}
		else {
			model = userModels.get("public");
			logToOSGI("Accès par utilisateur non authentifié, choix du modèle public");
		}

		if (method.equalsIgnoreCase("GET")) {
			getRequest(path, httpReq, httpResp, model);
		} else if (method.equalsIgnoreCase("POST")) {
			
			if(postRequest(path, httpReq, httpResp, model)) {
				
				// Post succesful, update model
				IPath prefPath = plugin.getStateLocation();
				System.out.println(prefPath);
				
				// 
				File modelStore = prefPath.append(username + ".modelwebserver").toFile();
				if(!modelStore.exists()) 
					modelStore.createNewFile();
				
				XMIResource xmiResource = new XMIResourceImpl();
				xmiResource.getContents().add(model);
				FileOutputStream out = new FileOutputStream(modelStore);
				xmiResource.save(out, Collections.emptyMap());
				out.close();
			}
			
		}
		else{
			writeResponse(httpResp, "Error -> La méthode "+method+" n'est pas supporté.",
					HttpServletResponse.SC_BAD_REQUEST);
		}
	}
	
	public void logToOSGI(String message) {
		plugin.getLog().log(new Status(IStatus.INFO, Activator.PLUGIN_ID, message));
	}

}