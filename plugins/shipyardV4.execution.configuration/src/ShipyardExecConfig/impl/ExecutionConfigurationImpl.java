/**
 */
package ShipyardExecConfig.impl;

import ShipyardExecConfig.ExecutionConfiguration;
import ShipyardExecConfig.SequenceFinishedResult;
import ShipyardExecConfig.ShipyardExecConfigPackage;
import ShipyardExecConfig.TaskFinishedResult;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import shipyardV4.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.impl.ExecutionConfigurationImpl#getInitialSequence <em>Initial Sequence</em>}</li>
 *   <li>{@link ShipyardExecConfig.impl.ExecutionConfigurationImpl#getSequenceFinishedResult <em>Sequence Finished Result</em>}</li>
 *   <li>{@link ShipyardExecConfig.impl.ExecutionConfigurationImpl#getTaskFinishedResult <em>Task Finished Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionConfigurationImpl extends NamedElementImpl implements ExecutionConfiguration {
	/**
	 * The cached value of the '{@link #getInitialSequence() <em>Initial Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence initialSequence;

	/**
	 * The cached value of the '{@link #getSequenceFinishedResult() <em>Sequence Finished Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceFinishedResult()
	 * @generated
	 * @ordered
	 */
	protected SequenceFinishedResult sequenceFinishedResult;

	/**
	 * The cached value of the '{@link #getTaskFinishedResult() <em>Task Finished Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskFinishedResult()
	 * @generated
	 * @ordered
	 */
	protected TaskFinishedResult taskFinishedResult;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardExecConfigPackage.Literals.EXECUTION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getInitialSequence() {
		if (initialSequence != null && initialSequence.eIsProxy()) {
			InternalEObject oldInitialSequence = (InternalEObject)initialSequence;
			initialSequence = (Sequence)eResolveProxy(oldInitialSequence);
			if (initialSequence != oldInitialSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__INITIAL_SEQUENCE, oldInitialSequence, initialSequence));
			}
		}
		return initialSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence basicGetInitialSequence() {
		return initialSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialSequence(Sequence newInitialSequence) {
		Sequence oldInitialSequence = initialSequence;
		initialSequence = newInitialSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__INITIAL_SEQUENCE, oldInitialSequence, initialSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFinishedResult getSequenceFinishedResult() {
		return sequenceFinishedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequenceFinishedResult(SequenceFinishedResult newSequenceFinishedResult, NotificationChain msgs) {
		SequenceFinishedResult oldSequenceFinishedResult = sequenceFinishedResult;
		sequenceFinishedResult = newSequenceFinishedResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT, oldSequenceFinishedResult, newSequenceFinishedResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceFinishedResult(SequenceFinishedResult newSequenceFinishedResult) {
		if (newSequenceFinishedResult != sequenceFinishedResult) {
			NotificationChain msgs = null;
			if (sequenceFinishedResult != null)
				msgs = ((InternalEObject)sequenceFinishedResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT, null, msgs);
			if (newSequenceFinishedResult != null)
				msgs = ((InternalEObject)newSequenceFinishedResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT, null, msgs);
			msgs = basicSetSequenceFinishedResult(newSequenceFinishedResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT, newSequenceFinishedResult, newSequenceFinishedResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFinishedResult getTaskFinishedResult() {
		return taskFinishedResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskFinishedResult(TaskFinishedResult newTaskFinishedResult, NotificationChain msgs) {
		TaskFinishedResult oldTaskFinishedResult = taskFinishedResult;
		taskFinishedResult = newTaskFinishedResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT, oldTaskFinishedResult, newTaskFinishedResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskFinishedResult(TaskFinishedResult newTaskFinishedResult) {
		if (newTaskFinishedResult != taskFinishedResult) {
			NotificationChain msgs = null;
			if (taskFinishedResult != null)
				msgs = ((InternalEObject)taskFinishedResult).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT, null, msgs);
			if (newTaskFinishedResult != null)
				msgs = ((InternalEObject)newTaskFinishedResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT, null, msgs);
			msgs = basicSetTaskFinishedResult(newTaskFinishedResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT, newTaskFinishedResult, newTaskFinishedResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT:
				return basicSetSequenceFinishedResult(null, msgs);
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT:
				return basicSetTaskFinishedResult(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__INITIAL_SEQUENCE:
				if (resolve) return getInitialSequence();
				return basicGetInitialSequence();
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT:
				return getSequenceFinishedResult();
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT:
				return getTaskFinishedResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__INITIAL_SEQUENCE:
				setInitialSequence((Sequence)newValue);
				return;
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT:
				setSequenceFinishedResult((SequenceFinishedResult)newValue);
				return;
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT:
				setTaskFinishedResult((TaskFinishedResult)newValue);
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
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__INITIAL_SEQUENCE:
				setInitialSequence((Sequence)null);
				return;
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT:
				setSequenceFinishedResult((SequenceFinishedResult)null);
				return;
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT:
				setTaskFinishedResult((TaskFinishedResult)null);
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
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__INITIAL_SEQUENCE:
				return initialSequence != null;
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT:
				return sequenceFinishedResult != null;
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT:
				return taskFinishedResult != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionConfigurationImpl
