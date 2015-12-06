package webserver;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "webserver"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private Server server;
	final private int port = 8080; 

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
	/**
	 * The server start method.
	 * Reads public model from xml and start server
	 * 
	 * @param context
	 * @throws Exception
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		server = new Server(port);
		server.setHandler(addEmfHandler());
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					server.start();
					server.join();
				} catch (Exception e) {
					
				}
			}
		}).start();
		
		getLog().log(new Status(IStatus.OK,PLUGIN_ID,"Webserver demarré"));
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

		getLog().log(new Status(IStatus.OK,PLUGIN_ID,"Arret du webserver en cours"));
		
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
	private Handler addEmfHandler() {
		return new EMFHandler(this);
	}
}
