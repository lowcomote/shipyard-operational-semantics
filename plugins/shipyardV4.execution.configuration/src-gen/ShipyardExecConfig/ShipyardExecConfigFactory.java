/**
 */
package ShipyardExecConfig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ShipyardExecConfig.ShipyardExecConfigPackage
 * @generated
 */
public interface ShipyardExecConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShipyardExecConfigFactory eINSTANCE = ShipyardExecConfig.impl.ShipyardExecConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shipyard Execution Suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shipyard Execution Suite</em>'.
	 * @generated
	 */
	ShipyardExecutionSuite createShipyardExecutionSuite();

	/**
	 * Returns a new object of class '<em>Execution Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Configuration</em>'.
	 * @generated
	 */
	ExecutionConfiguration createExecutionConfiguration();

	/**
	 * Returns a new object of class '<em>Sequence Finished Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Finished Result</em>'.
	 * @generated
	 */
	SequenceFinishedResult createSequenceFinishedResult();

	/**
	 * Returns a new object of class '<em>Task Finished Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Finished Result</em>'.
	 * @generated
	 */
	TaskFinishedResult createTaskFinishedResult();

	/**
	 * Returns a new object of class '<em>Expected Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expected Execution</em>'.
	 * @generated
	 */
	ExpectedExecution createExpectedExecution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ShipyardExecConfigPackage getShipyardExecConfigPackage();

} //ShipyardExecConfigFactory
