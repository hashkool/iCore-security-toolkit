/**
 */
package behavior.constraint;

import data.instance.Data;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Data Establishment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link behavior.constraint.StaticDataEstablishment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see behavior.constraint.ConstraintPackage#getStaticDataEstablishment()
 * @model
 * @generated
 */
public interface StaticDataEstablishment extends DataEstablishment {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(Data)
     * @see behavior.constraint.ConstraintPackage#getStaticDataEstablishment_Value()
     * @model containment="true" required="true"
     * @generated
     */
    Data getValue();

    /**
     * Sets the value of the '{@link behavior.constraint.StaticDataEstablishment#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(Data value);

} // StaticDataEstablishment
