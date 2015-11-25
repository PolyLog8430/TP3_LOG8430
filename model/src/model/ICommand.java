/**
 */
package model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICommand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.ICommand#getName <em>Name</em>}</li>
 *   <li>{@link model.ICommand#getRessource <em>Ressource</em>}</li>
 *   <li>{@link model.ICommand#getResult <em>Result</em>}</li>
 *   <li>{@link model.ICommand#isApplyOnFolder <em>Apply On Folder</em>}</li>
 *   <li>{@link model.ICommand#isApplyOnFile <em>Apply On File</em>}</li>
 *   <li>{@link model.ICommand#isApplyOnURI <em>Apply On URI</em>}</li>
 *   <li>{@link model.ICommand#getCodeResult <em>Code Result</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getICommand()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ICommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ModelPackage#getICommand_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.ICommand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
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
	 * If the meaning of the '<em>Ressource</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference.
	 * @see #setRessource(Ressource)
	 * @see model.ModelPackage#getICommand_Ressource()
	 * @model containment="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link model.ICommand#getRessource <em>Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
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
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see model.ModelPackage#getICommand_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link model.ICommand#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
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
	 * If the meaning of the '<em>Apply On Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On Folder</em>' attribute.
	 * @see #setApplyOnFolder(boolean)
	 * @see model.ModelPackage#getICommand_ApplyOnFolder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnFolder();

	/**
	 * Sets the value of the '{@link model.ICommand#isApplyOnFolder <em>Apply On Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
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
	 * If the meaning of the '<em>Apply On File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On File</em>' attribute.
	 * @see #setApplyOnFile(boolean)
	 * @see model.ModelPackage#getICommand_ApplyOnFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnFile();

	/**
	 * Sets the value of the '{@link model.ICommand#isApplyOnFile <em>Apply On File</em>}' attribute.
	 * <!-- begin-user-doc -->
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
	 * If the meaning of the '<em>Apply On URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply On URI</em>' attribute.
	 * @see #setApplyOnURI(boolean)
	 * @see model.ModelPackage#getICommand_ApplyOnURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isApplyOnURI();

	/**
	 * Sets the value of the '{@link model.ICommand#isApplyOnURI <em>Apply On URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply On URI</em>' attribute.
	 * @see #isApplyOnURI()
	 * @generated
	 */
	void setApplyOnURI(boolean value);

	/**
	 * Returns the value of the '<em><b>Code Result</b></em>' attribute.
	 * The default value is <code>"SUCCESS"</code>.
	 * The literals are from the enumeration {@link model.CommandCodeResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Result</em>' attribute.
	 * @see model.CommandCodeResult
	 * @see #setCodeResult(CommandCodeResult)
	 * @see model.ModelPackage#getICommand_CodeResult()
	 * @model default="SUCCESS"
	 * @generated
	 */
	CommandCodeResult getCodeResult();

	/**
	 * Sets the value of the '{@link model.ICommand#getCodeResult <em>Code Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Result</em>' attribute.
	 * @see model.CommandCodeResult
	 * @see #getCodeResult()
	 * @generated
	 */
	void setCodeResult(CommandCodeResult value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model resourceIdDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void execute(String resourceId);

} // ICommand
