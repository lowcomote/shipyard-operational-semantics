/**
 */
package ShipyardExecConfig.impl;

import ShipyardExecConfig.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShipyardExecConfigFactoryImpl extends EFactoryImpl implements ShipyardExecConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ShipyardExecConfigFactory init() {
		try {
			ShipyardExecConfigFactory theShipyardExecConfigFactory = (ShipyardExecConfigFactory)EPackage.Registry.INSTANCE.getEFactory(ShipyardExecConfigPackage.eNS_URI);
			if (theShipyardExecConfigFactory != null) {
				return theShipyardExecConfigFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ShipyardExecConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardExecConfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE: return createShipyardExecutionSuite();
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION: return createExecutionConfiguration();
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT: return createSequenceFinishedResult();
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT: return createTaskFinishedResult();
			case ShipyardExecConfigPackage.EXPECTED_EXECUTION: return createExpectedExecution();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardExecutionSuite createShipyardExecutionSuite() {
		ShipyardExecutionSuiteImpl shipyardExecutionSuite = new ShipyardExecutionSuiteImpl();
		return shipyardExecutionSuite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionConfiguration createExecutionConfiguration() {
		ExecutionConfigurationImpl executionConfiguration = new ExecutionConfigurationImpl();
		return executionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFinishedResult createSequenceFinishedResult() {
		SequenceFinishedResultImpl sequenceFinishedResult = new SequenceFinishedResultImpl();
		return sequenceFinishedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFinishedResult createTaskFinishedResult() {
		TaskFinishedResultImpl taskFinishedResult = new TaskFinishedResultImpl();
		return taskFinishedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpectedExecution createExpectedExecution() {
		ExpectedExecutionImpl expectedExecution = new ExpectedExecutionImpl();
		return expectedExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardExecConfigPackage getShipyardExecConfigPackage() {
		return (ShipyardExecConfigPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ShipyardExecConfigPackage getPackage() {
		return ShipyardExecConfigPackage.eINSTANCE;
	}

} //ShipyardExecConfigFactoryImpl
