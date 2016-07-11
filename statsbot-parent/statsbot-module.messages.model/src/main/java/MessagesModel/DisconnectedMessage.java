/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disconnected Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.DisconnectedMessage#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.DisconnectedMessage#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.DisconnectedMessage#getUserTeam <em>User Team</em>}</li>
 *   <li>{@link MessagesModel.DisconnectedMessage#getUserSteamID <em>User Steam ID</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getDisconnectedMessage()
 * @model
 * @generated
 */
public interface DisconnectedMessage extends Message {
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
	 * @see MessagesModel.ModelPackage#getDisconnectedMessage_UserID()
	 * @model
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link MessagesModel.DisconnectedMessage#getUserID <em>User ID</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getDisconnectedMessage_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link MessagesModel.DisconnectedMessage#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Team</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Team</em>' attribute.
	 * @see #setUserTeam(String)
	 * @see MessagesModel.ModelPackage#getDisconnectedMessage_UserTeam()
	 * @model
	 * @generated
	 */
	String getUserTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.DisconnectedMessage#getUserTeam <em>User Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Team</em>' attribute.
	 * @see #getUserTeam()
	 * @generated
	 */
	void setUserTeam(String value);

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
	 * @see MessagesModel.ModelPackage#getDisconnectedMessage_UserSteamID()
	 * @model
	 * @generated
	 */
	String getUserSteamID();

	/**
	 * Sets the value of the '{@link MessagesModel.DisconnectedMessage#getUserSteamID <em>User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Steam ID</em>' attribute.
	 * @see #getUserSteamID()
	 * @generated
	 */
	void setUserSteamID(String value);

} // DisconnectedMessage
