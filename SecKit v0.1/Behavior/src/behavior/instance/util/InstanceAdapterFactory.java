/**
 */
package behavior.instance.util;

import behavior.instance.*;

import models.Element;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see behavior.instance.InstancePackage
 * @generated
 */
public class InstanceAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static InstancePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = InstancePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InstanceSwitch<Adapter> modelSwitch =
        new InstanceSwitch<Adapter>() {
            @Override
            public Adapter caseBehavior(Behavior object) {
                return createBehaviorAdapter();
            }
            @Override
            public Adapter caseActivity(Activity object) {
                return createActivityAdapter();
            }
            @Override
            public Adapter caseFlowPoint(FlowPoint object) {
                return createFlowPointAdapter();
            }
            @Override
            public Adapter caseAction(Action object) {
                return createActionAdapter();
            }
            @Override
            public Adapter caseInteraction(Interaction object) {
                return createInteractionAdapter();
            }
            @Override
            public Adapter caseInteractionContribution(InteractionContribution object) {
                return createInteractionContributionAdapter();
            }
            @Override
            public Adapter caseDataProducerInstance(DataProducerInstance object) {
                return createDataProducerInstanceAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link behavior.instance.Behavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instance.Behavior
     * @generated
     */
    public Adapter createBehaviorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instance.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instance.Activity
     * @generated
     */
    public Adapter createActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instance.FlowPoint <em>Flow Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instance.FlowPoint
     * @generated
     */
    public Adapter createFlowPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instance.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instance.Action
     * @generated
     */
    public Adapter createActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instance.Interaction <em>Interaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instance.Interaction
     * @generated
     */
    public Adapter createInteractionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instance.InteractionContribution <em>Interaction Contribution</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instance.InteractionContribution
     * @generated
     */
    public Adapter createInteractionContributionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link behavior.instance.DataProducerInstance <em>Data Producer Instance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see behavior.instance.DataProducerInstance
     * @generated
     */
    public Adapter createDataProducerInstanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link models.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see models.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //InstanceAdapterFactory
