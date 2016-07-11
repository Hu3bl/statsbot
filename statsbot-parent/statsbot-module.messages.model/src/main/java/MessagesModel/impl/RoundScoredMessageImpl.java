/**
 */
package MessagesModel.impl;

import MessagesModel.ModelPackage;
import MessagesModel.RoundScoredMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Round Scored Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.impl.RoundScoredMessageImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link MessagesModel.impl.RoundScoredMessageImpl#getTeamWin <em>Team Win</em>}</li>
 *   <li>{@link MessagesModel.impl.RoundScoredMessageImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoundScoredMessageImpl extends MessageImpl implements RoundScoredMessage {
	/**
	 * The default value of the '{@link #getTeam() <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected String team = TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeamWin() <em>Team Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamWin()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAM_WIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeamWin() <em>Team Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamWin()
	 * @generated
	 * @ordered
	 */
	protected String teamWin = TEAM_WIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundScoredMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROUND_SCORED_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(String newTeam) {
		String oldTeam = team;
		team = newTeam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROUND_SCORED_MESSAGE__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTeamWin() {
		return teamWin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamWin(String newTeamWin) {
		String oldTeamWin = teamWin;
		teamWin = newTeamWin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROUND_SCORED_MESSAGE__TEAM_WIN, oldTeamWin, teamWin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROUND_SCORED_MESSAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROUND_SCORED_MESSAGE__TEAM:
				return getTeam();
			case ModelPackage.ROUND_SCORED_MESSAGE__TEAM_WIN:
				return getTeamWin();
			case ModelPackage.ROUND_SCORED_MESSAGE__TYPE:
				return getType();
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
			case ModelPackage.ROUND_SCORED_MESSAGE__TEAM:
				setTeam((String)newValue);
				return;
			case ModelPackage.ROUND_SCORED_MESSAGE__TEAM_WIN:
				setTeamWin((String)newValue);
				return;
			case ModelPackage.ROUND_SCORED_MESSAGE__TYPE:
				setType((String)newValue);
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
			case ModelPackage.ROUND_SCORED_MESSAGE__TEAM:
				setTeam(TEAM_EDEFAULT);
				return;
			case ModelPackage.ROUND_SCORED_MESSAGE__TEAM_WIN:
				setTeamWin(TEAM_WIN_EDEFAULT);
				return;
			case ModelPackage.ROUND_SCORED_MESSAGE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case ModelPackage.ROUND_SCORED_MESSAGE__TEAM:
				return TEAM_EDEFAULT == null ? team != null : !TEAM_EDEFAULT.equals(team);
			case ModelPackage.ROUND_SCORED_MESSAGE__TEAM_WIN:
				return TEAM_WIN_EDEFAULT == null ? teamWin != null : !TEAM_WIN_EDEFAULT.equals(teamWin);
			case ModelPackage.ROUND_SCORED_MESSAGE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (team: ");
		result.append(team);
		result.append(", teamWin: ");
		result.append(teamWin);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //RoundScoredMessageImpl
