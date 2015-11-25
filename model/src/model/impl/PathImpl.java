/**
 */
package model.impl;

import model.ModelPackage;
import model.Path;
import model.CommandCodeResult;

import java.io.File;

import org.eclipse.emf.ecore.EClass;

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
