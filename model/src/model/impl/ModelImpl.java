/**
 */
package model.impl;

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
 *   <li>{@link model.impl.ModelImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link model.impl.ModelImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link model.impl.ModelImpl#getLocalRessources <em>Local Ressources</em>}</li>
 *   <li>{@link model.impl.ModelImpl#getExternalRessources <em>External Ressources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressource;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<ICommand> command;

	/**
	 * The cached value of the '{@link #getLocalRessources() <em>Local Ressources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalRessource> localRessources;

	/**
	 * The cached value of the '{@link #getExternalRessources() <em>External Ressources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalRessource> externalRessources;

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
	 */
	public EList<Ressource> getRessource() {
		if(ressource ==null){
			ressource = new BasicEList<Ressource>();
		}
		ressource.clear();
		ressource.addAll(getLocalRessources());
		ressource.addAll(getExternalRessources());
		
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ICommand> getCommand() {
		if (command == null) {
			command = new EObjectContainmentEList<ICommand>(ICommand.class, this, ModelPackage.MODEL__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocalRessource> getLocalRessources() {
		if (localRessources == null) {
			localRessources = new EObjectContainmentEList<LocalRessource>(LocalRessource.class, this, ModelPackage.MODEL__LOCAL_RESSOURCES);
		}
		return localRessources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalRessource> getExternalRessources() {
		if (externalRessources == null) {
			externalRessources = new EObjectContainmentEList<ExternalRessource>(ExternalRessource.class, this, ModelPackage.MODEL__EXTERNAL_RESSOURCES);
		}
		return externalRessources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MODEL__RESSOURCE:
				return ((InternalEList<?>)getRessource()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODEL__COMMAND:
				return ((InternalEList<?>)getCommand()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODEL__LOCAL_RESSOURCES:
				return ((InternalEList<?>)getLocalRessources()).basicRemove(otherEnd, msgs);
			case ModelPackage.MODEL__EXTERNAL_RESSOURCES:
				return ((InternalEList<?>)getExternalRessources()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.MODEL__RESSOURCE:
				return getRessource();
			case ModelPackage.MODEL__COMMAND:
				return getCommand();
			case ModelPackage.MODEL__LOCAL_RESSOURCES:
				return getLocalRessources();
			case ModelPackage.MODEL__EXTERNAL_RESSOURCES:
				return getExternalRessources();
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
			case ModelPackage.MODEL__RESSOURCE:
				getRessource().clear();
				getRessource().addAll((Collection<? extends Ressource>)newValue);
				return;
			case ModelPackage.MODEL__COMMAND:
				getCommand().clear();
				getCommand().addAll((Collection<? extends ICommand>)newValue);
				return;
			case ModelPackage.MODEL__LOCAL_RESSOURCES:
				getLocalRessources().clear();
				getLocalRessources().addAll((Collection<? extends LocalRessource>)newValue);
				return;
			case ModelPackage.MODEL__EXTERNAL_RESSOURCES:
				getExternalRessources().clear();
				getExternalRessources().addAll((Collection<? extends ExternalRessource>)newValue);
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
			case ModelPackage.MODEL__RESSOURCE:
				getRessource().clear();
				return;
			case ModelPackage.MODEL__COMMAND:
				getCommand().clear();
				return;
			case ModelPackage.MODEL__LOCAL_RESSOURCES:
				getLocalRessources().clear();
				return;
			case ModelPackage.MODEL__EXTERNAL_RESSOURCES:
				getExternalRessources().clear();
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
			case ModelPackage.MODEL__RESSOURCE:
				return ressource != null && !ressource.isEmpty();
			case ModelPackage.MODEL__COMMAND:
				return command != null && !command.isEmpty();
			case ModelPackage.MODEL__LOCAL_RESSOURCES:
				return localRessources != null && !localRessources.isEmpty();
			case ModelPackage.MODEL__EXTERNAL_RESSOURCES:
				return externalRessources != null && !externalRessources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
