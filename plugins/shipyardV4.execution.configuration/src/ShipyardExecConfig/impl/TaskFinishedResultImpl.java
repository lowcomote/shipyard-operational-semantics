/**
 */
package ShipyardExecConfig.impl;

import ShipyardExecConfig.ShipyardExecConfigPackage;
import ShipyardExecConfig.TaskFinishedResult;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import shipyardV4.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Finished Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.impl.TaskFinishedResultImpl#getPassedTasks <em>Passed Tasks</em>}</li>
 *   <li>{@link ShipyardExecConfig.impl.TaskFinishedResultImpl#getWarningTasks <em>Warning Tasks</em>}</li>
 *   <li>{@link ShipyardExecConfig.impl.TaskFinishedResultImpl#getFailedTasks <em>Failed Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskFinishedResultImpl extends MinimalEObjectImpl.Container implements TaskFinishedResult {
	/**
	 * The cached value of the '{@link #getPassedTasks() <em>Passed Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> passedTasks;

	/**
	 * The cached value of the '{@link #getWarningTasks() <em>Warning Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> warningTasks;

	/**
	 * The cached value of the '{@link #getFailedTasks() <em>Failed Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> failedTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskFinishedResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardExecConfigPackage.Literals.TASK_FINISHED_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getPassedTasks() {
		if (passedTasks == null) {
			passedTasks = new EObjectResolvingEList<Task>(Task.class, this, ShipyardExecConfigPackage.TASK_FINISHED_RESULT__PASSED_TASKS);
		}
		return passedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getWarningTasks() {
		if (warningTasks == null) {
			warningTasks = new EObjectResolvingEList<Task>(Task.class, this, ShipyardExecConfigPackage.TASK_FINISHED_RESULT__WARNING_TASKS);
		}
		return warningTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getFailedTasks() {
		if (failedTasks == null) {
			failedTasks = new EObjectResolvingEList<Task>(Task.class, this, ShipyardExecConfigPackage.TASK_FINISHED_RESULT__FAILED_TASKS);
		}
		return failedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__PASSED_TASKS:
				return getPassedTasks();
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__WARNING_TASKS:
				return getWarningTasks();
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__FAILED_TASKS:
				return getFailedTasks();
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
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__PASSED_TASKS:
				getPassedTasks().clear();
				getPassedTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__WARNING_TASKS:
				getWarningTasks().clear();
				getWarningTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__FAILED_TASKS:
				getFailedTasks().clear();
				getFailedTasks().addAll((Collection<? extends Task>)newValue);
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
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__PASSED_TASKS:
				getPassedTasks().clear();
				return;
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__WARNING_TASKS:
				getWarningTasks().clear();
				return;
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__FAILED_TASKS:
				getFailedTasks().clear();
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
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__PASSED_TASKS:
				return passedTasks != null && !passedTasks.isEmpty();
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__WARNING_TASKS:
				return warningTasks != null && !warningTasks.isEmpty();
			case ShipyardExecConfigPackage.TASK_FINISHED_RESULT__FAILED_TASKS:
				return failedTasks != null && !failedTasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskFinishedResultImpl
