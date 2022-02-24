/**
 */
package ShipyardExecConfig.impl;

import ShipyardExecConfig.ExpectedExecution;
import ShipyardExecConfig.ShipyardExecConfigPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import shipyardV4.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expected Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.impl.ExpectedExecutionImpl#getExpectedTasks <em>Expected Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpectedExecutionImpl extends MinimalEObjectImpl.Container implements ExpectedExecution {
	/**
	 * The cached value of the '{@link #getExpectedTasks() <em>Expected Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> expectedTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpectedExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardExecConfigPackage.Literals.EXPECTED_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getExpectedTasks() {
		if (expectedTasks == null) {
			expectedTasks = new EObjectResolvingEList<Task>(Task.class, this, ShipyardExecConfigPackage.EXPECTED_EXECUTION__EXPECTED_TASKS);
		}
		return expectedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShipyardExecConfigPackage.EXPECTED_EXECUTION__EXPECTED_TASKS:
				return getExpectedTasks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShipyardExecConfigPackage.EXPECTED_EXECUTION__EXPECTED_TASKS:
				getExpectedTasks().clear();
				getExpectedTasks().addAll((Collection<? extends Task>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShipyardExecConfigPackage.EXPECTED_EXECUTION__EXPECTED_TASKS:
				getExpectedTasks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShipyardExecConfigPackage.EXPECTED_EXECUTION__EXPECTED_TASKS:
				return expectedTasks != null && !expectedTasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExpectedExecutionImpl
