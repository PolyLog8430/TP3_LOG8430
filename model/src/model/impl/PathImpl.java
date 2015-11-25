/**
 */
package model.impl;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import model.CommandCodeResult;
import model.ModelPackage;
import model.Path;
import model.Ressource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PathImpl extends ICommandImpl implements Path {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PATH;
	}
	

	public void execute(String resourceId) {
		File folder = new File(resourceId);
		if ( ! folder.isDirectory()) {
			codeResult = CommandCodeResult.ERROR;
			result = "Error, not a directory.";
		}
		else {
			codeResult = CommandCodeResult.SUCCESS;
			result = folder.getPath();
		}
	}

} //PathImpl
