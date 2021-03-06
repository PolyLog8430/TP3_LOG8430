/**
 */
package modelAuthenticator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelAuthenticator.User#getName <em>Name</em>}</li>
 *   <li>{@link modelAuthenticator.User#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see modelAuthenticator.ModelAuthenticatorPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the user's <em><b>Name</b></em>.
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see modelAuthenticator.ModelAuthenticatorPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modelAuthenticator.User#getName <em>Name</em>}' attribute. 
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the user's <em><b>Password</b></em>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see modelAuthenticator.ModelAuthenticatorPackage#getUser_Password()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link modelAuthenticator.User#getPassword <em>Password</em>}' attribute.
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // User
