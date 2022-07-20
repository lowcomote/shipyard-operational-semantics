/**
 */
package ShipyardExecConfig.impl;

import ShipyardExecConfig.SequenceFinishedResult;
import ShipyardExecConfig.ShipyardExecConfigPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import shipyardV4.Sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Finished Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.impl.SequenceFinishedResultImpl#getPassedSequences <em>Passed Sequences</em>}</li>
 *   <li>{@link ShipyardExecConfig.impl.SequenceFinishedResultImpl#getWarningSequences <em>Warning Sequences</em>}</li>
 *   <li>{@link ShipyardExecConfig.impl.SequenceFinishedResultImpl#getFailedSequence <em>Failed Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceFinishedResultImpl extends MinimalEObjectImpl.Container implements SequenceFinishedResult {
	/**
	 * The cached value of the '{@link #getPassedSequences() <em>Passed Sequences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassedSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> passedSequences;

	/**
	 * The cached value of the '{@link #getWarningSequences() <em>Warning Sequences</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarningSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> warningSequences;

	/**
	 * The cached value of the '{@link #getFailedSequence() <em>Failed Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailedSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> failedSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFinishedResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardExecConfigPackage.Literals.SEQUENCE_FINISHED_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getPassedSequences() {
		if (passedSequences == null) {
			passedSequences = new EObjectResolvingEList<Sequence>(Sequence.class, this, ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__PASSED_SEQUENCES);
		}
		return passedSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getWarningSequences() {
		if (warningSequences == null) {
			warningSequences = new EObjectResolvingEList<Sequence>(Sequence.class, this, ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__WARNING_SEQUENCES);
		}
		return warningSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sequence> getFailedSequence() {
		if (failedSequence == null) {
			failedSequence = new EObjectResolvingEList<Sequence>(Sequence.class, this, ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__FAILED_SEQUENCE);
		}
		return failedSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__PASSED_SEQUENCES:
				return getPassedSequences();
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__WARNING_SEQUENCES:
				return getWarningSequences();
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__FAILED_SEQUENCE:
				return getFailedSequence();
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
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__PASSED_SEQUENCES:
				getPassedSequences().clear();
				getPassedSequences().addAll((Collection<? extends Sequence>)newValue);
				return;
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__WARNING_SEQUENCES:
				getWarningSequences().clear();
				getWarningSequences().addAll((Collection<? extends Sequence>)newValue);
				return;
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__FAILED_SEQUENCE:
				getFailedSequence().clear();
				getFailedSequence().addAll((Collection<? extends Sequence>)newValue);
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
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__PASSED_SEQUENCES:
				getPassedSequences().clear();
				return;
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__WARNING_SEQUENCES:
				getWarningSequences().clear();
				return;
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__FAILED_SEQUENCE:
				getFailedSequence().clear();
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
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__PASSED_SEQUENCES:
				return passedSequences != null && !passedSequences.isEmpty();
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__WARNING_SEQUENCES:
				return warningSequences != null && !warningSequences.isEmpty();
			case ShipyardExecConfigPackage.SEQUENCE_FINISHED_RESULT__FAILED_SEQUENCE:
				return failedSequence != null && !failedSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceFinishedResultImpl
