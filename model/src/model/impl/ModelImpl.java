/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import model.ExternalRessource;
import model.ICommand;
import model.LocalRessource;
import model.Model;
import model.ModelPackage;
import model.Ressource;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.ModelImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link model.impl.ModelImpl#getLocalResources <em>Local Resources</em>}</li>
 *   <li>{@link model.impl.ModelImpl#getExternalResources <em>External Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ICommand> commands;

	/**
	 * The cached value of the '{@link #getLocalResources() <em>Local Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalResources()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalRessource> localResources;

	/**
	 * The cached value of the '{@link #getExternalResources() <em>External Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalRessource> externalResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ICommand> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<ICommand>(ICommand.class, this, ModelPackage.MODEL__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalRessource> getLocalResources() {
		if (localResources == null) {
			localResources = new EObjectContainmentEList<LocalRessource>(LocalRessource.class, this, ModelPackage.MODEL__LOCAL_RESOURCES);
		}
		return localResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalRessource> getExternalResources() {
		if (externalResources == null) {
			externalResources = new EObjectContainmentEList<ExternalRessource>(ExternalRessource.class, this, ModelPackage.MODEL__EXTERNAL_RESOURCES);
		}
		return externalResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Ressource> resources() {
		EList<Ressource> resources = new BasicEList<>();
		
		resources.addAll(getLocalResources());
		resources.addAll(getExternalResources());
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MODEL__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODEL__LOCAL_RESOURCES:
				return ((InternalEList<?>)getLocalResources()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODEL__EXTERNAL_RESOURCES:
				return ((InternalEList<?>)getExternalResources()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.MODEL__COMMANDS:
				return getCommands();
			case ModelPackage.MODEL__LOCAL_RESOURCES:
				return getLocalResources();
			case ModelPackage.MODEL__EXTERNAL_RESOURCES:
				return getExternalResources();
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
			case ModelPackage.MODEL__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends ICommand>)newValue);
				return;
			case ModelPackage.MODEL__LOCAL_RESOURCES:
				getLocalResources().clear();
				getLocalResources().addAll((Collection<? extends LocalRessource>)newValue);
				return;
			case ModelPackage.MODEL__EXTERNAL_RESOURCES:
				getExternalResources().clear();
				getExternalResources().addAll((Collection<? extends ExternalRessource>)newValue);
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
			case ModelPackage.MODEL__COMMANDS:
				getCommands().clear();
				return;
			case ModelPackage.MODEL__LOCAL_RESOURCES:
				getLocalResources().clear();
				return;
			case ModelPackage.MODEL__EXTERNAL_RESOURCES:
				getExternalResources().clear();
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
			case ModelPackage.MODEL__COMMANDS:
				return commands != null && !commands.isEmpty();
			case ModelPackage.MODEL__LOCAL_RESOURCES:
				return localResources != null && !localResources.isEmpty();
			case ModelPackage.MODEL__EXTERNAL_RESOURCES:
				return externalResources != null && !externalResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.MODEL___RESOURCES:
				return resources();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ModelImpl
