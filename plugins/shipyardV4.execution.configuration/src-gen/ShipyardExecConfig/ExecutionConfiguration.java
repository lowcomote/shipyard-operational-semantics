/**
 */
package ShipyardExecConfig;

import shipyardV4.Sequence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.ExecutionConfiguration#getInitialSequence <em>Initial Sequence</em>}</li>
 *   <li>{@link ShipyardExecConfig.ExecutionConfiguration#getSequenceFinishedResult <em>Sequence Finished Result</em>}</li>
 *   <li>{@link ShipyardExecConfig.ExecutionConfiguration#getTaskFinishedResult <em>Task Finished Result</em>}</li>
 *   <li>{@link ShipyardExecConfig.ExecutionConfiguration#getExpectedExecution <em>Expected Execution</em>}</li>
 * </ul>
 *
 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getExecutionConfiguration()
 * @model
 * @generated
 */
public interface ExecutionConfiguration extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Initial Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Sequence</em>' reference.
	 * @see #setInitialSequence(Sequence)
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getExecutionConfiguration_InitialSequence()
	 * @model
	 * @generated
	 */
	Sequence getInitialSequence();

	/**
	 * Sets the value of the '{@link ShipyardExecConfig.ExecutionConfiguration#getInitialSequence <em>Initial Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Sequence</em>' reference.
	 * @see #getInitialSequence()
	 * @generated
	 */
	void setInitialSequence(Sequence value);

	/**
	 * Returns the value of the '<em><b>Sequence Finished Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Finished Result</em>' containment reference.
	 * @see #setSequenceFinishedResult(SequenceFinishedResult)
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getExecutionConfiguration_SequenceFinishedResult()
	 * @model containment="true"
	 * @generated
	 */
	SequenceFinishedResult getSequenceFinishedResult();

	/**
	 * Sets the value of the '{@link ShipyardExecConfig.ExecutionConfiguration#getSequenceFinishedResult <em>Sequence Finished Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Finished Result</em>' containment reference.
	 * @see #getSequenceFinishedResult()
	 * @generated
	 */
	void setSequenceFinishedResult(SequenceFinishedResult value);

	/**
	 * Returns the value of the '<em><b>Task Finished Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Finished Result</em>' containment reference.
	 * @see #setTaskFinishedResult(TaskFinishedResult)
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getExecutionConfiguration_TaskFinishedResult()
	 * @model containment="true"
	 * @generated
	 */
	TaskFinishedResult getTaskFinishedResult();

	/**
	 * Sets the value of the '{@link ShipyardExecConfig.ExecutionConfiguration#getTaskFinishedResult <em>Task Finished Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Finished Result</em>' containment reference.
	 * @see #getTaskFinishedResult()
	 * @generated
	 */
	void setTaskFinishedResult(TaskFinishedResult value);

	/**
	 * Returns the value of the '<em><b>Expected Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Execution</em>' containment reference.
	 * @see #setExpectedExecution(ExpectedExecution)
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getExecutionConfiguration_ExpectedExecution()
	 * @model containment="true"
	 * @generated
	 */
	ExpectedExecution getExpectedExecution();

	/**
	 * Sets the value of the '{@link ShipyardExecConfig.ExecutionConfiguration#getExpectedExecution <em>Expected Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Execution</em>' containment reference.
	 * @see #getExpectedExecution()
	 * @generated
	 */
	void setExpectedExecution(ExpectedExecution value);

} // ExecutionConfiguration
