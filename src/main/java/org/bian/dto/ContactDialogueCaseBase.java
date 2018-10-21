package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueCaseBase
 */
public class ContactDialogueCaseBase   {
  private Object contactRecord = null;

  private Object contactDialogueRecord = null;

  private String customerReference = null;

  private String customerCaseReference = null;

  private String customerCaseAccessStartEndTime = null;

  private String customerCaseAccessResult = null;


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
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.InvestigationCase general-info:  \"Reference to the customer case\" 
   * @return customerCaseReference
  **/

  public String getCustomerCaseReference() {
    return customerCaseReference;
  }

  public void setCustomerCaseReference(String customerCaseReference) {
    this.customerCaseReference = customerCaseReference;
  }


  /**
   * Get customerCaseAccessStartEndTime
   * @return customerCaseAccessStartEndTime
  **/

  public String getCustomerCaseAccessStartEndTime() {
    return customerCaseAccessStartEndTime;
  }

  public void setCustomerCaseAccessStartEndTime(String customerCaseAccessStartEndTime) {
    this.customerCaseAccessStartEndTime = customerCaseAccessStartEndTime;
  }


  /**
   * `status: Registered` iso-link: [click-here](https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_E_Wn-cTGEeChad0JzLk7QA_-453837105/elements/_E_gY9MTGEeChad0JzLk7QA_1381201850) bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.InvestigationCase.InvestigationResolution general-info:  \"customer access result\" 
   * @return customerCaseAccessResult
  **/

  public String getCustomerCaseAccessResult() {
    return customerCaseAccessResult;
  }

  public void setCustomerCaseAccessResult(String customerCaseAccessResult) {
    this.customerCaseAccessResult = customerCaseAccessResult;
  }


}

