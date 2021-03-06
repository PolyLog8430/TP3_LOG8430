/**
 */
package modelWebserver;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modelWebserver.ModelWebserverFactory
 * @model kind="package"
 * @generated
 */
public interface ModelWebserverPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelWebserver";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modelWebserver";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelWebserverPackage eINSTANCE = modelWebserver.impl.ModelWebserverPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelWebserver.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.RessourceImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.ModelImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMMANDS = 0;

	/**
	 * The feature id for the '<em><b>Local Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LOCAL_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>External Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__EXTERNAL_RESOURCES = 2;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RESOURCES = 3;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.LocalRessourceImpl <em>Local Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.LocalRessourceImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getLocalRessource()
	 * @generated
	 */
	int LOCAL_RESSOURCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESSOURCE__NAME = RESSOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESSOURCE__PERMISSION = RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESSOURCE__PATH = RESSOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESSOURCE__TYPE = RESSOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Local Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESSOURCE_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Local Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESSOURCE_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.ExternalRessourceImpl <em>External Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.ExternalRessourceImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getExternalRessource()
	 * @generated
	 */
	int EXTERNAL_RESSOURCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESSOURCE__NAME = RESSOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESSOURCE__TITLE = RESSOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESSOURCE__URI = RESSOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESSOURCE_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESSOURCE_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.ICommandImpl <em>ICommand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.ICommandImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getICommand()
	 * @generated
	 */
	int ICOMMAND = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__RESSOURCE = 1;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__RESULT = 2;

	/**
	 * The feature id for the '<em><b>Apply On Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__APPLY_ON_FOLDER = 3;

	/**
	 * The feature id for the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__APPLY_ON_FILE = 4;

	/**
	 * The feature id for the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__APPLY_ON_URI = 5;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND__CODE_RESULT = 6;

	/**
	 * The number of structural features of the '<em>ICommand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND___EXECUTE__STRING = 0;

	/**
	 * The number of operations of the '<em>ICommand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMMAND_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.FolderNameImpl <em>Folder Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.FolderNameImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getFolderName()
	 * @generated
	 */
	int FOLDER_NAME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME__NAME = ICOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME__RESSOURCE = ICOMMAND__RESSOURCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Apply On Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME__APPLY_ON_FOLDER = ICOMMAND__APPLY_ON_FOLDER;

	/**
	 * The feature id for the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME__APPLY_ON_FILE = ICOMMAND__APPLY_ON_FILE;

	/**
	 * The feature id for the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME__APPLY_ON_URI = ICOMMAND__APPLY_ON_URI;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>Folder Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME___EXECUTE__STRING = ICOMMAND___EXECUTE__STRING;

	/**
	 * The number of operations of the '<em>Folder Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_NAME_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.PathImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getPath()
	 * @generated
	 */
	int PATH = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__NAME = ICOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__RESSOURCE = ICOMMAND__RESSOURCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Apply On Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__APPLY_ON_FOLDER = ICOMMAND__APPLY_ON_FOLDER;

	/**
	 * The feature id for the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__APPLY_ON_FILE = ICOMMAND__APPLY_ON_FILE;

	/**
	 * The feature id for the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__APPLY_ON_URI = ICOMMAND__APPLY_ON_URI;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH___EXECUTE__STRING = ICOMMAND___EXECUTE__STRING;

	/**
	 * The number of operations of the '<em>Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.FileNameImpl <em>File Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.FileNameImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getFileName()
	 * @generated
	 */
	int FILE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__NAME = ICOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__RESSOURCE = ICOMMAND__RESSOURCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Apply On Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__APPLY_ON_FOLDER = ICOMMAND__APPLY_ON_FOLDER;

	/**
	 * The feature id for the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__APPLY_ON_FILE = ICOMMAND__APPLY_ON_FILE;

	/**
	 * The feature id for the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__APPLY_ON_URI = ICOMMAND__APPLY_ON_URI;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>File Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME___EXECUTE__STRING = ICOMMAND___EXECUTE__STRING;

	/**
	 * The number of operations of the '<em>File Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.PageTileImpl <em>Page Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.PageTileImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getPageTile()
	 * @generated
	 */
	int PAGE_TILE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE__NAME = ICOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE__RESSOURCE = ICOMMAND__RESSOURCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Apply On Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE__APPLY_ON_FOLDER = ICOMMAND__APPLY_ON_FOLDER;

	/**
	 * The feature id for the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE__APPLY_ON_FILE = ICOMMAND__APPLY_ON_FILE;

	/**
	 * The feature id for the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE__APPLY_ON_URI = ICOMMAND__APPLY_ON_URI;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>Page Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE___EXECUTE__STRING = ICOMMAND___EXECUTE__STRING;

	/**
	 * The number of operations of the '<em>Page Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_TILE_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelWebserver.impl.FileSizeImpl <em>File Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.impl.FileSizeImpl
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getFileSize()
	 * @generated
	 */
	int FILE_SIZE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE__NAME = ICOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE__RESSOURCE = ICOMMAND__RESSOURCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Apply On Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE__APPLY_ON_FOLDER = ICOMMAND__APPLY_ON_FOLDER;

	/**
	 * The feature id for the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE__APPLY_ON_FILE = ICOMMAND__APPLY_ON_FILE;

	/**
	 * The feature id for the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE__APPLY_ON_URI = ICOMMAND__APPLY_ON_URI;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>File Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE___EXECUTE__STRING = ICOMMAND___EXECUTE__STRING;

	/**
	 * The number of operations of the '<em>File Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelWebserver.CommandCodeResult <em>Command Code Result</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelWebserver.CommandCodeResult
	 * @see modelWebserver.impl.ModelWebserverPackageImpl#getCommandCodeResult()
	 * @generated
	 */
	int COMMAND_CODE_RESULT = 10;


	/**
	 * Returns the meta object for class '{@link modelWebserver.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see modelWebserver.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.Ressource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modelWebserver.Ressource#getName()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Name();

	/**
	 * Returns the meta object for class '{@link modelWebserver.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see modelWebserver.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link modelWebserver.Model#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see modelWebserver.Model#getCommands()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Commands();

	/**
	 * Returns the meta object for the containment reference list '{@link modelWebserver.Model#getLocalResources <em>Local Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Resources</em>'.
	 * @see modelWebserver.Model#getLocalResources()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_LocalResources();

	/**
	 * Returns the meta object for the containment reference list '{@link modelWebserver.Model#getExternalResources <em>External Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Resources</em>'.
	 * @see modelWebserver.Model#getExternalResources()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_ExternalResources();

	/**
	 * Returns the meta object for the reference list '{@link modelWebserver.Model#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see modelWebserver.Model#getResources()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Resources();

	/**
	 * Returns the meta object for class '{@link modelWebserver.LocalRessource <em>Local Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Ressource</em>'.
	 * @see modelWebserver.LocalRessource
	 * @generated
	 */
	EClass getLocalRessource();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.LocalRessource#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see modelWebserver.LocalRessource#getPermission()
	 * @see #getLocalRessource()
	 * @generated
	 */
	EAttribute getLocalRessource_Permission();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.LocalRessource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see modelWebserver.LocalRessource#getPath()
	 * @see #getLocalRessource()
	 * @generated
	 */
	EAttribute getLocalRessource_Path();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.LocalRessource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see modelWebserver.LocalRessource#getType()
	 * @see #getLocalRessource()
	 * @generated
	 */
	EAttribute getLocalRessource_Type();

	/**
	 * Returns the meta object for class '{@link modelWebserver.ExternalRessource <em>External Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Ressource</em>'.
	 * @see modelWebserver.ExternalRessource
	 * @generated
	 */
	EClass getExternalRessource();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.ExternalRessource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see modelWebserver.ExternalRessource#getTitle()
	 * @see #getExternalRessource()
	 * @generated
	 */
	EAttribute getExternalRessource_Title();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.ExternalRessource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see modelWebserver.ExternalRessource#getUri()
	 * @see #getExternalRessource()
	 * @generated
	 */
	EAttribute getExternalRessource_Uri();

	/**
	 * Returns the meta object for class '{@link modelWebserver.ICommand <em>ICommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICommand</em>'.
	 * @see modelWebserver.ICommand
	 * @generated
	 */
	EClass getICommand();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.ICommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see modelWebserver.ICommand#getName()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_Name();

	/**
	 * Returns the meta object for the containment reference '{@link modelWebserver.ICommand#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ressource</em>'.
	 * @see modelWebserver.ICommand#getRessource()
	 * @see #getICommand()
	 * @generated
	 */
	EReference getICommand_Ressource();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.ICommand#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see modelWebserver.ICommand#getResult()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_Result();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.ICommand#isApplyOnFolder <em>Apply On Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On Folder</em>'.
	 * @see modelWebserver.ICommand#isApplyOnFolder()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_ApplyOnFolder();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.ICommand#isApplyOnFile <em>Apply On File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On File</em>'.
	 * @see modelWebserver.ICommand#isApplyOnFile()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_ApplyOnFile();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.ICommand#isApplyOnURI <em>Apply On URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On URI</em>'.
	 * @see modelWebserver.ICommand#isApplyOnURI()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_ApplyOnURI();

	/**
	 * Returns the meta object for the attribute '{@link modelWebserver.ICommand#getCodeResult <em>Code Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Result</em>'.
	 * @see modelWebserver.ICommand#getCodeResult()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_CodeResult();

	/**
	 * Returns the meta object for the '{@link modelWebserver.ICommand#execute(java.lang.String) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see modelWebserver.ICommand#execute(java.lang.String)
	 * @generated
	 */
	EOperation getICommand__Execute__String();

	/**
	 * Returns the meta object for class '{@link modelWebserver.FolderName <em>Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Name</em>'.
	 * @see modelWebserver.FolderName
	 * @generated
	 */
	EClass getFolderName();

	/**
	 * Returns the meta object for class '{@link modelWebserver.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see modelWebserver.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for class '{@link modelWebserver.FileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Name</em>'.
	 * @see modelWebserver.FileName
	 * @generated
	 */
	EClass getFileName();

	/**
	 * Returns the meta object for class '{@link modelWebserver.PageTile <em>Page Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Tile</em>'.
	 * @see modelWebserver.PageTile
	 * @generated
	 */
	EClass getPageTile();

	/**
	 * Returns the meta object for class '{@link modelWebserver.FileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Size</em>'.
	 * @see modelWebserver.FileSize
	 * @generated
	 */
	EClass getFileSize();

	/**
	 * Returns the meta object for enum '{@link modelWebserver.CommandCodeResult <em>Command Code Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Code Result</em>'.
	 * @see modelWebserver.CommandCodeResult
	 * @generated
	 */
	EEnum getCommandCodeResult();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelWebserverFactory getModelWebserverFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modelWebserver.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.RessourceImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__NAME = eINSTANCE.getRessource_Name();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.ModelImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMMANDS = eINSTANCE.getModel_Commands();

		/**
		 * The meta object literal for the '<em><b>Local Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LOCAL_RESOURCES = eINSTANCE.getModel_LocalResources();

		/**
		 * The meta object literal for the '<em><b>External Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__EXTERNAL_RESOURCES = eINSTANCE.getModel_ExternalResources();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RESOURCES = eINSTANCE.getModel_Resources();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.LocalRessourceImpl <em>Local Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.LocalRessourceImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getLocalRessource()
		 * @generated
		 */
		EClass LOCAL_RESSOURCE = eINSTANCE.getLocalRessource();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_RESSOURCE__PERMISSION = eINSTANCE.getLocalRessource_Permission();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_RESSOURCE__PATH = eINSTANCE.getLocalRessource_Path();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_RESSOURCE__TYPE = eINSTANCE.getLocalRessource_Type();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.ExternalRessourceImpl <em>External Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.ExternalRessourceImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getExternalRessource()
		 * @generated
		 */
		EClass EXTERNAL_RESSOURCE = eINSTANCE.getExternalRessource();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_RESSOURCE__TITLE = eINSTANCE.getExternalRessource_Title();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_RESSOURCE__URI = eINSTANCE.getExternalRessource_Uri();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.ICommandImpl <em>ICommand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.ICommandImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getICommand()
		 * @generated
		 */
		EClass ICOMMAND = eINSTANCE.getICommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMMAND__NAME = eINSTANCE.getICommand_Name();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICOMMAND__RESSOURCE = eINSTANCE.getICommand_Ressource();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMMAND__RESULT = eINSTANCE.getICommand_Result();

		/**
		 * The meta object literal for the '<em><b>Apply On Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMMAND__APPLY_ON_FOLDER = eINSTANCE.getICommand_ApplyOnFolder();

		/**
		 * The meta object literal for the '<em><b>Apply On File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMMAND__APPLY_ON_FILE = eINSTANCE.getICommand_ApplyOnFile();

		/**
		 * The meta object literal for the '<em><b>Apply On URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMMAND__APPLY_ON_URI = eINSTANCE.getICommand_ApplyOnURI();

		/**
		 * The meta object literal for the '<em><b>Code Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMMAND__CODE_RESULT = eINSTANCE.getICommand_CodeResult();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICOMMAND___EXECUTE__STRING = eINSTANCE.getICommand__Execute__String();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.FolderNameImpl <em>Folder Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.FolderNameImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getFolderName()
		 * @generated
		 */
		EClass FOLDER_NAME = eINSTANCE.getFolderName();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.PathImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.FileNameImpl <em>File Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.FileNameImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getFileName()
		 * @generated
		 */
		EClass FILE_NAME = eINSTANCE.getFileName();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.PageTileImpl <em>Page Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.PageTileImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getPageTile()
		 * @generated
		 */
		EClass PAGE_TILE = eINSTANCE.getPageTile();

		/**
		 * The meta object literal for the '{@link modelWebserver.impl.FileSizeImpl <em>File Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.impl.FileSizeImpl
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getFileSize()
		 * @generated
		 */
		EClass FILE_SIZE = eINSTANCE.getFileSize();

		/**
		 * The meta object literal for the '{@link modelWebserver.CommandCodeResult <em>Command Code Result</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelWebserver.CommandCodeResult
		 * @see modelWebserver.impl.ModelWebserverPackageImpl#getCommandCodeResult()
		 * @generated
		 */
		EEnum COMMAND_CODE_RESULT = eINSTANCE.getCommandCodeResult();

	}

} //ModelWebserverPackage
