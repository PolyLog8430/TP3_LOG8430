/**
 */
package modelWebserver.impl;

import java.io.File;

import org.eclipse.emf.ecore.EClass;

import modelWebserver.CommandCodeResult;
import modelWebserver.FolderName;
import modelWebserver.ModelWebserverPackage;

/**
 * <!-- begin-user-doc -->
 * The implementation of the '<em><b>Folder Name</b></em>' command.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FolderNameImpl extends ICommandImpl implements FolderName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelWebserverPackage.Literals.FOLDER_NAME;
	}

	/**
	 * Execute the command FolderName on the given resource.
	 * @param resourceId The complete path of the folder.
	 */
	@Override
	public void execute(String resourceId) {
		File folder = new File(resourceId);
		if ( ! folder.isDirectory()) {
			codeResult = CommandCodeResult.ERROR;
			result = "Error, not a directory.";
		}
		else {
			codeResult = CommandCodeResult.SUCCESS;
			result = folder.getName();
		}
	}
} //FolderNameImpl
