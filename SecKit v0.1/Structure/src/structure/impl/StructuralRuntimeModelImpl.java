/**
 */
package structure.impl;

import java.util.Collection;

import models.impl.ModelImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structure.StructuralRuntimeModel;
import structure.StructurePackage;

import structure.instance.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structural Runtime Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link structure.impl.StructuralRuntimeModelImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuralRuntimeModelImpl extends ModelImpl implements StructuralRuntimeModel {
    /**
     * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntities()
     * @generated
     * @ordered
     */
    protected EList<Entity> entities;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StructuralRuntimeModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return StructurePackage.Literals.STRUCTURAL_RUNTIME_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Entity> getEntities() {
        if (entities == null) {
            entities = new EObjectContainmentEList<Entity>(Entity.class, this, StructurePackage.STRUCTURAL_RUNTIME_MODEL__ENTITIES);
        }
        return entities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case StructurePackage.STRUCTURAL_RUNTIME_MODEL__ENTITIES:
                return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
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
            case StructurePackage.STRUCTURAL_RUNTIME_MODEL__ENTITIES:
                return getEntities();
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
            case StructurePackage.STRUCTURAL_RUNTIME_MODEL__ENTITIES:
                getEntities().clear();
                getEntities().addAll((Collection<? extends Entity>)newValue);
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
            case StructurePackage.STRUCTURAL_RUNTIME_MODEL__ENTITIES:
                getEntities().clear();
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
            case StructurePackage.STRUCTURAL_RUNTIME_MODEL__ENTITIES:
                return entities != null && !entities.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //StructuralRuntimeModelImpl
