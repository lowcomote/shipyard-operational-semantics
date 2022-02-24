/**
 */
package ShipyardExecConfig.impl;

import ShipyardExecConfig.ExecutionConfiguration;
import ShipyardExecConfig.ShipyardExecConfigPackage;
import ShipyardExecConfig.ShipyardExecutionSuite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import shipyardV4.ShipyardV4Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipyard Execution Suite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ShipyardExecConfig.impl.ShipyardExecutionSuiteImpl#getShipyardV4Root <em>Shipyard V4 Root</em>}</li>
 *   <li>{@link ShipyardExecConfig.impl.ShipyardExecutionSuiteImpl#getExecutionConfigurations <em>Execution Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipyardExecutionSuiteImpl extends NamedElementImpl implements ShipyardExecutionSuite {
	/**
	 * The cached value of the '{@link #getShipyardV4Root() <em>Shipyard V4 Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipyardV4Root()
	 * @generated
	 * @ordered
	 */
	protected ShipyardV4Root shipyardV4Root;

	/**
	 * The cached value of the '{@link #getExecutionConfigurations() <em>Execution Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutionConfiguration> executionConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipyardExecutionSuiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardExecConfigPackage.Literals.SHIPYARD_EXECUTION_SUITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardV4Root getShipyardV4Root() {
		if (shipyardV4Root != null && shipyardV4Root.eIsProxy()) {
			InternalEObject oldShipyardV4Root = (InternalEObject)shipyardV4Root;
			shipyardV4Root = (ShipyardV4Root)eResolveProxy(oldShipyardV4Root);
			if (shipyardV4Root != oldShipyardV4Root) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT, oldShipyardV4Root, shipyardV4Root));
			}
		}
		return shipyardV4Root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShipyardV4Root basicGetShipyardV4Root() {
		return shipyardV4Root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipyardV4Root(ShipyardV4Root newShipyardV4Root) {
		ShipyardV4Root oldShipyardV4Root = shipyardV4Root;
		shipyardV4Root = newShipyardV4Root;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT, oldShipyardV4Root, shipyardV4Root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutionConfiguration> getExecutionConfigurations() {
		if (executionConfigurations == null) {
			executionConfigurations = new EObjectContainmentEList<ExecutionConfiguration>(ExecutionConfiguration.class, this, ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS);
		}
		return executionConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS:
				return ((InternalEList<?>)getExecutionConfigurations()).basicRemove(otherEnd, msgs);
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
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT:
				if (resolve) return getShipyardV4Root();
				return basicGetShipyardV4Root();
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS:
				return getExecutionConfigurations();
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
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT:
				setShipyardV4Root((ShipyardV4Root)newValue);
				return;
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS:
				getExecutionConfigurations().clear();
				getExecutionConfigurations().addAll((Collection<? extends ExecutionConfiguration>)newValue);
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
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT:
				setShipyardV4Root((ShipyardV4Root)null);
				return;
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS:
				getExecutionConfigurations().clear();
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
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__SHIPYARD_V4_ROOT:
				return shipyardV4Root != null;
			case ShipyardExecConfigPackage.SHIPYARD_EXECUTION_SUITE__EXECUTION_CONFIGURATIONS:
				return executionConfigurations != null && !executionConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ShipyardExecutionSuiteImpl
