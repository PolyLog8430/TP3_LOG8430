package authenticationserver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import modelAuthenticator.User;
import utils.IOUtil;

public class EMFHandler extends AbstractHandler {

	private static final String SERVER_TO_FORWARD = "localhost:8080";

	private final EObject root;

	public EMFHandler(EObject root) {
		this.root = root;
	}

	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {
		String authLogin = null;

		String auth = httpReq.getHeader("Authorization");
		Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID, "Auth request : "+auth));	

		// If the header is in good format
		if (auth != null && auth.startsWith("Basic")) {
			auth = auth.substring("Basic".length()).trim();
			String credentials[] = new String(Base64.getDecoder().decode(auth), Charset.forName("UTF-8")).split(":", 2);

			EStructuralFeature usersFeature = root.eClass().getEStructuralFeature("users");
			EList<EObject> list = (EList<EObject>) root.eGet(usersFeature);

			// Get user/pass with input parameters and compare to model
			for (EObject eo : list) {
				if (eo.eClass().getInstanceClassName().equals(User.class.getName())) { // Type of User
					String login = (String) eo.eGet(eo.eClass().getEStructuralFeature("name"));
					String pass = (String) eo.eGet(eo.eClass().getEStructuralFeature("password"));
					
					if (login.equals(credentials[0]) && pass.equals(credentials[1])) { 
						authLogin = login;
						break;
					}
				}
			}
		}

		if (authLogin != null) { // Auth ok
			Activator.getDefault().getLog().log(new Status(Status.INFO, Activator.PLUGIN_ID, authLogin+" is authorized"));	
			forward(httpReq, httpResp, authLogin);
		} 
		else { // Un-authorized
			Activator.getDefault().getLog().log(new Status(Status.WARNING, Activator.PLUGIN_ID, "Unauthorized"));	
			httpResp.setStatus(HttpServletResponse.SC_FORBIDDEN);
			httpResp.getWriter().print("Mauvais login / mot de passe");
		}

		httpResp.flushBuffer();
	}

	/**
	 * Transmit client request to webserver or webserver response to client
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	private void forward(HttpServletRequest req, HttpServletResponse resp, String username) throws IOException {
		// Send Request
		URL url = new URL("http://" + SERVER_TO_FORWARD + req.getRequestURI()
		+ ((req.getQueryString() != null) ? "?" + req.getQueryString() : ""));

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(req.getMethod());

		connection.setRequestProperty("Authorization", "Custom "+username);
		
		if (req.getMethod().compareTo("GET") != 0) { // If the request isn't GET, copy its body 

			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);

			try {
				IOUtil.fastCopy(req.getInputStream(), connection.getOutputStream());
			} finally {
				req.getInputStream().close();
				connection.getOutputStream().close();
			}
		}
		
		// Forward server answer
		try { 
			resp.setStatus(connection.getResponseCode());
			IOUtil.fastCopy(connection.getInputStream(), resp.getOutputStream());
			connection.getInputStream().close();
			
		} catch (IOException e) {
			connection.disconnect();
			resp.setStatus(HttpURLConnection.HTTP_INTERNAL_ERROR);
			IOUtil.fastCopy(connection.getErrorStream(), resp.getOutputStream());
			connection.getErrorStream().close();
				
		} finally {
			resp.getOutputStream().close();
		}

	}

}