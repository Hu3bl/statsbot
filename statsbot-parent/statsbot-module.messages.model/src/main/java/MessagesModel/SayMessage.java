/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Say Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.SayMessage#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.SayMessage#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.SayMessage#getUserTeam <em>User Team</em>}</li>
 *   <li>{@link MessagesModel.SayMessage#getUserSteamID <em>User Steam ID</em>}</li>
 *   <li>{@link MessagesModel.SayMessage#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getSayMessage()
 * @model
 * @generated
 */
public interface SayMessage extends Message {
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
	 * @see MessagesModel.ModelPackage#getSayMessage_UserID()
	 * @model
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link MessagesModel.SayMessage#getUserID <em>User ID</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getSayMessage_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link MessagesModel.SayMessage#getUserName <em>User Name</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getSayMessage_UserTeam()
	 * @model
	 * @generated
	 */
	String getUserTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.SayMessage#getUserTeam <em>User Team</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getSayMessage_UserSteamID()
	 * @model
	 * @generated
	 */
	String getUserSteamID();

	/**
	 * Sets the value of the '{@link MessagesModel.SayMessage#getUserSteamID <em>User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Steam ID</em>' attribute.
	 * @see #getUserSteamID()
	 * @generated
	 */
	void setUserSteamID(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see MessagesModel.ModelPackage#getSayMessage_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link MessagesModel.SayMessage#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // SayMessage
