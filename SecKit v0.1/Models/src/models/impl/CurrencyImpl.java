/**
 */
package models.impl;

import models.Currency;
import models.ModelsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Currency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link models.impl.CurrencyImpl#getName <em>Name</em>}</li>
 *   <li>{@link models.impl.CurrencyImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link models.impl.CurrencyImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurrencyImpl extends MinimalEObjectImpl.Container implements Currency {
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
     * The default value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcronym()
     * @generated
     * @ordered
     */
    protected static final String ACRONYM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcronym()
     * @generated
     * @ordered
     */
    protected String acronym = ACRONYM_EDEFAULT;

    /**
     * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSymbol()
     * @generated
     * @ordered
     */
    protected static final String SYMBOL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSymbol()
     * @generated
     * @ordered
     */
    protected String symbol = SYMBOL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CurrencyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ModelsPackage.Literals.CURRENCY;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.CURRENCY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAcronym(String newAcronym) {
        String oldAcronym = acronym;
        acronym = newAcronym;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.CURRENCY__ACRONYM, oldAcronym, acronym));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSymbol(String newSymbol) {
        String oldSymbol = symbol;
        symbol = newSymbol;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelsPackage.CURRENCY__SYMBOL, oldSymbol, symbol));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelsPackage.CURRENCY__NAME:
                return getName();
            case ModelsPackage.CURRENCY__ACRONYM:
                return getAcronym();
            case ModelsPackage.CURRENCY__SYMBOL:
                return getSymbol();
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
            case ModelsPackage.CURRENCY__NAME:
                setName((String)newValue);
                return;
            case ModelsPackage.CURRENCY__ACRONYM:
                setAcronym((String)newValue);
                return;
            case ModelsPackage.CURRENCY__SYMBOL:
                setSymbol((String)newValue);
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
            case ModelsPackage.CURRENCY__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelsPackage.CURRENCY__ACRONYM:
                setAcronym(ACRONYM_EDEFAULT);
                return;
            case ModelsPackage.CURRENCY__SYMBOL:
                setSymbol(SYMBOL_EDEFAULT);
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
            case ModelsPackage.CURRENCY__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelsPackage.CURRENCY__ACRONYM:
                return ACRONYM_EDEFAULT == null ? acronym != null : !ACRONYM_EDEFAULT.equals(acronym);
            case ModelsPackage.CURRENCY__SYMBOL:
                return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
        }
        return super.eIsSet(featureID);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", acronym: ");
        result.append(acronym);
        result.append(", symbol: ");
        result.append(symbol);
        result.append(')');
        return result.toString();
    }

} //CurrencyImpl
