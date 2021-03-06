/**
 */
package MessagesModel.impl;

import MessagesModel.ChangeNameMessage;
import MessagesModel.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Name Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.impl.ChangeNameMessageImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.ChangeNameMessageImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.impl.ChangeNameMessageImpl#getUserTeam <em>User Team</em>}</li>
 *   <li>{@link MessagesModel.impl.ChangeNameMessageImpl#getUserSteamID <em>User Steam ID</em>}</li>
 *   <li>{@link MessagesModel.impl.ChangeNameMessageImpl#getNewUserName <em>New User Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeNameMessageImpl extends MessageImpl implements ChangeNameMessage {
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
	 * The default value of the '{@link #getNewUserName() <em>New User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewUserName() <em>New User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewUserName()
	 * @generated
	 * @ordered
	 */
	protected String newUserName = NEW_USER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeNameMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CHANGE_NAME_MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHANGE_NAME_MESSAGE__USER_ID, oldUserID, userID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHANGE_NAME_MESSAGE__USER_NAME, oldUserName, userName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHANGE_NAME_MESSAGE__USER_TEAM, oldUserTeam, userTeam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHANGE_NAME_MESSAGE__USER_STEAM_ID, oldUserSteamID, userSteamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewUserName() {
		return newUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewUserName(String newNewUserName) {
		String oldNewUserName = newUserName;
		newUserName = newNewUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CHANGE_NAME_MESSAGE__NEW_USER_NAME, oldNewUserName, newUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_ID:
				return getUserID();
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_NAME:
				return getUserName();
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_TEAM:
				return getUserTeam();
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_STEAM_ID:
				return getUserSteamID();
			case ModelPackage.CHANGE_NAME_MESSAGE__NEW_USER_NAME:
				return getNewUserName();
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
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_ID:
				setUserID((String)newValue);
				return;
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_NAME:
				setUserName((String)newValue);
				return;
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_TEAM:
				setUserTeam((String)newValue);
				return;
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_STEAM_ID:
				setUserSteamID((String)newValue);
				return;
			case ModelPackage.CHANGE_NAME_MESSAGE__NEW_USER_NAME:
				setNewUserName((String)newValue);
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
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_TEAM:
				setUserTeam(USER_TEAM_EDEFAULT);
				return;
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_STEAM_ID:
				setUserSteamID(USER_STEAM_ID_EDEFAULT);
				return;
			case ModelPackage.CHANGE_NAME_MESSAGE__NEW_USER_NAME:
				setNewUserName(NEW_USER_NAME_EDEFAULT);
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
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_TEAM:
				return USER_TEAM_EDEFAULT == null ? userTeam != null : !USER_TEAM_EDEFAULT.equals(userTeam);
			case ModelPackage.CHANGE_NAME_MESSAGE__USER_STEAM_ID:
				return USER_STEAM_ID_EDEFAULT == null ? userSteamID != null : !USER_STEAM_ID_EDEFAULT.equals(userSteamID);
			case ModelPackage.CHANGE_NAME_MESSAGE__NEW_USER_NAME:
				return NEW_USER_NAME_EDEFAULT == null ? newUserName != null : !NEW_USER_NAME_EDEFAULT.equals(newUserName);
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
		result.append(", newUserName: ");
		result.append(newUserName);
		result.append(')');
		return result.toString();
	}

} //ChangeNameMessageImpl
