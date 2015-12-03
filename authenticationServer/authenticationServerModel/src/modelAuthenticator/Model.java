/**
 */
package modelAuthenticator;

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
 *   <li>{@link modelAuthenticator.Model#getUsers <em>Users</em>}</li>
 * </ul>
 *
 * @see modelAuthenticator.ModelAuthenticatorPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link modelAuthenticator.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * The list '<em>Users</em>' contains the list of users registered in the application.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see modelAuthenticator.ModelAuthenticatorPackage#getModel_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

} // Model
