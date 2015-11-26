package authenticationserver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		boolean authSuccess = false;

		System.out.println("OK");

		String auth = httpReq.getHeader("Authorization");
		System.out.println("Auth: " + auth);

		if (auth != null && auth.startsWith("Basic")) {
			auth = auth.substring("Basic".length()).trim();
			String credentials[] = new String(Base64.getDecoder().decode(auth), Charset.forName("UTF-8")).split(":", 2);

			EObject eobject = (EObject) root;
			EStructuralFeature feature = eobject.eClass().getEStructuralFeature("users");
			EList list = (EList) eobject.eGet(feature);

			// Get user/pass with input parameters and compare to model
			for (Object o : list) {
				EObject eo = (EObject) o;
				if (eo.eClass().getInstanceClassName().equals(User.class.getName())) {
					String login = (String) eo.eGet(eo.eClass().getEStructuralFeature("name"));
					String pass = (String) eo.eGet(eo.eClass().getEStructuralFeature("password"));
					if (login.equals(credentials[0]) && pass.equals(credentials[1])) {
						System.out.println("OK: " + credentials[0]);
						authSuccess = true;
					}
				}
			}
		}

		if (authSuccess) {
			forward(httpReq, httpResp);
		} else {
			httpResp.setStatus(HttpServletResponse.SC_FORBIDDEN);
			httpResp.getWriter().print("Bad credential");
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
	private void forward(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		URL url = new URL("http://" + SERVER_TO_FORWARD + req.getRequestURI()
		+ ((req.getQueryString() != null) ? "?" + req.getQueryString() : ""));

		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod(req.getMethod());

		if (req.getMethod().compareTo("GET") != 0) {

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

		try {
			resp.setStatus(connection.getResponseCode());
			IOUtil.fastCopy(connection.getInputStream(), resp.getOutputStream());
			connection.getInputStream().close();
		} catch (IOException e) {
			IOUtil.fastCopy(connection.getErrorStream(), resp.getOutputStream());
			connection.getErrorStream().close();
		} finally {
			resp.getOutputStream().close();
		}

	}

}