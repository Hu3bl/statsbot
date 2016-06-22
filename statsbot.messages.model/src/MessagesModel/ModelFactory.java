/**
 */
package MessagesModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see MessagesModel.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = MessagesModel.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attacked Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attacked Message</em>'.
	 * @generated
	 */
	AttackedMessage createAttackedMessage();

	/**
	 * Returns a new object of class '<em>Bomb Defusing Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bomb Defusing Message</em>'.
	 * @generated
	 */
	BombDefusingMessage createBombDefusingMessage();

	/**
	 * Returns a new object of class '<em>Bomb Planting Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bomb Planting Message</em>'.
	 * @generated
	 */
	BombPlantingMessage createBombPlantingMessage();

	/**
	 * Returns a new object of class '<em>Change Map Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Map Message</em>'.
	 * @generated
	 */
	ChangeMapMessage createChangeMapMessage();

	/**
	 * Returns a new object of class '<em>Change Name Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Name Message</em>'.
	 * @generated
	 */
	ChangeNameMessage createChangeNameMessage();

	/**
	 * Returns a new object of class '<em>Connected Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connected Message</em>'.
	 * @generated
	 */
	ConnectedMessage createConnectedMessage();

	/**
	 * Returns a new object of class '<em>Disconnected Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disconnected Message</em>'.
	 * @generated
	 */
	DisconnectedMessage createDisconnectedMessage();

	/**
	 * Returns a new object of class '<em>Entered The Game Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entered The Game Message</em>'.
	 * @generated
	 */
	EnteredTheGameMessage createEnteredTheGameMessage();

	/**
	 * Returns a new object of class '<em>Got The Bomb Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Got The Bomb Message</em>'.
	 * @generated
	 */
	GotTheBombMessage createGotTheBombMessage();

	/**
	 * Returns a new object of class '<em>Join Team Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Team Message</em>'.
	 * @generated
	 */
	JoinTeamMessage createJoinTeamMessage();

	/**
	 * Returns a new object of class '<em>Kill Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kill Message</em>'.
	 * @generated
	 */
	KillMessage createKillMessage();

	/**
	 * Returns a new object of class '<em>Kill Assist Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kill Assist Message</em>'.
	 * @generated
	 */
	KillAssistMessage createKillAssistMessage();

	/**
	 * Returns a new object of class '<em>Purchased Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purchased Message</em>'.
	 * @generated
	 */
	PurchasedMessage createPurchasedMessage();

	/**
	 * Returns a new object of class '<em>Remind Round Score Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remind Round Score Message</em>'.
	 * @generated
	 */
	RemindRoundScoreMessage createRemindRoundScoreMessage();

	/**
	 * Returns a new object of class '<em>Round End Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round End Message</em>'.
	 * @generated
	 */
	RoundEndMessage createRoundEndMessage();

	/**
	 * Returns a new object of class '<em>Round Restart Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Restart Message</em>'.
	 * @generated
	 */
	RoundRestartMessage createRoundRestartMessage();

	/**
	 * Returns a new object of class '<em>Round Scored Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Scored Message</em>'.
	 * @generated
	 */
	RoundScoredMessage createRoundScoredMessage();

	/**
	 * Returns a new object of class '<em>Round Spawn Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Spawn Message</em>'.
	 * @generated
	 */
	RoundSpawnMessage createRoundSpawnMessage();

	/**
	 * Returns a new object of class '<em>Round Start Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round Start Message</em>'.
	 * @generated
	 */
	RoundStartMessage createRoundStartMessage();

	/**
	 * Returns a new object of class '<em>Say Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Say Message</em>'.
	 * @generated
	 */
	SayMessage createSayMessage();

	/**
	 * Returns a new object of class '<em>Switch Team Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Team Message</em>'.
	 * @generated
	 */
	SwitchTeamMessage createSwitchTeamMessage();

	/**
	 * Returns a new object of class '<em>Team Scored Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Scored Message</em>'.
	 * @generated
	 */
	TeamScoredMessage createTeamScoredMessage();

	/**
	 * Returns a new object of class '<em>Threw Stuff Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Threw Stuff Message</em>'.
	 * @generated
	 */
	ThrewStuffMessage createThrewStuffMessage();

	/**
	 * Returns a new object of class '<em>Message Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Buffer</em>'.
	 * @generated
	 */
	MessageBuffer createMessageBuffer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
