/**
 */
package modelWebserver;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modelWebserver.LocalRessource#getPermission <em>Permission</em>}</li>
 *   <li>{@link modelWebserver.LocalRessource#getPath <em>Path</em>}</li>
 *   <li>{@link modelWebserver.LocalRessource#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see modelWebserver.ModelWebserverPackage#getLocalRessource()
 * @model
 * @generated
 */
public interface LocalRessource extends Ressource {
	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Get the user permissions on this resource.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see #setPermission(String)
	 * @see modelWebserver.ModelWebserverPackage#getLocalRessource_Permission()
	 * @model
	 * @generated
	 */
	String getPermission();

	/**
	 * Sets the value of the '{@link modelWebserver.LocalRessource#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set the user permissions on this resource.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Return the path of the resource.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see modelWebserver.ModelWebserverPackage#getLocalRessource_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link modelWebserver.LocalRessource#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set the path of the resource.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Return the type of the local resource.
	 * The type indicates whether the resource is a file or a folder.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see modelWebserver.ModelWebserverPackage#getLocalRessource_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link modelWebserver.LocalRessource#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Set the type of the local resource.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // LocalRessource
