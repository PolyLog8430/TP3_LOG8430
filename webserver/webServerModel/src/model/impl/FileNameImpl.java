/**
 */
package model.impl;

import model.CommandCodeResult;
import model.FileName;
import model.ModelPackage;

import java.io.File;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FileNameImpl extends ICommandImpl implements FileName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FILE_NAME;
	}

	/**
	 * Execute the command FileName on the given resource.
	 * @param resourceId The complete path of the file.
	 */
	@Override
	public void execute(String resourceId) {
		File file = new File(resourceId);
		if ( ! file.isFile()) {
			codeResult = CommandCodeResult.ERROR;
			result = "Error, not a file.";
		}
		else {
			codeResult = CommandCodeResult.SUCCESS;
			result = file.getName();
		}

	}
} //FileNameImpl
