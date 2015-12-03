/**
 */
package modelWebserver.impl;

import java.io.File;

import org.eclipse.emf.ecore.EClass;

import modelWebserver.CommandCodeResult;
import modelWebserver.FileSize;
import modelWebserver.ModelWebserverPackage;

/**
 * <!-- begin-user-doc -->
 * The implementation of the '<em><b>File Size</b></em>' command.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FileSizeImpl extends ICommandImpl implements FileSize {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelWebserverPackage.Literals.FILE_SIZE;
	}
	
	/**
	 * Execute the command FileSize on the given resource.
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
			result = String.valueOf(file.getTotalSpace()) + "bytes";
		}
	}

} //FileSizeImpl
