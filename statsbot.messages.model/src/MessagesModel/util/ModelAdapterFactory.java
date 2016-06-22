/**
 */
package MessagesModel.util;

import MessagesModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see MessagesModel.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseAttackedMessage(AttackedMessage object) {
				return createAttackedMessageAdapter();
			}
			@Override
			public Adapter caseBombDefusingMessage(BombDefusingMessage object) {
				return createBombDefusingMessageAdapter();
			}
			@Override
			public Adapter caseBombPlantingMessage(BombPlantingMessage object) {
				return createBombPlantingMessageAdapter();
			}
			@Override
			public Adapter caseChangeMapMessage(ChangeMapMessage object) {
				return createChangeMapMessageAdapter();
			}
			@Override
			public Adapter caseChangeNameMessage(ChangeNameMessage object) {
				return createChangeNameMessageAdapter();
			}
			@Override
			public Adapter caseConnectedMessage(ConnectedMessage object) {
				return createConnectedMessageAdapter();
			}
			@Override
			public Adapter caseDisconnectedMessage(DisconnectedMessage object) {
				return createDisconnectedMessageAdapter();
			}
			@Override
			public Adapter caseEnteredTheGameMessage(EnteredTheGameMessage object) {
				return createEnteredTheGameMessageAdapter();
			}
			@Override
			public Adapter caseGotTheBombMessage(GotTheBombMessage object) {
				return createGotTheBombMessageAdapter();
			}
			@Override
			public Adapter caseJoinTeamMessage(JoinTeamMessage object) {
				return createJoinTeamMessageAdapter();
			}
			@Override
			public Adapter caseKillMessage(KillMessage object) {
				return createKillMessageAdapter();
			}
			@Override
			public Adapter caseKillAssistMessage(KillAssistMessage object) {
				return createKillAssistMessageAdapter();
			}
			@Override
			public Adapter casePurchasedMessage(PurchasedMessage object) {
				return createPurchasedMessageAdapter();
			}
			@Override
			public Adapter caseRemindRoundScoreMessage(RemindRoundScoreMessage object) {
				return createRemindRoundScoreMessageAdapter();
			}
			@Override
			public Adapter caseRoundEndMessage(RoundEndMessage object) {
				return createRoundEndMessageAdapter();
			}
			@Override
			public Adapter caseRoundRestartMessage(RoundRestartMessage object) {
				return createRoundRestartMessageAdapter();
			}
			@Override
			public Adapter caseRoundScoredMessage(RoundScoredMessage object) {
				return createRoundScoredMessageAdapter();
			}
			@Override
			public Adapter caseRoundSpawnMessage(RoundSpawnMessage object) {
				return createRoundSpawnMessageAdapter();
			}
			@Override
			public Adapter caseRoundStartMessage(RoundStartMessage object) {
				return createRoundStartMessageAdapter();
			}
			@Override
			public Adapter caseSayMessage(SayMessage object) {
				return createSayMessageAdapter();
			}
			@Override
			public Adapter caseSwitchTeamMessage(SwitchTeamMessage object) {
				return createSwitchTeamMessageAdapter();
			}
			@Override
			public Adapter caseTeamScoredMessage(TeamScoredMessage object) {
				return createTeamScoredMessageAdapter();
			}
			@Override
			public Adapter caseThrewStuffMessage(ThrewStuffMessage object) {
				return createThrewStuffMessageAdapter();
			}
			@Override
			public Adapter caseMessageBuffer(MessageBuffer object) {
				return createMessageBufferAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.AttackedMessage <em>Attacked Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.AttackedMessage
	 * @generated
	 */
	public Adapter createAttackedMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.BombDefusingMessage <em>Bomb Defusing Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.BombDefusingMessage
	 * @generated
	 */
	public Adapter createBombDefusingMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.BombPlantingMessage <em>Bomb Planting Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.BombPlantingMessage
	 * @generated
	 */
	public Adapter createBombPlantingMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.ChangeMapMessage <em>Change Map Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.ChangeMapMessage
	 * @generated
	 */
	public Adapter createChangeMapMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.ChangeNameMessage <em>Change Name Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.ChangeNameMessage
	 * @generated
	 */
	public Adapter createChangeNameMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.ConnectedMessage <em>Connected Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.ConnectedMessage
	 * @generated
	 */
	public Adapter createConnectedMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.DisconnectedMessage <em>Disconnected Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.DisconnectedMessage
	 * @generated
	 */
	public Adapter createDisconnectedMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.EnteredTheGameMessage <em>Entered The Game Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.EnteredTheGameMessage
	 * @generated
	 */
	public Adapter createEnteredTheGameMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.GotTheBombMessage <em>Got The Bomb Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.GotTheBombMessage
	 * @generated
	 */
	public Adapter createGotTheBombMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.JoinTeamMessage <em>Join Team Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.JoinTeamMessage
	 * @generated
	 */
	public Adapter createJoinTeamMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.KillMessage <em>Kill Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.KillMessage
	 * @generated
	 */
	public Adapter createKillMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.KillAssistMessage <em>Kill Assist Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.KillAssistMessage
	 * @generated
	 */
	public Adapter createKillAssistMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.PurchasedMessage <em>Purchased Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.PurchasedMessage
	 * @generated
	 */
	public Adapter createPurchasedMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.RemindRoundScoreMessage <em>Remind Round Score Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.RemindRoundScoreMessage
	 * @generated
	 */
	public Adapter createRemindRoundScoreMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.RoundEndMessage <em>Round End Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.RoundEndMessage
	 * @generated
	 */
	public Adapter createRoundEndMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.RoundRestartMessage <em>Round Restart Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.RoundRestartMessage
	 * @generated
	 */
	public Adapter createRoundRestartMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.RoundScoredMessage <em>Round Scored Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.RoundScoredMessage
	 * @generated
	 */
	public Adapter createRoundScoredMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.RoundSpawnMessage <em>Round Spawn Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.RoundSpawnMessage
	 * @generated
	 */
	public Adapter createRoundSpawnMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.RoundStartMessage <em>Round Start Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.RoundStartMessage
	 * @generated
	 */
	public Adapter createRoundStartMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.SayMessage <em>Say Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.SayMessage
	 * @generated
	 */
	public Adapter createSayMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.SwitchTeamMessage <em>Switch Team Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.SwitchTeamMessage
	 * @generated
	 */
	public Adapter createSwitchTeamMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.TeamScoredMessage <em>Team Scored Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.TeamScoredMessage
	 * @generated
	 */
	public Adapter createTeamScoredMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.ThrewStuffMessage <em>Threw Stuff Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.ThrewStuffMessage
	 * @generated
	 */
	public Adapter createThrewStuffMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link MessagesModel.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see MessagesModel.MessageBuffer
	 * @generated
	 */
	public Adapter createMessageBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
