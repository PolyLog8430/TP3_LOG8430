/**
 */
package model.impl;

import model.FolderName;
import model.ModelPackage;
import model.CommandCodeResult;

import java.io.File;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder Name</b></em>'.
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
		return ModelPackage.Literals.FOLDER_NAME;
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
