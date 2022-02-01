/**
 */
package shipyardV4.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import shipyardV4.Shipyard;
import shipyardV4.ShipyardV4Package;
import shipyardV4.ShipyardV4Root;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link shipyardV4.impl.ShipyardV4RootImpl#getShipyardV4Root <em>Shipyard V4 Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShipyardV4RootImpl extends MinimalEObjectImpl.Container implements ShipyardV4Root {
	/**
	 * The cached value of the '{@link #getShipyardV4Root() <em>Shipyard V4 Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShipyardV4Root()
	 * @generated
	 * @ordered
	 */
	protected Shipyard shipyardV4Root;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShipyardV4RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShipyardV4Package.Literals.SHIPYARD_V4_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shipyard getShipyardV4Root() {
		return shipyardV4Root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShipyardV4Root(Shipyard newShipyardV4Root, NotificationChain msgs) {
		Shipyard oldShipyardV4Root = shipyardV4Root;
		shipyardV4Root = newShipyardV4Root;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT, oldShipyardV4Root, newShipyardV4Root);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShipyardV4Root(Shipyard newShipyardV4Root) {
		if (newShipyardV4Root != shipyardV4Root) {
			NotificationChain msgs = null;
			if (shipyardV4Root != null)
				msgs = ((InternalEObject)shipyardV4Root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT, null, msgs);
			if (newShipyardV4Root != null)
				msgs = ((InternalEObject)newShipyardV4Root).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT, null, msgs);
			msgs = basicSetShipyardV4Root(newShipyardV4Root, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT, newShipyardV4Root, newShipyardV4Root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				return basicSetShipyardV4Root(null, msgs);
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				return getShipyardV4Root();
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				setShipyardV4Root((Shipyard)newValue);
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				setShipyardV4Root((Shipyard)null);
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
			case ShipyardV4Package.SHIPYARD_V4_ROOT__SHIPYARD_V4_ROOT:
				return shipyardV4Root != null;
		}
		return super.eIsSet(featureID);
	}

} //ShipyardV4RootImpl
