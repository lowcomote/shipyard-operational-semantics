/**
 */
package ShipyardExecConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import shipyardV4.Sequence;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Finished Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.SequenceFinishedResult#getPassedSequences <em>Passed Sequences</em>}</li>
 *   <li>{@link ShipyardExecConfig.SequenceFinishedResult#getWarningSequences <em>Warning Sequences</em>}</li>
 *   <li>{@link ShipyardExecConfig.SequenceFinishedResult#getFailedSequence <em>Failed Sequence</em>}</li>
 * </ul>
 *
 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getSequenceFinishedResult()
 * @model
 * @generated
 */
public interface SequenceFinishedResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Passed Sequences</b></em>' reference list.
	 * The list contents are of type {@link shipyardV4.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passed Sequences</em>' reference list.
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getSequenceFinishedResult_PassedSequences()
	 * @model
	 * @generated
	 */
	EList<Sequence> getPassedSequences();

	/**
	 * Returns the value of the '<em><b>Warning Sequences</b></em>' reference list.
	 * The list contents are of type {@link shipyardV4.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Sequences</em>' reference list.
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getSequenceFinishedResult_WarningSequences()
	 * @model
	 * @generated
	 */
	EList<Sequence> getWarningSequences();

	/**
	 * Returns the value of the '<em><b>Failed Sequence</b></em>' reference list.
	 * The list contents are of type {@link shipyardV4.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failed Sequence</em>' reference list.
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getSequenceFinishedResult_FailedSequence()
	 * @model
	 * @generated
	 */
	EList<Sequence> getFailedSequence();

} // SequenceFinishedResult
