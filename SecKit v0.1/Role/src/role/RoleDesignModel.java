/**
 */
package role;

import models.Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link role.RoleDesignModel#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see role.RolePackage#getRoleDesignModel()
 * @model
 * @generated
 */
public interface RoleDesignModel extends Model {
    /**
     * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
     * The list contents are of type {@link role.RoleTypePackage}.
     * It is bidirectional and its opposite is '{@link role.RoleTypePackage#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packages</em>' containment reference list.
     * @see role.RolePackage#getRoleDesignModel_Packages()
     * @see role.RoleTypePackage#getModel
     * @model opposite="model" containment="true"
     * @generated
     */
    EList<RoleTypePackage> getPackages();

} // RoleDesignModel
