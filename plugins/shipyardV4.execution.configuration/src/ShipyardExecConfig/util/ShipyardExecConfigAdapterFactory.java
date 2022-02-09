/**
 */
package ShipyardExecConfig.util;

import ShipyardExecConfig.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ShipyardExecConfig.ShipyardExecConfigPackage
 * @generated
 */
public class ShipyardExecConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShipyardExecConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardExecConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ShipyardExecConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipyardExecConfigSwitch<Adapter> modelSwitch =
		new ShipyardExecConfigSwitch<Adapter>() {
			@Override
			public Adapter caseShipyardExecutionSuite(ShipyardExecutionSuite object) {
				return createShipyardExecutionSuiteAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseExecutionConfiguration(ExecutionConfiguration object) {
				return createExecutionConfigurationAdapter();
			}
			@Override
			public Adapter caseSequenceFinishedResult(SequenceFinishedResult object) {
				return createSequenceFinishedResultAdapter();
			}
			@Override
			public Adapter caseTaskFinishedResult(TaskFinishedResult object) {
				return createTaskFinishedResultAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ShipyardExecConfig.ShipyardExecutionSuite <em>Shipyard Execution Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShipyardExecConfig.ShipyardExecutionSuite
	 * @generated
	 */
	public Adapter createShipyardExecutionSuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShipyardExecConfig.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShipyardExecConfig.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShipyardExecConfig.ExecutionConfiguration <em>Execution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShipyardExecConfig.ExecutionConfiguration
	 * @generated
	 */
	public Adapter createExecutionConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShipyardExecConfig.SequenceFinishedResult <em>Sequence Finished Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShipyardExecConfig.SequenceFinishedResult
	 * @generated
	 */
	public Adapter createSequenceFinishedResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ShipyardExecConfig.TaskFinishedResult <em>Task Finished Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ShipyardExecConfig.TaskFinishedResult
	 * @generated
	 */
	public Adapter createTaskFinishedResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ShipyardExecConfigAdapterFactory
