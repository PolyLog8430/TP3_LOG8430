/**
 */
package model.impl;

import java.lang.reflect.InvocationTargetException;
import model.CommandCodeResult;
import model.ModelPackage;
import model.Ressource;
import model.RessourceName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.RessourceNameImpl#getName <em>Name</em>}</li>
 *   <li>{@link model.impl.RessourceNameImpl#getRessource <em>Ressource</em>}</li>
 *   <li>{@link model.impl.RessourceNameImpl#getResult <em>Result</em>}</li>
 *   <li>{@link model.impl.RessourceNameImpl#isApplyOnFolder <em>Apply On Folder</em>}</li>
 *   <li>{@link model.impl.RessourceNameImpl#isApplyOnFile <em>Apply On File</em>}</li>
 *   <li>{@link model.impl.RessourceNameImpl#isApplyOnURI <em>Apply On URI</em>}</li>
 *   <li>{@link model.impl.RessourceNameImpl#getCodeResult <em>Code Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceNameImpl extends MinimalEObjectImpl.Container implements RessourceName {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessource() <em>Ressource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessource()
	 * @generated
	 * @ordered
	 */
	protected Ressource ressource;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected String result = RESULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyOnFolder() <em>Apply On Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFolder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_ON_FOLDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyOnFolder() <em>Apply On Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFolder()
	 * @generated
	 * @ordered
	 */
	protected boolean applyOnFolder = APPLY_ON_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyOnFile() <em>Apply On File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_ON_FILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyOnFile() <em>Apply On File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnFile()
	 * @generated
	 * @ordered
	 */
	protected boolean applyOnFile = APPLY_ON_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplyOnURI() <em>Apply On URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnURI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_ON_URI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyOnURI() <em>Apply On URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyOnURI()
	 * @generated
	 * @ordered
	 */
	protected boolean applyOnURI = APPLY_ON_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeResult() <em>Code Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeResult()
	 * @generated
	 * @ordered
	 */
	protected static final CommandCodeResult CODE_RESULT_EDEFAULT = CommandCodeResult.SUCCESS;

	/**
	 * The cached value of the '{@link #getCodeResult() <em>Code Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeResult()
	 * @generated
	 * @ordered
	 */
	protected CommandCodeResult codeResult = CODE_RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESSOURCE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESSOURCE_NAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ressource getRessource() {
		return ressource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRessource(Ressource newRessource, NotificationChain msgs) {
		Ressource oldRessource = ressource;
		ressource = newRessource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.RESSOURCE_NAME__RESSOURCE, oldRessource, newRessource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRessource(Ressource newRessource) {
		if (newRessource != ressource) {
			NotificationChain msgs = null;
			if (ressource != null)
				msgs = ((InternalEObject)ressource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESSOURCE_NAME__RESSOURCE, null, msgs);
			if (newRessource != null)
				msgs = ((InternalEObject)newRessource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.RESSOURCE_NAME__RESSOURCE, null, msgs);
			msgs = basicSetRessource(newRessource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESSOURCE_NAME__RESSOURCE, newRessource, newRessource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(String newResult) {
		String oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESSOURCE_NAME__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyOnFolder() {
		return applyOnFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyOnFolder(boolean newApplyOnFolder) {
		boolean oldApplyOnFolder = applyOnFolder;
		applyOnFolder = newApplyOnFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESSOURCE_NAME__APPLY_ON_FOLDER, oldApplyOnFolder, applyOnFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyOnFile() {
		return applyOnFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyOnFile(boolean newApplyOnFile) {
		boolean oldApplyOnFile = applyOnFile;
		applyOnFile = newApplyOnFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESSOURCE_NAME__APPLY_ON_FILE, oldApplyOnFile, applyOnFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyOnURI() {
		return applyOnURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyOnURI(boolean newApplyOnURI) {
		boolean oldApplyOnURI = applyOnURI;
		applyOnURI = newApplyOnURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESSOURCE_NAME__APPLY_ON_URI, oldApplyOnURI, applyOnURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandCodeResult getCodeResult() {
		return codeResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeResult(CommandCodeResult newCodeResult) {
		CommandCodeResult oldCodeResult = codeResult;
		codeResult = newCodeResult == null ? CODE_RESULT_EDEFAULT : newCodeResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESSOURCE_NAME__CODE_RESULT, oldCodeResult, codeResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute(String resourceId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.RESSOURCE_NAME__RESSOURCE:
				return basicSetRessource(null, msgs);
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
			case ModelPackage.RESSOURCE_NAME__NAME:
				return getName();
			case ModelPackage.RESSOURCE_NAME__RESSOURCE:
				return getRessource();
			case ModelPackage.RESSOURCE_NAME__RESULT:
				return getResult();
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_FOLDER:
				return isApplyOnFolder();
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_FILE:
				return isApplyOnFile();
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_URI:
				return isApplyOnURI();
			case ModelPackage.RESSOURCE_NAME__CODE_RESULT:
				return getCodeResult();
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
			case ModelPackage.RESSOURCE_NAME__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.RESSOURCE_NAME__RESSOURCE:
				setRessource((Ressource)newValue);
				return;
			case ModelPackage.RESSOURCE_NAME__RESULT:
				setResult((String)newValue);
				return;
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_FOLDER:
				setApplyOnFolder((Boolean)newValue);
				return;
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_FILE:
				setApplyOnFile((Boolean)newValue);
				return;
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_URI:
				setApplyOnURI((Boolean)newValue);
				return;
			case ModelPackage.RESSOURCE_NAME__CODE_RESULT:
				setCodeResult((CommandCodeResult)newValue);
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
			case ModelPackage.RESSOURCE_NAME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.RESSOURCE_NAME__RESSOURCE:
				setRessource((Ressource)null);
				return;
			case ModelPackage.RESSOURCE_NAME__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_FOLDER:
				setApplyOnFolder(APPLY_ON_FOLDER_EDEFAULT);
				return;
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_FILE:
				setApplyOnFile(APPLY_ON_FILE_EDEFAULT);
				return;
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_URI:
				setApplyOnURI(APPLY_ON_URI_EDEFAULT);
				return;
			case ModelPackage.RESSOURCE_NAME__CODE_RESULT:
				setCodeResult(CODE_RESULT_EDEFAULT);
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
			case ModelPackage.RESSOURCE_NAME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.RESSOURCE_NAME__RESSOURCE:
				return ressource != null;
			case ModelPackage.RESSOURCE_NAME__RESULT:
				return RESULT_EDEFAULT == null ? result != null : !RESULT_EDEFAULT.equals(result);
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_FOLDER:
				return applyOnFolder != APPLY_ON_FOLDER_EDEFAULT;
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_FILE:
				return applyOnFile != APPLY_ON_FILE_EDEFAULT;
			case ModelPackage.RESSOURCE_NAME__APPLY_ON_URI:
				return applyOnURI != APPLY_ON_URI_EDEFAULT;
			case ModelPackage.RESSOURCE_NAME__CODE_RESULT:
				return codeResult != CODE_RESULT_EDEFAULT;
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
			case ModelPackage.RESSOURCE_NAME___EXECUTE__STRING:
				execute((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", result: ");
		result.append(result);
		result.append(", applyOnFolder: ");
		result.append(applyOnFolder);
		result.append(", applyOnFile: ");
		result.append(applyOnFile);
		result.append(", applyOnURI: ");
		result.append(applyOnURI);
		result.append(", codeResult: ");
		result.append(codeResult);
		result.append(')');
		return result.toString();
	}

} //RessourceNameImpl
