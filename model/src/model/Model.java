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
 *   <li>{@link model.Model#getRessource <em>Ressource</em>}</li>
 *   <li>{@link model.Model#getCommand <em>Command</em>}</li>
 *   <li>{@link model.Model#getLocalRessources <em>Local Ressources</em>}</li>
 *   <li>{@link model.Model#getExternalRessources <em>External Ressources</em>}</li>
 * </ul>
 *
 * @see model.ModelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' containment reference list.
	 * The list contents are of type {@link model.Ressource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference list.
	 * @see model.ModelPackage#getModel_Ressource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessource();

	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference list.
	 * The list contents are of type {@link model.ICommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference list.
	 * @see model.ModelPackage#getModel_Command()
	 * @model containment="true"
	 * @generated
	 */
	EList<ICommand> getCommand();

	/**
	 * Returns the value of the '<em><b>Local Ressources</b></em>' containment reference list.
	 * The list contents are of type {@link model.LocalRessource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Ressources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Ressources</em>' containment reference list.
	 * @see model.ModelPackage#getModel_LocalRessources()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalRessource> getLocalRessources();

	/**
	 * Returns the value of the '<em><b>External Ressources</b></em>' containment reference list.
	 * The list contents are of type {@link model.ExternalRessource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Ressources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Ressources</em>' containment reference list.
	 * @see model.ModelPackage#getModel_ExternalRessources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalRessource> getExternalRessources();

} // Model
