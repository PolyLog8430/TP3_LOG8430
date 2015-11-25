package webserver;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	public void getRequest(String path, HttpServletResponse httpResp) 
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
			//EClass eClass = (EClass) feature.eContainer().eClass().getEStructuralFeature(feature.getName()); 
			//System.out.println("Eclass is : " + eClass);
			EObject eObject = modelFactory.create(eRef.getEReferenceType());
			System.out.println("Instanciated : " + eObject.toString());
			
			for(EStructuralFeature e : eObject.eClass().getEStructuralFeatures()) {
				System.out.println(e.getName());
			}
			
			EObject mainDoc = (EObject) root;
			EStructuralFeature listFeature =  mainDoc.eClass().getEStructuralFeature(fragment);
			EList list = (EList) mainDoc.eGet(listFeature);
			list.add(eObject);
			
			/*EObject eobject = (EObject) context;
			eobject.eClass().eSet(feature, null);*/
			
			// Parse body and find keys
			JSONObject json = new JSONObject(allBody);
			try {
				System.out.println(json.getString("test"));
			}
			catch (JSONException e) {
				e.printStackTrace();
			}
			allBody += "Key = : "  + json.getString("test");
			
			httpResp.setStatus(HttpServletResponse.SC_OK);
			httpResp.getWriter().print(allBody);
			httpResp.flushBuffer();
			}
		}
		
	}
	
	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {
		String method = httpReq.getMethod();

		if(method.equalsIgnoreCase("GET")) {
			getRequest(path, httpResp);
		} 
		else if (method.equalsIgnoreCase("POST")) {
			postRequest(path, httpReq, httpResp);
		}
	}

}