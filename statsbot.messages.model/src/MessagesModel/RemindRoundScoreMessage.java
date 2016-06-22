/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remind Round Score Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.RemindRoundScoreMessage#getTeam <em>Team</em>}</li>
 *   <li>{@link MessagesModel.RemindRoundScoreMessage#getTeamWin <em>Team Win</em>}</li>
 *   <li>{@link MessagesModel.RemindRoundScoreMessage#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getRemindRoundScoreMessage()
 * @model
 * @generated
 */
public interface RemindRoundScoreMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' attribute.
	 * @see #setTeam(String)
	 * @see MessagesModel.ModelPackage#getRemindRoundScoreMessage_Team()
	 * @model
	 * @generated
	 */
	String getTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.RemindRoundScoreMessage#getTeam <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' attribute.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(String value);

	/**
	 * Returns the value of the '<em><b>Team Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Team Win</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Win</em>' attribute.
	 * @see #setTeamWin(String)
	 * @see MessagesModel.ModelPackage#getRemindRoundScoreMessage_TeamWin()
	 * @model
	 * @generated
	 */
	String getTeamWin();

	/**
	 * Sets the value of the '{@link MessagesModel.RemindRoundScoreMessage#getTeamWin <em>Team Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team Win</em>' attribute.
	 * @see #getTeamWin()
	 * @generated
	 */
	void setTeamWin(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see MessagesModel.ModelPackage#getRemindRoundScoreMessage_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MessagesModel.RemindRoundScoreMessage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RemindRoundScoreMessage
