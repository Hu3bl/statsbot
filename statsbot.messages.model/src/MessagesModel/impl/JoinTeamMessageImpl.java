/**
 */
package MessagesModel.impl;

import MessagesModel.JoinTeamMessage;
import MessagesModel.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Team Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.impl.JoinTeamMessageImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.JoinTeamMessageImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.impl.JoinTeamMessageImpl#getUserTeam <em>User Team</em>}</li>
 *   <li>{@link MessagesModel.impl.JoinTeamMessageImpl#getUserStreamID <em>User Stream ID</em>}</li>
 *   <li>{@link MessagesModel.impl.JoinTeamMessageImpl#getJoinedTeam <em>Joined Team</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinTeamMessageImpl extends MessageImpl implements JoinTeamMessage {
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
	 * The default value of the '{@link #getUserStreamID() <em>User Stream ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserStreamID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_STREAM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserStreamID() <em>User Stream ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserStreamID()
	 * @generated
	 * @ordered
	 */
	protected String userStreamID = USER_STREAM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getJoinedTeam() <em>Joined Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinedTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String JOINED_TEAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoinedTeam() <em>Joined Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinedTeam()
	 * @generated
	 * @ordered
	 */
	protected String joinedTeam = JOINED_TEAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinTeamMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.JOIN_TEAM_MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JOIN_TEAM_MESSAGE__USER_ID, oldUserID, userID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JOIN_TEAM_MESSAGE__USER_NAME, oldUserName, userName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JOIN_TEAM_MESSAGE__USER_TEAM, oldUserTeam, userTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserStreamID() {
		return userStreamID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserStreamID(String newUserStreamID) {
		String oldUserStreamID = userStreamID;
		userStreamID = newUserStreamID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JOIN_TEAM_MESSAGE__USER_STREAM_ID, oldUserStreamID, userStreamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJoinedTeam() {
		return joinedTeam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinedTeam(String newJoinedTeam) {
		String oldJoinedTeam = joinedTeam;
		joinedTeam = newJoinedTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.JOIN_TEAM_MESSAGE__JOINED_TEAM, oldJoinedTeam, joinedTeam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_ID:
				return getUserID();
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_NAME:
				return getUserName();
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_TEAM:
				return getUserTeam();
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_STREAM_ID:
				return getUserStreamID();
			case ModelPackage.JOIN_TEAM_MESSAGE__JOINED_TEAM:
				return getJoinedTeam();
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
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_ID:
				setUserID((String)newValue);
				return;
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_NAME:
				setUserName((String)newValue);
				return;
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_TEAM:
				setUserTeam((String)newValue);
				return;
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_STREAM_ID:
				setUserStreamID((String)newValue);
				return;
			case ModelPackage.JOIN_TEAM_MESSAGE__JOINED_TEAM:
				setJoinedTeam((String)newValue);
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
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_TEAM:
				setUserTeam(USER_TEAM_EDEFAULT);
				return;
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_STREAM_ID:
				setUserStreamID(USER_STREAM_ID_EDEFAULT);
				return;
			case ModelPackage.JOIN_TEAM_MESSAGE__JOINED_TEAM:
				setJoinedTeam(JOINED_TEAM_EDEFAULT);
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
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_TEAM:
				return USER_TEAM_EDEFAULT == null ? userTeam != null : !USER_TEAM_EDEFAULT.equals(userTeam);
			case ModelPackage.JOIN_TEAM_MESSAGE__USER_STREAM_ID:
				return USER_STREAM_ID_EDEFAULT == null ? userStreamID != null : !USER_STREAM_ID_EDEFAULT.equals(userStreamID);
			case ModelPackage.JOIN_TEAM_MESSAGE__JOINED_TEAM:
				return JOINED_TEAM_EDEFAULT == null ? joinedTeam != null : !JOINED_TEAM_EDEFAULT.equals(joinedTeam);
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
		result.append(", userStreamID: ");
		result.append(userStreamID);
		result.append(", joinedTeam: ");
		result.append(joinedTeam);
		result.append(')');
		return result.toString();
	}

} //JoinTeamMessageImpl
