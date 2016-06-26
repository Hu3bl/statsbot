/**
 */
package MessagesModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see MessagesModel.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MessagesModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://statsbot.renehahn.de/messages/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "messagesModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = MessagesModel.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link MessagesModel.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.MessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.AttackedMessageImpl <em>Attacked Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.AttackedMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getAttackedMessage()
	 * @generated
	 */
	int ATTACKED_MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Attacker Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_NAME = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attacker User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_USER_ID = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attacker Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_STEAM_ID = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Attacker Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_TEAM = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attacker Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_POS_X = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Attacker Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_POS_Y = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attacker Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_POS_Z = MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Attacker Weapon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_WEAPON = MESSAGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Attacker Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_DAMAGE = MESSAGE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attacker Damage Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_DAMAGE_ARMOR = MESSAGE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Attacker Hit Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__ATTACKER_HIT_GROUP = MESSAGE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Victim Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_NAME = MESSAGE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Victim User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_USER_ID = MESSAGE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Victim Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_STEAM_ID = MESSAGE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Victim Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_TEAM = MESSAGE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Victim Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_POS_X = MESSAGE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Victim Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_POS_Y = MESSAGE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Victim Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_POS_Z = MESSAGE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Victim Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_HEALTH = MESSAGE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Victim Armor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE__VICTIM_ARMOR = MESSAGE_FEATURE_COUNT + 19;

	/**
	 * The number of structural features of the '<em>Attacked Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 20;

	/**
	 * The number of operations of the '<em>Attacked Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKED_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.BombDefusingMessageImpl <em>Bomb Defusing Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.BombDefusingMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getBombDefusingMessage()
	 * @generated
	 */
	int BOMB_DEFUSING_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_DEFUSING_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_DEFUSING_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_DEFUSING_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_DEFUSING_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bomb Defusing Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_DEFUSING_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bomb Defusing Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_DEFUSING_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.BombPlantingMessageImpl <em>Bomb Planting Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.BombPlantingMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getBombPlantingMessage()
	 * @generated
	 */
	int BOMB_PLANTING_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_PLANTING_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_PLANTING_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_PLANTING_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_PLANTING_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Bomb Planting Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_PLANTING_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Bomb Planting Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOMB_PLANTING_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.ChangeMapMessageImpl <em>Change Map Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.ChangeMapMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getChangeMapMessage()
	 * @generated
	 */
	int CHANGE_MAP_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MAP_MESSAGE__MAP = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Map Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MAP_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Change Map Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_MAP_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.ChangeNameMessageImpl <em>Change Name Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.ChangeNameMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getChangeNameMessage()
	 * @generated
	 */
	int CHANGE_NAME_MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_NAME_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_NAME_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_NAME_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_NAME_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>New User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_NAME_MESSAGE__NEW_USER_NAME = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Change Name Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_NAME_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Change Name Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_NAME_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.ConnectedMessageImpl <em>Connected Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.ConnectedMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getConnectedMessage()
	 * @generated
	 */
	int CONNECTED_MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_MESSAGE__ADDRESS = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Connected Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Connected Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTED_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.DisconnectedMessageImpl <em>Disconnected Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.DisconnectedMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getDisconnectedMessage()
	 * @generated
	 */
	int DISCONNECTED_MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTED_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTED_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTED_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTED_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Disconnected Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTED_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Disconnected Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTED_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.EnteredTheGameMessageImpl <em>Entered The Game Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.EnteredTheGameMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getEnteredTheGameMessage()
	 * @generated
	 */
	int ENTERED_THE_GAME_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERED_THE_GAME_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERED_THE_GAME_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERED_THE_GAME_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entered The Game Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERED_THE_GAME_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entered The Game Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTERED_THE_GAME_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.GotTheBombMessageImpl <em>Got The Bomb Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.GotTheBombMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getGotTheBombMessage()
	 * @generated
	 */
	int GOT_THE_BOMB_MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOT_THE_BOMB_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOT_THE_BOMB_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOT_THE_BOMB_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOT_THE_BOMB_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Got The Bomb Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOT_THE_BOMB_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Got The Bomb Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOT_THE_BOMB_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.JoinTeamMessageImpl <em>Join Team Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.JoinTeamMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getJoinTeamMessage()
	 * @generated
	 */
	int JOIN_TEAM_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TEAM_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TEAM_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TEAM_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TEAM_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Joined Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TEAM_MESSAGE__JOINED_TEAM = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Join Team Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TEAM_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Join Team Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TEAM_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.KillMessageImpl <em>Kill Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.KillMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getKillMessage()
	 * @generated
	 */
	int KILL_MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Killer Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLER_POS_X = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Killer Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLER_POS_Y = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Killer Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLER_POS_Z = MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Killed User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLED_USER_ID = MESSAGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Killed User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLED_USER_NAME = MESSAGE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Killed User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLED_USER_TEAM = MESSAGE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Killed User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLED_USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Killed Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLED_POS_X = MESSAGE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Killed Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLED_POS_Y = MESSAGE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Killed Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__KILLED_POS_Z = MESSAGE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Weapon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__WEAPON = MESSAGE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Headshot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE__HEADSHOT = MESSAGE_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Kill Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>Kill Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.KillAssistMessageImpl <em>Kill Assist Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.KillAssistMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getKillAssistMessage()
	 * @generated
	 */
	int KILL_ASSIST_MESSAGE = 12;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Killed User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE__KILLED_USER_ID = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Killed User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE__KILLED_USER_NAME = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Killed User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE__KILLED_USER_TEAM = MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Killed User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE__KILLED_USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Kill Assist Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Kill Assist Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KILL_ASSIST_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.PurchasedMessageImpl <em>Purchased Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.PurchasedMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getPurchasedMessage()
	 * @generated
	 */
	int PURCHASED_MESSAGE = 13;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASED_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASED_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASED_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASED_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purchased Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASED_MESSAGE__PURCHASED_OBJECT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Purchased Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASED_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Purchased Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PURCHASED_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.RemindRoundScoreMessageImpl <em>Remind Round Score Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.RemindRoundScoreMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getRemindRoundScoreMessage()
	 * @generated
	 */
	int REMIND_ROUND_SCORE_MESSAGE = 14;

	/**
	 * The feature id for the '<em><b>Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMIND_ROUND_SCORE_MESSAGE__TEAM = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Team Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMIND_ROUND_SCORE_MESSAGE__TEAM_WIN = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMIND_ROUND_SCORE_MESSAGE__TYPE = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remind Round Score Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMIND_ROUND_SCORE_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Remind Round Score Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMIND_ROUND_SCORE_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.RoundEndMessageImpl <em>Round End Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.RoundEndMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getRoundEndMessage()
	 * @generated
	 */
	int ROUND_END_MESSAGE = 15;

	/**
	 * The number of structural features of the '<em>Round End Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_END_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Round End Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_END_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.RoundRestartMessageImpl <em>Round Restart Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.RoundRestartMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getRoundRestartMessage()
	 * @generated
	 */
	int ROUND_RESTART_MESSAGE = 16;

	/**
	 * The number of structural features of the '<em>Round Restart Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_RESTART_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Round Restart Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_RESTART_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.RoundScoredMessageImpl <em>Round Scored Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.RoundScoredMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getRoundScoredMessage()
	 * @generated
	 */
	int ROUND_SCORED_MESSAGE = 17;

	/**
	 * The feature id for the '<em><b>Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_SCORED_MESSAGE__TEAM = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Team Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_SCORED_MESSAGE__TEAM_WIN = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_SCORED_MESSAGE__TYPE = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Round Scored Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_SCORED_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Round Scored Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_SCORED_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.RoundSpawnMessageImpl <em>Round Spawn Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.RoundSpawnMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getRoundSpawnMessage()
	 * @generated
	 */
	int ROUND_SPAWN_MESSAGE = 18;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_SPAWN_MESSAGE__TIME = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Round Spawn Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_SPAWN_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Round Spawn Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_SPAWN_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.RoundStartMessageImpl <em>Round Start Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.RoundStartMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getRoundStartMessage()
	 * @generated
	 */
	int ROUND_START_MESSAGE = 19;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_START_MESSAGE__TIME = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Round Start Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_START_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Round Start Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_START_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.SayMessageImpl <em>Say Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.SayMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getSayMessage()
	 * @generated
	 */
	int SAY_MESSAGE = 20;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_MESSAGE__TEXT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Say Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Say Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.SwitchTeamMessageImpl <em>Switch Team Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.SwitchTeamMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getSwitchTeamMessage()
	 * @generated
	 */
	int SWITCH_TEAM_MESSAGE = 21;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TEAM_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TEAM_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TEAM_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TEAM_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Switched Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TEAM_MESSAGE__SWITCHED_TEAM = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Switch Team Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TEAM_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Switch Team Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_TEAM_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.TeamScoredMessageImpl <em>Team Scored Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.TeamScoredMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getTeamScoredMessage()
	 * @generated
	 */
	int TEAM_SCORED_MESSAGE = 22;

	/**
	 * The feature id for the '<em><b>Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_SCORED_MESSAGE__TEAM = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_SCORED_MESSAGE__SCORE = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_SCORED_MESSAGE__PLAYERS = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Team Scored Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_SCORED_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Team Scored Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_SCORED_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.ThrewStuffMessageImpl <em>Threw Stuff Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.ThrewStuffMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getThrewStuffMessage()
	 * @generated
	 */
	int THREW_STUFF_MESSAGE = 23;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pos X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE__POS_X = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pos Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE__POS_Y = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pos Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE__POS_Z = MESSAGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stuff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE__STUFF = MESSAGE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Threw Stuff Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Threw Stuff Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREW_STUFF_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MessagesModel.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.MessageBufferImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getMessageBuffer()
	 * @generated
	 */
	int MESSAGE_BUFFER = 24;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER__MESSAGES = 0;

	/**
	 * The number of structural features of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_BUFFER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link MessagesModel.impl.SayTeamMessageImpl <em>Say Team Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MessagesModel.impl.SayTeamMessageImpl
	 * @see MessagesModel.impl.ModelPackageImpl#getSayTeamMessage()
	 * @generated
	 */
	int SAY_TEAM_MESSAGE = 25;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_TEAM_MESSAGE__USER_ID = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_TEAM_MESSAGE__USER_NAME = MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>User Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_TEAM_MESSAGE__USER_TEAM = MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>User Steam ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_TEAM_MESSAGE__USER_STEAM_ID = MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_TEAM_MESSAGE__TEXT = MESSAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Say Team Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_TEAM_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Say Team Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAY_TEAM_MESSAGE_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link MessagesModel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see MessagesModel.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link MessagesModel.AttackedMessage <em>Attacked Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacked Message</em>'.
	 * @see MessagesModel.AttackedMessage
	 * @generated
	 */
	EClass getAttackedMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerName <em>Attacker Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Name</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerName()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerUserID <em>Attacker User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker User ID</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerUserID()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerUserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerSteamID <em>Attacker Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Steam ID</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerSteamID()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerTeam <em>Attacker Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Team</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerTeam()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerPosX <em>Attacker Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Pos X</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerPosX()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerPosX();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerPosY <em>Attacker Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Pos Y</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerPosY()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerPosY();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerPosZ <em>Attacker Pos Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Pos Z</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerPosZ()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerPosZ();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerWeapon <em>Attacker Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Weapon</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerWeapon()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerWeapon();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerDamage <em>Attacker Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Damage</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerDamage()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerDamage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerDamageArmor <em>Attacker Damage Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Damage Armor</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerDamageArmor()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerDamageArmor();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getAttackerHitGroup <em>Attacker Hit Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attacker Hit Group</em>'.
	 * @see MessagesModel.AttackedMessage#getAttackerHitGroup()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_AttackerHitGroup();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimName <em>Victim Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Name</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimName()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimUserID <em>Victim User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim User ID</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimUserID()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimUserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimSteamID <em>Victim Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Steam ID</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimSteamID()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimTeam <em>Victim Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Team</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimTeam()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimPosX <em>Victim Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Pos X</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimPosX()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimPosX();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimPosY <em>Victim Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Pos Y</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimPosY()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimPosY();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimPosZ <em>Victim Pos Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Pos Z</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimPosZ()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimPosZ();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimHealth <em>Victim Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Health</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimHealth()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimHealth();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.AttackedMessage#getVictimArmor <em>Victim Armor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Victim Armor</em>'.
	 * @see MessagesModel.AttackedMessage#getVictimArmor()
	 * @see #getAttackedMessage()
	 * @generated
	 */
	EAttribute getAttackedMessage_VictimArmor();

	/**
	 * Returns the meta object for class '{@link MessagesModel.BombDefusingMessage <em>Bomb Defusing Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bomb Defusing Message</em>'.
	 * @see MessagesModel.BombDefusingMessage
	 * @generated
	 */
	EClass getBombDefusingMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.BombDefusingMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.BombDefusingMessage#getUserID()
	 * @see #getBombDefusingMessage()
	 * @generated
	 */
	EAttribute getBombDefusingMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.BombDefusingMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.BombDefusingMessage#getUserName()
	 * @see #getBombDefusingMessage()
	 * @generated
	 */
	EAttribute getBombDefusingMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.BombDefusingMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.BombDefusingMessage#getUserTeam()
	 * @see #getBombDefusingMessage()
	 * @generated
	 */
	EAttribute getBombDefusingMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.BombDefusingMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.BombDefusingMessage#getUserSteamID()
	 * @see #getBombDefusingMessage()
	 * @generated
	 */
	EAttribute getBombDefusingMessage_UserSteamID();

	/**
	 * Returns the meta object for class '{@link MessagesModel.BombPlantingMessage <em>Bomb Planting Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bomb Planting Message</em>'.
	 * @see MessagesModel.BombPlantingMessage
	 * @generated
	 */
	EClass getBombPlantingMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.BombPlantingMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.BombPlantingMessage#getUserID()
	 * @see #getBombPlantingMessage()
	 * @generated
	 */
	EAttribute getBombPlantingMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.BombPlantingMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.BombPlantingMessage#getUserName()
	 * @see #getBombPlantingMessage()
	 * @generated
	 */
	EAttribute getBombPlantingMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.BombPlantingMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.BombPlantingMessage#getUserTeam()
	 * @see #getBombPlantingMessage()
	 * @generated
	 */
	EAttribute getBombPlantingMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.BombPlantingMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.BombPlantingMessage#getUserSteamID()
	 * @see #getBombPlantingMessage()
	 * @generated
	 */
	EAttribute getBombPlantingMessage_UserSteamID();

	/**
	 * Returns the meta object for class '{@link MessagesModel.ChangeMapMessage <em>Change Map Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Map Message</em>'.
	 * @see MessagesModel.ChangeMapMessage
	 * @generated
	 */
	EClass getChangeMapMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ChangeMapMessage#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Map</em>'.
	 * @see MessagesModel.ChangeMapMessage#getMap()
	 * @see #getChangeMapMessage()
	 * @generated
	 */
	EAttribute getChangeMapMessage_Map();

	/**
	 * Returns the meta object for class '{@link MessagesModel.ChangeNameMessage <em>Change Name Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Name Message</em>'.
	 * @see MessagesModel.ChangeNameMessage
	 * @generated
	 */
	EClass getChangeNameMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ChangeNameMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.ChangeNameMessage#getUserID()
	 * @see #getChangeNameMessage()
	 * @generated
	 */
	EAttribute getChangeNameMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ChangeNameMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.ChangeNameMessage#getUserName()
	 * @see #getChangeNameMessage()
	 * @generated
	 */
	EAttribute getChangeNameMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ChangeNameMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.ChangeNameMessage#getUserTeam()
	 * @see #getChangeNameMessage()
	 * @generated
	 */
	EAttribute getChangeNameMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ChangeNameMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.ChangeNameMessage#getUserSteamID()
	 * @see #getChangeNameMessage()
	 * @generated
	 */
	EAttribute getChangeNameMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ChangeNameMessage#getNewUserName <em>New User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New User Name</em>'.
	 * @see MessagesModel.ChangeNameMessage#getNewUserName()
	 * @see #getChangeNameMessage()
	 * @generated
	 */
	EAttribute getChangeNameMessage_NewUserName();

	/**
	 * Returns the meta object for class '{@link MessagesModel.ConnectedMessage <em>Connected Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connected Message</em>'.
	 * @see MessagesModel.ConnectedMessage
	 * @generated
	 */
	EClass getConnectedMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ConnectedMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.ConnectedMessage#getUserID()
	 * @see #getConnectedMessage()
	 * @generated
	 */
	EAttribute getConnectedMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ConnectedMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.ConnectedMessage#getUserName()
	 * @see #getConnectedMessage()
	 * @generated
	 */
	EAttribute getConnectedMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ConnectedMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.ConnectedMessage#getUserSteamID()
	 * @see #getConnectedMessage()
	 * @generated
	 */
	EAttribute getConnectedMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ConnectedMessage#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see MessagesModel.ConnectedMessage#getAddress()
	 * @see #getConnectedMessage()
	 * @generated
	 */
	EAttribute getConnectedMessage_Address();

	/**
	 * Returns the meta object for class '{@link MessagesModel.DisconnectedMessage <em>Disconnected Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnected Message</em>'.
	 * @see MessagesModel.DisconnectedMessage
	 * @generated
	 */
	EClass getDisconnectedMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.DisconnectedMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.DisconnectedMessage#getUserID()
	 * @see #getDisconnectedMessage()
	 * @generated
	 */
	EAttribute getDisconnectedMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.DisconnectedMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.DisconnectedMessage#getUserName()
	 * @see #getDisconnectedMessage()
	 * @generated
	 */
	EAttribute getDisconnectedMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.DisconnectedMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.DisconnectedMessage#getUserTeam()
	 * @see #getDisconnectedMessage()
	 * @generated
	 */
	EAttribute getDisconnectedMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.DisconnectedMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.DisconnectedMessage#getUserSteamID()
	 * @see #getDisconnectedMessage()
	 * @generated
	 */
	EAttribute getDisconnectedMessage_UserSteamID();

	/**
	 * Returns the meta object for class '{@link MessagesModel.EnteredTheGameMessage <em>Entered The Game Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entered The Game Message</em>'.
	 * @see MessagesModel.EnteredTheGameMessage
	 * @generated
	 */
	EClass getEnteredTheGameMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.EnteredTheGameMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.EnteredTheGameMessage#getUserID()
	 * @see #getEnteredTheGameMessage()
	 * @generated
	 */
	EAttribute getEnteredTheGameMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.EnteredTheGameMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.EnteredTheGameMessage#getUserName()
	 * @see #getEnteredTheGameMessage()
	 * @generated
	 */
	EAttribute getEnteredTheGameMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.EnteredTheGameMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.EnteredTheGameMessage#getUserSteamID()
	 * @see #getEnteredTheGameMessage()
	 * @generated
	 */
	EAttribute getEnteredTheGameMessage_UserSteamID();

	/**
	 * Returns the meta object for class '{@link MessagesModel.GotTheBombMessage <em>Got The Bomb Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Got The Bomb Message</em>'.
	 * @see MessagesModel.GotTheBombMessage
	 * @generated
	 */
	EClass getGotTheBombMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.GotTheBombMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.GotTheBombMessage#getUserName()
	 * @see #getGotTheBombMessage()
	 * @generated
	 */
	EAttribute getGotTheBombMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.GotTheBombMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.GotTheBombMessage#getUserTeam()
	 * @see #getGotTheBombMessage()
	 * @generated
	 */
	EAttribute getGotTheBombMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.GotTheBombMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.GotTheBombMessage#getUserSteamID()
	 * @see #getGotTheBombMessage()
	 * @generated
	 */
	EAttribute getGotTheBombMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.GotTheBombMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.GotTheBombMessage#getUserID()
	 * @see #getGotTheBombMessage()
	 * @generated
	 */
	EAttribute getGotTheBombMessage_UserID();

	/**
	 * Returns the meta object for class '{@link MessagesModel.JoinTeamMessage <em>Join Team Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Team Message</em>'.
	 * @see MessagesModel.JoinTeamMessage
	 * @generated
	 */
	EClass getJoinTeamMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.JoinTeamMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.JoinTeamMessage#getUserID()
	 * @see #getJoinTeamMessage()
	 * @generated
	 */
	EAttribute getJoinTeamMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.JoinTeamMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.JoinTeamMessage#getUserName()
	 * @see #getJoinTeamMessage()
	 * @generated
	 */
	EAttribute getJoinTeamMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.JoinTeamMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.JoinTeamMessage#getUserTeam()
	 * @see #getJoinTeamMessage()
	 * @generated
	 */
	EAttribute getJoinTeamMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.JoinTeamMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.JoinTeamMessage#getUserSteamID()
	 * @see #getJoinTeamMessage()
	 * @generated
	 */
	EAttribute getJoinTeamMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.JoinTeamMessage#getJoinedTeam <em>Joined Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Joined Team</em>'.
	 * @see MessagesModel.JoinTeamMessage#getJoinedTeam()
	 * @see #getJoinTeamMessage()
	 * @generated
	 */
	EAttribute getJoinTeamMessage_JoinedTeam();

	/**
	 * Returns the meta object for class '{@link MessagesModel.KillMessage <em>Kill Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kill Message</em>'.
	 * @see MessagesModel.KillMessage
	 * @generated
	 */
	EClass getKillMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.KillMessage#getUserID()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.KillMessage#getUserName()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.KillMessage#getUserTeam()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.KillMessage#getUserSteamID()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKillerPosX <em>Killer Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killer Pos X</em>'.
	 * @see MessagesModel.KillMessage#getKillerPosX()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KillerPosX();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKillerPosY <em>Killer Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killer Pos Y</em>'.
	 * @see MessagesModel.KillMessage#getKillerPosY()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KillerPosY();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKillerPosZ <em>Killer Pos Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killer Pos Z</em>'.
	 * @see MessagesModel.KillMessage#getKillerPosZ()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KillerPosZ();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKilledUserID <em>Killed User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed User ID</em>'.
	 * @see MessagesModel.KillMessage#getKilledUserID()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KilledUserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKilledUserName <em>Killed User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed User Name</em>'.
	 * @see MessagesModel.KillMessage#getKilledUserName()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KilledUserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKilledUserTeam <em>Killed User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed User Team</em>'.
	 * @see MessagesModel.KillMessage#getKilledUserTeam()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KilledUserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKilledUserSteamID <em>Killed User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed User Steam ID</em>'.
	 * @see MessagesModel.KillMessage#getKilledUserSteamID()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KilledUserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKilledPosX <em>Killed Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed Pos X</em>'.
	 * @see MessagesModel.KillMessage#getKilledPosX()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KilledPosX();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKilledPosY <em>Killed Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed Pos Y</em>'.
	 * @see MessagesModel.KillMessage#getKilledPosY()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KilledPosY();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getKilledPosZ <em>Killed Pos Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed Pos Z</em>'.
	 * @see MessagesModel.KillMessage#getKilledPosZ()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_KilledPosZ();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weapon</em>'.
	 * @see MessagesModel.KillMessage#getWeapon()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_Weapon();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillMessage#isHeadshot <em>Headshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headshot</em>'.
	 * @see MessagesModel.KillMessage#isHeadshot()
	 * @see #getKillMessage()
	 * @generated
	 */
	EAttribute getKillMessage_Headshot();

	/**
	 * Returns the meta object for class '{@link MessagesModel.KillAssistMessage <em>Kill Assist Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kill Assist Message</em>'.
	 * @see MessagesModel.KillAssistMessage
	 * @generated
	 */
	EClass getKillAssistMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillAssistMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.KillAssistMessage#getUserID()
	 * @see #getKillAssistMessage()
	 * @generated
	 */
	EAttribute getKillAssistMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillAssistMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.KillAssistMessage#getUserName()
	 * @see #getKillAssistMessage()
	 * @generated
	 */
	EAttribute getKillAssistMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillAssistMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.KillAssistMessage#getUserTeam()
	 * @see #getKillAssistMessage()
	 * @generated
	 */
	EAttribute getKillAssistMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillAssistMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.KillAssistMessage#getUserSteamID()
	 * @see #getKillAssistMessage()
	 * @generated
	 */
	EAttribute getKillAssistMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillAssistMessage#getKilledUserID <em>Killed User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed User ID</em>'.
	 * @see MessagesModel.KillAssistMessage#getKilledUserID()
	 * @see #getKillAssistMessage()
	 * @generated
	 */
	EAttribute getKillAssistMessage_KilledUserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillAssistMessage#getKilledUserName <em>Killed User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed User Name</em>'.
	 * @see MessagesModel.KillAssistMessage#getKilledUserName()
	 * @see #getKillAssistMessage()
	 * @generated
	 */
	EAttribute getKillAssistMessage_KilledUserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillAssistMessage#getKilledUserTeam <em>Killed User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed User Team</em>'.
	 * @see MessagesModel.KillAssistMessage#getKilledUserTeam()
	 * @see #getKillAssistMessage()
	 * @generated
	 */
	EAttribute getKillAssistMessage_KilledUserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.KillAssistMessage#getKilledUserSteamID <em>Killed User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Killed User Steam ID</em>'.
	 * @see MessagesModel.KillAssistMessage#getKilledUserSteamID()
	 * @see #getKillAssistMessage()
	 * @generated
	 */
	EAttribute getKillAssistMessage_KilledUserSteamID();

	/**
	 * Returns the meta object for class '{@link MessagesModel.PurchasedMessage <em>Purchased Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Purchased Message</em>'.
	 * @see MessagesModel.PurchasedMessage
	 * @generated
	 */
	EClass getPurchasedMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.PurchasedMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.PurchasedMessage#getUserID()
	 * @see #getPurchasedMessage()
	 * @generated
	 */
	EAttribute getPurchasedMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.PurchasedMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.PurchasedMessage#getUserName()
	 * @see #getPurchasedMessage()
	 * @generated
	 */
	EAttribute getPurchasedMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.PurchasedMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.PurchasedMessage#getUserTeam()
	 * @see #getPurchasedMessage()
	 * @generated
	 */
	EAttribute getPurchasedMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.PurchasedMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.PurchasedMessage#getUserSteamID()
	 * @see #getPurchasedMessage()
	 * @generated
	 */
	EAttribute getPurchasedMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.PurchasedMessage#getPurchasedObject <em>Purchased Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purchased Object</em>'.
	 * @see MessagesModel.PurchasedMessage#getPurchasedObject()
	 * @see #getPurchasedMessage()
	 * @generated
	 */
	EAttribute getPurchasedMessage_PurchasedObject();

	/**
	 * Returns the meta object for class '{@link MessagesModel.RemindRoundScoreMessage <em>Remind Round Score Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remind Round Score Message</em>'.
	 * @see MessagesModel.RemindRoundScoreMessage
	 * @generated
	 */
	EClass getRemindRoundScoreMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.RemindRoundScoreMessage#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team</em>'.
	 * @see MessagesModel.RemindRoundScoreMessage#getTeam()
	 * @see #getRemindRoundScoreMessage()
	 * @generated
	 */
	EAttribute getRemindRoundScoreMessage_Team();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.RemindRoundScoreMessage#getTeamWin <em>Team Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Win</em>'.
	 * @see MessagesModel.RemindRoundScoreMessage#getTeamWin()
	 * @see #getRemindRoundScoreMessage()
	 * @generated
	 */
	EAttribute getRemindRoundScoreMessage_TeamWin();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.RemindRoundScoreMessage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MessagesModel.RemindRoundScoreMessage#getType()
	 * @see #getRemindRoundScoreMessage()
	 * @generated
	 */
	EAttribute getRemindRoundScoreMessage_Type();

	/**
	 * Returns the meta object for class '{@link MessagesModel.RoundEndMessage <em>Round End Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round End Message</em>'.
	 * @see MessagesModel.RoundEndMessage
	 * @generated
	 */
	EClass getRoundEndMessage();

	/**
	 * Returns the meta object for class '{@link MessagesModel.RoundRestartMessage <em>Round Restart Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Restart Message</em>'.
	 * @see MessagesModel.RoundRestartMessage
	 * @generated
	 */
	EClass getRoundRestartMessage();

	/**
	 * Returns the meta object for class '{@link MessagesModel.RoundScoredMessage <em>Round Scored Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Scored Message</em>'.
	 * @see MessagesModel.RoundScoredMessage
	 * @generated
	 */
	EClass getRoundScoredMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.RoundScoredMessage#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team</em>'.
	 * @see MessagesModel.RoundScoredMessage#getTeam()
	 * @see #getRoundScoredMessage()
	 * @generated
	 */
	EAttribute getRoundScoredMessage_Team();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.RoundScoredMessage#getTeamWin <em>Team Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team Win</em>'.
	 * @see MessagesModel.RoundScoredMessage#getTeamWin()
	 * @see #getRoundScoredMessage()
	 * @generated
	 */
	EAttribute getRoundScoredMessage_TeamWin();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.RoundScoredMessage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see MessagesModel.RoundScoredMessage#getType()
	 * @see #getRoundScoredMessage()
	 * @generated
	 */
	EAttribute getRoundScoredMessage_Type();

	/**
	 * Returns the meta object for class '{@link MessagesModel.RoundSpawnMessage <em>Round Spawn Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Spawn Message</em>'.
	 * @see MessagesModel.RoundSpawnMessage
	 * @generated
	 */
	EClass getRoundSpawnMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.RoundSpawnMessage#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see MessagesModel.RoundSpawnMessage#getTime()
	 * @see #getRoundSpawnMessage()
	 * @generated
	 */
	EAttribute getRoundSpawnMessage_Time();

	/**
	 * Returns the meta object for class '{@link MessagesModel.RoundStartMessage <em>Round Start Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Start Message</em>'.
	 * @see MessagesModel.RoundStartMessage
	 * @generated
	 */
	EClass getRoundStartMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.RoundStartMessage#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see MessagesModel.RoundStartMessage#getTime()
	 * @see #getRoundStartMessage()
	 * @generated
	 */
	EAttribute getRoundStartMessage_Time();

	/**
	 * Returns the meta object for class '{@link MessagesModel.SayMessage <em>Say Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Say Message</em>'.
	 * @see MessagesModel.SayMessage
	 * @generated
	 */
	EClass getSayMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.SayMessage#getUserID()
	 * @see #getSayMessage()
	 * @generated
	 */
	EAttribute getSayMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.SayMessage#getUserName()
	 * @see #getSayMessage()
	 * @generated
	 */
	EAttribute getSayMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.SayMessage#getUserTeam()
	 * @see #getSayMessage()
	 * @generated
	 */
	EAttribute getSayMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.SayMessage#getUserSteamID()
	 * @see #getSayMessage()
	 * @generated
	 */
	EAttribute getSayMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayMessage#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see MessagesModel.SayMessage#getText()
	 * @see #getSayMessage()
	 * @generated
	 */
	EAttribute getSayMessage_Text();

	/**
	 * Returns the meta object for class '{@link MessagesModel.SwitchTeamMessage <em>Switch Team Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Team Message</em>'.
	 * @see MessagesModel.SwitchTeamMessage
	 * @generated
	 */
	EClass getSwitchTeamMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SwitchTeamMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.SwitchTeamMessage#getUserID()
	 * @see #getSwitchTeamMessage()
	 * @generated
	 */
	EAttribute getSwitchTeamMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SwitchTeamMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.SwitchTeamMessage#getUserName()
	 * @see #getSwitchTeamMessage()
	 * @generated
	 */
	EAttribute getSwitchTeamMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SwitchTeamMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.SwitchTeamMessage#getUserTeam()
	 * @see #getSwitchTeamMessage()
	 * @generated
	 */
	EAttribute getSwitchTeamMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SwitchTeamMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.SwitchTeamMessage#getUserSteamID()
	 * @see #getSwitchTeamMessage()
	 * @generated
	 */
	EAttribute getSwitchTeamMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SwitchTeamMessage#getSwitchedTeam <em>Switched Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Switched Team</em>'.
	 * @see MessagesModel.SwitchTeamMessage#getSwitchedTeam()
	 * @see #getSwitchTeamMessage()
	 * @generated
	 */
	EAttribute getSwitchTeamMessage_SwitchedTeam();

	/**
	 * Returns the meta object for class '{@link MessagesModel.TeamScoredMessage <em>Team Scored Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Scored Message</em>'.
	 * @see MessagesModel.TeamScoredMessage
	 * @generated
	 */
	EClass getTeamScoredMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.TeamScoredMessage#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Team</em>'.
	 * @see MessagesModel.TeamScoredMessage#getTeam()
	 * @see #getTeamScoredMessage()
	 * @generated
	 */
	EAttribute getTeamScoredMessage_Team();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.TeamScoredMessage#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see MessagesModel.TeamScoredMessage#getScore()
	 * @see #getTeamScoredMessage()
	 * @generated
	 */
	EAttribute getTeamScoredMessage_Score();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.TeamScoredMessage#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Players</em>'.
	 * @see MessagesModel.TeamScoredMessage#getPlayers()
	 * @see #getTeamScoredMessage()
	 * @generated
	 */
	EAttribute getTeamScoredMessage_Players();

	/**
	 * Returns the meta object for class '{@link MessagesModel.ThrewStuffMessage <em>Threw Stuff Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threw Stuff Message</em>'.
	 * @see MessagesModel.ThrewStuffMessage
	 * @generated
	 */
	EClass getThrewStuffMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ThrewStuffMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.ThrewStuffMessage#getUserID()
	 * @see #getThrewStuffMessage()
	 * @generated
	 */
	EAttribute getThrewStuffMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ThrewStuffMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.ThrewStuffMessage#getUserName()
	 * @see #getThrewStuffMessage()
	 * @generated
	 */
	EAttribute getThrewStuffMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ThrewStuffMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.ThrewStuffMessage#getUserTeam()
	 * @see #getThrewStuffMessage()
	 * @generated
	 */
	EAttribute getThrewStuffMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ThrewStuffMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.ThrewStuffMessage#getUserSteamID()
	 * @see #getThrewStuffMessage()
	 * @generated
	 */
	EAttribute getThrewStuffMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ThrewStuffMessage#getPosX <em>Pos X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos X</em>'.
	 * @see MessagesModel.ThrewStuffMessage#getPosX()
	 * @see #getThrewStuffMessage()
	 * @generated
	 */
	EAttribute getThrewStuffMessage_PosX();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ThrewStuffMessage#getPosY <em>Pos Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Y</em>'.
	 * @see MessagesModel.ThrewStuffMessage#getPosY()
	 * @see #getThrewStuffMessage()
	 * @generated
	 */
	EAttribute getThrewStuffMessage_PosY();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ThrewStuffMessage#getPosZ <em>Pos Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pos Z</em>'.
	 * @see MessagesModel.ThrewStuffMessage#getPosZ()
	 * @see #getThrewStuffMessage()
	 * @generated
	 */
	EAttribute getThrewStuffMessage_PosZ();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.ThrewStuffMessage#getStuff <em>Stuff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stuff</em>'.
	 * @see MessagesModel.ThrewStuffMessage#getStuff()
	 * @see #getThrewStuffMessage()
	 * @generated
	 */
	EAttribute getThrewStuffMessage_Stuff();

	/**
	 * Returns the meta object for class '{@link MessagesModel.MessageBuffer <em>Message Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Buffer</em>'.
	 * @see MessagesModel.MessageBuffer
	 * @generated
	 */
	EClass getMessageBuffer();

	/**
	 * Returns the meta object for the containment reference list '{@link MessagesModel.MessageBuffer#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see MessagesModel.MessageBuffer#getMessages()
	 * @see #getMessageBuffer()
	 * @generated
	 */
	EReference getMessageBuffer_Messages();

	/**
	 * Returns the meta object for class '{@link MessagesModel.SayTeamMessage <em>Say Team Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Say Team Message</em>'.
	 * @see MessagesModel.SayTeamMessage
	 * @generated
	 */
	EClass getSayTeamMessage();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayTeamMessage#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see MessagesModel.SayTeamMessage#getUserID()
	 * @see #getSayTeamMessage()
	 * @generated
	 */
	EAttribute getSayTeamMessage_UserID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayTeamMessage#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see MessagesModel.SayTeamMessage#getUserName()
	 * @see #getSayTeamMessage()
	 * @generated
	 */
	EAttribute getSayTeamMessage_UserName();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayTeamMessage#getUserTeam <em>User Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Team</em>'.
	 * @see MessagesModel.SayTeamMessage#getUserTeam()
	 * @see #getSayTeamMessage()
	 * @generated
	 */
	EAttribute getSayTeamMessage_UserTeam();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayTeamMessage#getUserSteamID <em>User Steam ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Steam ID</em>'.
	 * @see MessagesModel.SayTeamMessage#getUserSteamID()
	 * @see #getSayTeamMessage()
	 * @generated
	 */
	EAttribute getSayTeamMessage_UserSteamID();

	/**
	 * Returns the meta object for the attribute '{@link MessagesModel.SayTeamMessage#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see MessagesModel.SayTeamMessage#getText()
	 * @see #getSayTeamMessage()
	 * @generated
	 */
	EAttribute getSayTeamMessage_Text();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link MessagesModel.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.MessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.AttackedMessageImpl <em>Attacked Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.AttackedMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getAttackedMessage()
		 * @generated
		 */
		EClass ATTACKED_MESSAGE = eINSTANCE.getAttackedMessage();

		/**
		 * The meta object literal for the '<em><b>Attacker Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_NAME = eINSTANCE.getAttackedMessage_AttackerName();

		/**
		 * The meta object literal for the '<em><b>Attacker User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_USER_ID = eINSTANCE.getAttackedMessage_AttackerUserID();

		/**
		 * The meta object literal for the '<em><b>Attacker Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_STEAM_ID = eINSTANCE.getAttackedMessage_AttackerSteamID();

		/**
		 * The meta object literal for the '<em><b>Attacker Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_TEAM = eINSTANCE.getAttackedMessage_AttackerTeam();

		/**
		 * The meta object literal for the '<em><b>Attacker Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_POS_X = eINSTANCE.getAttackedMessage_AttackerPosX();

		/**
		 * The meta object literal for the '<em><b>Attacker Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_POS_Y = eINSTANCE.getAttackedMessage_AttackerPosY();

		/**
		 * The meta object literal for the '<em><b>Attacker Pos Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_POS_Z = eINSTANCE.getAttackedMessage_AttackerPosZ();

		/**
		 * The meta object literal for the '<em><b>Attacker Weapon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_WEAPON = eINSTANCE.getAttackedMessage_AttackerWeapon();

		/**
		 * The meta object literal for the '<em><b>Attacker Damage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_DAMAGE = eINSTANCE.getAttackedMessage_AttackerDamage();

		/**
		 * The meta object literal for the '<em><b>Attacker Damage Armor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_DAMAGE_ARMOR = eINSTANCE.getAttackedMessage_AttackerDamageArmor();

		/**
		 * The meta object literal for the '<em><b>Attacker Hit Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__ATTACKER_HIT_GROUP = eINSTANCE.getAttackedMessage_AttackerHitGroup();

		/**
		 * The meta object literal for the '<em><b>Victim Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_NAME = eINSTANCE.getAttackedMessage_VictimName();

		/**
		 * The meta object literal for the '<em><b>Victim User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_USER_ID = eINSTANCE.getAttackedMessage_VictimUserID();

		/**
		 * The meta object literal for the '<em><b>Victim Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_STEAM_ID = eINSTANCE.getAttackedMessage_VictimSteamID();

		/**
		 * The meta object literal for the '<em><b>Victim Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_TEAM = eINSTANCE.getAttackedMessage_VictimTeam();

		/**
		 * The meta object literal for the '<em><b>Victim Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_POS_X = eINSTANCE.getAttackedMessage_VictimPosX();

		/**
		 * The meta object literal for the '<em><b>Victim Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_POS_Y = eINSTANCE.getAttackedMessage_VictimPosY();

		/**
		 * The meta object literal for the '<em><b>Victim Pos Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_POS_Z = eINSTANCE.getAttackedMessage_VictimPosZ();

		/**
		 * The meta object literal for the '<em><b>Victim Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_HEALTH = eINSTANCE.getAttackedMessage_VictimHealth();

		/**
		 * The meta object literal for the '<em><b>Victim Armor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKED_MESSAGE__VICTIM_ARMOR = eINSTANCE.getAttackedMessage_VictimArmor();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.BombDefusingMessageImpl <em>Bomb Defusing Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.BombDefusingMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getBombDefusingMessage()
		 * @generated
		 */
		EClass BOMB_DEFUSING_MESSAGE = eINSTANCE.getBombDefusingMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOMB_DEFUSING_MESSAGE__USER_ID = eINSTANCE.getBombDefusingMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOMB_DEFUSING_MESSAGE__USER_NAME = eINSTANCE.getBombDefusingMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOMB_DEFUSING_MESSAGE__USER_TEAM = eINSTANCE.getBombDefusingMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOMB_DEFUSING_MESSAGE__USER_STEAM_ID = eINSTANCE.getBombDefusingMessage_UserSteamID();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.BombPlantingMessageImpl <em>Bomb Planting Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.BombPlantingMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getBombPlantingMessage()
		 * @generated
		 */
		EClass BOMB_PLANTING_MESSAGE = eINSTANCE.getBombPlantingMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOMB_PLANTING_MESSAGE__USER_ID = eINSTANCE.getBombPlantingMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOMB_PLANTING_MESSAGE__USER_NAME = eINSTANCE.getBombPlantingMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOMB_PLANTING_MESSAGE__USER_TEAM = eINSTANCE.getBombPlantingMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOMB_PLANTING_MESSAGE__USER_STEAM_ID = eINSTANCE.getBombPlantingMessage_UserSteamID();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.ChangeMapMessageImpl <em>Change Map Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.ChangeMapMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getChangeMapMessage()
		 * @generated
		 */
		EClass CHANGE_MAP_MESSAGE = eINSTANCE.getChangeMapMessage();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_MAP_MESSAGE__MAP = eINSTANCE.getChangeMapMessage_Map();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.ChangeNameMessageImpl <em>Change Name Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.ChangeNameMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getChangeNameMessage()
		 * @generated
		 */
		EClass CHANGE_NAME_MESSAGE = eINSTANCE.getChangeNameMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_NAME_MESSAGE__USER_ID = eINSTANCE.getChangeNameMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_NAME_MESSAGE__USER_NAME = eINSTANCE.getChangeNameMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_NAME_MESSAGE__USER_TEAM = eINSTANCE.getChangeNameMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_NAME_MESSAGE__USER_STEAM_ID = eINSTANCE.getChangeNameMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>New User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_NAME_MESSAGE__NEW_USER_NAME = eINSTANCE.getChangeNameMessage_NewUserName();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.ConnectedMessageImpl <em>Connected Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.ConnectedMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getConnectedMessage()
		 * @generated
		 */
		EClass CONNECTED_MESSAGE = eINSTANCE.getConnectedMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTED_MESSAGE__USER_ID = eINSTANCE.getConnectedMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTED_MESSAGE__USER_NAME = eINSTANCE.getConnectedMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTED_MESSAGE__USER_STEAM_ID = eINSTANCE.getConnectedMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTED_MESSAGE__ADDRESS = eINSTANCE.getConnectedMessage_Address();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.DisconnectedMessageImpl <em>Disconnected Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.DisconnectedMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getDisconnectedMessage()
		 * @generated
		 */
		EClass DISCONNECTED_MESSAGE = eINSTANCE.getDisconnectedMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECTED_MESSAGE__USER_ID = eINSTANCE.getDisconnectedMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECTED_MESSAGE__USER_NAME = eINSTANCE.getDisconnectedMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECTED_MESSAGE__USER_TEAM = eINSTANCE.getDisconnectedMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCONNECTED_MESSAGE__USER_STEAM_ID = eINSTANCE.getDisconnectedMessage_UserSteamID();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.EnteredTheGameMessageImpl <em>Entered The Game Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.EnteredTheGameMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getEnteredTheGameMessage()
		 * @generated
		 */
		EClass ENTERED_THE_GAME_MESSAGE = eINSTANCE.getEnteredTheGameMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERED_THE_GAME_MESSAGE__USER_ID = eINSTANCE.getEnteredTheGameMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERED_THE_GAME_MESSAGE__USER_NAME = eINSTANCE.getEnteredTheGameMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTERED_THE_GAME_MESSAGE__USER_STEAM_ID = eINSTANCE.getEnteredTheGameMessage_UserSteamID();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.GotTheBombMessageImpl <em>Got The Bomb Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.GotTheBombMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getGotTheBombMessage()
		 * @generated
		 */
		EClass GOT_THE_BOMB_MESSAGE = eINSTANCE.getGotTheBombMessage();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOT_THE_BOMB_MESSAGE__USER_NAME = eINSTANCE.getGotTheBombMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOT_THE_BOMB_MESSAGE__USER_TEAM = eINSTANCE.getGotTheBombMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOT_THE_BOMB_MESSAGE__USER_STEAM_ID = eINSTANCE.getGotTheBombMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOT_THE_BOMB_MESSAGE__USER_ID = eINSTANCE.getGotTheBombMessage_UserID();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.JoinTeamMessageImpl <em>Join Team Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.JoinTeamMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getJoinTeamMessage()
		 * @generated
		 */
		EClass JOIN_TEAM_MESSAGE = eINSTANCE.getJoinTeamMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TEAM_MESSAGE__USER_ID = eINSTANCE.getJoinTeamMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TEAM_MESSAGE__USER_NAME = eINSTANCE.getJoinTeamMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TEAM_MESSAGE__USER_TEAM = eINSTANCE.getJoinTeamMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TEAM_MESSAGE__USER_STEAM_ID = eINSTANCE.getJoinTeamMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Joined Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOIN_TEAM_MESSAGE__JOINED_TEAM = eINSTANCE.getJoinTeamMessage_JoinedTeam();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.KillMessageImpl <em>Kill Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.KillMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getKillMessage()
		 * @generated
		 */
		EClass KILL_MESSAGE = eINSTANCE.getKillMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__USER_ID = eINSTANCE.getKillMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__USER_NAME = eINSTANCE.getKillMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__USER_TEAM = eINSTANCE.getKillMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__USER_STEAM_ID = eINSTANCE.getKillMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Killer Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLER_POS_X = eINSTANCE.getKillMessage_KillerPosX();

		/**
		 * The meta object literal for the '<em><b>Killer Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLER_POS_Y = eINSTANCE.getKillMessage_KillerPosY();

		/**
		 * The meta object literal for the '<em><b>Killer Pos Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLER_POS_Z = eINSTANCE.getKillMessage_KillerPosZ();

		/**
		 * The meta object literal for the '<em><b>Killed User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLED_USER_ID = eINSTANCE.getKillMessage_KilledUserID();

		/**
		 * The meta object literal for the '<em><b>Killed User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLED_USER_NAME = eINSTANCE.getKillMessage_KilledUserName();

		/**
		 * The meta object literal for the '<em><b>Killed User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLED_USER_TEAM = eINSTANCE.getKillMessage_KilledUserTeam();

		/**
		 * The meta object literal for the '<em><b>Killed User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLED_USER_STEAM_ID = eINSTANCE.getKillMessage_KilledUserSteamID();

		/**
		 * The meta object literal for the '<em><b>Killed Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLED_POS_X = eINSTANCE.getKillMessage_KilledPosX();

		/**
		 * The meta object literal for the '<em><b>Killed Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLED_POS_Y = eINSTANCE.getKillMessage_KilledPosY();

		/**
		 * The meta object literal for the '<em><b>Killed Pos Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__KILLED_POS_Z = eINSTANCE.getKillMessage_KilledPosZ();

		/**
		 * The meta object literal for the '<em><b>Weapon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__WEAPON = eINSTANCE.getKillMessage_Weapon();

		/**
		 * The meta object literal for the '<em><b>Headshot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_MESSAGE__HEADSHOT = eINSTANCE.getKillMessage_Headshot();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.KillAssistMessageImpl <em>Kill Assist Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.KillAssistMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getKillAssistMessage()
		 * @generated
		 */
		EClass KILL_ASSIST_MESSAGE = eINSTANCE.getKillAssistMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_ASSIST_MESSAGE__USER_ID = eINSTANCE.getKillAssistMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_ASSIST_MESSAGE__USER_NAME = eINSTANCE.getKillAssistMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_ASSIST_MESSAGE__USER_TEAM = eINSTANCE.getKillAssistMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_ASSIST_MESSAGE__USER_STEAM_ID = eINSTANCE.getKillAssistMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Killed User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_ASSIST_MESSAGE__KILLED_USER_ID = eINSTANCE.getKillAssistMessage_KilledUserID();

		/**
		 * The meta object literal for the '<em><b>Killed User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_ASSIST_MESSAGE__KILLED_USER_NAME = eINSTANCE.getKillAssistMessage_KilledUserName();

		/**
		 * The meta object literal for the '<em><b>Killed User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_ASSIST_MESSAGE__KILLED_USER_TEAM = eINSTANCE.getKillAssistMessage_KilledUserTeam();

		/**
		 * The meta object literal for the '<em><b>Killed User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KILL_ASSIST_MESSAGE__KILLED_USER_STEAM_ID = eINSTANCE.getKillAssistMessage_KilledUserSteamID();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.PurchasedMessageImpl <em>Purchased Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.PurchasedMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getPurchasedMessage()
		 * @generated
		 */
		EClass PURCHASED_MESSAGE = eINSTANCE.getPurchasedMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASED_MESSAGE__USER_ID = eINSTANCE.getPurchasedMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASED_MESSAGE__USER_NAME = eINSTANCE.getPurchasedMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASED_MESSAGE__USER_TEAM = eINSTANCE.getPurchasedMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASED_MESSAGE__USER_STEAM_ID = eINSTANCE.getPurchasedMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Purchased Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PURCHASED_MESSAGE__PURCHASED_OBJECT = eINSTANCE.getPurchasedMessage_PurchasedObject();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.RemindRoundScoreMessageImpl <em>Remind Round Score Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.RemindRoundScoreMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getRemindRoundScoreMessage()
		 * @generated
		 */
		EClass REMIND_ROUND_SCORE_MESSAGE = eINSTANCE.getRemindRoundScoreMessage();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMIND_ROUND_SCORE_MESSAGE__TEAM = eINSTANCE.getRemindRoundScoreMessage_Team();

		/**
		 * The meta object literal for the '<em><b>Team Win</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMIND_ROUND_SCORE_MESSAGE__TEAM_WIN = eINSTANCE.getRemindRoundScoreMessage_TeamWin();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMIND_ROUND_SCORE_MESSAGE__TYPE = eINSTANCE.getRemindRoundScoreMessage_Type();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.RoundEndMessageImpl <em>Round End Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.RoundEndMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getRoundEndMessage()
		 * @generated
		 */
		EClass ROUND_END_MESSAGE = eINSTANCE.getRoundEndMessage();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.RoundRestartMessageImpl <em>Round Restart Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.RoundRestartMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getRoundRestartMessage()
		 * @generated
		 */
		EClass ROUND_RESTART_MESSAGE = eINSTANCE.getRoundRestartMessage();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.RoundScoredMessageImpl <em>Round Scored Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.RoundScoredMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getRoundScoredMessage()
		 * @generated
		 */
		EClass ROUND_SCORED_MESSAGE = eINSTANCE.getRoundScoredMessage();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_SCORED_MESSAGE__TEAM = eINSTANCE.getRoundScoredMessage_Team();

		/**
		 * The meta object literal for the '<em><b>Team Win</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_SCORED_MESSAGE__TEAM_WIN = eINSTANCE.getRoundScoredMessage_TeamWin();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_SCORED_MESSAGE__TYPE = eINSTANCE.getRoundScoredMessage_Type();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.RoundSpawnMessageImpl <em>Round Spawn Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.RoundSpawnMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getRoundSpawnMessage()
		 * @generated
		 */
		EClass ROUND_SPAWN_MESSAGE = eINSTANCE.getRoundSpawnMessage();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_SPAWN_MESSAGE__TIME = eINSTANCE.getRoundSpawnMessage_Time();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.RoundStartMessageImpl <em>Round Start Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.RoundStartMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getRoundStartMessage()
		 * @generated
		 */
		EClass ROUND_START_MESSAGE = eINSTANCE.getRoundStartMessage();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUND_START_MESSAGE__TIME = eINSTANCE.getRoundStartMessage_Time();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.SayMessageImpl <em>Say Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.SayMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getSayMessage()
		 * @generated
		 */
		EClass SAY_MESSAGE = eINSTANCE.getSayMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_MESSAGE__USER_ID = eINSTANCE.getSayMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_MESSAGE__USER_NAME = eINSTANCE.getSayMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_MESSAGE__USER_TEAM = eINSTANCE.getSayMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_MESSAGE__USER_STEAM_ID = eINSTANCE.getSayMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_MESSAGE__TEXT = eINSTANCE.getSayMessage_Text();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.SwitchTeamMessageImpl <em>Switch Team Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.SwitchTeamMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getSwitchTeamMessage()
		 * @generated
		 */
		EClass SWITCH_TEAM_MESSAGE = eINSTANCE.getSwitchTeamMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_TEAM_MESSAGE__USER_ID = eINSTANCE.getSwitchTeamMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_TEAM_MESSAGE__USER_NAME = eINSTANCE.getSwitchTeamMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_TEAM_MESSAGE__USER_TEAM = eINSTANCE.getSwitchTeamMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_TEAM_MESSAGE__USER_STEAM_ID = eINSTANCE.getSwitchTeamMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Switched Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_TEAM_MESSAGE__SWITCHED_TEAM = eINSTANCE.getSwitchTeamMessage_SwitchedTeam();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.TeamScoredMessageImpl <em>Team Scored Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.TeamScoredMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getTeamScoredMessage()
		 * @generated
		 */
		EClass TEAM_SCORED_MESSAGE = eINSTANCE.getTeamScoredMessage();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_SCORED_MESSAGE__TEAM = eINSTANCE.getTeamScoredMessage_Team();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_SCORED_MESSAGE__SCORE = eINSTANCE.getTeamScoredMessage_Score();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM_SCORED_MESSAGE__PLAYERS = eINSTANCE.getTeamScoredMessage_Players();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.ThrewStuffMessageImpl <em>Threw Stuff Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.ThrewStuffMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getThrewStuffMessage()
		 * @generated
		 */
		EClass THREW_STUFF_MESSAGE = eINSTANCE.getThrewStuffMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREW_STUFF_MESSAGE__USER_ID = eINSTANCE.getThrewStuffMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREW_STUFF_MESSAGE__USER_NAME = eINSTANCE.getThrewStuffMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREW_STUFF_MESSAGE__USER_TEAM = eINSTANCE.getThrewStuffMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREW_STUFF_MESSAGE__USER_STEAM_ID = eINSTANCE.getThrewStuffMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Pos X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREW_STUFF_MESSAGE__POS_X = eINSTANCE.getThrewStuffMessage_PosX();

		/**
		 * The meta object literal for the '<em><b>Pos Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREW_STUFF_MESSAGE__POS_Y = eINSTANCE.getThrewStuffMessage_PosY();

		/**
		 * The meta object literal for the '<em><b>Pos Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREW_STUFF_MESSAGE__POS_Z = eINSTANCE.getThrewStuffMessage_PosZ();

		/**
		 * The meta object literal for the '<em><b>Stuff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREW_STUFF_MESSAGE__STUFF = eINSTANCE.getThrewStuffMessage_Stuff();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.MessageBufferImpl <em>Message Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.MessageBufferImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getMessageBuffer()
		 * @generated
		 */
		EClass MESSAGE_BUFFER = eINSTANCE.getMessageBuffer();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_BUFFER__MESSAGES = eINSTANCE.getMessageBuffer_Messages();

		/**
		 * The meta object literal for the '{@link MessagesModel.impl.SayTeamMessageImpl <em>Say Team Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MessagesModel.impl.SayTeamMessageImpl
		 * @see MessagesModel.impl.ModelPackageImpl#getSayTeamMessage()
		 * @generated
		 */
		EClass SAY_TEAM_MESSAGE = eINSTANCE.getSayTeamMessage();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_TEAM_MESSAGE__USER_ID = eINSTANCE.getSayTeamMessage_UserID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_TEAM_MESSAGE__USER_NAME = eINSTANCE.getSayTeamMessage_UserName();

		/**
		 * The meta object literal for the '<em><b>User Team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_TEAM_MESSAGE__USER_TEAM = eINSTANCE.getSayTeamMessage_UserTeam();

		/**
		 * The meta object literal for the '<em><b>User Steam ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_TEAM_MESSAGE__USER_STEAM_ID = eINSTANCE.getSayTeamMessage_UserSteamID();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAY_TEAM_MESSAGE__TEXT = eINSTANCE.getSayTeamMessage_Text();

	}

} //ModelPackage
