/**
 */
package ShipyardExecConfig.provider;


import ShipyardExecConfig.ExecutionConfiguration;
import ShipyardExecConfig.ShipyardExecConfigFactory;
import ShipyardExecConfig.ShipyardExecConfigPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ShipyardExecConfig.ExecutionConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionConfigurationItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionConfigurationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInitialSequencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initial Sequence feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialSequencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExecutionConfiguration_initialSequence_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExecutionConfiguration_initialSequence_feature", "_UI_ExecutionConfiguration_type"),
				 ShipyardExecConfigPackage.Literals.EXECUTION_CONFIGURATION__INITIAL_SEQUENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ShipyardExecConfigPackage.Literals.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT);
			childrenFeatures.add(ShipyardExecConfigPackage.Literals.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT);
			childrenFeatures.add(ShipyardExecConfigPackage.Literals.EXECUTION_CONFIGURATION__EXPECTED_EXECUTION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ExecutionConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExecutionConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExecutionConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ExecutionConfiguration_type") :
			getString("_UI_ExecutionConfiguration_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExecutionConfiguration.class)) {
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT:
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT:
			case ShipyardExecConfigPackage.EXECUTION_CONFIGURATION__EXPECTED_EXECUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ShipyardExecConfigPackage.Literals.EXECUTION_CONFIGURATION__SEQUENCE_FINISHED_RESULT,
				 ShipyardExecConfigFactory.eINSTANCE.createSequenceFinishedResult()));

		newChildDescriptors.add
			(createChildParameter
				(ShipyardExecConfigPackage.Literals.EXECUTION_CONFIGURATION__TASK_FINISHED_RESULT,
				 ShipyardExecConfigFactory.eINSTANCE.createTaskFinishedResult()));

		newChildDescriptors.add
			(createChildParameter
				(ShipyardExecConfigPackage.Literals.EXECUTION_CONFIGURATION__EXPECTED_EXECUTION,
				 ShipyardExecConfigFactory.eINSTANCE.createExpectedExecution()));
	}

}
