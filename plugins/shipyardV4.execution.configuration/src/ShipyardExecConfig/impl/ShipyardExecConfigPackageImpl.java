/**
 */
package ShipyardExecConfig.impl;

import ShipyardExecConfig.ExecutionConfiguration;
import ShipyardExecConfig.ExpectedExecution;
import ShipyardExecConfig.NamedElement;
import ShipyardExecConfig.SequenceFinishedResult;
import ShipyardExecConfig.ShipyardExecConfigFactory;
import ShipyardExecConfig.ShipyardExecConfigPackage;
import ShipyardExecConfig.ShipyardExecutionSuite;
import ShipyardExecConfig.TaskFinishedResult;

import jsonMetaschemaMM.JsonMetaschemaMMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import shipyardV4.ShipyardV4Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShipyardExecConfigPackageImpl extends EPackageImpl implements ShipyardExecConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shipyardExecutionSuiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFinishedResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskFinishedResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expectedExecutionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShipyardExecConfigPackageImpl() {
		super(eNS_URI, ShipyardExecConfigFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ShipyardExecConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShipyardExecConfigPackage init() {
		if (isInited) return (ShipyardExecConfigPackage)EPackage.Registry.INSTANCE.getEPackage(ShipyardExecConfigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredShipyardExecConfigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ShipyardExecConfigPackageImpl theShipyardExecConfigPackage = registeredShipyardExecConfigPackage instanceof ShipyardExecConfigPackageImpl ? (ShipyardExecConfigPackageImpl)registeredShipyardExecConfigPackage : new ShipyardExecConfigPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ShipyardV4Package.eINSTANCE.eClass();
		JsonMetaschemaMMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theShipyardExecConfigPackage.createPackageContents();

		// Initialize created meta-data
		theShipyardExecConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShipyardExecConfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ShipyardExecConfigPackage.eNS_URI, theShipyardExecConfigPackage);
		return theShipyardExecConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShipyardExecutionSuite() {
		return shipyardExecutionSuiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardExecutionSuite_ShipyardV4Root() {
		return (EReference)shipyardExecutionSuiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShipyardExecutionSuite_ExecutionConfigurations() {
		return (EReference)shipyardExecutionSuiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionConfiguration() {
		return executionConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionConfiguration_InitialSequence() {
		return (EReference)executionConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionConfiguration_SequenceFinishedResult() {
		return (EReference)executionConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionConfiguration_TaskFinishedResult() {
		return (EReference)executionConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionConfiguration_ExpectedExecution() {
		return (EReference)executionConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFinishedResult() {
		return sequenceFinishedResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFinishedResult_PassedSequences() {
		return (EReference)sequenceFinishedResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFinishedResult_WarningSequences() {
		return (EReference)sequenceFinishedResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFinishedResult_FailedSequence() {
		return (EReference)sequenceFinishedResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskFinishedResult() {
		return taskFinishedResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskFinishedResult_PassedTasks() {
		return (EReference)taskFinishedResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskFinishedResult_WarningTasks() {
		return (EReference)taskFinishedResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskFinishedResult_FailedTasks() {
		return (EReference)taskFinishedResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpectedExecution() {
		return expectedExecutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpectedExecution_ExpectedTasks() {
		return (EReference)expectedExecutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardExecConfigFactory getShipyardExecConfigFactory() {
		return (ShipyardExecConfigFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		shipyardExecutionSuiteEClass = createEClass(SHIPYARD_EXECUTION_SUITE);
		createEReference(shipyardExecutionSuiteEClass, SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT);
		createEReference(shipyardExecutionSuiteEClass, SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		executionConfigurationEClass = createEClass(EXECUTION_CONFIGURATION);
		createEReference(executionConfigurationEClass, EXECUTION_CONFIGURATION__INITIAL_SEQUENCE);
		createEReference(executionConfigurationEClass, EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT);
		createEReference(executionConfigurationEClass, EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT);
		createEReference(executionConfigurationEClass, EXECUTION_CONFIGURATION__EXPECTED_EXECUTION);

		sequenceFinishedResultEClass = createEClass(SEQUENCE_FINISHED_RESULT);
		createEReference(sequenceFinishedResultEClass, SEQUENCE_FINISHED_RESULT__PASSED_SEQUENCES);
		createEReference(sequenceFinishedResultEClass, SEQUENCE_FINISHED_RESULT__WARNING_SEQUENCES);
		createEReference(sequenceFinishedResultEClass, SEQUENCE_FINISHED_RESULT__FAILED_SEQUENCE);

		taskFinishedResultEClass = createEClass(TASK_FINISHED_RESULT);
		createEReference(taskFinishedResultEClass, TASK_FINISHED_RESULT__PASSED_TASKS);
		createEReference(taskFinishedResultEClass, TASK_FINISHED_RESULT__WARNING_TASKS);
		createEReference(taskFinishedResultEClass, TASK_FINISHED_RESULT__FAILED_TASKS);

		expectedExecutionEClass = createEClass(EXPECTED_EXECUTION);
		createEReference(expectedExecutionEClass, EXPECTED_EXECUTION__EXPECTED_TASKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ShipyardV4Package theShipyardV4Package = (ShipyardV4Package)EPackage.Registry.INSTANCE.getEPackage(ShipyardV4Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		shipyardExecutionSuiteEClass.getESuperTypes().add(this.getNamedElement());
		executionConfigurationEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(shipyardExecutionSuiteEClass, ShipyardExecutionSuite.class, "ShipyardExecutionSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShipyardExecutionSuite_ShipyardV4Root(), theShipyardV4Package.getShipyardV4Root(), null, "shipyardV4Root", null, 0, 1, ShipyardExecutionSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShipyardExecutionSuite_ExecutionConfigurations(), this.getExecutionConfiguration(), null, "executionConfigurations", null, 0, -1, ShipyardExecutionSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionConfigurationEClass, ExecutionConfiguration.class, "ExecutionConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionConfiguration_InitialSequence(), theShipyardV4Package.getSequence(), null, "initialSequence", null, 0, 1, ExecutionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionConfiguration_SequenceFinishedResult(), this.getSequenceFinishedResult(), null, "sequenceFinishedResult", null, 0, 1, ExecutionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionConfiguration_TaskFinishedResult(), this.getTaskFinishedResult(), null, "taskFinishedResult", null, 0, 1, ExecutionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionConfiguration_ExpectedExecution(), this.getExpectedExecution(), null, "expectedExecution", null, 0, 1, ExecutionConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceFinishedResultEClass, SequenceFinishedResult.class, "SequenceFinishedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceFinishedResult_PassedSequences(), theShipyardV4Package.getSequence(), null, "passedSequences", null, 0, -1, SequenceFinishedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceFinishedResult_WarningSequences(), theShipyardV4Package.getSequence(), null, "warningSequences", null, 0, -1, SequenceFinishedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequenceFinishedResult_FailedSequence(), theShipyardV4Package.getSequence(), null, "failedSequence", null, 0, -1, SequenceFinishedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskFinishedResultEClass, TaskFinishedResult.class, "TaskFinishedResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskFinishedResult_PassedTasks(), theShipyardV4Package.getTask(), null, "passedTasks", null, 0, -1, TaskFinishedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskFinishedResult_WarningTasks(), theShipyardV4Package.getTask(), null, "warningTasks", null, 0, -1, TaskFinishedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskFinishedResult_FailedTasks(), theShipyardV4Package.getTask(), null, "failedTasks", null, 0, -1, TaskFinishedResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expectedExecutionEClass, ExpectedExecution.class, "ExpectedExecution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpectedExecution_ExpectedTasks(), theShipyardV4Package.getTask(), null, "expectedTasks", null, 0, -1, ExpectedExecution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ShipyardExecConfigPackageImpl
