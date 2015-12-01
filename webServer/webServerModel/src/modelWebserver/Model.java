/**
 */
package modelWebserver;

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
 *   <li>{@link modelWebserver.Model#getCommands <em>Commands</em>}</li>
 *   <li>{@link modelWebserver.Model#getLocalResources <em>Local Resources</em>}</li>
 *   <li>{@link modelWebserver.Model#getExternalResources <em>External Resources</em>}</li>
 *   <li>{@link modelWebserver.Model#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see modelWebserver.ModelWebserverPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link modelWebserver.ICommand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see modelWebserver.ModelWebserverPackage#getModel_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<ICommand> getCommands();

	/**
	 * Returns the value of the '<em><b>Local Resources</b></em>' containment reference list.
	 * The list contents are of type {@link modelWebserver.LocalRessource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Resources</em>' containment reference list.
	 * @see modelWebserver.ModelWebserverPackage#getModel_LocalResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalRessource> getLocalResources();

	/**
	 * Returns the value of the '<em><b>External Resources</b></em>' containment reference list.
	 * The list contents are of type {@link modelWebserver.ExternalRessource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Resources</em>' containment reference list.
	 * @see modelWebserver.ModelWebserverPackage#getModel_ExternalResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalRessource> getExternalResources();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link modelWebserver.Ressource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see modelWebserver.ModelWebserverPackage#getModel_Resources()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<Ressource> getResources();

} // Model
