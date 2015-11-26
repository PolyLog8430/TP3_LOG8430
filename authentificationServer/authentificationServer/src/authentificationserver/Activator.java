package authentificationserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collections;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import modelAuthentificator.ModelFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "authenticator"; //$NON-NLS-1$

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

		IPath stateLocation = Activator.getDefault().getStateLocation();
		IPath model = stateLocation.append("savedModel.xml");
		// File savedFile = model.toFile();

		File savedFile = savedModel;
		System.out.println("Le modele est enregistré dans le fichier: " + savedFile.getAbsolutePath());
		if (savedFile.exists()) {
			// load from plug-in specific location
			FileInputStream in = new FileInputStream(savedFile);
			xmiResource.load(in, Collections.emptyMap());
			in.close();
			root = xmiResource.getContents().get(0);
		} else {
			root = ModelFactory.eINSTANCE.createModel();
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

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 *
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	private Handler addEmfHandler(EObject root) {
		return new EMFHandler(root);
	}
}
