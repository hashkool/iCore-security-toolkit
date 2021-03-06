/**
 */
package trust.action.impl;

import com.dstc.spectrum.opinion.SubjectiveOpinion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trust.action.ActionPackage;
import trust.action.ManageOpinion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manage Opinion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link trust.action.impl.ManageOpinionImpl#getOpinion <em>Opinion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ManageOpinionImpl extends TrustManagementActionImpl implements ManageOpinion {
  /**
   * The default value of the '{@link #getOpinion() <em>Opinion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpinion()
   * @generated
   * @ordered
   */
  protected static final SubjectiveOpinion OPINION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpinion() <em>Opinion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpinion()
   * @generated
   * @ordered
   */
  protected SubjectiveOpinion opinion = OPINION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ManageOpinionImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ActionPackage.Literals.MANAGE_OPINION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubjectiveOpinion getOpinion() {
    return opinion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpinion(SubjectiveOpinion newOpinion) {
    SubjectiveOpinion oldOpinion = opinion;
    opinion = newOpinion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.MANAGE_OPINION__OPINION, oldOpinion, opinion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ActionPackage.MANAGE_OPINION__OPINION:
        return getOpinion();
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
      case ActionPackage.MANAGE_OPINION__OPINION:
        setOpinion((SubjectiveOpinion)newValue);
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
      case ActionPackage.MANAGE_OPINION__OPINION:
        setOpinion(OPINION_EDEFAULT);
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
      case ActionPackage.MANAGE_OPINION__OPINION:
        return OPINION_EDEFAULT == null ? opinion != null : !OPINION_EDEFAULT.equals(opinion);
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
    result.append(" (opinion: ");
    result.append(opinion);
    result.append(')');
    return result.toString();
  }

} //ManageOpinionImpl
