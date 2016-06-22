/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connected Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.ConnectedMessage#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.ConnectedMessage#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.ConnectedMessage#getUserSteamID <em>User Steam ID</em>}</li>
 *   <li>{@link MessagesModel.ConnectedMessage#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getConnectedMessage()
 * @model
 * @generated
 */
public interface ConnectedMessage extends Message {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see MessagesModel.ModelPackage#getConnectedMessage_UserID()
	 * @model
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link MessagesModel.ConnectedMessage#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see MessagesModel.ModelPackage#getConnectedMessage_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link MessagesModel.ConnectedMessage#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Steam ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Steam ID</em>' attribute.
	 * @see #setUserSteamID(String)
	 * @see MessagesModel.ModelPackage#getConnectedMessage_UserSteamID()
	 * @model
	 * @generated
	 */
	String getUserSteamID();

	/**
	 * Sets the value of the '{@link MessagesModel.ConnectedMessage#getUserSteamID <em>User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Steam ID</em>' attribute.
	 * @see #getUserSteamID()
	 * @generated
	 */
	void setUserSteamID(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see MessagesModel.ModelPackage#getConnectedMessage_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link MessagesModel.ConnectedMessage#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // ConnectedMessage
