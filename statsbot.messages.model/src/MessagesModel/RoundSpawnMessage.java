/**
 */
package MessagesModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round Spawn Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.RoundSpawnMessage#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getRoundSpawnMessage()
 * @model
 * @generated
 */
public interface RoundSpawnMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see MessagesModel.ModelPackage#getRoundSpawnMessage_Time()
	 * @model
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link MessagesModel.RoundSpawnMessage#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

} // RoundSpawnMessage
