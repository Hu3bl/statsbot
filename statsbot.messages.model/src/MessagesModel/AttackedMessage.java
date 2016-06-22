/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attacked Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerName <em>Attacker Name</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerUserID <em>Attacker User ID</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerSteamID <em>Attacker Steam ID</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerTeam <em>Attacker Team</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerPosX <em>Attacker Pos X</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerPosY <em>Attacker Pos Y</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerPosZ <em>Attacker Pos Z</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerWeapon <em>Attacker Weapon</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerDamage <em>Attacker Damage</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerDamageArmor <em>Attacker Damage Armor</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getAttackerHitGroup <em>Attacker Hit Group</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimName <em>Victim Name</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimUserID <em>Victim User ID</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimSteamID <em>Victim Steam ID</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimTeam <em>Victim Team</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimPosX <em>Victim Pos X</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimPosY <em>Victim Pos Y</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimPosZ <em>Victim Pos Z</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimHealth <em>Victim Health</em>}</li>
 *   <li>{@link MessagesModel.AttackedMessage#getVictimArmor <em>Victim Armor</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getAttackedMessage()
 * @model
 * @generated
 */
public interface AttackedMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Attacker Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Name</em>' attribute.
	 * @see #setAttackerName(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerName()
	 * @model
	 * @generated
	 */
	String getAttackerName();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerName <em>Attacker Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Name</em>' attribute.
	 * @see #getAttackerName()
	 * @generated
	 */
	void setAttackerName(String value);

	/**
	 * Returns the value of the '<em><b>Attacker User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker User ID</em>' attribute.
	 * @see #setAttackerUserID(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerUserID()
	 * @model
	 * @generated
	 */
	String getAttackerUserID();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerUserID <em>Attacker User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker User ID</em>' attribute.
	 * @see #getAttackerUserID()
	 * @generated
	 */
	void setAttackerUserID(String value);

	/**
	 * Returns the value of the '<em><b>Attacker Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Steam ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Steam ID</em>' attribute.
	 * @see #setAttackerSteamID(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerSteamID()
	 * @model
	 * @generated
	 */
	String getAttackerSteamID();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerSteamID <em>Attacker Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Steam ID</em>' attribute.
	 * @see #getAttackerSteamID()
	 * @generated
	 */
	void setAttackerSteamID(String value);

	/**
	 * Returns the value of the '<em><b>Attacker Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Team</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Team</em>' attribute.
	 * @see #setAttackerTeam(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerTeam()
	 * @model
	 * @generated
	 */
	String getAttackerTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerTeam <em>Attacker Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Team</em>' attribute.
	 * @see #getAttackerTeam()
	 * @generated
	 */
	void setAttackerTeam(String value);

	/**
	 * Returns the value of the '<em><b>Attacker Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Pos X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Pos X</em>' attribute.
	 * @see #setAttackerPosX(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerPosX()
	 * @model
	 * @generated
	 */
	int getAttackerPosX();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerPosX <em>Attacker Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Pos X</em>' attribute.
	 * @see #getAttackerPosX()
	 * @generated
	 */
	void setAttackerPosX(int value);

	/**
	 * Returns the value of the '<em><b>Attacker Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Pos Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Pos Y</em>' attribute.
	 * @see #setAttackerPosY(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerPosY()
	 * @model
	 * @generated
	 */
	int getAttackerPosY();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerPosY <em>Attacker Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Pos Y</em>' attribute.
	 * @see #getAttackerPosY()
	 * @generated
	 */
	void setAttackerPosY(int value);

	/**
	 * Returns the value of the '<em><b>Attacker Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Pos Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Pos Z</em>' attribute.
	 * @see #setAttackerPosZ(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerPosZ()
	 * @model
	 * @generated
	 */
	int getAttackerPosZ();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerPosZ <em>Attacker Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Pos Z</em>' attribute.
	 * @see #getAttackerPosZ()
	 * @generated
	 */
	void setAttackerPosZ(int value);

	/**
	 * Returns the value of the '<em><b>Attacker Weapon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Weapon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Weapon</em>' attribute.
	 * @see #setAttackerWeapon(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerWeapon()
	 * @model
	 * @generated
	 */
	String getAttackerWeapon();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerWeapon <em>Attacker Weapon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Weapon</em>' attribute.
	 * @see #getAttackerWeapon()
	 * @generated
	 */
	void setAttackerWeapon(String value);

	/**
	 * Returns the value of the '<em><b>Attacker Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Damage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Damage</em>' attribute.
	 * @see #setAttackerDamage(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerDamage()
	 * @model
	 * @generated
	 */
	int getAttackerDamage();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerDamage <em>Attacker Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Damage</em>' attribute.
	 * @see #getAttackerDamage()
	 * @generated
	 */
	void setAttackerDamage(int value);

	/**
	 * Returns the value of the '<em><b>Attacker Damage Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Damage Armor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Damage Armor</em>' attribute.
	 * @see #setAttackerDamageArmor(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerDamageArmor()
	 * @model
	 * @generated
	 */
	int getAttackerDamageArmor();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerDamageArmor <em>Attacker Damage Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Damage Armor</em>' attribute.
	 * @see #getAttackerDamageArmor()
	 * @generated
	 */
	void setAttackerDamageArmor(int value);

	/**
	 * Returns the value of the '<em><b>Attacker Hit Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacker Hit Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacker Hit Group</em>' attribute.
	 * @see #setAttackerHitGroup(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_AttackerHitGroup()
	 * @model
	 * @generated
	 */
	String getAttackerHitGroup();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getAttackerHitGroup <em>Attacker Hit Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attacker Hit Group</em>' attribute.
	 * @see #getAttackerHitGroup()
	 * @generated
	 */
	void setAttackerHitGroup(String value);

	/**
	 * Returns the value of the '<em><b>Victim Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Name</em>' attribute.
	 * @see #setVictimName(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimName()
	 * @model
	 * @generated
	 */
	String getVictimName();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimName <em>Victim Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Name</em>' attribute.
	 * @see #getVictimName()
	 * @generated
	 */
	void setVictimName(String value);

	/**
	 * Returns the value of the '<em><b>Victim User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim User ID</em>' attribute.
	 * @see #setVictimUserID(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimUserID()
	 * @model
	 * @generated
	 */
	String getVictimUserID();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimUserID <em>Victim User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim User ID</em>' attribute.
	 * @see #getVictimUserID()
	 * @generated
	 */
	void setVictimUserID(String value);

	/**
	 * Returns the value of the '<em><b>Victim Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim Steam ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Steam ID</em>' attribute.
	 * @see #setVictimSteamID(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimSteamID()
	 * @model
	 * @generated
	 */
	String getVictimSteamID();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimSteamID <em>Victim Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Steam ID</em>' attribute.
	 * @see #getVictimSteamID()
	 * @generated
	 */
	void setVictimSteamID(String value);

	/**
	 * Returns the value of the '<em><b>Victim Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim Team</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Team</em>' attribute.
	 * @see #setVictimTeam(String)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimTeam()
	 * @model
	 * @generated
	 */
	String getVictimTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimTeam <em>Victim Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Team</em>' attribute.
	 * @see #getVictimTeam()
	 * @generated
	 */
	void setVictimTeam(String value);

	/**
	 * Returns the value of the '<em><b>Victim Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim Pos X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Pos X</em>' attribute.
	 * @see #setVictimPosX(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimPosX()
	 * @model
	 * @generated
	 */
	int getVictimPosX();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimPosX <em>Victim Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Pos X</em>' attribute.
	 * @see #getVictimPosX()
	 * @generated
	 */
	void setVictimPosX(int value);

	/**
	 * Returns the value of the '<em><b>Victim Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim Pos Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Pos Y</em>' attribute.
	 * @see #setVictimPosY(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimPosY()
	 * @model
	 * @generated
	 */
	int getVictimPosY();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimPosY <em>Victim Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Pos Y</em>' attribute.
	 * @see #getVictimPosY()
	 * @generated
	 */
	void setVictimPosY(int value);

	/**
	 * Returns the value of the '<em><b>Victim Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim Pos Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Pos Z</em>' attribute.
	 * @see #setVictimPosZ(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimPosZ()
	 * @model
	 * @generated
	 */
	int getVictimPosZ();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimPosZ <em>Victim Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Pos Z</em>' attribute.
	 * @see #getVictimPosZ()
	 * @generated
	 */
	void setVictimPosZ(int value);

	/**
	 * Returns the value of the '<em><b>Victim Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim Health</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Health</em>' attribute.
	 * @see #setVictimHealth(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimHealth()
	 * @model
	 * @generated
	 */
	int getVictimHealth();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimHealth <em>Victim Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Health</em>' attribute.
	 * @see #getVictimHealth()
	 * @generated
	 */
	void setVictimHealth(int value);

	/**
	 * Returns the value of the '<em><b>Victim Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Victim Armor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Victim Armor</em>' attribute.
	 * @see #setVictimArmor(int)
	 * @see MessagesModel.ModelPackage#getAttackedMessage_VictimArmor()
	 * @model
	 * @generated
	 */
	int getVictimArmor();

	/**
	 * Sets the value of the '{@link MessagesModel.AttackedMessage#getVictimArmor <em>Victim Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Victim Armor</em>' attribute.
	 * @see #getVictimArmor()
	 * @generated
	 */
	void setVictimArmor(int value);

} // AttackedMessage
