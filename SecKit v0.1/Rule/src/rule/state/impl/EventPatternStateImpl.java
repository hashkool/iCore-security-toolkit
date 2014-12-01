/**
 */
package rule.state.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rule.condition.EventPattern;

import rule.state.EventPatternState;
import rule.state.StatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Pattern State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rule.state.impl.EventPatternStateImpl#getEventPattern <em>Event Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventPatternStateImpl extends StateImpl implements EventPatternState {
    /**
     * The cached value of the '{@link #getEventPattern() <em>Event Pattern</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEventPattern()
     * @generated
     * @ordered
     */
    protected EventPattern eventPattern;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EventPatternStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StatePackage.Literals.EVENT_PATTERN_STATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPattern getEventPattern() {
        if (eventPattern != null && eventPattern.eIsProxy()) {
            InternalEObject oldEventPattern = (InternalEObject)eventPattern;
            eventPattern = (EventPattern)eResolveProxy(oldEventPattern);
            if (eventPattern != oldEventPattern) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatePackage.EVENT_PATTERN_STATE__EVENT_PATTERN, oldEventPattern, eventPattern));
            }
        }
        return eventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EventPattern basicGetEventPattern() {
        return eventPattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEventPattern(EventPattern newEventPattern) {
        EventPattern oldEventPattern = eventPattern;
        eventPattern = newEventPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StatePackage.EVENT_PATTERN_STATE__EVENT_PATTERN, oldEventPattern, eventPattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case StatePackage.EVENT_PATTERN_STATE__EVENT_PATTERN:
                if (resolve) return getEventPattern();
                return basicGetEventPattern();
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
            case StatePackage.EVENT_PATTERN_STATE__EVENT_PATTERN:
                setEventPattern((EventPattern)newValue);
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
            case StatePackage.EVENT_PATTERN_STATE__EVENT_PATTERN:
                setEventPattern((EventPattern)null);
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
            case StatePackage.EVENT_PATTERN_STATE__EVENT_PATTERN:
                return eventPattern != null;
        }
        return super.eIsSet(featureID);
    }

} //EventPatternStateImpl
