package webserver;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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

import modelWebserver.ModelWebserverFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "webserver"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private Server server;

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
	/**
	 * The server start method.
	 * Reads saved model or creates empty model.
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		server = new Server(8080);
		XMIResource xmiResource = new XMIResourceImpl();
		
		URL modelEntry = plugin.getBundle().getEntry("model.modelwebserver");
		try{
			InputStream in = modelEntry.openStream();
			
			xmiResource.load(in, Collections.emptyMap());
			in.close();
			getLog().log(new Status(IStatus.INFO,PLUGIN_ID,"Modèle trouvé à : " + modelEntry.getPath()));

			root = xmiResource.getContents().get(0);
		}
		catch(IOException e){
			getLog().log(new Status(IStatus.WARNING,PLUGIN_ID,"Pas de modèle nommé model.modelwebserver trouvé, création d'un modèle vide", e));

			root = ModelWebserverFactory.eINSTANCE.createModel();
		}
		
		server.setHandler(addEmfHandler(root));
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					server.start();
					server.join();
					getLog().log(new Status(IStatus.OK,PLUGIN_ID,"Démarrage du web serveur"));
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
	/**
	 * Stopping the server.
	 * persist the model.
	 * @param context
	 * @throws Exception
	 */
	public void stop(BundleContext context) throws Exception {

		getLog().log(new Status(IStatus.OK,PLUGIN_ID,"Stopping webserver, save model in model.modelwebserver"));

		XMIResource xmiResource = new XMIResourceImpl();
		xmiResource.getContents().add(root);
		OutputStream out = plugin.getBundle().getEntry("model.modelwebserver").openConnection().getOutputStream();
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
	 * Create the server handler, responsible for handling the request affecting the model.
	 * @param root root EMF object.
	 * @return
	 */
	private Handler addEmfHandler(EObject root) {
		return new EMFHandler(root);
	}
}
