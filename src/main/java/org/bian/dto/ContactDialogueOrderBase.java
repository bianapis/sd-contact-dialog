package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueOrderBase
 */
public class ContactDialogueOrderBase   {
  private Object contactRecord = null;

  private Object contactDialogueRecord = null;

  private String customerReference = null;

  private String servicingOrderReference = null;

  private String servicingOrderAccessStartEndTime = null;

  private String servicingOrderAccessResult = null;


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession general-info:  \"contact details including authentication level provided by SD-Contact Handler\" 
   * @return contactRecord
  **/

  public Object getContactRecord() {
    return contactRecord;
  }

  public void setContactRecord(Object contactRecord) {
    this.contactRecord = contactRecord;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.ExecutedAction general-info:  \"session dialogue log of actions returned to SD-Contact Handler\" 
   * @return contactDialogueRecord
  **/

  public Object getContactDialogueRecord() {
    return contactDialogueRecord;
  }

  public void setContactDialogueRecord(Object contactDialogueRecord) {
    this.contactDialogueRecord = contactDialogueRecord;
  }


  /**
   * `status: Provisionally Registered` bian-reference: RepresentativeOfCustomer.RepresentedCustomer 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.ServicingOrder general-info:  \"Reference to the servicing order\" 
   * @return servicingOrderReference
  **/

  public String getServicingOrderReference() {
    return servicingOrderReference;
  }

  public void setServicingOrderReference(String servicingOrderReference) {
    this.servicingOrderReference = servicingOrderReference;
  }


  /**
   * Get servicingOrderAccessStartEndTime
   * @return servicingOrderAccessStartEndTime
  **/

  public String getServicingOrderAccessStartEndTime() {
    return servicingOrderAccessStartEndTime;
  }

  public void setServicingOrderAccessStartEndTime(String servicingOrderAccessStartEndTime) {
    this.servicingOrderAccessStartEndTime = servicingOrderAccessStartEndTime;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.ServicingOrder.ServicingOrderResolution general-info:  \"servicing order access result\" 
   * @return servicingOrderAccessResult
  **/

  public String getServicingOrderAccessResult() {
    return servicingOrderAccessResult;
  }

  public void setServicingOrderAccessResult(String servicingOrderAccessResult) {
    this.servicingOrderAccessResult = servicingOrderAccessResult;
  }


}

