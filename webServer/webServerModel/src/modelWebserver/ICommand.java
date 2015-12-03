/**
 */
package modelWebserver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICommand</b></em>'.
 * An abstract class for all commands to extends.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelWebserver.ICommand#getName <em>Name</em>}</li>
 *   <li>{@link modelWebserver.ICommand#getRessource <em>Ressource</em>}</li>
 *   <li>{@link modelWebserver.ICommand#getResult <em>Result</em>}</li>
 *   <li>{@link modelWebserver.ICommand#isApplyOnFolder <em>Apply On Folder</em>}</li>
 *   <li>{@link modelWebserver.ICommand#isApplyOnFile <em>Apply On File</em>}</li>
 *   <li>{@link modelWebserver.ICommand#isApplyOnURI <em>Apply On URI</em>}</li>
 *   <li>{@link modelWebserver.ICommand#getCodeResult <em>Code Result</em>}</li>
 * </ul>
 *
 * @see modelWebserver.ModelWebserverPackage#getICommand()
 * @model abstract="true"
 * @generated
 */
public interface ICommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * This is the command name to appear to the end-user
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see modelWebserver.ModelWebserverPackage#getICommand_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modelWebserver.ICommand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Setting the command name.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * get the ressource for which the command is called.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference.
	 * @see #setRessource(Ressource)
	 * @see modelWebserver.ModelWebserverPackage#getICommand_Ressource()
	 * @model containment="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link modelWebserver.ICommand#getRessource <em>Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * Set the ressource for which the command should be applied.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' containment reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * returns the result of the of the command.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see modelWebserver.ModelWebserverPackage#getICommand_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link modelWebserver.ICommand#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set the result of the command
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

	/**
	 * Returns the value of the '<em><b>Apply On Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Whether the command applicable on Folders or not.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On Folder</em>' attribute.
	 * @see #setApplyOnFolder(boolean)
	 * @see modelWebserver.ModelWebserverPackage#getICommand_ApplyOnFolder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnFolder();

	/**
	 * Sets the value of the '{@link modelWebserver.ICommand#isApplyOnFolder <em>Apply On Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * set whether the command applicable on Folders or not.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply On Folder</em>' attribute.
	 * @see #isApplyOnFolder()
	 * @generated
	 */
	void setApplyOnFolder(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply On File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Whether the command applicable on Files or not.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On File</em>' attribute.
	 * @see #setApplyOnFile(boolean)
	 * @see modelWebserver.ModelWebserverPackage#getICommand_ApplyOnFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnFile();

	/**
	 * Sets the value of the '{@link modelWebserver.ICommand#isApplyOnFile <em>Apply On File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set whether the command applicable on Folders or not.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply On File</em>' attribute.
	 * @see #isApplyOnFile()
	 * @generated
	 */
	void setApplyOnFile(boolean value);

	/**
	 * Returns the value of the '<em><b>Apply On URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Whether the command applicable on URI or not.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On URI</em>' attribute.
	 * @see #setApplyOnURI(boolean)
	 * @see modelWebserver.ModelWebserverPackage#getICommand_ApplyOnURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnURI();

	/**
	 * Sets the value of the '{@link modelWebserver.ICommand#isApplyOnURI <em>Apply On URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set whether the command applicable on Folders or not.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply On URI</em>' attribute.
	 * @see #isApplyOnURI()
	 * @generated
	 */
	void setApplyOnURI(boolean value);

	/**
	 * Returns the value of the '<em><b>Code Result</b></em>' attribute.
	 * The default value is <code>"SUCCESS"</code>.
	 * The literals are from the enumeration {@link modelWebserver.CommandCodeResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * return the result of the command.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Result</em>' attribute.
	 * @see modelWebserver.CommandCodeResult
	 * @see #setCodeResult(CommandCodeResult)
	 * @see modelWebserver.ModelWebserverPackage#getICommand_CodeResult()
	 * @model default="SUCCESS"
	 * @generated
	 */
	CommandCodeResult getCodeResult();

	/**
	 * Sets the value of the '{@link modelWebserver.ICommand#getCodeResult <em>Code Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set the result of the command
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Result</em>' attribute.
	 * @see modelWebserver.CommandCodeResult
	 * @see #getCodeResult()
	 * @generated
	 */
	void setCodeResult(CommandCodeResult value);

	/**
	 * <!-- begin-user-doc -->
	 * Execute the command on the resource specified by the given ressourceId.
	 * Set the appropriate result value and the result code. 
	 * <!-- end-user-doc -->
	 * @model resourceIdDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void execute(String resourceId);

} // ICommand
