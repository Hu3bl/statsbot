/**
 */
package MessagesModel.impl;

import MessagesModel.ModelPackage;
import MessagesModel.PurchasedMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purchased Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.impl.PurchasedMessageImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link MessagesModel.impl.PurchasedMessageImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link MessagesModel.impl.PurchasedMessageImpl#getUserTeam <em>User Team</em>}</li>
 *   <li>{@link MessagesModel.impl.PurchasedMessageImpl#getUserStreamID <em>User Stream ID</em>}</li>
 *   <li>{@link MessagesModel.impl.PurchasedMessageImpl#getPurchasedObject <em>Purchased Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PurchasedMessageImpl extends MessageImpl implements PurchasedMessage {
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
	 * The default value of the '{@link #getPurchasedObject() <em>Purchased Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchasedObject()
	 * @generated
	 * @ordered
	 */
	protected static final String PURCHASED_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurchasedObject() <em>Purchased Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurchasedObject()
	 * @generated
	 * @ordered
	 */
	protected String purchasedObject = PURCHASED_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurchasedMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PURCHASED_MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASED_MESSAGE__USER_ID, oldUserID, userID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASED_MESSAGE__USER_NAME, oldUserName, userName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASED_MESSAGE__USER_TEAM, oldUserTeam, userTeam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASED_MESSAGE__USER_STREAM_ID, oldUserStreamID, userStreamID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurchasedObject() {
		return purchasedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurchasedObject(String newPurchasedObject) {
		String oldPurchasedObject = purchasedObject;
		purchasedObject = newPurchasedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PURCHASED_MESSAGE__PURCHASED_OBJECT, oldPurchasedObject, purchasedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PURCHASED_MESSAGE__USER_ID:
				return getUserID();
			case ModelPackage.PURCHASED_MESSAGE__USER_NAME:
				return getUserName();
			case ModelPackage.PURCHASED_MESSAGE__USER_TEAM:
				return getUserTeam();
			case ModelPackage.PURCHASED_MESSAGE__USER_STREAM_ID:
				return getUserStreamID();
			case ModelPackage.PURCHASED_MESSAGE__PURCHASED_OBJECT:
				return getPurchasedObject();
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
			case ModelPackage.PURCHASED_MESSAGE__USER_ID:
				setUserID((String)newValue);
				return;
			case ModelPackage.PURCHASED_MESSAGE__USER_NAME:
				setUserName((String)newValue);
				return;
			case ModelPackage.PURCHASED_MESSAGE__USER_TEAM:
				setUserTeam((String)newValue);
				return;
			case ModelPackage.PURCHASED_MESSAGE__USER_STREAM_ID:
				setUserStreamID((String)newValue);
				return;
			case ModelPackage.PURCHASED_MESSAGE__PURCHASED_OBJECT:
				setPurchasedObject((String)newValue);
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
			case ModelPackage.PURCHASED_MESSAGE__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case ModelPackage.PURCHASED_MESSAGE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case ModelPackage.PURCHASED_MESSAGE__USER_TEAM:
				setUserTeam(USER_TEAM_EDEFAULT);
				return;
			case ModelPackage.PURCHASED_MESSAGE__USER_STREAM_ID:
				setUserStreamID(USER_STREAM_ID_EDEFAULT);
				return;
			case ModelPackage.PURCHASED_MESSAGE__PURCHASED_OBJECT:
				setPurchasedObject(PURCHASED_OBJECT_EDEFAULT);
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
			case ModelPackage.PURCHASED_MESSAGE__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case ModelPackage.PURCHASED_MESSAGE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case ModelPackage.PURCHASED_MESSAGE__USER_TEAM:
				return USER_TEAM_EDEFAULT == null ? userTeam != null : !USER_TEAM_EDEFAULT.equals(userTeam);
			case ModelPackage.PURCHASED_MESSAGE__USER_STREAM_ID:
				return USER_STREAM_ID_EDEFAULT == null ? userStreamID != null : !USER_STREAM_ID_EDEFAULT.equals(userStreamID);
			case ModelPackage.PURCHASED_MESSAGE__PURCHASED_OBJECT:
				return PURCHASED_OBJECT_EDEFAULT == null ? purchasedObject != null : !PURCHASED_OBJECT_EDEFAULT.equals(purchasedObject);
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
		result.append(", purchasedObject: ");
		result.append(purchasedObject);
		result.append(')');
		return result.toString();
	}

} //PurchasedMessageImpl
