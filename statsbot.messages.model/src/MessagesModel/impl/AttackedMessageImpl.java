/**
 */
package MessagesModel.impl;

import MessagesModel.AttackedMessage;
import MessagesModel.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacked Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerName <em>Attacker Name</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerUserID <em>Attacker User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerSteamID <em>Attacker Steam ID</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerTeam <em>Attacker Team</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerPosX <em>Attacker Pos X</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerPosY <em>Attacker Pos Y</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerPosZ <em>Attacker Pos Z</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerWeapon <em>Attacker Weapon</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerDamage <em>Attacker Damage</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerDamageArmor <em>Attacker Damage Armor</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getAttackerHitGroup <em>Attacker Hit Group</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimName <em>Victim Name</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimUserID <em>Victim User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimSteamID <em>Victim Steam ID</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimTeam <em>Victim Team</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimPosX <em>Victim Pos X</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimPosY <em>Victim Pos Y</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimPosZ <em>Victim Pos Z</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimHealth <em>Victim Health</em>}</li>
 *   <li>{@link MessagesModel.impl.AttackedMessageImpl#getVictimArmor <em>Victim Armor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackedMessageImpl extends MessageImpl implements AttackedMessage {
	/**
	 * The default value of the '{@link #getAttackerName() <em>Attacker Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACKER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackerName() <em>Attacker Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerName()
	 * @generated
	 * @ordered
	 */
	protected String attackerName = ATTACKER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerUserID() <em>Attacker User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACKER_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackerUserID() <em>Attacker User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerUserID()
	 * @generated
	 * @ordered
	 */
	protected String attackerUserID = ATTACKER_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerSteamID() <em>Attacker Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerSteamID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACKER_STEAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackerSteamID() <em>Attacker Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerSteamID()
	 * @generated
	 * @ordered
	 */
	protected String attackerSteamID = ATTACKER_STEAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerTeam() <em>Attacker Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACKER_TEAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackerTeam() <em>Attacker Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerTeam()
	 * @generated
	 * @ordered
	 */
	protected String attackerTeam = ATTACKER_TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerPosX() <em>Attacker Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerPosX()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACKER_POS_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttackerPosX() <em>Attacker Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerPosX()
	 * @generated
	 * @ordered
	 */
	protected int attackerPosX = ATTACKER_POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerPosY() <em>Attacker Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerPosY()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACKER_POS_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttackerPosY() <em>Attacker Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerPosY()
	 * @generated
	 * @ordered
	 */
	protected int attackerPosY = ATTACKER_POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerPosZ() <em>Attacker Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerPosZ()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACKER_POS_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttackerPosZ() <em>Attacker Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerPosZ()
	 * @generated
	 * @ordered
	 */
	protected int attackerPosZ = ATTACKER_POS_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerWeapon() <em>Attacker Weapon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerWeapon()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACKER_WEAPON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackerWeapon() <em>Attacker Weapon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerWeapon()
	 * @generated
	 * @ordered
	 */
	protected String attackerWeapon = ATTACKER_WEAPON_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerDamage() <em>Attacker Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerDamage()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACKER_DAMAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttackerDamage() <em>Attacker Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerDamage()
	 * @generated
	 * @ordered
	 */
	protected int attackerDamage = ATTACKER_DAMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerDamageArmor() <em>Attacker Damage Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerDamageArmor()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACKER_DAMAGE_ARMOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttackerDamageArmor() <em>Attacker Damage Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerDamageArmor()
	 * @generated
	 * @ordered
	 */
	protected int attackerDamageArmor = ATTACKER_DAMAGE_ARMOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttackerHitGroup() <em>Attacker Hit Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerHitGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACKER_HIT_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackerHitGroup() <em>Attacker Hit Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackerHitGroup()
	 * @generated
	 * @ordered
	 */
	protected String attackerHitGroup = ATTACKER_HIT_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimName() <em>Victim Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimName()
	 * @generated
	 * @ordered
	 */
	protected static final String VICTIM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVictimName() <em>Victim Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimName()
	 * @generated
	 * @ordered
	 */
	protected String victimName = VICTIM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimUserID() <em>Victim User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String VICTIM_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVictimUserID() <em>Victim User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimUserID()
	 * @generated
	 * @ordered
	 */
	protected String victimUserID = VICTIM_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimSteamID() <em>Victim Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimSteamID()
	 * @generated
	 * @ordered
	 */
	protected static final String VICTIM_STEAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVictimSteamID() <em>Victim Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimSteamID()
	 * @generated
	 * @ordered
	 */
	protected String victimSteamID = VICTIM_STEAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimTeam() <em>Victim Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String VICTIM_TEAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVictimTeam() <em>Victim Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimTeam()
	 * @generated
	 * @ordered
	 */
	protected String victimTeam = VICTIM_TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimPosX() <em>Victim Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimPosX()
	 * @generated
	 * @ordered
	 */
	protected static final int VICTIM_POS_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVictimPosX() <em>Victim Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimPosX()
	 * @generated
	 * @ordered
	 */
	protected int victimPosX = VICTIM_POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimPosY() <em>Victim Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimPosY()
	 * @generated
	 * @ordered
	 */
	protected static final int VICTIM_POS_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVictimPosY() <em>Victim Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimPosY()
	 * @generated
	 * @ordered
	 */
	protected int victimPosY = VICTIM_POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimPosZ() <em>Victim Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimPosZ()
	 * @generated
	 * @ordered
	 */
	protected static final int VICTIM_POS_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVictimPosZ() <em>Victim Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimPosZ()
	 * @generated
	 * @ordered
	 */
	protected int victimPosZ = VICTIM_POS_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimHealth() <em>Victim Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimHealth()
	 * @generated
	 * @ordered
	 */
	protected static final int VICTIM_HEALTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVictimHealth() <em>Victim Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimHealth()
	 * @generated
	 * @ordered
	 */
	protected int victimHealth = VICTIM_HEALTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVictimArmor() <em>Victim Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimArmor()
	 * @generated
	 * @ordered
	 */
	protected static final int VICTIM_ARMOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVictimArmor() <em>Victim Armor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVictimArmor()
	 * @generated
	 * @ordered
	 */
	protected int victimArmor = VICTIM_ARMOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackedMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ATTACKED_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttackerName() {
		return attackerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerName(String newAttackerName) {
		String oldAttackerName = attackerName;
		attackerName = newAttackerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_NAME, oldAttackerName, attackerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttackerUserID() {
		return attackerUserID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerUserID(String newAttackerUserID) {
		String oldAttackerUserID = attackerUserID;
		attackerUserID = newAttackerUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_USER_ID, oldAttackerUserID, attackerUserID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttackerSteamID() {
		return attackerSteamID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerSteamID(String newAttackerSteamID) {
		String oldAttackerSteamID = attackerSteamID;
		attackerSteamID = newAttackerSteamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_STEAM_ID, oldAttackerSteamID, attackerSteamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttackerTeam() {
		return attackerTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerTeam(String newAttackerTeam) {
		String oldAttackerTeam = attackerTeam;
		attackerTeam = newAttackerTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_TEAM, oldAttackerTeam, attackerTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttackerPosX() {
		return attackerPosX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerPosX(int newAttackerPosX) {
		int oldAttackerPosX = attackerPosX;
		attackerPosX = newAttackerPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_X, oldAttackerPosX, attackerPosX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttackerPosY() {
		return attackerPosY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerPosY(int newAttackerPosY) {
		int oldAttackerPosY = attackerPosY;
		attackerPosY = newAttackerPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Y, oldAttackerPosY, attackerPosY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttackerPosZ() {
		return attackerPosZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerPosZ(int newAttackerPosZ) {
		int oldAttackerPosZ = attackerPosZ;
		attackerPosZ = newAttackerPosZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Z, oldAttackerPosZ, attackerPosZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttackerWeapon() {
		return attackerWeapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerWeapon(String newAttackerWeapon) {
		String oldAttackerWeapon = attackerWeapon;
		attackerWeapon = newAttackerWeapon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_WEAPON, oldAttackerWeapon, attackerWeapon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttackerDamage() {
		return attackerDamage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerDamage(int newAttackerDamage) {
		int oldAttackerDamage = attackerDamage;
		attackerDamage = newAttackerDamage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE, oldAttackerDamage, attackerDamage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttackerDamageArmor() {
		return attackerDamageArmor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerDamageArmor(int newAttackerDamageArmor) {
		int oldAttackerDamageArmor = attackerDamageArmor;
		attackerDamageArmor = newAttackerDamageArmor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE_ARMOR, oldAttackerDamageArmor, attackerDamageArmor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttackerHitGroup() {
		return attackerHitGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackerHitGroup(String newAttackerHitGroup) {
		String oldAttackerHitGroup = attackerHitGroup;
		attackerHitGroup = newAttackerHitGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__ATTACKER_HIT_GROUP, oldAttackerHitGroup, attackerHitGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVictimName() {
		return victimName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimName(String newVictimName) {
		String oldVictimName = victimName;
		victimName = newVictimName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_NAME, oldVictimName, victimName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVictimUserID() {
		return victimUserID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimUserID(String newVictimUserID) {
		String oldVictimUserID = victimUserID;
		victimUserID = newVictimUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_USER_ID, oldVictimUserID, victimUserID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVictimSteamID() {
		return victimSteamID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimSteamID(String newVictimSteamID) {
		String oldVictimSteamID = victimSteamID;
		victimSteamID = newVictimSteamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_STEAM_ID, oldVictimSteamID, victimSteamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVictimTeam() {
		return victimTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimTeam(String newVictimTeam) {
		String oldVictimTeam = victimTeam;
		victimTeam = newVictimTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_TEAM, oldVictimTeam, victimTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVictimPosX() {
		return victimPosX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimPosX(int newVictimPosX) {
		int oldVictimPosX = victimPosX;
		victimPosX = newVictimPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_X, oldVictimPosX, victimPosX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVictimPosY() {
		return victimPosY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimPosY(int newVictimPosY) {
		int oldVictimPosY = victimPosY;
		victimPosY = newVictimPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Y, oldVictimPosY, victimPosY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVictimPosZ() {
		return victimPosZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimPosZ(int newVictimPosZ) {
		int oldVictimPosZ = victimPosZ;
		victimPosZ = newVictimPosZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Z, oldVictimPosZ, victimPosZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVictimHealth() {
		return victimHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimHealth(int newVictimHealth) {
		int oldVictimHealth = victimHealth;
		victimHealth = newVictimHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_HEALTH, oldVictimHealth, victimHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVictimArmor() {
		return victimArmor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVictimArmor(int newVictimArmor) {
		int oldVictimArmor = victimArmor;
		victimArmor = newVictimArmor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ATTACKED_MESSAGE__VICTIM_ARMOR, oldVictimArmor, victimArmor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_NAME:
				return getAttackerName();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_USER_ID:
				return getAttackerUserID();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_STEAM_ID:
				return getAttackerSteamID();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_TEAM:
				return getAttackerTeam();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_X:
				return getAttackerPosX();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Y:
				return getAttackerPosY();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Z:
				return getAttackerPosZ();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_WEAPON:
				return getAttackerWeapon();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE:
				return getAttackerDamage();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE_ARMOR:
				return getAttackerDamageArmor();
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_HIT_GROUP:
				return getAttackerHitGroup();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_NAME:
				return getVictimName();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_USER_ID:
				return getVictimUserID();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_STEAM_ID:
				return getVictimSteamID();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_TEAM:
				return getVictimTeam();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_X:
				return getVictimPosX();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Y:
				return getVictimPosY();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Z:
				return getVictimPosZ();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_HEALTH:
				return getVictimHealth();
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_ARMOR:
				return getVictimArmor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_NAME:
				setAttackerName((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_USER_ID:
				setAttackerUserID((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_STEAM_ID:
				setAttackerSteamID((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_TEAM:
				setAttackerTeam((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_X:
				setAttackerPosX((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Y:
				setAttackerPosY((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Z:
				setAttackerPosZ((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_WEAPON:
				setAttackerWeapon((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE:
				setAttackerDamage((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE_ARMOR:
				setAttackerDamageArmor((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_HIT_GROUP:
				setAttackerHitGroup((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_NAME:
				setVictimName((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_USER_ID:
				setVictimUserID((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_STEAM_ID:
				setVictimSteamID((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_TEAM:
				setVictimTeam((String)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_X:
				setVictimPosX((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Y:
				setVictimPosY((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Z:
				setVictimPosZ((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_HEALTH:
				setVictimHealth((Integer)newValue);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_ARMOR:
				setVictimArmor((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_NAME:
				setAttackerName(ATTACKER_NAME_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_USER_ID:
				setAttackerUserID(ATTACKER_USER_ID_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_STEAM_ID:
				setAttackerSteamID(ATTACKER_STEAM_ID_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_TEAM:
				setAttackerTeam(ATTACKER_TEAM_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_X:
				setAttackerPosX(ATTACKER_POS_X_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Y:
				setAttackerPosY(ATTACKER_POS_Y_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Z:
				setAttackerPosZ(ATTACKER_POS_Z_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_WEAPON:
				setAttackerWeapon(ATTACKER_WEAPON_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE:
				setAttackerDamage(ATTACKER_DAMAGE_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE_ARMOR:
				setAttackerDamageArmor(ATTACKER_DAMAGE_ARMOR_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_HIT_GROUP:
				setAttackerHitGroup(ATTACKER_HIT_GROUP_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_NAME:
				setVictimName(VICTIM_NAME_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_USER_ID:
				setVictimUserID(VICTIM_USER_ID_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_STEAM_ID:
				setVictimSteamID(VICTIM_STEAM_ID_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_TEAM:
				setVictimTeam(VICTIM_TEAM_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_X:
				setVictimPosX(VICTIM_POS_X_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Y:
				setVictimPosY(VICTIM_POS_Y_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Z:
				setVictimPosZ(VICTIM_POS_Z_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_HEALTH:
				setVictimHealth(VICTIM_HEALTH_EDEFAULT);
				return;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_ARMOR:
				setVictimArmor(VICTIM_ARMOR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_NAME:
				return ATTACKER_NAME_EDEFAULT == null ? attackerName != null : !ATTACKER_NAME_EDEFAULT.equals(attackerName);
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_USER_ID:
				return ATTACKER_USER_ID_EDEFAULT == null ? attackerUserID != null : !ATTACKER_USER_ID_EDEFAULT.equals(attackerUserID);
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_STEAM_ID:
				return ATTACKER_STEAM_ID_EDEFAULT == null ? attackerSteamID != null : !ATTACKER_STEAM_ID_EDEFAULT.equals(attackerSteamID);
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_TEAM:
				return ATTACKER_TEAM_EDEFAULT == null ? attackerTeam != null : !ATTACKER_TEAM_EDEFAULT.equals(attackerTeam);
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_X:
				return attackerPosX != ATTACKER_POS_X_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Y:
				return attackerPosY != ATTACKER_POS_Y_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_POS_Z:
				return attackerPosZ != ATTACKER_POS_Z_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_WEAPON:
				return ATTACKER_WEAPON_EDEFAULT == null ? attackerWeapon != null : !ATTACKER_WEAPON_EDEFAULT.equals(attackerWeapon);
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE:
				return attackerDamage != ATTACKER_DAMAGE_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_DAMAGE_ARMOR:
				return attackerDamageArmor != ATTACKER_DAMAGE_ARMOR_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__ATTACKER_HIT_GROUP:
				return ATTACKER_HIT_GROUP_EDEFAULT == null ? attackerHitGroup != null : !ATTACKER_HIT_GROUP_EDEFAULT.equals(attackerHitGroup);
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_NAME:
				return VICTIM_NAME_EDEFAULT == null ? victimName != null : !VICTIM_NAME_EDEFAULT.equals(victimName);
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_USER_ID:
				return VICTIM_USER_ID_EDEFAULT == null ? victimUserID != null : !VICTIM_USER_ID_EDEFAULT.equals(victimUserID);
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_STEAM_ID:
				return VICTIM_STEAM_ID_EDEFAULT == null ? victimSteamID != null : !VICTIM_STEAM_ID_EDEFAULT.equals(victimSteamID);
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_TEAM:
				return VICTIM_TEAM_EDEFAULT == null ? victimTeam != null : !VICTIM_TEAM_EDEFAULT.equals(victimTeam);
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_X:
				return victimPosX != VICTIM_POS_X_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Y:
				return victimPosY != VICTIM_POS_Y_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_POS_Z:
				return victimPosZ != VICTIM_POS_Z_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_HEALTH:
				return victimHealth != VICTIM_HEALTH_EDEFAULT;
			case ModelPackage.ATTACKED_MESSAGE__VICTIM_ARMOR:
				return victimArmor != VICTIM_ARMOR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attackerName: ");
		result.append(attackerName);
		result.append(", attackerUserID: ");
		result.append(attackerUserID);
		result.append(", attackerSteamID: ");
		result.append(attackerSteamID);
		result.append(", attackerTeam: ");
		result.append(attackerTeam);
		result.append(", attackerPosX: ");
		result.append(attackerPosX);
		result.append(", attackerPosY: ");
		result.append(attackerPosY);
		result.append(", attackerPosZ: ");
		result.append(attackerPosZ);
		result.append(", attackerWeapon: ");
		result.append(attackerWeapon);
		result.append(", attackerDamage: ");
		result.append(attackerDamage);
		result.append(", attackerDamageArmor: ");
		result.append(attackerDamageArmor);
		result.append(", attackerHitGroup: ");
		result.append(attackerHitGroup);
		result.append(", victimName: ");
		result.append(victimName);
		result.append(", victimUserID: ");
		result.append(victimUserID);
		result.append(", victimSteamID: ");
		result.append(victimSteamID);
		result.append(", victimTeam: ");
		result.append(victimTeam);
		result.append(", victimPosX: ");
		result.append(victimPosX);
		result.append(", victimPosY: ");
		result.append(victimPosY);
		result.append(", victimPosZ: ");
		result.append(victimPosZ);
		result.append(", victimHealth: ");
		result.append(victimHealth);
		result.append(", victimArmor: ");
		result.append(victimArmor);
		result.append(')');
		return result.toString();
	}

} //AttackedMessageImpl
