/**
 */
package MessagesModel.impl;

import MessagesModel.KillAssistMessage;
import MessagesModel.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kill Assist Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.impl.KillAssistMessageImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.KillAssistMessageImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.impl.KillAssistMessageImpl#getUserTeam <em>User Team</em>}</li>
 *   <li>{@link MessagesModel.impl.KillAssistMessageImpl#getUserSteamID <em>User Steam ID</em>}</li>
 *   <li>{@link MessagesModel.impl.KillAssistMessageImpl#getKilledUserID <em>Killed User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.KillAssistMessageImpl#getKilledUserName <em>Killed User Name</em>}</li>
 *   <li>{@link MessagesModel.impl.KillAssistMessageImpl#getKilledUserTeam <em>Killed User Team</em>}</li>
 *   <li>{@link MessagesModel.impl.KillAssistMessageImpl#getKilledUserSteamID <em>Killed User Steam ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KillAssistMessageImpl extends MessageImpl implements KillAssistMessage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KillAssistMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.KILL_ASSIST_MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_ASSIST_MESSAGE__USER_ID, oldUserID, userID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_ASSIST_MESSAGE__USER_NAME, oldUserName, userName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_ASSIST_MESSAGE__USER_TEAM, oldUserTeam, userTeam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_ASSIST_MESSAGE__USER_STEAM_ID, oldUserSteamID, userSteamID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_ID, oldKilledUserID, killedUserID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_NAME, oldKilledUserName, killedUserName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_TEAM, oldKilledUserTeam, killedUserTeam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_STEAM_ID, oldKilledUserSteamID, killedUserSteamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_ID:
				return getUserID();
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_NAME:
				return getUserName();
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_TEAM:
				return getUserTeam();
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_STEAM_ID:
				return getUserSteamID();
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_ID:
				return getKilledUserID();
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_NAME:
				return getKilledUserName();
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_TEAM:
				return getKilledUserTeam();
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_STEAM_ID:
				return getKilledUserSteamID();
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
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_ID:
				setUserID((String)newValue);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_NAME:
				setUserName((String)newValue);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_TEAM:
				setUserTeam((String)newValue);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_STEAM_ID:
				setUserSteamID((String)newValue);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_ID:
				setKilledUserID((String)newValue);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_NAME:
				setKilledUserName((String)newValue);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_TEAM:
				setKilledUserTeam((String)newValue);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_STEAM_ID:
				setKilledUserSteamID((String)newValue);
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
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_TEAM:
				setUserTeam(USER_TEAM_EDEFAULT);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_STEAM_ID:
				setUserSteamID(USER_STEAM_ID_EDEFAULT);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_ID:
				setKilledUserID(KILLED_USER_ID_EDEFAULT);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_NAME:
				setKilledUserName(KILLED_USER_NAME_EDEFAULT);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_TEAM:
				setKilledUserTeam(KILLED_USER_TEAM_EDEFAULT);
				return;
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_STEAM_ID:
				setKilledUserSteamID(KILLED_USER_STEAM_ID_EDEFAULT);
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
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_TEAM:
				return USER_TEAM_EDEFAULT == null ? userTeam != null : !USER_TEAM_EDEFAULT.equals(userTeam);
			case ModelPackage.KILL_ASSIST_MESSAGE__USER_STEAM_ID:
				return USER_STEAM_ID_EDEFAULT == null ? userSteamID != null : !USER_STEAM_ID_EDEFAULT.equals(userSteamID);
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_ID:
				return KILLED_USER_ID_EDEFAULT == null ? killedUserID != null : !KILLED_USER_ID_EDEFAULT.equals(killedUserID);
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_NAME:
				return KILLED_USER_NAME_EDEFAULT == null ? killedUserName != null : !KILLED_USER_NAME_EDEFAULT.equals(killedUserName);
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_TEAM:
				return KILLED_USER_TEAM_EDEFAULT == null ? killedUserTeam != null : !KILLED_USER_TEAM_EDEFAULT.equals(killedUserTeam);
			case ModelPackage.KILL_ASSIST_MESSAGE__KILLED_USER_STEAM_ID:
				return KILLED_USER_STEAM_ID_EDEFAULT == null ? killedUserSteamID != null : !KILLED_USER_STEAM_ID_EDEFAULT.equals(killedUserSteamID);
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
		result.append(", killedUserID: ");
		result.append(killedUserID);
		result.append(", killedUserName: ");
		result.append(killedUserName);
		result.append(", killedUserTeam: ");
		result.append(killedUserTeam);
		result.append(", killedUserSteamID: ");
		result.append(killedUserSteamID);
		result.append(')');
		return result.toString();
	}

} //KillAssistMessageImpl
