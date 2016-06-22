/**
 */
package MessagesModel.impl;

import MessagesModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.ATTACKED_MESSAGE: return createAttackedMessage();
			case ModelPackage.BOMB_DEFUSING_MESSAGE: return createBombDefusingMessage();
			case ModelPackage.BOMB_PLANTING_MESSAGE: return createBombPlantingMessage();
			case ModelPackage.CHANGE_MAP_MESSAGE: return createChangeMapMessage();
			case ModelPackage.CHANGE_NAME_MESSAGE: return createChangeNameMessage();
			case ModelPackage.CONNECTED_MESSAGE: return createConnectedMessage();
			case ModelPackage.DISCONNECTED_MESSAGE: return createDisconnectedMessage();
			case ModelPackage.ENTERED_THE_GAME_MESSAGE: return createEnteredTheGameMessage();
			case ModelPackage.GOT_THE_BOMB_MESSAGE: return createGotTheBombMessage();
			case ModelPackage.JOIN_TEAM_MESSAGE: return createJoinTeamMessage();
			case ModelPackage.KILL_MESSAGE: return createKillMessage();
			case ModelPackage.KILL_ASSIST_MESSAGE: return createKillAssistMessage();
			case ModelPackage.PURCHASED_MESSAGE: return createPurchasedMessage();
			case ModelPackage.REMIND_ROUND_SCORE_MESSAGE: return createRemindRoundScoreMessage();
			case ModelPackage.ROUND_END_MESSAGE: return createRoundEndMessage();
			case ModelPackage.ROUND_RESTART_MESSAGE: return createRoundRestartMessage();
			case ModelPackage.ROUND_SCORED_MESSAGE: return createRoundScoredMessage();
			case ModelPackage.ROUND_SPAWN_MESSAGE: return createRoundSpawnMessage();
			case ModelPackage.ROUND_START_MESSAGE: return createRoundStartMessage();
			case ModelPackage.SAY_MESSAGE: return createSayMessage();
			case ModelPackage.SWITCH_TEAM_MESSAGE: return createSwitchTeamMessage();
			case ModelPackage.TEAM_SCORED_MESSAGE: return createTeamScoredMessage();
			case ModelPackage.THREW_STUFF_MESSAGE: return createThrewStuffMessage();
			case ModelPackage.MESSAGE_BUFFER: return createMessageBuffer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttackedMessage createAttackedMessage() {
		AttackedMessageImpl attackedMessage = new AttackedMessageImpl();
		return attackedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BombDefusingMessage createBombDefusingMessage() {
		BombDefusingMessageImpl bombDefusingMessage = new BombDefusingMessageImpl();
		return bombDefusingMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BombPlantingMessage createBombPlantingMessage() {
		BombPlantingMessageImpl bombPlantingMessage = new BombPlantingMessageImpl();
		return bombPlantingMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMapMessage createChangeMapMessage() {
		ChangeMapMessageImpl changeMapMessage = new ChangeMapMessageImpl();
		return changeMapMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeNameMessage createChangeNameMessage() {
		ChangeNameMessageImpl changeNameMessage = new ChangeNameMessageImpl();
		return changeNameMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedMessage createConnectedMessage() {
		ConnectedMessageImpl connectedMessage = new ConnectedMessageImpl();
		return connectedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectedMessage createDisconnectedMessage() {
		DisconnectedMessageImpl disconnectedMessage = new DisconnectedMessageImpl();
		return disconnectedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnteredTheGameMessage createEnteredTheGameMessage() {
		EnteredTheGameMessageImpl enteredTheGameMessage = new EnteredTheGameMessageImpl();
		return enteredTheGameMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GotTheBombMessage createGotTheBombMessage() {
		GotTheBombMessageImpl gotTheBombMessage = new GotTheBombMessageImpl();
		return gotTheBombMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinTeamMessage createJoinTeamMessage() {
		JoinTeamMessageImpl joinTeamMessage = new JoinTeamMessageImpl();
		return joinTeamMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KillMessage createKillMessage() {
		KillMessageImpl killMessage = new KillMessageImpl();
		return killMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KillAssistMessage createKillAssistMessage() {
		KillAssistMessageImpl killAssistMessage = new KillAssistMessageImpl();
		return killAssistMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchasedMessage createPurchasedMessage() {
		PurchasedMessageImpl purchasedMessage = new PurchasedMessageImpl();
		return purchasedMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemindRoundScoreMessage createRemindRoundScoreMessage() {
		RemindRoundScoreMessageImpl remindRoundScoreMessage = new RemindRoundScoreMessageImpl();
		return remindRoundScoreMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundEndMessage createRoundEndMessage() {
		RoundEndMessageImpl roundEndMessage = new RoundEndMessageImpl();
		return roundEndMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundRestartMessage createRoundRestartMessage() {
		RoundRestartMessageImpl roundRestartMessage = new RoundRestartMessageImpl();
		return roundRestartMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundScoredMessage createRoundScoredMessage() {
		RoundScoredMessageImpl roundScoredMessage = new RoundScoredMessageImpl();
		return roundScoredMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundSpawnMessage createRoundSpawnMessage() {
		RoundSpawnMessageImpl roundSpawnMessage = new RoundSpawnMessageImpl();
		return roundSpawnMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundStartMessage createRoundStartMessage() {
		RoundStartMessageImpl roundStartMessage = new RoundStartMessageImpl();
		return roundStartMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SayMessage createSayMessage() {
		SayMessageImpl sayMessage = new SayMessageImpl();
		return sayMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchTeamMessage createSwitchTeamMessage() {
		SwitchTeamMessageImpl switchTeamMessage = new SwitchTeamMessageImpl();
		return switchTeamMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamScoredMessage createTeamScoredMessage() {
		TeamScoredMessageImpl teamScoredMessage = new TeamScoredMessageImpl();
		return teamScoredMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrewStuffMessage createThrewStuffMessage() {
		ThrewStuffMessageImpl threwStuffMessage = new ThrewStuffMessageImpl();
		return threwStuffMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageBuffer createMessageBuffer() {
		MessageBufferImpl messageBuffer = new MessageBufferImpl();
		return messageBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //ModelFactoryImpl
