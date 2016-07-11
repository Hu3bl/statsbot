/**
 */
package MessagesModel.impl;

import MessagesModel.KillMessage;
import MessagesModel.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kill Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getUserTeam <em>User Team</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getUserSteamID <em>User Steam ID</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKillerPosX <em>Killer Pos X</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKillerPosY <em>Killer Pos Y</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKillerPosZ <em>Killer Pos Z</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKilledUserID <em>Killed User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKilledUserName <em>Killed User Name</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKilledUserTeam <em>Killed User Team</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKilledUserSteamID <em>Killed User Steam ID</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKilledPosX <em>Killed Pos X</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKilledPosY <em>Killed Pos Y</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getKilledPosZ <em>Killed Pos Z</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#isHeadshot <em>Headshot</em>}</li>
 *   <li>{@link MessagesModel.impl.KillMessageImpl#isPenetrated <em>Penetrated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KillMessageImpl extends MessageImpl implements KillMessage {
	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserTeam() <em>User Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_TEAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserTeam() <em>User Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserTeam()
	 * @generated
	 * @ordered
	 */
	protected String userTeam = USER_TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserSteamID() <em>User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSteamID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_STEAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserSteamID() <em>User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserSteamID()
	 * @generated
	 * @ordered
	 */
	protected String userSteamID = USER_STEAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKillerPosX() <em>Killer Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKillerPosX()
	 * @generated
	 * @ordered
	 */
	protected static final int KILLER_POS_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKillerPosX() <em>Killer Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKillerPosX()
	 * @generated
	 * @ordered
	 */
	protected int killerPosX = KILLER_POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getKillerPosY() <em>Killer Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKillerPosY()
	 * @generated
	 * @ordered
	 */
	protected static final int KILLER_POS_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKillerPosY() <em>Killer Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKillerPosY()
	 * @generated
	 * @ordered
	 */
	protected int killerPosY = KILLER_POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getKillerPosZ() <em>Killer Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKillerPosZ()
	 * @generated
	 * @ordered
	 */
	protected static final int KILLER_POS_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKillerPosZ() <em>Killer Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKillerPosZ()
	 * @generated
	 * @ordered
	 */
	protected int killerPosZ = KILLER_POS_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getKilledUserID() <em>Killed User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String KILLED_USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKilledUserID() <em>Killed User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledUserID()
	 * @generated
	 * @ordered
	 */
	protected String killedUserID = KILLED_USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKilledUserName() <em>Killed User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String KILLED_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKilledUserName() <em>Killed User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledUserName()
	 * @generated
	 * @ordered
	 */
	protected String killedUserName = KILLED_USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKilledUserTeam() <em>Killed User Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledUserTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String KILLED_USER_TEAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKilledUserTeam() <em>Killed User Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledUserTeam()
	 * @generated
	 * @ordered
	 */
	protected String killedUserTeam = KILLED_USER_TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getKilledUserSteamID() <em>Killed User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledUserSteamID()
	 * @generated
	 * @ordered
	 */
	protected static final String KILLED_USER_STEAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKilledUserSteamID() <em>Killed User Steam ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledUserSteamID()
	 * @generated
	 * @ordered
	 */
	protected String killedUserSteamID = KILLED_USER_STEAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKilledPosX() <em>Killed Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledPosX()
	 * @generated
	 * @ordered
	 */
	protected static final int KILLED_POS_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKilledPosX() <em>Killed Pos X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledPosX()
	 * @generated
	 * @ordered
	 */
	protected int killedPosX = KILLED_POS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getKilledPosY() <em>Killed Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledPosY()
	 * @generated
	 * @ordered
	 */
	protected static final int KILLED_POS_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKilledPosY() <em>Killed Pos Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledPosY()
	 * @generated
	 * @ordered
	 */
	protected int killedPosY = KILLED_POS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getKilledPosZ() <em>Killed Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledPosZ()
	 * @generated
	 * @ordered
	 */
	protected static final int KILLED_POS_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKilledPosZ() <em>Killed Pos Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKilledPosZ()
	 * @generated
	 * @ordered
	 */
	protected int killedPosZ = KILLED_POS_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeapon() <em>Weapon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeapon()
	 * @generated
	 * @ordered
	 */
	protected static final String WEAPON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeapon() <em>Weapon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeapon()
	 * @generated
	 * @ordered
	 */
	protected String weapon = WEAPON_EDEFAULT;

	/**
	 * The default value of the '{@link #isHeadshot() <em>Headshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeadshot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEADSHOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeadshot() <em>Headshot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeadshot()
	 * @generated
	 * @ordered
	 */
	protected boolean headshot = HEADSHOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPenetrated() <em>Penetrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPenetrated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PENETRATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPenetrated() <em>Penetrated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPenetrated()
	 * @generated
	 * @ordered
	 */
	protected boolean penetrated = PENETRATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KillMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.KILL_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserTeam() {
		return userTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserTeam(String newUserTeam) {
		String oldUserTeam = userTeam;
		userTeam = newUserTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__USER_TEAM, oldUserTeam, userTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserSteamID() {
		return userSteamID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserSteamID(String newUserSteamID) {
		String oldUserSteamID = userSteamID;
		userSteamID = newUserSteamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__USER_STEAM_ID, oldUserSteamID, userSteamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKillerPosX() {
		return killerPosX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKillerPosX(int newKillerPosX) {
		int oldKillerPosX = killerPosX;
		killerPosX = newKillerPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLER_POS_X, oldKillerPosX, killerPosX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKillerPosY() {
		return killerPosY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKillerPosY(int newKillerPosY) {
		int oldKillerPosY = killerPosY;
		killerPosY = newKillerPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLER_POS_Y, oldKillerPosY, killerPosY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKillerPosZ() {
		return killerPosZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKillerPosZ(int newKillerPosZ) {
		int oldKillerPosZ = killerPosZ;
		killerPosZ = newKillerPosZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLER_POS_Z, oldKillerPosZ, killerPosZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKilledUserID() {
		return killedUserID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilledUserID(String newKilledUserID) {
		String oldKilledUserID = killedUserID;
		killedUserID = newKilledUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLED_USER_ID, oldKilledUserID, killedUserID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKilledUserName() {
		return killedUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilledUserName(String newKilledUserName) {
		String oldKilledUserName = killedUserName;
		killedUserName = newKilledUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLED_USER_NAME, oldKilledUserName, killedUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKilledUserTeam() {
		return killedUserTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilledUserTeam(String newKilledUserTeam) {
		String oldKilledUserTeam = killedUserTeam;
		killedUserTeam = newKilledUserTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLED_USER_TEAM, oldKilledUserTeam, killedUserTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKilledUserSteamID() {
		return killedUserSteamID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilledUserSteamID(String newKilledUserSteamID) {
		String oldKilledUserSteamID = killedUserSteamID;
		killedUserSteamID = newKilledUserSteamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLED_USER_STEAM_ID, oldKilledUserSteamID, killedUserSteamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKilledPosX() {
		return killedPosX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilledPosX(int newKilledPosX) {
		int oldKilledPosX = killedPosX;
		killedPosX = newKilledPosX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLED_POS_X, oldKilledPosX, killedPosX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKilledPosY() {
		return killedPosY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilledPosY(int newKilledPosY) {
		int oldKilledPosY = killedPosY;
		killedPosY = newKilledPosY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLED_POS_Y, oldKilledPosY, killedPosY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKilledPosZ() {
		return killedPosZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKilledPosZ(int newKilledPosZ) {
		int oldKilledPosZ = killedPosZ;
		killedPosZ = newKilledPosZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__KILLED_POS_Z, oldKilledPosZ, killedPosZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeapon() {
		return weapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeapon(String newWeapon) {
		String oldWeapon = weapon;
		weapon = newWeapon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__WEAPON, oldWeapon, weapon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHeadshot() {
		return headshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeadshot(boolean newHeadshot) {
		boolean oldHeadshot = headshot;
		headshot = newHeadshot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__HEADSHOT, oldHeadshot, headshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPenetrated() {
		return penetrated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenetrated(boolean newPenetrated) {
		boolean oldPenetrated = penetrated;
		penetrated = newPenetrated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_MESSAGE__PENETRATED, oldPenetrated, penetrated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.KILL_MESSAGE__USER_ID:
				return getUserID();
			case ModelPackage.KILL_MESSAGE__USER_NAME:
				return getUserName();
			case ModelPackage.KILL_MESSAGE__USER_TEAM:
				return getUserTeam();
			case ModelPackage.KILL_MESSAGE__USER_STEAM_ID:
				return getUserSteamID();
			case ModelPackage.KILL_MESSAGE__KILLER_POS_X:
				return getKillerPosX();
			case ModelPackage.KILL_MESSAGE__KILLER_POS_Y:
				return getKillerPosY();
			case ModelPackage.KILL_MESSAGE__KILLER_POS_Z:
				return getKillerPosZ();
			case ModelPackage.KILL_MESSAGE__KILLED_USER_ID:
				return getKilledUserID();
			case ModelPackage.KILL_MESSAGE__KILLED_USER_NAME:
				return getKilledUserName();
			case ModelPackage.KILL_MESSAGE__KILLED_USER_TEAM:
				return getKilledUserTeam();
			case ModelPackage.KILL_MESSAGE__KILLED_USER_STEAM_ID:
				return getKilledUserSteamID();
			case ModelPackage.KILL_MESSAGE__KILLED_POS_X:
				return getKilledPosX();
			case ModelPackage.KILL_MESSAGE__KILLED_POS_Y:
				return getKilledPosY();
			case ModelPackage.KILL_MESSAGE__KILLED_POS_Z:
				return getKilledPosZ();
			case ModelPackage.KILL_MESSAGE__WEAPON:
				return getWeapon();
			case ModelPackage.KILL_MESSAGE__HEADSHOT:
				return isHeadshot();
			case ModelPackage.KILL_MESSAGE__PENETRATED:
				return isPenetrated();
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
			case ModelPackage.KILL_MESSAGE__USER_ID:
				setUserID((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__USER_NAME:
				setUserName((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__USER_TEAM:
				setUserTeam((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__USER_STEAM_ID:
				setUserSteamID((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLER_POS_X:
				setKillerPosX((Integer)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLER_POS_Y:
				setKillerPosY((Integer)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLER_POS_Z:
				setKillerPosZ((Integer)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_ID:
				setKilledUserID((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_NAME:
				setKilledUserName((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_TEAM:
				setKilledUserTeam((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_STEAM_ID:
				setKilledUserSteamID((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_POS_X:
				setKilledPosX((Integer)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_POS_Y:
				setKilledPosY((Integer)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_POS_Z:
				setKilledPosZ((Integer)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__WEAPON:
				setWeapon((String)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__HEADSHOT:
				setHeadshot((Boolean)newValue);
				return;
			case ModelPackage.KILL_MESSAGE__PENETRATED:
				setPenetrated((Boolean)newValue);
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
			case ModelPackage.KILL_MESSAGE__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__USER_TEAM:
				setUserTeam(USER_TEAM_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__USER_STEAM_ID:
				setUserSteamID(USER_STEAM_ID_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLER_POS_X:
				setKillerPosX(KILLER_POS_X_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLER_POS_Y:
				setKillerPosY(KILLER_POS_Y_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLER_POS_Z:
				setKillerPosZ(KILLER_POS_Z_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_ID:
				setKilledUserID(KILLED_USER_ID_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_NAME:
				setKilledUserName(KILLED_USER_NAME_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_TEAM:
				setKilledUserTeam(KILLED_USER_TEAM_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_STEAM_ID:
				setKilledUserSteamID(KILLED_USER_STEAM_ID_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_POS_X:
				setKilledPosX(KILLED_POS_X_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_POS_Y:
				setKilledPosY(KILLED_POS_Y_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__KILLED_POS_Z:
				setKilledPosZ(KILLED_POS_Z_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__WEAPON:
				setWeapon(WEAPON_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__HEADSHOT:
				setHeadshot(HEADSHOT_EDEFAULT);
				return;
			case ModelPackage.KILL_MESSAGE__PENETRATED:
				setPenetrated(PENETRATED_EDEFAULT);
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
			case ModelPackage.KILL_MESSAGE__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case ModelPackage.KILL_MESSAGE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case ModelPackage.KILL_MESSAGE__USER_TEAM:
				return USER_TEAM_EDEFAULT == null ? userTeam != null : !USER_TEAM_EDEFAULT.equals(userTeam);
			case ModelPackage.KILL_MESSAGE__USER_STEAM_ID:
				return USER_STEAM_ID_EDEFAULT == null ? userSteamID != null : !USER_STEAM_ID_EDEFAULT.equals(userSteamID);
			case ModelPackage.KILL_MESSAGE__KILLER_POS_X:
				return killerPosX != KILLER_POS_X_EDEFAULT;
			case ModelPackage.KILL_MESSAGE__KILLER_POS_Y:
				return killerPosY != KILLER_POS_Y_EDEFAULT;
			case ModelPackage.KILL_MESSAGE__KILLER_POS_Z:
				return killerPosZ != KILLER_POS_Z_EDEFAULT;
			case ModelPackage.KILL_MESSAGE__KILLED_USER_ID:
				return KILLED_USER_ID_EDEFAULT == null ? killedUserID != null : !KILLED_USER_ID_EDEFAULT.equals(killedUserID);
			case ModelPackage.KILL_MESSAGE__KILLED_USER_NAME:
				return KILLED_USER_NAME_EDEFAULT == null ? killedUserName != null : !KILLED_USER_NAME_EDEFAULT.equals(killedUserName);
			case ModelPackage.KILL_MESSAGE__KILLED_USER_TEAM:
				return KILLED_USER_TEAM_EDEFAULT == null ? killedUserTeam != null : !KILLED_USER_TEAM_EDEFAULT.equals(killedUserTeam);
			case ModelPackage.KILL_MESSAGE__KILLED_USER_STEAM_ID:
				return KILLED_USER_STEAM_ID_EDEFAULT == null ? killedUserSteamID != null : !KILLED_USER_STEAM_ID_EDEFAULT.equals(killedUserSteamID);
			case ModelPackage.KILL_MESSAGE__KILLED_POS_X:
				return killedPosX != KILLED_POS_X_EDEFAULT;
			case ModelPackage.KILL_MESSAGE__KILLED_POS_Y:
				return killedPosY != KILLED_POS_Y_EDEFAULT;
			case ModelPackage.KILL_MESSAGE__KILLED_POS_Z:
				return killedPosZ != KILLED_POS_Z_EDEFAULT;
			case ModelPackage.KILL_MESSAGE__WEAPON:
				return WEAPON_EDEFAULT == null ? weapon != null : !WEAPON_EDEFAULT.equals(weapon);
			case ModelPackage.KILL_MESSAGE__HEADSHOT:
				return headshot != HEADSHOT_EDEFAULT;
			case ModelPackage.KILL_MESSAGE__PENETRATED:
				return penetrated != PENETRATED_EDEFAULT;
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
		result.append(" (userID: ");
		result.append(userID);
		result.append(", userName: ");
		result.append(userName);
		result.append(", userTeam: ");
		result.append(userTeam);
		result.append(", userSteamID: ");
		result.append(userSteamID);
		result.append(", killerPosX: ");
		result.append(killerPosX);
		result.append(", killerPosY: ");
		result.append(killerPosY);
		result.append(", killerPosZ: ");
		result.append(killerPosZ);
		result.append(", killedUserID: ");
		result.append(killedUserID);
		result.append(", killedUserName: ");
		result.append(killedUserName);
		result.append(", killedUserTeam: ");
		result.append(killedUserTeam);
		result.append(", killedUserSteamID: ");
		result.append(killedUserSteamID);
		result.append(", killedPosX: ");
		result.append(killedPosX);
		result.append(", killedPosY: ");
		result.append(killedPosY);
		result.append(", killedPosZ: ");
		result.append(killedPosZ);
		result.append(", weapon: ");
		result.append(weapon);
		result.append(", headshot: ");
		result.append(headshot);
		result.append(", penetrated: ");
		result.append(penetrated);
		result.append(')');
		return result.toString();
	}

} //KillMessageImpl
