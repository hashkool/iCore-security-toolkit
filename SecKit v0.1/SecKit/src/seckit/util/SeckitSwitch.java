/**
 */
package seckit.util;

import models.Element;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import seckit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see seckit.SeckitPackage
 * @generated
 */
public class SeckitSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static SeckitPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SeckitSwitch() {
        if (modelPackage == null) {
            modelPackage = SeckitPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case SeckitPackage.SYSTEM_DESIGN_VIEWPOINT: {
                SystemDesignViewpoint systemDesignViewpoint = (SystemDesignViewpoint)theEObject;
                T result = caseSystemDesignViewpoint(systemDesignViewpoint);
                if (result == null) result = caseSystemViewpoint(systemDesignViewpoint);
                if (result == null) result = caseElement(systemDesignViewpoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SeckitPackage.SYSTEM_RUNTIME_VIEWPOINT: {
                SystemRuntimeViewpoint systemRuntimeViewpoint = (SystemRuntimeViewpoint)theEObject;
                T result = caseSystemRuntimeViewpoint(systemRuntimeViewpoint);
                if (result == null) result = caseSystemViewpoint(systemRuntimeViewpoint);
                if (result == null) result = caseElement(systemRuntimeViewpoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SeckitPackage.SYSTEM_VIEWPOINT: {
                SystemViewpoint systemViewpoint = (SystemViewpoint)theEObject;
                T result = caseSystemViewpoint(systemViewpoint);
                if (result == null) result = caseElement(systemViewpoint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case SeckitPackage.SYSTEM_VIEWPOINTS: {
                SystemViewpoints systemViewpoints = (SystemViewpoints)theEObject;
                T result = caseSystemViewpoints(systemViewpoints);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System Design Viewpoint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Design Viewpoint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystemDesignViewpoint(SystemDesignViewpoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System Runtime Viewpoint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Runtime Viewpoint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystemRuntimeViewpoint(SystemRuntimeViewpoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System Viewpoint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Viewpoint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystemViewpoint(SystemViewpoint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>System Viewpoints</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Viewpoints</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSystemViewpoints(SystemViewpoints object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseElement(Element object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //SeckitSwitch
