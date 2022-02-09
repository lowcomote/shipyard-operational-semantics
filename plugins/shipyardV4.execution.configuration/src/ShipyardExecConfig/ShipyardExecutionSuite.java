/**
 */
package ShipyardExecConfig;

import org.eclipse.emf.common.util.EList;

import shipyardV4.ShipyardV4Root;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shipyard Execution Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.ShipyardExecutionSuite#getShipyardV4Root <em>Shipyard V4 Root</em>}</li>
 *   <li>{@link ShipyardExecConfig.ShipyardExecutionSuite#getExecutionConfigurations <em>Execution Configurations</em>}</li>
 * </ul>
 *
 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getShipyardExecutionSuite()
 * @model
 * @generated
 */
public interface ShipyardExecutionSuite extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Shipyard V4 Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shipyard V4 Root</em>' reference.
	 * @see #setShipyardV4Root(ShipyardV4Root)
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getShipyardExecutionSuite_ShipyardV4Root()
	 * @model
	 * @generated
	 */
	ShipyardV4Root getShipyardV4Root();

	/**
	 * Sets the value of the '{@link ShipyardExecConfig.ShipyardExecutionSuite#getShipyardV4Root <em>Shipyard V4 Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shipyard V4 Root</em>' reference.
	 * @see #getShipyardV4Root()
	 * @generated
	 */
	void setShipyardV4Root(ShipyardV4Root value);

	/**
	 * Returns the value of the '<em><b>Execution Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ShipyardExecConfig.ExecutionConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Configurations</em>' containment reference list.
	 * @see ShipyardExecConfig.ShipyardExecConfigPackage#getShipyardExecutionSuite_ExecutionConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionConfiguration> getExecutionConfigurations();

} // ShipyardExecutionSuite
