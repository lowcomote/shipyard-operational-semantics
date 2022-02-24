/**
 */
package ShipyardExecConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import shipyardV4.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expected Execution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.ExpectedExecution#getExpectedTasks <em>Expected Tasks</em>}</li>
 * </ul>
 *
 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getExpectedExecution()
 * @model
 * @generated
 */
public interface ExpectedExecution extends EObject {
	/**
	 * Returns the value of the '<em><b>Expected Tasks</b></em>' reference list.
	 * The list contents are of type {@link shipyardV4.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Tasks</em>' reference list.
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getExpectedExecution_ExpectedTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getExpectedTasks();

} // ExpectedExecution
