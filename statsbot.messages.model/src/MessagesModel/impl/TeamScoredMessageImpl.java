/**
 */
package MessagesModel.impl;

import MessagesModel.ModelPackage;
import MessagesModel.TeamScoredMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Scored Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.impl.TeamScoredMessageImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link MessagesModel.impl.TeamScoredMessageImpl#getScore <em>Score</em>}</li>
 *   <li>{@link MessagesModel.impl.TeamScoredMessageImpl#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamScoredMessageImpl extends MessageImpl implements TeamScoredMessage {
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
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final String SCORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected String score = SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayers() <em>Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAYERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected String players = PLAYERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamScoredMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TEAM_SCORED_MESSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_SCORED_MESSAGE__TEAM, oldTeam, team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScore(String newScore) {
		String oldScore = score;
		score = newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_SCORED_MESSAGE__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlayers() {
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayers(String newPlayers) {
		String oldPlayers = players;
		players = newPlayers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TEAM_SCORED_MESSAGE__PLAYERS, oldPlayers, players));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TEAM_SCORED_MESSAGE__TEAM:
				return getTeam();
			case ModelPackage.TEAM_SCORED_MESSAGE__SCORE:
				return getScore();
			case ModelPackage.TEAM_SCORED_MESSAGE__PLAYERS:
				return getPlayers();
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
			case ModelPackage.TEAM_SCORED_MESSAGE__TEAM:
				setTeam((String)newValue);
				return;
			case ModelPackage.TEAM_SCORED_MESSAGE__SCORE:
				setScore((String)newValue);
				return;
			case ModelPackage.TEAM_SCORED_MESSAGE__PLAYERS:
				setPlayers((String)newValue);
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
			case ModelPackage.TEAM_SCORED_MESSAGE__TEAM:
				setTeam(TEAM_EDEFAULT);
				return;
			case ModelPackage.TEAM_SCORED_MESSAGE__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case ModelPackage.TEAM_SCORED_MESSAGE__PLAYERS:
				setPlayers(PLAYERS_EDEFAULT);
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
			case ModelPackage.TEAM_SCORED_MESSAGE__TEAM:
				return TEAM_EDEFAULT == null ? team != null : !TEAM_EDEFAULT.equals(team);
			case ModelPackage.TEAM_SCORED_MESSAGE__SCORE:
				return SCORE_EDEFAULT == null ? score != null : !SCORE_EDEFAULT.equals(score);
			case ModelPackage.TEAM_SCORED_MESSAGE__PLAYERS:
				return PLAYERS_EDEFAULT == null ? players != null : !PLAYERS_EDEFAULT.equals(players);
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
		result.append(", score: ");
		result.append(score);
		result.append(", players: ");
		result.append(players);
		result.append(')');
		return result.toString();
	}

} //TeamScoredMessageImpl
