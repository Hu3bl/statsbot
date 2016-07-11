/**
 */
package MessagesModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MessagesModel.MessageBuffer#getMessages <em>Messages</em>}</li>
 * </ul>
 *
 * @see MessagesModel.ModelPackage#getMessageBuffer()
 * @model
 * @generated
 */
public interface MessageBuffer extends EObject {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link MessagesModel.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see MessagesModel.ModelPackage#getMessageBuffer_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

} // MessageBuffer
