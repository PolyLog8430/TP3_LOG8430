/**
 */
package model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.Model#getCommands <em>Commands</em>}</li>
 *   <li>{@link model.Model#getLocalResources <em>Local Resources</em>}</li>
 *   <li>{@link model.Model#getExternalResources <em>External Resources</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link model.ICommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see model.ModelPackage#getModel_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<ICommand> getCommands();

	/**
	 * Returns the value of the '<em><b>Local Resources</b></em>' containment reference list.
	 * The list contents are of type {@link model.LocalRessource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Resources</em>' containment reference list.
	 * @see model.ModelPackage#getModel_LocalResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalRessource> getLocalResources();

	/**
	 * Returns the value of the '<em><b>External Resources</b></em>' containment reference list.
	 * The list contents are of type {@link model.ExternalRessource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Resources</em>' containment reference list.
	 * @see model.ModelPackage#getModel_ExternalResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalRessource> getExternalResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Ressource> resources();

} // Model
