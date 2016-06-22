/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kill Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.KillMessage#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getUserTeam <em>User Team</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getUserSteamID <em>User Steam ID</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKillerPosX <em>Killer Pos X</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKillerPosY <em>Killer Pos Y</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKillerPosZ <em>Killer Pos Z</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKilledUserID <em>Killed User ID</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKilledUserName <em>Killed User Name</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKilledUserTeam <em>Killed User Team</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKilledUserSteamID <em>Killed User Steam ID</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKilledPosX <em>Killed Pos X</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKilledPosY <em>Killed Pos Y</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getKilledPosZ <em>Killed Pos Z</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link MessagesModel.KillMessage#isHeadshot <em>Headshot</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getKillMessage()
 * @model
 * @generated
 */
public interface KillMessage extends Message {
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
	 * @see MessagesModel.ModelPackage#getKillMessage_UserID()
	 * @model
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getUserID <em>User ID</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getKillMessage_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getUserName <em>User Name</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getKillMessage_UserTeam()
	 * @model
	 * @generated
	 */
	String getUserTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getUserTeam <em>User Team</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getKillMessage_UserSteamID()
	 * @model
	 * @generated
	 */
	String getUserSteamID();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getUserSteamID <em>User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Steam ID</em>' attribute.
	 * @see #getUserSteamID()
	 * @generated
	 */
	void setUserSteamID(String value);

	/**
	 * Returns the value of the '<em><b>Killer Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killer Pos X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killer Pos X</em>' attribute.
	 * @see #setKillerPosX(int)
	 * @see MessagesModel.ModelPackage#getKillMessage_KillerPosX()
	 * @model
	 * @generated
	 */
	int getKillerPosX();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKillerPosX <em>Killer Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killer Pos X</em>' attribute.
	 * @see #getKillerPosX()
	 * @generated
	 */
	void setKillerPosX(int value);

	/**
	 * Returns the value of the '<em><b>Killer Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killer Pos Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killer Pos Y</em>' attribute.
	 * @see #setKillerPosY(int)
	 * @see MessagesModel.ModelPackage#getKillMessage_KillerPosY()
	 * @model
	 * @generated
	 */
	int getKillerPosY();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKillerPosY <em>Killer Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killer Pos Y</em>' attribute.
	 * @see #getKillerPosY()
	 * @generated
	 */
	void setKillerPosY(int value);

	/**
	 * Returns the value of the '<em><b>Killer Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killer Pos Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killer Pos Z</em>' attribute.
	 * @see #setKillerPosZ(int)
	 * @see MessagesModel.ModelPackage#getKillMessage_KillerPosZ()
	 * @model
	 * @generated
	 */
	int getKillerPosZ();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKillerPosZ <em>Killer Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killer Pos Z</em>' attribute.
	 * @see #getKillerPosZ()
	 * @generated
	 */
	void setKillerPosZ(int value);

	/**
	 * Returns the value of the '<em><b>Killed User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed User ID</em>' attribute.
	 * @see #setKilledUserID(String)
	 * @see MessagesModel.ModelPackage#getKillMessage_KilledUserID()
	 * @model
	 * @generated
	 */
	String getKilledUserID();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKilledUserID <em>Killed User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killed User ID</em>' attribute.
	 * @see #getKilledUserID()
	 * @generated
	 */
	void setKilledUserID(String value);

	/**
	 * Returns the value of the '<em><b>Killed User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed User Name</em>' attribute.
	 * @see #setKilledUserName(String)
	 * @see MessagesModel.ModelPackage#getKillMessage_KilledUserName()
	 * @model
	 * @generated
	 */
	String getKilledUserName();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKilledUserName <em>Killed User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killed User Name</em>' attribute.
	 * @see #getKilledUserName()
	 * @generated
	 */
	void setKilledUserName(String value);

	/**
	 * Returns the value of the '<em><b>Killed User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed User Team</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed User Team</em>' attribute.
	 * @see #setKilledUserTeam(String)
	 * @see MessagesModel.ModelPackage#getKillMessage_KilledUserTeam()
	 * @model
	 * @generated
	 */
	String getKilledUserTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKilledUserTeam <em>Killed User Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killed User Team</em>' attribute.
	 * @see #getKilledUserTeam()
	 * @generated
	 */
	void setKilledUserTeam(String value);

	/**
	 * Returns the value of the '<em><b>Killed User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed User Steam ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed User Steam ID</em>' attribute.
	 * @see #setKilledUserSteamID(String)
	 * @see MessagesModel.ModelPackage#getKillMessage_KilledUserSteamID()
	 * @model
	 * @generated
	 */
	String getKilledUserSteamID();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKilledUserSteamID <em>Killed User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killed User Steam ID</em>' attribute.
	 * @see #getKilledUserSteamID()
	 * @generated
	 */
	void setKilledUserSteamID(String value);

	/**
	 * Returns the value of the '<em><b>Killed Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed Pos X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed Pos X</em>' attribute.
	 * @see #setKilledPosX(int)
	 * @see MessagesModel.ModelPackage#getKillMessage_KilledPosX()
	 * @model
	 * @generated
	 */
	int getKilledPosX();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKilledPosX <em>Killed Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killed Pos X</em>' attribute.
	 * @see #getKilledPosX()
	 * @generated
	 */
	void setKilledPosX(int value);

	/**
	 * Returns the value of the '<em><b>Killed Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed Pos Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed Pos Y</em>' attribute.
	 * @see #setKilledPosY(int)
	 * @see MessagesModel.ModelPackage#getKillMessage_KilledPosY()
	 * @model
	 * @generated
	 */
	int getKilledPosY();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKilledPosY <em>Killed Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killed Pos Y</em>' attribute.
	 * @see #getKilledPosY()
	 * @generated
	 */
	void setKilledPosY(int value);

	/**
	 * Returns the value of the '<em><b>Killed Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed Pos Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed Pos Z</em>' attribute.
	 * @see #setKilledPosZ(int)
	 * @see MessagesModel.ModelPackage#getKillMessage_KilledPosZ()
	 * @model
	 * @generated
	 */
	int getKilledPosZ();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getKilledPosZ <em>Killed Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killed Pos Z</em>' attribute.
	 * @see #getKilledPosZ()
	 * @generated
	 */
	void setKilledPosZ(int value);

	/**
	 * Returns the value of the '<em><b>Weapon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weapon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weapon</em>' attribute.
	 * @see #setWeapon(String)
	 * @see MessagesModel.ModelPackage#getKillMessage_Weapon()
	 * @model
	 * @generated
	 */
	String getWeapon();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#getWeapon <em>Weapon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weapon</em>' attribute.
	 * @see #getWeapon()
	 * @generated
	 */
	void setWeapon(String value);

	/**
	 * Returns the value of the '<em><b>Headshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headshot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headshot</em>' attribute.
	 * @see #setHeadshot(boolean)
	 * @see MessagesModel.ModelPackage#getKillMessage_Headshot()
	 * @model
	 * @generated
	 */
	boolean isHeadshot();

	/**
	 * Sets the value of the '{@link MessagesModel.KillMessage#isHeadshot <em>Headshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headshot</em>' attribute.
	 * @see #isHeadshot()
	 * @generated
	 */
	void setHeadshot(boolean value);

} // KillMessage
