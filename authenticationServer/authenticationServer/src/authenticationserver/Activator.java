package authenticationserver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import modelAuthenticator.ModelAuthenticatorFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "authenticationServer"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private Server server;
	private File savedModel = new File("users.model");

	private EObject root;

	/**
	 * The constructor
	 */
	public Activator() {

	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		server = new Server(8081);
		XMIResource xmiResource = new XMIResourceImpl();

		URL modelEntry = plugin.getBundle().getEntry("/users.modelAuthenticator");
		
		if (modelEntry != null) {
			System.out.println("Modèle trouvé à : " + modelEntry.getPath());
			// load from plug-in specific location
			InputStream in = modelEntry.openStream();
			xmiResource.load(in, Collections.emptyMap());
			System.out.println(xmiResource.toString());
			in.close();
			root = xmiResource.getContents().get(0);
		} else {
			System.out.println("Pas de modèle trouvé, création d'un modèle vide");
			root = ModelAuthenticatorFactory.eINSTANCE.createModel();
		}
		
		server.setHandler(addEmfHandler(root));
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					server.start();
					server.join();
				} catch (Exception e) {
					getLog().log(new Status(IStatus.ERROR, PLUGIN_ID, "Failed to start webserver"));
				}
			}
		}).start();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {

		XMIResource xmiResource = new XMIResourceImpl();
		xmiResource.getContents().add(root);
		FileOutputStream out = new FileOutputStream(savedModel);
		xmiResource.save(out, Collections.emptyMap());
		out.close();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}


	private Handler addEmfHandler(EObject root) {
		return new EMFHandler(root);
	}
}
