/**
 */
package MessagesModel.util;

import MessagesModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see MessagesModel.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ATTACKED_MESSAGE: {
				AttackedMessage attackedMessage = (AttackedMessage)theEObject;
				T result = caseAttackedMessage(attackedMessage);
				if (result == null) result = caseMessage(attackedMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOMB_DEFUSING_MESSAGE: {
				BombDefusingMessage bombDefusingMessage = (BombDefusingMessage)theEObject;
				T result = caseBombDefusingMessage(bombDefusingMessage);
				if (result == null) result = caseMessage(bombDefusingMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOMB_PLANTING_MESSAGE: {
				BombPlantingMessage bombPlantingMessage = (BombPlantingMessage)theEObject;
				T result = caseBombPlantingMessage(bombPlantingMessage);
				if (result == null) result = caseMessage(bombPlantingMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CHANGE_MAP_MESSAGE: {
				ChangeMapMessage changeMapMessage = (ChangeMapMessage)theEObject;
				T result = caseChangeMapMessage(changeMapMessage);
				if (result == null) result = caseMessage(changeMapMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CHANGE_NAME_MESSAGE: {
				ChangeNameMessage changeNameMessage = (ChangeNameMessage)theEObject;
				T result = caseChangeNameMessage(changeNameMessage);
				if (result == null) result = caseMessage(changeNameMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.CONNECTED_MESSAGE: {
				ConnectedMessage connectedMessage = (ConnectedMessage)theEObject;
				T result = caseConnectedMessage(connectedMessage);
				if (result == null) result = caseMessage(connectedMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.DISCONNECTED_MESSAGE: {
				DisconnectedMessage disconnectedMessage = (DisconnectedMessage)theEObject;
				T result = caseDisconnectedMessage(disconnectedMessage);
				if (result == null) result = caseMessage(disconnectedMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ENTERED_THE_GAME_MESSAGE: {
				EnteredTheGameMessage enteredTheGameMessage = (EnteredTheGameMessage)theEObject;
				T result = caseEnteredTheGameMessage(enteredTheGameMessage);
				if (result == null) result = caseMessage(enteredTheGameMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.GOT_THE_BOMB_MESSAGE: {
				GotTheBombMessage gotTheBombMessage = (GotTheBombMessage)theEObject;
				T result = caseGotTheBombMessage(gotTheBombMessage);
				if (result == null) result = caseMessage(gotTheBombMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.JOIN_TEAM_MESSAGE: {
				JoinTeamMessage joinTeamMessage = (JoinTeamMessage)theEObject;
				T result = caseJoinTeamMessage(joinTeamMessage);
				if (result == null) result = caseMessage(joinTeamMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.KILL_MESSAGE: {
				KillMessage killMessage = (KillMessage)theEObject;
				T result = caseKillMessage(killMessage);
				if (result == null) result = caseMessage(killMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.KILL_ASSIST_MESSAGE: {
				KillAssistMessage killAssistMessage = (KillAssistMessage)theEObject;
				T result = caseKillAssistMessage(killAssistMessage);
				if (result == null) result = caseMessage(killAssistMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.PURCHASED_MESSAGE: {
				PurchasedMessage purchasedMessage = (PurchasedMessage)theEObject;
				T result = casePurchasedMessage(purchasedMessage);
				if (result == null) result = caseMessage(purchasedMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.REMIND_ROUND_SCORE_MESSAGE: {
				RemindRoundScoreMessage remindRoundScoreMessage = (RemindRoundScoreMessage)theEObject;
				T result = caseRemindRoundScoreMessage(remindRoundScoreMessage);
				if (result == null) result = caseMessage(remindRoundScoreMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROUND_END_MESSAGE: {
				RoundEndMessage roundEndMessage = (RoundEndMessage)theEObject;
				T result = caseRoundEndMessage(roundEndMessage);
				if (result == null) result = caseMessage(roundEndMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROUND_RESTART_MESSAGE: {
				RoundRestartMessage roundRestartMessage = (RoundRestartMessage)theEObject;
				T result = caseRoundRestartMessage(roundRestartMessage);
				if (result == null) result = caseMessage(roundRestartMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROUND_SCORED_MESSAGE: {
				RoundScoredMessage roundScoredMessage = (RoundScoredMessage)theEObject;
				T result = caseRoundScoredMessage(roundScoredMessage);
				if (result == null) result = caseMessage(roundScoredMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROUND_SPAWN_MESSAGE: {
				RoundSpawnMessage roundSpawnMessage = (RoundSpawnMessage)theEObject;
				T result = caseRoundSpawnMessage(roundSpawnMessage);
				if (result == null) result = caseMessage(roundSpawnMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ROUND_START_MESSAGE: {
				RoundStartMessage roundStartMessage = (RoundStartMessage)theEObject;
				T result = caseRoundStartMessage(roundStartMessage);
				if (result == null) result = caseMessage(roundStartMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SAY_MESSAGE: {
				SayMessage sayMessage = (SayMessage)theEObject;
				T result = caseSayMessage(sayMessage);
				if (result == null) result = caseMessage(sayMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SWITCH_TEAM_MESSAGE: {
				SwitchTeamMessage switchTeamMessage = (SwitchTeamMessage)theEObject;
				T result = caseSwitchTeamMessage(switchTeamMessage);
				if (result == null) result = caseMessage(switchTeamMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.TEAM_SCORED_MESSAGE: {
				TeamScoredMessage teamScoredMessage = (TeamScoredMessage)theEObject;
				T result = caseTeamScoredMessage(teamScoredMessage);
				if (result == null) result = caseMessage(teamScoredMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.THREW_STUFF_MESSAGE: {
				ThrewStuffMessage threwStuffMessage = (ThrewStuffMessage)theEObject;
				T result = caseThrewStuffMessage(threwStuffMessage);
				if (result == null) result = caseMessage(threwStuffMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MESSAGE_BUFFER: {
				MessageBuffer messageBuffer = (MessageBuffer)theEObject;
				T result = caseMessageBuffer(messageBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SAY_TEAM_MESSAGE: {
				SayTeamMessage sayTeamMessage = (SayTeamMessage)theEObject;
				T result = caseSayTeamMessage(sayTeamMessage);
				if (result == null) result = caseMessage(sayTeamMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacked Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacked Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttackedMessage(AttackedMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bomb Defusing Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bomb Defusing Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBombDefusingMessage(BombDefusingMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bomb Planting Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bomb Planting Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBombPlantingMessage(BombPlantingMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Map Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Map Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeMapMessage(ChangeMapMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Name Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Name Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeNameMessage(ChangeNameMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connected Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connected Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectedMessage(ConnectedMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnected Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnected Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnectedMessage(DisconnectedMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entered The Game Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entered The Game Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnteredTheGameMessage(EnteredTheGameMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Got The Bomb Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Got The Bomb Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGotTheBombMessage(GotTheBombMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Team Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Team Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinTeamMessage(JoinTeamMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kill Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kill Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKillMessage(KillMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kill Assist Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kill Assist Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKillAssistMessage(KillAssistMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purchased Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purchased Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurchasedMessage(PurchasedMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remind Round Score Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remind Round Score Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemindRoundScoreMessage(RemindRoundScoreMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round End Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round End Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundEndMessage(RoundEndMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Restart Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Restart Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundRestartMessage(RoundRestartMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Scored Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Scored Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundScoredMessage(RoundScoredMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Spawn Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Spawn Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundSpawnMessage(RoundSpawnMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Round Start Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Round Start Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundStartMessage(RoundStartMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Say Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Say Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSayMessage(SayMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Team Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Team Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchTeamMessage(SwitchTeamMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Team Scored Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Team Scored Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTeamScoredMessage(TeamScoredMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threw Stuff Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threw Stuff Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrewStuffMessage(ThrewStuffMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageBuffer(MessageBuffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Say Team Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Say Team Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSayTeamMessage(SayTeamMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ModelSwitch
