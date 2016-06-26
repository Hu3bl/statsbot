/**
 */
package MessagesModel.impl;

import MessagesModel.AttackedMessage;
import MessagesModel.BombDefusingMessage;
import MessagesModel.BombPlantingMessage;
import MessagesModel.ChangeMapMessage;
import MessagesModel.ChangeNameMessage;
import MessagesModel.ConnectedMessage;
import MessagesModel.DisconnectedMessage;
import MessagesModel.EnteredTheGameMessage;
import MessagesModel.GotTheBombMessage;
import MessagesModel.JoinTeamMessage;
import MessagesModel.KillAssistMessage;
import MessagesModel.KillMessage;
import MessagesModel.Message;
import MessagesModel.MessageBuffer;
import MessagesModel.ModelFactory;
import MessagesModel.ModelPackage;
import MessagesModel.PurchasedMessage;
import MessagesModel.RemindRoundScoreMessage;
import MessagesModel.RoundEndMessage;
import MessagesModel.RoundRestartMessage;
import MessagesModel.RoundScoredMessage;
import MessagesModel.RoundSpawnMessage;
import MessagesModel.RoundStartMessage;
import MessagesModel.SayMessage;
import MessagesModel.SayTeamMessage;
import MessagesModel.SwitchTeamMessage;
import MessagesModel.TeamScoredMessage;
import MessagesModel.ThrewStuffMessage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attackedMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bombDefusingMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bombPlantingMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeMapMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeNameMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectedMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectedMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enteredTheGameMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gotTheBombMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinTeamMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass killMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass killAssistMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchasedMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remindRoundScoreMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundEndMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundRestartMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundScoredMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundSpawnMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundStartMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sayMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchTeamMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamScoredMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threwStuffMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageBufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sayTeamMessageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see MessagesModel.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttackedMessage() {
		return attackedMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerName() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerUserID() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerSteamID() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerTeam() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerPosX() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerPosY() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerPosZ() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerWeapon() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerDamage() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerDamageArmor() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_AttackerHitGroup() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimName() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimUserID() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimSteamID() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimTeam() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimPosX() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimPosY() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimPosZ() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimHealth() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttackedMessage_VictimArmor() {
		return (EAttribute)attackedMessageEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBombDefusingMessage() {
		return bombDefusingMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBombDefusingMessage_UserID() {
		return (EAttribute)bombDefusingMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBombDefusingMessage_UserName() {
		return (EAttribute)bombDefusingMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBombDefusingMessage_UserTeam() {
		return (EAttribute)bombDefusingMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBombDefusingMessage_UserSteamID() {
		return (EAttribute)bombDefusingMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBombPlantingMessage() {
		return bombPlantingMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBombPlantingMessage_UserID() {
		return (EAttribute)bombPlantingMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBombPlantingMessage_UserName() {
		return (EAttribute)bombPlantingMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBombPlantingMessage_UserTeam() {
		return (EAttribute)bombPlantingMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBombPlantingMessage_UserSteamID() {
		return (EAttribute)bombPlantingMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeMapMessage() {
		return changeMapMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeMapMessage_Map() {
		return (EAttribute)changeMapMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeNameMessage() {
		return changeNameMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeNameMessage_UserID() {
		return (EAttribute)changeNameMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeNameMessage_UserName() {
		return (EAttribute)changeNameMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeNameMessage_UserTeam() {
		return (EAttribute)changeNameMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeNameMessage_UserSteamID() {
		return (EAttribute)changeNameMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeNameMessage_NewUserName() {
		return (EAttribute)changeNameMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectedMessage() {
		return connectedMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectedMessage_UserID() {
		return (EAttribute)connectedMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectedMessage_UserName() {
		return (EAttribute)connectedMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectedMessage_UserSteamID() {
		return (EAttribute)connectedMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectedMessage_Address() {
		return (EAttribute)connectedMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectedMessage() {
		return disconnectedMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectedMessage_UserID() {
		return (EAttribute)disconnectedMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectedMessage_UserName() {
		return (EAttribute)disconnectedMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectedMessage_UserTeam() {
		return (EAttribute)disconnectedMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectedMessage_UserSteamID() {
		return (EAttribute)disconnectedMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnteredTheGameMessage() {
		return enteredTheGameMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnteredTheGameMessage_UserID() {
		return (EAttribute)enteredTheGameMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnteredTheGameMessage_UserName() {
		return (EAttribute)enteredTheGameMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnteredTheGameMessage_UserSteamID() {
		return (EAttribute)enteredTheGameMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGotTheBombMessage() {
		return gotTheBombMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGotTheBombMessage_UserName() {
		return (EAttribute)gotTheBombMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGotTheBombMessage_UserTeam() {
		return (EAttribute)gotTheBombMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGotTheBombMessage_UserSteamID() {
		return (EAttribute)gotTheBombMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGotTheBombMessage_UserID() {
		return (EAttribute)gotTheBombMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinTeamMessage() {
		return joinTeamMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTeamMessage_UserID() {
		return (EAttribute)joinTeamMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTeamMessage_UserName() {
		return (EAttribute)joinTeamMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTeamMessage_UserTeam() {
		return (EAttribute)joinTeamMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTeamMessage_UserSteamID() {
		return (EAttribute)joinTeamMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinTeamMessage_JoinedTeam() {
		return (EAttribute)joinTeamMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKillMessage() {
		return killMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_UserID() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_UserName() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_UserTeam() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_UserSteamID() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KillerPosX() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KillerPosY() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KillerPosZ() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KilledUserID() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KilledUserName() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KilledUserTeam() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KilledUserSteamID() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KilledPosX() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KilledPosY() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_KilledPosZ() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_Weapon() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillMessage_Headshot() {
		return (EAttribute)killMessageEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKillAssistMessage() {
		return killAssistMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillAssistMessage_UserID() {
		return (EAttribute)killAssistMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillAssistMessage_UserName() {
		return (EAttribute)killAssistMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillAssistMessage_UserTeam() {
		return (EAttribute)killAssistMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillAssistMessage_UserSteamID() {
		return (EAttribute)killAssistMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillAssistMessage_KilledUserID() {
		return (EAttribute)killAssistMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillAssistMessage_KilledUserName() {
		return (EAttribute)killAssistMessageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillAssistMessage_KilledUserTeam() {
		return (EAttribute)killAssistMessageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKillAssistMessage_KilledUserSteamID() {
		return (EAttribute)killAssistMessageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurchasedMessage() {
		return purchasedMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchasedMessage_UserID() {
		return (EAttribute)purchasedMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchasedMessage_UserName() {
		return (EAttribute)purchasedMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchasedMessage_UserTeam() {
		return (EAttribute)purchasedMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchasedMessage_UserSteamID() {
		return (EAttribute)purchasedMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchasedMessage_PurchasedObject() {
		return (EAttribute)purchasedMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemindRoundScoreMessage() {
		return remindRoundScoreMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemindRoundScoreMessage_Team() {
		return (EAttribute)remindRoundScoreMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemindRoundScoreMessage_TeamWin() {
		return (EAttribute)remindRoundScoreMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemindRoundScoreMessage_Type() {
		return (EAttribute)remindRoundScoreMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundEndMessage() {
		return roundEndMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundRestartMessage() {
		return roundRestartMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundScoredMessage() {
		return roundScoredMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundScoredMessage_Team() {
		return (EAttribute)roundScoredMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundScoredMessage_TeamWin() {
		return (EAttribute)roundScoredMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundScoredMessage_Type() {
		return (EAttribute)roundScoredMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundSpawnMessage() {
		return roundSpawnMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundSpawnMessage_Time() {
		return (EAttribute)roundSpawnMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundStartMessage() {
		return roundStartMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundStartMessage_Time() {
		return (EAttribute)roundStartMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSayMessage() {
		return sayMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayMessage_UserID() {
		return (EAttribute)sayMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayMessage_UserName() {
		return (EAttribute)sayMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayMessage_UserTeam() {
		return (EAttribute)sayMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayMessage_UserSteamID() {
		return (EAttribute)sayMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayMessage_Text() {
		return (EAttribute)sayMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchTeamMessage() {
		return switchTeamMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchTeamMessage_UserID() {
		return (EAttribute)switchTeamMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchTeamMessage_UserName() {
		return (EAttribute)switchTeamMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchTeamMessage_UserTeam() {
		return (EAttribute)switchTeamMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchTeamMessage_UserSteamID() {
		return (EAttribute)switchTeamMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchTeamMessage_SwitchedTeam() {
		return (EAttribute)switchTeamMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTeamScoredMessage() {
		return teamScoredMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamScoredMessage_Team() {
		return (EAttribute)teamScoredMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamScoredMessage_Score() {
		return (EAttribute)teamScoredMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTeamScoredMessage_Players() {
		return (EAttribute)teamScoredMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrewStuffMessage() {
		return threwStuffMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrewStuffMessage_UserID() {
		return (EAttribute)threwStuffMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrewStuffMessage_UserName() {
		return (EAttribute)threwStuffMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrewStuffMessage_UserTeam() {
		return (EAttribute)threwStuffMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrewStuffMessage_UserSteamID() {
		return (EAttribute)threwStuffMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrewStuffMessage_PosX() {
		return (EAttribute)threwStuffMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrewStuffMessage_PosY() {
		return (EAttribute)threwStuffMessageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrewStuffMessage_PosZ() {
		return (EAttribute)threwStuffMessageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrewStuffMessage_Stuff() {
		return (EAttribute)threwStuffMessageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageBuffer() {
		return messageBufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageBuffer_Messages() {
		return (EReference)messageBufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSayTeamMessage() {
		return sayTeamMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayTeamMessage_UserID() {
		return (EAttribute)sayTeamMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayTeamMessage_UserName() {
		return (EAttribute)sayTeamMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayTeamMessage_UserTeam() {
		return (EAttribute)sayTeamMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayTeamMessage_UserSteamID() {
		return (EAttribute)sayTeamMessageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSayTeamMessage_Text() {
		return (EAttribute)sayTeamMessageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		messageEClass = createEClass(MESSAGE);

		attackedMessageEClass = createEClass(ATTACKED_MESSAGE);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_NAME);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_USER_ID);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_STEAM_ID);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_TEAM);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_POS_X);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_POS_Y);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_POS_Z);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_WEAPON);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_DAMAGE);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_DAMAGE_ARMOR);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__ATTACKER_HIT_GROUP);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_NAME);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_USER_ID);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_STEAM_ID);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_TEAM);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_POS_X);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_POS_Y);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_POS_Z);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_HEALTH);
		createEAttribute(attackedMessageEClass, ATTACKED_MESSAGE__VICTIM_ARMOR);

		bombDefusingMessageEClass = createEClass(BOMB_DEFUSING_MESSAGE);
		createEAttribute(bombDefusingMessageEClass, BOMB_DEFUSING_MESSAGE__USER_ID);
		createEAttribute(bombDefusingMessageEClass, BOMB_DEFUSING_MESSAGE__USER_NAME);
		createEAttribute(bombDefusingMessageEClass, BOMB_DEFUSING_MESSAGE__USER_TEAM);
		createEAttribute(bombDefusingMessageEClass, BOMB_DEFUSING_MESSAGE__USER_STEAM_ID);

		bombPlantingMessageEClass = createEClass(BOMB_PLANTING_MESSAGE);
		createEAttribute(bombPlantingMessageEClass, BOMB_PLANTING_MESSAGE__USER_ID);
		createEAttribute(bombPlantingMessageEClass, BOMB_PLANTING_MESSAGE__USER_NAME);
		createEAttribute(bombPlantingMessageEClass, BOMB_PLANTING_MESSAGE__USER_TEAM);
		createEAttribute(bombPlantingMessageEClass, BOMB_PLANTING_MESSAGE__USER_STEAM_ID);

		changeMapMessageEClass = createEClass(CHANGE_MAP_MESSAGE);
		createEAttribute(changeMapMessageEClass, CHANGE_MAP_MESSAGE__MAP);

		changeNameMessageEClass = createEClass(CHANGE_NAME_MESSAGE);
		createEAttribute(changeNameMessageEClass, CHANGE_NAME_MESSAGE__USER_ID);
		createEAttribute(changeNameMessageEClass, CHANGE_NAME_MESSAGE__USER_NAME);
		createEAttribute(changeNameMessageEClass, CHANGE_NAME_MESSAGE__USER_TEAM);
		createEAttribute(changeNameMessageEClass, CHANGE_NAME_MESSAGE__USER_STEAM_ID);
		createEAttribute(changeNameMessageEClass, CHANGE_NAME_MESSAGE__NEW_USER_NAME);

		connectedMessageEClass = createEClass(CONNECTED_MESSAGE);
		createEAttribute(connectedMessageEClass, CONNECTED_MESSAGE__USER_ID);
		createEAttribute(connectedMessageEClass, CONNECTED_MESSAGE__USER_NAME);
		createEAttribute(connectedMessageEClass, CONNECTED_MESSAGE__USER_STEAM_ID);
		createEAttribute(connectedMessageEClass, CONNECTED_MESSAGE__ADDRESS);

		disconnectedMessageEClass = createEClass(DISCONNECTED_MESSAGE);
		createEAttribute(disconnectedMessageEClass, DISCONNECTED_MESSAGE__USER_ID);
		createEAttribute(disconnectedMessageEClass, DISCONNECTED_MESSAGE__USER_NAME);
		createEAttribute(disconnectedMessageEClass, DISCONNECTED_MESSAGE__USER_TEAM);
		createEAttribute(disconnectedMessageEClass, DISCONNECTED_MESSAGE__USER_STEAM_ID);

		enteredTheGameMessageEClass = createEClass(ENTERED_THE_GAME_MESSAGE);
		createEAttribute(enteredTheGameMessageEClass, ENTERED_THE_GAME_MESSAGE__USER_ID);
		createEAttribute(enteredTheGameMessageEClass, ENTERED_THE_GAME_MESSAGE__USER_NAME);
		createEAttribute(enteredTheGameMessageEClass, ENTERED_THE_GAME_MESSAGE__USER_STEAM_ID);

		gotTheBombMessageEClass = createEClass(GOT_THE_BOMB_MESSAGE);
		createEAttribute(gotTheBombMessageEClass, GOT_THE_BOMB_MESSAGE__USER_NAME);
		createEAttribute(gotTheBombMessageEClass, GOT_THE_BOMB_MESSAGE__USER_TEAM);
		createEAttribute(gotTheBombMessageEClass, GOT_THE_BOMB_MESSAGE__USER_STEAM_ID);
		createEAttribute(gotTheBombMessageEClass, GOT_THE_BOMB_MESSAGE__USER_ID);

		joinTeamMessageEClass = createEClass(JOIN_TEAM_MESSAGE);
		createEAttribute(joinTeamMessageEClass, JOIN_TEAM_MESSAGE__USER_ID);
		createEAttribute(joinTeamMessageEClass, JOIN_TEAM_MESSAGE__USER_NAME);
		createEAttribute(joinTeamMessageEClass, JOIN_TEAM_MESSAGE__USER_TEAM);
		createEAttribute(joinTeamMessageEClass, JOIN_TEAM_MESSAGE__USER_STEAM_ID);
		createEAttribute(joinTeamMessageEClass, JOIN_TEAM_MESSAGE__JOINED_TEAM);

		killMessageEClass = createEClass(KILL_MESSAGE);
		createEAttribute(killMessageEClass, KILL_MESSAGE__USER_ID);
		createEAttribute(killMessageEClass, KILL_MESSAGE__USER_NAME);
		createEAttribute(killMessageEClass, KILL_MESSAGE__USER_TEAM);
		createEAttribute(killMessageEClass, KILL_MESSAGE__USER_STEAM_ID);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLER_POS_X);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLER_POS_Y);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLER_POS_Z);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLED_USER_ID);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLED_USER_NAME);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLED_USER_TEAM);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLED_USER_STEAM_ID);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLED_POS_X);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLED_POS_Y);
		createEAttribute(killMessageEClass, KILL_MESSAGE__KILLED_POS_Z);
		createEAttribute(killMessageEClass, KILL_MESSAGE__WEAPON);
		createEAttribute(killMessageEClass, KILL_MESSAGE__HEADSHOT);

		killAssistMessageEClass = createEClass(KILL_ASSIST_MESSAGE);
		createEAttribute(killAssistMessageEClass, KILL_ASSIST_MESSAGE__USER_ID);
		createEAttribute(killAssistMessageEClass, KILL_ASSIST_MESSAGE__USER_NAME);
		createEAttribute(killAssistMessageEClass, KILL_ASSIST_MESSAGE__USER_TEAM);
		createEAttribute(killAssistMessageEClass, KILL_ASSIST_MESSAGE__USER_STEAM_ID);
		createEAttribute(killAssistMessageEClass, KILL_ASSIST_MESSAGE__KILLED_USER_ID);
		createEAttribute(killAssistMessageEClass, KILL_ASSIST_MESSAGE__KILLED_USER_NAME);
		createEAttribute(killAssistMessageEClass, KILL_ASSIST_MESSAGE__KILLED_USER_TEAM);
		createEAttribute(killAssistMessageEClass, KILL_ASSIST_MESSAGE__KILLED_USER_STEAM_ID);

		purchasedMessageEClass = createEClass(PURCHASED_MESSAGE);
		createEAttribute(purchasedMessageEClass, PURCHASED_MESSAGE__USER_ID);
		createEAttribute(purchasedMessageEClass, PURCHASED_MESSAGE__USER_NAME);
		createEAttribute(purchasedMessageEClass, PURCHASED_MESSAGE__USER_TEAM);
		createEAttribute(purchasedMessageEClass, PURCHASED_MESSAGE__USER_STEAM_ID);
		createEAttribute(purchasedMessageEClass, PURCHASED_MESSAGE__PURCHASED_OBJECT);

		remindRoundScoreMessageEClass = createEClass(REMIND_ROUND_SCORE_MESSAGE);
		createEAttribute(remindRoundScoreMessageEClass, REMIND_ROUND_SCORE_MESSAGE__TEAM);
		createEAttribute(remindRoundScoreMessageEClass, REMIND_ROUND_SCORE_MESSAGE__TEAM_WIN);
		createEAttribute(remindRoundScoreMessageEClass, REMIND_ROUND_SCORE_MESSAGE__TYPE);

		roundEndMessageEClass = createEClass(ROUND_END_MESSAGE);

		roundRestartMessageEClass = createEClass(ROUND_RESTART_MESSAGE);

		roundScoredMessageEClass = createEClass(ROUND_SCORED_MESSAGE);
		createEAttribute(roundScoredMessageEClass, ROUND_SCORED_MESSAGE__TEAM);
		createEAttribute(roundScoredMessageEClass, ROUND_SCORED_MESSAGE__TEAM_WIN);
		createEAttribute(roundScoredMessageEClass, ROUND_SCORED_MESSAGE__TYPE);

		roundSpawnMessageEClass = createEClass(ROUND_SPAWN_MESSAGE);
		createEAttribute(roundSpawnMessageEClass, ROUND_SPAWN_MESSAGE__TIME);

		roundStartMessageEClass = createEClass(ROUND_START_MESSAGE);
		createEAttribute(roundStartMessageEClass, ROUND_START_MESSAGE__TIME);

		sayMessageEClass = createEClass(SAY_MESSAGE);
		createEAttribute(sayMessageEClass, SAY_MESSAGE__USER_ID);
		createEAttribute(sayMessageEClass, SAY_MESSAGE__USER_NAME);
		createEAttribute(sayMessageEClass, SAY_MESSAGE__USER_TEAM);
		createEAttribute(sayMessageEClass, SAY_MESSAGE__USER_STEAM_ID);
		createEAttribute(sayMessageEClass, SAY_MESSAGE__TEXT);

		switchTeamMessageEClass = createEClass(SWITCH_TEAM_MESSAGE);
		createEAttribute(switchTeamMessageEClass, SWITCH_TEAM_MESSAGE__USER_ID);
		createEAttribute(switchTeamMessageEClass, SWITCH_TEAM_MESSAGE__USER_NAME);
		createEAttribute(switchTeamMessageEClass, SWITCH_TEAM_MESSAGE__USER_TEAM);
		createEAttribute(switchTeamMessageEClass, SWITCH_TEAM_MESSAGE__USER_STEAM_ID);
		createEAttribute(switchTeamMessageEClass, SWITCH_TEAM_MESSAGE__SWITCHED_TEAM);

		teamScoredMessageEClass = createEClass(TEAM_SCORED_MESSAGE);
		createEAttribute(teamScoredMessageEClass, TEAM_SCORED_MESSAGE__TEAM);
		createEAttribute(teamScoredMessageEClass, TEAM_SCORED_MESSAGE__SCORE);
		createEAttribute(teamScoredMessageEClass, TEAM_SCORED_MESSAGE__PLAYERS);

		threwStuffMessageEClass = createEClass(THREW_STUFF_MESSAGE);
		createEAttribute(threwStuffMessageEClass, THREW_STUFF_MESSAGE__USER_ID);
		createEAttribute(threwStuffMessageEClass, THREW_STUFF_MESSAGE__USER_NAME);
		createEAttribute(threwStuffMessageEClass, THREW_STUFF_MESSAGE__USER_TEAM);
		createEAttribute(threwStuffMessageEClass, THREW_STUFF_MESSAGE__USER_STEAM_ID);
		createEAttribute(threwStuffMessageEClass, THREW_STUFF_MESSAGE__POS_X);
		createEAttribute(threwStuffMessageEClass, THREW_STUFF_MESSAGE__POS_Y);
		createEAttribute(threwStuffMessageEClass, THREW_STUFF_MESSAGE__POS_Z);
		createEAttribute(threwStuffMessageEClass, THREW_STUFF_MESSAGE__STUFF);

		messageBufferEClass = createEClass(MESSAGE_BUFFER);
		createEReference(messageBufferEClass, MESSAGE_BUFFER__MESSAGES);

		sayTeamMessageEClass = createEClass(SAY_TEAM_MESSAGE);
		createEAttribute(sayTeamMessageEClass, SAY_TEAM_MESSAGE__USER_ID);
		createEAttribute(sayTeamMessageEClass, SAY_TEAM_MESSAGE__USER_NAME);
		createEAttribute(sayTeamMessageEClass, SAY_TEAM_MESSAGE__USER_TEAM);
		createEAttribute(sayTeamMessageEClass, SAY_TEAM_MESSAGE__USER_STEAM_ID);
		createEAttribute(sayTeamMessageEClass, SAY_TEAM_MESSAGE__TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attackedMessageEClass.getESuperTypes().add(this.getMessage());
		bombDefusingMessageEClass.getESuperTypes().add(this.getMessage());
		bombPlantingMessageEClass.getESuperTypes().add(this.getMessage());
		changeMapMessageEClass.getESuperTypes().add(this.getMessage());
		changeNameMessageEClass.getESuperTypes().add(this.getMessage());
		connectedMessageEClass.getESuperTypes().add(this.getMessage());
		disconnectedMessageEClass.getESuperTypes().add(this.getMessage());
		enteredTheGameMessageEClass.getESuperTypes().add(this.getMessage());
		gotTheBombMessageEClass.getESuperTypes().add(this.getMessage());
		joinTeamMessageEClass.getESuperTypes().add(this.getMessage());
		killMessageEClass.getESuperTypes().add(this.getMessage());
		killAssistMessageEClass.getESuperTypes().add(this.getMessage());
		purchasedMessageEClass.getESuperTypes().add(this.getMessage());
		remindRoundScoreMessageEClass.getESuperTypes().add(this.getMessage());
		roundEndMessageEClass.getESuperTypes().add(this.getMessage());
		roundRestartMessageEClass.getESuperTypes().add(this.getMessage());
		roundScoredMessageEClass.getESuperTypes().add(this.getMessage());
		roundSpawnMessageEClass.getESuperTypes().add(this.getMessage());
		roundStartMessageEClass.getESuperTypes().add(this.getMessage());
		sayMessageEClass.getESuperTypes().add(this.getMessage());
		switchTeamMessageEClass.getESuperTypes().add(this.getMessage());
		teamScoredMessageEClass.getESuperTypes().add(this.getMessage());
		threwStuffMessageEClass.getESuperTypes().add(this.getMessage());
		sayTeamMessageEClass.getESuperTypes().add(this.getMessage());

		// Initialize classes, features, and operations; add parameters
		initEClass(messageEClass, Message.class, "Message", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attackedMessageEClass, AttackedMessage.class, "AttackedMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttackedMessage_AttackerName(), ecorePackage.getEString(), "attackerName", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerUserID(), ecorePackage.getEString(), "attackerUserID", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerSteamID(), ecorePackage.getEString(), "attackerSteamID", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerTeam(), ecorePackage.getEString(), "attackerTeam", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerPosX(), ecorePackage.getEInt(), "attackerPosX", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerPosY(), ecorePackage.getEInt(), "attackerPosY", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerPosZ(), ecorePackage.getEInt(), "attackerPosZ", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerWeapon(), ecorePackage.getEString(), "attackerWeapon", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerDamage(), ecorePackage.getEInt(), "attackerDamage", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerDamageArmor(), ecorePackage.getEInt(), "attackerDamageArmor", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_AttackerHitGroup(), ecorePackage.getEString(), "attackerHitGroup", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimName(), ecorePackage.getEString(), "victimName", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimUserID(), ecorePackage.getEString(), "victimUserID", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimSteamID(), ecorePackage.getEString(), "victimSteamID", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimTeam(), ecorePackage.getEString(), "victimTeam", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimPosX(), ecorePackage.getEInt(), "victimPosX", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimPosY(), ecorePackage.getEInt(), "victimPosY", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimPosZ(), ecorePackage.getEInt(), "victimPosZ", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimHealth(), ecorePackage.getEInt(), "victimHealth", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttackedMessage_VictimArmor(), ecorePackage.getEInt(), "victimArmor", null, 0, 1, AttackedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bombDefusingMessageEClass, BombDefusingMessage.class, "BombDefusingMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBombDefusingMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, BombDefusingMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBombDefusingMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, BombDefusingMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBombDefusingMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, BombDefusingMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBombDefusingMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, BombDefusingMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bombPlantingMessageEClass, BombPlantingMessage.class, "BombPlantingMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBombPlantingMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, BombPlantingMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBombPlantingMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, BombPlantingMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBombPlantingMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, BombPlantingMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBombPlantingMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, BombPlantingMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeMapMessageEClass, ChangeMapMessage.class, "ChangeMapMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeMapMessage_Map(), ecorePackage.getEString(), "map", null, 0, 1, ChangeMapMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeNameMessageEClass, ChangeNameMessage.class, "ChangeNameMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeNameMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, ChangeNameMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeNameMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, ChangeNameMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeNameMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, ChangeNameMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeNameMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, ChangeNameMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeNameMessage_NewUserName(), ecorePackage.getEString(), "newUserName", null, 0, 1, ChangeNameMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectedMessageEClass, ConnectedMessage.class, "ConnectedMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectedMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, ConnectedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectedMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, ConnectedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectedMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, ConnectedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnectedMessage_Address(), ecorePackage.getEString(), "address", null, 0, 1, ConnectedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disconnectedMessageEClass, DisconnectedMessage.class, "DisconnectedMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisconnectedMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, DisconnectedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisconnectedMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, DisconnectedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisconnectedMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, DisconnectedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisconnectedMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, DisconnectedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enteredTheGameMessageEClass, EnteredTheGameMessage.class, "EnteredTheGameMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnteredTheGameMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, EnteredTheGameMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnteredTheGameMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, EnteredTheGameMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnteredTheGameMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, EnteredTheGameMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gotTheBombMessageEClass, GotTheBombMessage.class, "GotTheBombMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGotTheBombMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, GotTheBombMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGotTheBombMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, GotTheBombMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGotTheBombMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, GotTheBombMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGotTheBombMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, GotTheBombMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinTeamMessageEClass, JoinTeamMessage.class, "JoinTeamMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinTeamMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, JoinTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTeamMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, JoinTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTeamMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, JoinTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTeamMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, JoinTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJoinTeamMessage_JoinedTeam(), ecorePackage.getEString(), "joinedTeam", null, 0, 1, JoinTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(killMessageEClass, KillMessage.class, "KillMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKillMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KillerPosX(), ecorePackage.getEInt(), "killerPosX", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KillerPosY(), ecorePackage.getEInt(), "killerPosY", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KillerPosZ(), ecorePackage.getEInt(), "killerPosZ", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KilledUserID(), ecorePackage.getEString(), "killedUserID", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KilledUserName(), ecorePackage.getEString(), "killedUserName", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KilledUserTeam(), ecorePackage.getEString(), "killedUserTeam", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KilledUserSteamID(), ecorePackage.getEString(), "killedUserSteamID", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KilledPosX(), ecorePackage.getEInt(), "killedPosX", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KilledPosY(), ecorePackage.getEInt(), "killedPosY", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_KilledPosZ(), ecorePackage.getEInt(), "killedPosZ", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_Weapon(), ecorePackage.getEString(), "weapon", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillMessage_Headshot(), ecorePackage.getEBoolean(), "headshot", null, 0, 1, KillMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(killAssistMessageEClass, KillAssistMessage.class, "KillAssistMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKillAssistMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, KillAssistMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillAssistMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, KillAssistMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillAssistMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, KillAssistMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillAssistMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, KillAssistMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillAssistMessage_KilledUserID(), ecorePackage.getEString(), "killedUserID", null, 0, 1, KillAssistMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillAssistMessage_KilledUserName(), ecorePackage.getEString(), "killedUserName", null, 0, 1, KillAssistMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillAssistMessage_KilledUserTeam(), ecorePackage.getEString(), "killedUserTeam", null, 0, 1, KillAssistMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKillAssistMessage_KilledUserSteamID(), ecorePackage.getEString(), "killedUserSteamID", null, 0, 1, KillAssistMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(purchasedMessageEClass, PurchasedMessage.class, "PurchasedMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurchasedMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, PurchasedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurchasedMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, PurchasedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurchasedMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, PurchasedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurchasedMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, PurchasedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPurchasedMessage_PurchasedObject(), ecorePackage.getEString(), "purchasedObject", null, 0, 1, PurchasedMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remindRoundScoreMessageEClass, RemindRoundScoreMessage.class, "RemindRoundScoreMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemindRoundScoreMessage_Team(), ecorePackage.getEString(), "team", null, 0, 1, RemindRoundScoreMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemindRoundScoreMessage_TeamWin(), ecorePackage.getEString(), "teamWin", null, 0, 1, RemindRoundScoreMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemindRoundScoreMessage_Type(), ecorePackage.getEString(), "type", null, 0, 1, RemindRoundScoreMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundEndMessageEClass, RoundEndMessage.class, "RoundEndMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roundRestartMessageEClass, RoundRestartMessage.class, "RoundRestartMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roundScoredMessageEClass, RoundScoredMessage.class, "RoundScoredMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoundScoredMessage_Team(), ecorePackage.getEString(), "team", null, 0, 1, RoundScoredMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundScoredMessage_TeamWin(), ecorePackage.getEString(), "teamWin", null, 0, 1, RoundScoredMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundScoredMessage_Type(), ecorePackage.getEString(), "type", null, 0, 1, RoundScoredMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundSpawnMessageEClass, RoundSpawnMessage.class, "RoundSpawnMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoundSpawnMessage_Time(), ecorePackage.getEInt(), "time", null, 0, 1, RoundSpawnMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundStartMessageEClass, RoundStartMessage.class, "RoundStartMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoundStartMessage_Time(), ecorePackage.getEInt(), "time", null, 0, 1, RoundStartMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sayMessageEClass, SayMessage.class, "SayMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSayMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, SayMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, SayMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, SayMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, SayMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayMessage_Text(), ecorePackage.getEString(), "text", null, 0, 1, SayMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchTeamMessageEClass, SwitchTeamMessage.class, "SwitchTeamMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSwitchTeamMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, SwitchTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwitchTeamMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, SwitchTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwitchTeamMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, SwitchTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwitchTeamMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, SwitchTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSwitchTeamMessage_SwitchedTeam(), ecorePackage.getEString(), "switchedTeam", null, 0, 1, SwitchTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teamScoredMessageEClass, TeamScoredMessage.class, "TeamScoredMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeamScoredMessage_Team(), ecorePackage.getEString(), "team", null, 0, 1, TeamScoredMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamScoredMessage_Score(), ecorePackage.getEString(), "score", null, 0, 1, TeamScoredMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeamScoredMessage_Players(), ecorePackage.getEString(), "players", null, 0, 1, TeamScoredMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(threwStuffMessageEClass, ThrewStuffMessage.class, "ThrewStuffMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrewStuffMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, ThrewStuffMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrewStuffMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, ThrewStuffMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrewStuffMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, ThrewStuffMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrewStuffMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, ThrewStuffMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrewStuffMessage_PosX(), ecorePackage.getEInt(), "posX", null, 0, 1, ThrewStuffMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrewStuffMessage_PosY(), ecorePackage.getEInt(), "posY", null, 0, 1, ThrewStuffMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrewStuffMessage_PosZ(), ecorePackage.getEInt(), "posZ", null, 0, 1, ThrewStuffMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrewStuffMessage_Stuff(), ecorePackage.getEString(), "stuff", null, 0, 1, ThrewStuffMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageBufferEClass, MessageBuffer.class, "MessageBuffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageBuffer_Messages(), this.getMessage(), null, "messages", null, 0, -1, MessageBuffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sayTeamMessageEClass, SayTeamMessage.class, "SayTeamMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSayTeamMessage_UserID(), ecorePackage.getEString(), "userID", null, 0, 1, SayTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayTeamMessage_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, SayTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayTeamMessage_UserTeam(), ecorePackage.getEString(), "userTeam", null, 0, 1, SayTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayTeamMessage_UserSteamID(), ecorePackage.getEString(), "userSteamID", null, 0, 1, SayTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSayTeamMessage_Text(), ecorePackage.getEString(), "text", null, 0, 1, SayTeamMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
