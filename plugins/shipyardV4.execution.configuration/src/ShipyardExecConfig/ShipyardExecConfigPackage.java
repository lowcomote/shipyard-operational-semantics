/**
 */
package ShipyardExecConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ShipyardExecConfig.ShipyardExecConfigFactory
 * @model kind="package"
 * @generated
 */
public interface ShipyardExecConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ShipyardExecConfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jku.bise.at/shipyardV4/ShipyardExecConfig";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "shipconf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ShipyardExecConfigPackage eINSTANCE = ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link ShipyardExecConfig.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShipyardExecConfig.impl.NamedElementImpl
	 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ShipyardExecConfig.impl.ShipyardExecutionSuiteImpl <em>Shipyard Execution Suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShipyardExecConfig.impl.ShipyardExecutionSuiteImpl
	 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getShipyardExecutionSuite()
	 * @generated
	 */
	int SHIPYARD_EXECUTION_SUITE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_EXECUTION_SUITE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Shipyard V4 Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execution Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shipyard Execution Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_EXECUTION_SUITE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shipyard Execution Suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIPYARD_EXECUTION_SUITE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ShipyardExecConfig.impl.ExecutionConfigurationImpl <em>Execution Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShipyardExecConfig.impl.ExecutionConfigurationImpl
	 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getExecutionConfiguration()
	 * @generated
	 */
	int EXECUTION_CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONFIGURATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Initial Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONFIGURATION__INITIAL_SEQUENCE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sequence Finished Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task Finished Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Execution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONFIGURATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Execution Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_CONFIGURATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ShipyardExecConfig.impl.SequenceFinishedResultImpl <em>Sequence Finished Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShipyardExecConfig.impl.SequenceFinishedResultImpl
	 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getSequenceFinishedResult()
	 * @generated
	 */
	int SEQUENCE_FINISHED_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Passed Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FINISHED_RESULT__PASSED_SEQUENCES = 0;

	/**
	 * The feature id for the '<em><b>Warning Sequences</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FINISHED_RESULT__WARNING_SEQUENCES = 1;

	/**
	 * The feature id for the '<em><b>Failed Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FINISHED_RESULT__FAILED_SEQUENCE = 2;

	/**
	 * The number of structural features of the '<em>Sequence Finished Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FINISHED_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sequence Finished Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FINISHED_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ShipyardExecConfig.impl.TaskFinishedResultImpl <em>Task Finished Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ShipyardExecConfig.impl.TaskFinishedResultImpl
	 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getTaskFinishedResult()
	 * @generated
	 */
	int TASK_FINISHED_RESULT = 4;

	/**
	 * The feature id for the '<em><b>Passed Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED_RESULT__PASSED_TASKS = 0;

	/**
	 * The feature id for the '<em><b>Warning Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED_RESULT__WARNING_TASKS = 1;

	/**
	 * The feature id for the '<em><b>Failed Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED_RESULT__FAILED_TASKS = 2;

	/**
	 * The number of structural features of the '<em>Task Finished Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED_RESULT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task Finished Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FINISHED_RESULT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ShipyardExecConfig.ShipyardExecutionSuite <em>Shipyard Execution Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shipyard Execution Suite</em>'.
	 * @see ShipyardExecConfig.ShipyardExecutionSuite
	 * @generated
	 */
	EClass getShipyardExecutionSuite();

	/**
	 * Returns the meta object for the reference '{@link ShipyardExecConfig.ShipyardExecutionSuite#getShipyardV4Root <em>Shipyard V4 Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shipyard V4 Root</em>'.
	 * @see ShipyardExecConfig.ShipyardExecutionSuite#getShipyardV4Root()
	 * @see #getShipyardExecutionSuite()
	 * @generated
	 */
	EReference getShipyardExecutionSuite_ShipyardV4Root();

	/**
	 * Returns the meta object for the containment reference list '{@link ShipyardExecConfig.ShipyardExecutionSuite#getExecutionConfigurations <em>Execution Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Configurations</em>'.
	 * @see ShipyardExecConfig.ShipyardExecutionSuite#getExecutionConfigurations()
	 * @see #getShipyardExecutionSuite()
	 * @generated
	 */
	EReference getShipyardExecutionSuite_ExecutionConfigurations();

	/**
	 * Returns the meta object for class '{@link ShipyardExecConfig.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ShipyardExecConfig.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ShipyardExecConfig.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ShipyardExecConfig.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ShipyardExecConfig.ExecutionConfiguration <em>Execution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Configuration</em>'.
	 * @see ShipyardExecConfig.ExecutionConfiguration
	 * @generated
	 */
	EClass getExecutionConfiguration();

	/**
	 * Returns the meta object for the reference '{@link ShipyardExecConfig.ExecutionConfiguration#getInitialSequence <em>Initial Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Sequence</em>'.
	 * @see ShipyardExecConfig.ExecutionConfiguration#getInitialSequence()
	 * @see #getExecutionConfiguration()
	 * @generated
	 */
	EReference getExecutionConfiguration_InitialSequence();

	/**
	 * Returns the meta object for the containment reference '{@link ShipyardExecConfig.ExecutionConfiguration#getSequenceFinishedResult <em>Sequence Finished Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Finished Result</em>'.
	 * @see ShipyardExecConfig.ExecutionConfiguration#getSequenceFinishedResult()
	 * @see #getExecutionConfiguration()
	 * @generated
	 */
	EReference getExecutionConfiguration_SequenceFinishedResult();

	/**
	 * Returns the meta object for the containment reference '{@link ShipyardExecConfig.ExecutionConfiguration#getTaskFinishedResult <em>Task Finished Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Finished Result</em>'.
	 * @see ShipyardExecConfig.ExecutionConfiguration#getTaskFinishedResult()
	 * @see #getExecutionConfiguration()
	 * @generated
	 */
	EReference getExecutionConfiguration_TaskFinishedResult();

	/**
	 * Returns the meta object for class '{@link ShipyardExecConfig.SequenceFinishedResult <em>Sequence Finished Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Finished Result</em>'.
	 * @see ShipyardExecConfig.SequenceFinishedResult
	 * @generated
	 */
	EClass getSequenceFinishedResult();

	/**
	 * Returns the meta object for the reference list '{@link ShipyardExecConfig.SequenceFinishedResult#getPassedSequences <em>Passed Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passed Sequences</em>'.
	 * @see ShipyardExecConfig.SequenceFinishedResult#getPassedSequences()
	 * @see #getSequenceFinishedResult()
	 * @generated
	 */
	EReference getSequenceFinishedResult_PassedSequences();

	/**
	 * Returns the meta object for the reference list '{@link ShipyardExecConfig.SequenceFinishedResult#getWarningSequences <em>Warning Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Warning Sequences</em>'.
	 * @see ShipyardExecConfig.SequenceFinishedResult#getWarningSequences()
	 * @see #getSequenceFinishedResult()
	 * @generated
	 */
	EReference getSequenceFinishedResult_WarningSequences();

	/**
	 * Returns the meta object for the reference list '{@link ShipyardExecConfig.SequenceFinishedResult#getFailedSequence <em>Failed Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failed Sequence</em>'.
	 * @see ShipyardExecConfig.SequenceFinishedResult#getFailedSequence()
	 * @see #getSequenceFinishedResult()
	 * @generated
	 */
	EReference getSequenceFinishedResult_FailedSequence();

	/**
	 * Returns the meta object for class '{@link ShipyardExecConfig.TaskFinishedResult <em>Task Finished Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Finished Result</em>'.
	 * @see ShipyardExecConfig.TaskFinishedResult
	 * @generated
	 */
	EClass getTaskFinishedResult();

	/**
	 * Returns the meta object for the reference list '{@link ShipyardExecConfig.TaskFinishedResult#getPassedTasks <em>Passed Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passed Tasks</em>'.
	 * @see ShipyardExecConfig.TaskFinishedResult#getPassedTasks()
	 * @see #getTaskFinishedResult()
	 * @generated
	 */
	EReference getTaskFinishedResult_PassedTasks();

	/**
	 * Returns the meta object for the reference list '{@link ShipyardExecConfig.TaskFinishedResult#getWarningTasks <em>Warning Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Warning Tasks</em>'.
	 * @see ShipyardExecConfig.TaskFinishedResult#getWarningTasks()
	 * @see #getTaskFinishedResult()
	 * @generated
	 */
	EReference getTaskFinishedResult_WarningTasks();

	/**
	 * Returns the meta object for the reference list '{@link ShipyardExecConfig.TaskFinishedResult#getFailedTasks <em>Failed Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Failed Tasks</em>'.
	 * @see ShipyardExecConfig.TaskFinishedResult#getFailedTasks()
	 * @see #getTaskFinishedResult()
	 * @generated
	 */
	EReference getTaskFinishedResult_FailedTasks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ShipyardExecConfigFactory getShipyardExecConfigFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ShipyardExecConfig.impl.ShipyardExecutionSuiteImpl <em>Shipyard Execution Suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShipyardExecConfig.impl.ShipyardExecutionSuiteImpl
		 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getShipyardExecutionSuite()
		 * @generated
		 */
		EClass SHIPYARD_EXECUTION_SUITE = eINSTANCE.getShipyardExecutionSuite();

		/**
		 * The meta object literal for the '<em><b>Shipyard V4 Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT = eINSTANCE.getShipyardExecutionSuite_ShipyardV4Root();

		/**
		 * The meta object literal for the '<em><b>Execution Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS = eINSTANCE.getShipyardExecutionSuite_ExecutionConfigurations();

		/**
		 * The meta object literal for the '{@link ShipyardExecConfig.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShipyardExecConfig.impl.NamedElementImpl
		 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ShipyardExecConfig.impl.ExecutionConfigurationImpl <em>Execution Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShipyardExecConfig.impl.ExecutionConfigurationImpl
		 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getExecutionConfiguration()
		 * @generated
		 */
		EClass EXECUTION_CONFIGURATION = eINSTANCE.getExecutionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Initial Sequence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONFIGURATION__INITIAL_SEQUENCE = eINSTANCE.getExecutionConfiguration_InitialSequence();

		/**
		 * The meta object literal for the '<em><b>Sequence Finished Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT = eINSTANCE.getExecutionConfiguration_SequenceFinishedResult();

		/**
		 * The meta object literal for the '<em><b>Task Finished Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT = eINSTANCE.getExecutionConfiguration_TaskFinishedResult();

		/**
		 * The meta object literal for the '{@link ShipyardExecConfig.impl.SequenceFinishedResultImpl <em>Sequence Finished Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShipyardExecConfig.impl.SequenceFinishedResultImpl
		 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getSequenceFinishedResult()
		 * @generated
		 */
		EClass SEQUENCE_FINISHED_RESULT = eINSTANCE.getSequenceFinishedResult();

		/**
		 * The meta object literal for the '<em><b>Passed Sequences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FINISHED_RESULT__PASSED_SEQUENCES = eINSTANCE.getSequenceFinishedResult_PassedSequences();

		/**
		 * The meta object literal for the '<em><b>Warning Sequences</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FINISHED_RESULT__WARNING_SEQUENCES = eINSTANCE.getSequenceFinishedResult_WarningSequences();

		/**
		 * The meta object literal for the '<em><b>Failed Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE_FINISHED_RESULT__FAILED_SEQUENCE = eINSTANCE.getSequenceFinishedResult_FailedSequence();

		/**
		 * The meta object literal for the '{@link ShipyardExecConfig.impl.TaskFinishedResultImpl <em>Task Finished Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ShipyardExecConfig.impl.TaskFinishedResultImpl
		 * @see ShipyardExecConfig.impl.ShipyardExecConfigPackageImpl#getTaskFinishedResult()
		 * @generated
		 */
		EClass TASK_FINISHED_RESULT = eINSTANCE.getTaskFinishedResult();

		/**
		 * The meta object literal for the '<em><b>Passed Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_FINISHED_RESULT__PASSED_TASKS = eINSTANCE.getTaskFinishedResult_PassedTasks();

		/**
		 * The meta object literal for the '<em><b>Warning Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_FINISHED_RESULT__WARNING_TASKS = eINSTANCE.getTaskFinishedResult_WarningTasks();

		/**
		 * The meta object literal for the '<em><b>Failed Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_FINISHED_RESULT__FAILED_TASKS = eINSTANCE.getTaskFinishedResult_FailedTasks();

	}

} //ShipyardExecConfigPackage
