/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round Scored Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.RoundScoredMessage#getTeam <em>Team</em>}</li>
 *   <li>{@link MessagesModel.RoundScoredMessage#getTeamWin <em>Team Win</em>}</li>
 *   <li>{@link MessagesModel.RoundScoredMessage#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getRoundScoredMessage()
 * @model
 * @generated
 */
public interface RoundScoredMessage extends Message {
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
	 * @see MessagesModel.ModelPackage#getRoundScoredMessage_Team()
	 * @model
	 * @generated
	 */
	String getTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.RoundScoredMessage#getTeam <em>Team</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getRoundScoredMessage_TeamWin()
	 * @model
	 * @generated
	 */
	String getTeamWin();

	/**
	 * Sets the value of the '{@link MessagesModel.RoundScoredMessage#getTeamWin <em>Team Win</em>}' attribute.
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
	 * @see MessagesModel.ModelPackage#getRoundScoredMessage_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link MessagesModel.RoundScoredMessage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // RoundScoredMessage
