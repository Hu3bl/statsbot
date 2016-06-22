/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Scored Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.TeamScoredMessage#getTeam <em>Team</em>}</li>
 *   <li>{@link MessagesModel.TeamScoredMessage#getScore <em>Score</em>}</li>
 *   <li>{@link MessagesModel.TeamScoredMessage#getPlayers <em>Players</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getTeamScoredMessage()
 * @model
 * @generated
 */
public interface TeamScoredMessage extends Message {
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
	 * @see MessagesModel.ModelPackage#getTeamScoredMessage_Team()
	 * @model
	 * @generated
	 */
	String getTeam();

	/**
	 * Sets the value of the '{@link MessagesModel.TeamScoredMessage#getTeam <em>Team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' attribute.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(String value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Score</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see #setScore(String)
	 * @see MessagesModel.ModelPackage#getTeamScoredMessage_Score()
	 * @model
	 * @generated
	 */
	String getScore();

	/**
	 * Sets the value of the '{@link MessagesModel.TeamScoredMessage#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see #getScore()
	 * @generated
	 */
	void setScore(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' attribute.
	 * @see #setPlayers(String)
	 * @see MessagesModel.ModelPackage#getTeamScoredMessage_Players()
	 * @model
	 * @generated
	 */
	String getPlayers();

	/**
	 * Sets the value of the '{@link MessagesModel.TeamScoredMessage#getPlayers <em>Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Players</em>' attribute.
	 * @see #getPlayers()
	 * @generated
	 */
	void setPlayers(String value);

} // TeamScoredMessage
