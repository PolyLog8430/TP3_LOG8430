/**
 */
package modelWebserver.impl;

import java.util.Collection;

import modelWebserver.ExternalRessource;
import modelWebserver.ICommand;
import modelWebserver.LocalRessource;
import modelWebserver.Model;
import modelWebserver.ModelWebserverPackage;
import modelWebserver.Ressource;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modelWebserver.impl.ModelImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link modelWebserver.impl.ModelImpl#getLocalResources <em>Local Resources</em>}</li>
 *   <li>{@link modelWebserver.impl.ModelImpl#getExternalResources <em>External Resources</em>}</li>
 *   <li>{@link modelWebserver.impl.ModelImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * The list of commands available for clients usage.
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<ICommand> commands;

	/**
	 * The cached value of the '{@link #getLocalResources() <em>Local Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * Available local resources.
	 * <!-- end-user-doc -->
	 * @see #getLocalResources()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalRessource> localResources;

	/**
	 * The cached value of the '{@link #getExternalResources() <em>External Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * Available external ressources.
	 * <!-- end-user-doc -->
	 * @see #getExternalResources()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalRessource> externalResources;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * All available ressources.
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> resources;

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
		return ModelWebserverPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ICommand> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<ICommand>(ICommand.class, this, ModelWebserverPackage.MODEL__COMMANDS);
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
			localResources = new EObjectContainmentEList<LocalRessource>(LocalRessource.class, this, ModelWebserverPackage.MODEL__LOCAL_RESOURCES);
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
			externalResources = new EObjectContainmentEList<ExternalRessource>(ExternalRessource.class, this, ModelWebserverPackage.MODEL__EXTERNAL_RESOURCES);
		}
		return externalResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get external and local resources
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Ressource> getResources() {
		if (resources == null) {
			resources = new EObjectResolvingEList<Ressource>(Ressource.class, this, ModelWebserverPackage.MODEL__RESOURCES);
		}
		resources.clear();
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
			case ModelWebserverPackage.MODEL__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
			case ModelWebserverPackage.MODEL__LOCAL_RESOURCES:
				return ((InternalEList<?>)getLocalResources()).basicRemove(otherEnd, msgs);
			case ModelWebserverPackage.MODEL__EXTERNAL_RESOURCES:
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
			case ModelWebserverPackage.MODEL__COMMANDS:
				return getCommands();
			case ModelWebserverPackage.MODEL__LOCAL_RESOURCES:
				return getLocalResources();
			case ModelWebserverPackage.MODEL__EXTERNAL_RESOURCES:
				return getExternalResources();
			case ModelWebserverPackage.MODEL__RESOURCES:
				return getResources();
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
			case ModelWebserverPackage.MODEL__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends ICommand>)newValue);
				return;
			case ModelWebserverPackage.MODEL__LOCAL_RESOURCES:
				getLocalResources().clear();
				getLocalResources().addAll((Collection<? extends LocalRessource>)newValue);
				return;
			case ModelWebserverPackage.MODEL__EXTERNAL_RESOURCES:
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
			case ModelWebserverPackage.MODEL__COMMANDS:
				getCommands().clear();
				return;
			case ModelWebserverPackage.MODEL__LOCAL_RESOURCES:
				getLocalResources().clear();
				return;
			case ModelWebserverPackage.MODEL__EXTERNAL_RESOURCES:
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
			case ModelWebserverPackage.MODEL__COMMANDS:
				return commands != null && !commands.isEmpty();
			case ModelWebserverPackage.MODEL__LOCAL_RESOURCES:
				return localResources != null && !localResources.isEmpty();
			case ModelWebserverPackage.MODEL__EXTERNAL_RESOURCES:
				return externalResources != null && !externalResources.isEmpty();
			case ModelWebserverPackage.MODEL__RESOURCES:
				return resources != null && !resources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
