package webserver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.json.JSONException;
import org.json.JSONObject;

import model.Model;
import model.ModelFactory;
import model.impl.ModelFactoryImpl;

public class EMFHandler extends AbstractHandler {

	private final EObject root;

	public EMFHandler(EObject root) {
		this.root = root;
	}

	public void getRequest(String path, HttpServletRequest httpReq, HttpServletResponse httpResp) 
			throws IOException, ServletException {
		
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
				//find the feature
				EStructuralFeature feature = eobject.eClass().getEStructuralFeature(fragment);
				
				// call reflexively
				System.out.println("Requested feature Name : " + feature.getName());
				context  = eobject.eGet(feature);
				
				if(context instanceof EList){
					String filterURL = httpReq.getQueryString();
					if(filterURL != null){
						String[] args = filterURL.split("&");
						String[][] filters = new String[args.length][2];
						int j = 0;
						for(String filter : args){
							String[] a = filter.split("=");
							filters[j][0] = a[0];
							filters[j][1] = (a.length == 2 ) ? a[1] : "";
							j++;
						}
						
						EList list = (EList) context;
						EList listFiltered = new BasicEList<>();
						for(Object o : list){
							EObject eo = (EObject) o;
							boolean add = true;
							for(String[] filter : filters){
								EStructuralFeature method = eo.eClass().getEStructuralFeature(filter[0]);
								if(method != null){
									add &= (filter[1].equals(eo.eGet(method)));
								}
							}
							if(add){
								listFiltered.add(o);
							}
						}
						
						context = listFiltered;
					}
				}
				
			} else if (context instanceof EList) {
				EList list = (EList) context;
				context = list.get(position);
			}

		}
		httpResp.setStatus(HttpServletResponse.SC_OK);
		httpResp.getWriter().print(context);
		httpResp.flushBuffer();
	}
	
	public void postRequest(String path, HttpServletRequest httpReq, HttpServletResponse httpResp) 
			throws IOException, ServletException {
		
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
		
		if(allBody.equals("")) {
			// No body, send error
			httpResp.setStatus(HttpServletResponse.SC_PRECONDITION_FAILED);
			httpResp.getWriter().print("No body in the post request");
			httpResp.flushBuffer();
		}
		else {
			// Get Post information
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
					//find the feature
					feature = eobject.eClass().getEStructuralFeature(fragment);
					
					eRef = (EReference) feature;
					// call reflexively
					System.out.println("Requested feature Name : " + feature.getName() + "  class : " + feature.getClass() + "  : " + feature.getFeatureID());
					context  = eobject.eGet(feature);
			}
			
			ModelFactory modelFactory = ModelFactoryImpl.eINSTANCE;
			Model model = modelFactory.createModel();
			
			System.out.println("Factory instantiated");
			EObject eObject = modelFactory.create(eRef.getEReferenceType());
			System.out.println("Instanciated : " + eObject.toString());
			
			for(EStructuralFeature e : eObject.eClass().getEStructuralFeatures()) {
				System.out.println(e.getName());
			}
			
			EObject mainDoc = (EObject) root;
			EStructuralFeature listFeature =  mainDoc.eClass().getEStructuralFeature(fragment);
			EList list = (EList) mainDoc.eGet(listFeature);
			list.add(eObject);
			
			// Parse body and find keys
			JSONObject json = new JSONObject(allBody);
			
			String returnJson = "";
			
			Iterator<String> iterator = json.keys();
			while(iterator.hasNext()) {
				String next = iterator.next();
				eObject.eSet(eObject.eClass().getEStructuralFeature(next), json.getString(next));
			}
			
			httpResp.setStatus(HttpServletResponse.SC_CREATED);
			httpResp.getWriter().print(returnJson);
			httpResp.flushBuffer();
			}
		}
		
	}
	
	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {
		String method = httpReq.getMethod();

		if(method.equalsIgnoreCase("GET")) {
			getRequest(path, httpReq, httpResp);
		} 
		else if (method.equalsIgnoreCase("POST")) {
			postRequest(path, httpReq, httpResp);
		}
	}

}