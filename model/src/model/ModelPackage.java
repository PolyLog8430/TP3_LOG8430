/**
 */
package model;

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
 * @see model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

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
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link model.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RessourceImpl
	 * @see model.impl.ModelPackageImpl#getRessource()
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
	 * The meta object id for the '{@link model.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ModelImpl
	 * @see model.impl.ModelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 1;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RESSOURCE = 0;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.impl.LocalRessourceImpl <em>Local Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.LocalRessourceImpl
	 * @see model.impl.ModelPackageImpl#getLocalRessource()
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
	 * The number of structural features of the '<em>Local Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESSOURCE_FEATURE_COUNT = RESSOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Local Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_RESSOURCE_OPERATION_COUNT = RESSOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.ExternalRessourceImpl <em>External Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.ExternalRessourceImpl
	 * @see model.impl.ModelPackageImpl#getExternalRessource()
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
	 * The meta object id for the '{@link model.ICommand <em>ICommand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ICommand
	 * @see model.impl.ModelPackageImpl#getICommand()
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
	 * The meta object id for the '{@link model.impl.RessourceNameImpl <em>Ressource Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.RessourceNameImpl
	 * @see model.impl.ModelPackageImpl#getRessourceName()
	 * @generated
	 */
	int RESSOURCE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME__NAME = ICOMMAND__NAME;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME__RESSOURCE = ICOMMAND__RESSOURCE;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME__RESULT = ICOMMAND__RESULT;

	/**
	 * The feature id for the '<em><b>Apply On Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME__APPLY_ON_FOLDER = ICOMMAND__APPLY_ON_FOLDER;

	/**
	 * The feature id for the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME__APPLY_ON_FILE = ICOMMAND__APPLY_ON_FILE;

	/**
	 * The feature id for the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME__APPLY_ON_URI = ICOMMAND__APPLY_ON_URI;

	/**
	 * The feature id for the '<em><b>Code Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME__CODE_RESULT = ICOMMAND__CODE_RESULT;

	/**
	 * The number of structural features of the '<em>Ressource Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME_FEATURE_COUNT = ICOMMAND_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME___EXECUTE__STRING = ICOMMAND___EXECUTE__STRING;

	/**
	 * The number of operations of the '<em>Ressource Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_NAME_OPERATION_COUNT = ICOMMAND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.impl.PathImpl <em>Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.impl.PathImpl
	 * @see model.impl.ModelPackageImpl#getPath()
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
	 * The meta object id for the '{@link model.CommandCodeResult <em>Command Code Result</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.CommandCodeResult
	 * @see model.impl.ModelPackageImpl#getCommandCodeResult()
	 * @generated
	 */
	int COMMAND_CODE_RESULT = 7;


	/**
	 * Returns the meta object for class '{@link model.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see model.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link model.Ressource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Ressource#getName()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Name();

	/**
	 * Returns the meta object for class '{@link model.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see model.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Model#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressource</em>'.
	 * @see model.Model#getRessource()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Ressource();

	/**
	 * Returns the meta object for the containment reference list '{@link model.Model#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Command</em>'.
	 * @see model.Model#getCommand()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Command();

	/**
	 * Returns the meta object for class '{@link model.LocalRessource <em>Local Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Ressource</em>'.
	 * @see model.LocalRessource
	 * @generated
	 */
	EClass getLocalRessource();

	/**
	 * Returns the meta object for the attribute '{@link model.LocalRessource#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see model.LocalRessource#getPermission()
	 * @see #getLocalRessource()
	 * @generated
	 */
	EAttribute getLocalRessource_Permission();

	/**
	 * Returns the meta object for the attribute '{@link model.LocalRessource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see model.LocalRessource#getPath()
	 * @see #getLocalRessource()
	 * @generated
	 */
	EAttribute getLocalRessource_Path();

	/**
	 * Returns the meta object for class '{@link model.ExternalRessource <em>External Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Ressource</em>'.
	 * @see model.ExternalRessource
	 * @generated
	 */
	EClass getExternalRessource();

	/**
	 * Returns the meta object for the attribute '{@link model.ExternalRessource#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see model.ExternalRessource#getTitle()
	 * @see #getExternalRessource()
	 * @generated
	 */
	EAttribute getExternalRessource_Title();

	/**
	 * Returns the meta object for the attribute '{@link model.ExternalRessource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see model.ExternalRessource#getUri()
	 * @see #getExternalRessource()
	 * @generated
	 */
	EAttribute getExternalRessource_Uri();

	/**
	 * Returns the meta object for class '{@link model.ICommand <em>ICommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICommand</em>'.
	 * @see model.ICommand
	 * @generated
	 */
	EClass getICommand();

	/**
	 * Returns the meta object for the attribute '{@link model.ICommand#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.ICommand#getName()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_Name();

	/**
	 * Returns the meta object for the containment reference '{@link model.ICommand#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ressource</em>'.
	 * @see model.ICommand#getRessource()
	 * @see #getICommand()
	 * @generated
	 */
	EReference getICommand_Ressource();

	/**
	 * Returns the meta object for the attribute '{@link model.ICommand#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see model.ICommand#getResult()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_Result();

	/**
	 * Returns the meta object for the attribute '{@link model.ICommand#isApplyOnFolder <em>Apply On Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On Folder</em>'.
	 * @see model.ICommand#isApplyOnFolder()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_ApplyOnFolder();

	/**
	 * Returns the meta object for the attribute '{@link model.ICommand#isApplyOnFile <em>Apply On File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On File</em>'.
	 * @see model.ICommand#isApplyOnFile()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_ApplyOnFile();

	/**
	 * Returns the meta object for the attribute '{@link model.ICommand#isApplyOnURI <em>Apply On URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply On URI</em>'.
	 * @see model.ICommand#isApplyOnURI()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_ApplyOnURI();

	/**
	 * Returns the meta object for the attribute '{@link model.ICommand#getCodeResult <em>Code Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Result</em>'.
	 * @see model.ICommand#getCodeResult()
	 * @see #getICommand()
	 * @generated
	 */
	EAttribute getICommand_CodeResult();

	/**
	 * Returns the meta object for the '{@link model.ICommand#execute(java.lang.String) <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see model.ICommand#execute(java.lang.String)
	 * @generated
	 */
	EOperation getICommand__Execute__String();

	/**
	 * Returns the meta object for class '{@link model.RessourceName <em>Ressource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource Name</em>'.
	 * @see model.RessourceName
	 * @generated
	 */
	EClass getRessourceName();

	/**
	 * Returns the meta object for class '{@link model.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path</em>'.
	 * @see model.Path
	 * @generated
	 */
	EClass getPath();

	/**
	 * Returns the meta object for enum '{@link model.CommandCodeResult <em>Command Code Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Command Code Result</em>'.
	 * @see model.CommandCodeResult
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
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link model.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RessourceImpl
		 * @see model.impl.ModelPackageImpl#getRessource()
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
		 * The meta object literal for the '{@link model.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ModelImpl
		 * @see model.impl.ModelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RESSOURCE = eINSTANCE.getModel_Ressource();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__COMMAND = eINSTANCE.getModel_Command();

		/**
		 * The meta object literal for the '{@link model.impl.LocalRessourceImpl <em>Local Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.LocalRessourceImpl
		 * @see model.impl.ModelPackageImpl#getLocalRessource()
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
		 * The meta object literal for the '{@link model.impl.ExternalRessourceImpl <em>External Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.ExternalRessourceImpl
		 * @see model.impl.ModelPackageImpl#getExternalRessource()
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
		 * The meta object literal for the '{@link model.ICommand <em>ICommand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.ICommand
		 * @see model.impl.ModelPackageImpl#getICommand()
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
		 * The meta object literal for the '{@link model.impl.RessourceNameImpl <em>Ressource Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.RessourceNameImpl
		 * @see model.impl.ModelPackageImpl#getRessourceName()
		 * @generated
		 */
		EClass RESSOURCE_NAME = eINSTANCE.getRessourceName();

		/**
		 * The meta object literal for the '{@link model.impl.PathImpl <em>Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.impl.PathImpl
		 * @see model.impl.ModelPackageImpl#getPath()
		 * @generated
		 */
		EClass PATH = eINSTANCE.getPath();

		/**
		 * The meta object literal for the '{@link model.CommandCodeResult <em>Command Code Result</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.CommandCodeResult
		 * @see model.impl.ModelPackageImpl#getCommandCodeResult()
		 * @generated
		 */
		EEnum COMMAND_CODE_RESULT = eINSTANCE.getCommandCodeResult();

	}

} //ModelPackage
