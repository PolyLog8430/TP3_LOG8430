/**
 */
package modelWebserver.impl;

import java.io.File;

import org.eclipse.emf.ecore.EClass;

import modelWebserver.CommandCodeResult;
import modelWebserver.ModelWebserverPackage;
import modelWebserver.Path;

/**
 * <!-- begin-user-doc -->
 * The implementation of the '<em><b>Path</b></em>' command.
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
		return ModelWebserverPackage.Literals.PATH;
	}

	@Override
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
