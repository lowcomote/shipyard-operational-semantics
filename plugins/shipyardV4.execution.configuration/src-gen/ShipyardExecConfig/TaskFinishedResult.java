/**
 */
package ShipyardExecConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import shipyardV4.Task;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Finished Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.TaskFinishedResult#getPassedTasks <em>Passed Tasks</em>}</li>
 *   <li>{@link ShipyardExecConfig.TaskFinishedResult#getWarningTasks <em>Warning Tasks</em>}</li>
 *   <li>{@link ShipyardExecConfig.TaskFinishedResult#getFailedTasks <em>Failed Tasks</em>}</li>
 * </ul>
 *
 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getTaskFinishedResult()
 * @model
 * @generated
 */
public interface TaskFinishedResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Passed Tasks</b></em>' reference list.
	 * The list contents are of type {@link shipyardV4.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passed Tasks</em>' reference list.
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getTaskFinishedResult_PassedTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getPassedTasks();

	/**
	 * Returns the value of the '<em><b>Warning Tasks</b></em>' reference list.
	 * The list contents are of type {@link shipyardV4.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Tasks</em>' reference list.
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getTaskFinishedResult_WarningTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getWarningTasks();

	/**
	 * Returns the value of the '<em><b>Failed Tasks</b></em>' reference list.
	 * The list contents are of type {@link shipyardV4.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Tasks</em>' reference list.
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getTaskFinishedResult_FailedTasks()
	 * @model
	 * @generated
	 */
	EList<Task> getFailedTasks();

} // TaskFinishedResult
