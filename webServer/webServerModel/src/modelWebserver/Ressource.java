/**
 */
package modelWebserver;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource</b></em>'.
 * An interface to represent all resources.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelWebserver.Ressource#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see modelWebserver.ModelWebserverPackage#getRessource()
 * @model abstract="true"
 * @generated
 */
public interface Ressource extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Return the name of the resource. 
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see modelWebserver.ModelWebserverPackage#getRessource_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link modelWebserver.Ressource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set the name of the resource.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Ressource
