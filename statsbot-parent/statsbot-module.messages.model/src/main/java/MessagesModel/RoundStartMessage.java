/**
 */
package MessagesModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Round Start Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.RoundStartMessage#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getRoundStartMessage()
 * @model
 * @generated
 */
public interface RoundStartMessage extends Message {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see MessagesModel.ModelPackage#getRoundStartMessage_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link MessagesModel.RoundStartMessage#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

} // RoundStartMessage
