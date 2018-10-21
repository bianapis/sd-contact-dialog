package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueHistoryBaseWithIds
 */
public class ContactDialogueHistoryBaseWithIds   {
  private String contactDialogueRecordReference = null;

  private String contactDialogueHistoryTaskReference = null;

  private String customerReference = null;

  private Object contactDialogueRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return contactDialogueRecordReference
  **/

  public String getContactDialogueRecordReference() {
    return contactDialogueRecordReference;
  }

  public void setContactDialogueRecordReference(String contactDialogueRecordReference) {
    this.contactDialogueRecordReference = contactDialogueRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return contactDialogueHistoryTaskReference
  **/

  public String getContactDialogueHistoryTaskReference() {
    return contactDialogueHistoryTaskReference;
  }

  public void setContactDialogueHistoryTaskReference(String contactDialogueHistoryTaskReference) {
    this.contactDialogueHistoryTaskReference = contactDialogueHistoryTaskReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: RepresentativeOfCustomer.RepresentedCustomer general-info:  \"used to update customer history\" 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.ExecutedAction general-info:  \"extracted information provided to capture session event\" 
   * @return contactDialogueRecord
  **/

  public Object getContactDialogueRecord() {
    return contactDialogueRecord;
  }

  public void setContactDialogueRecord(Object contactDialogueRecord) {
    this.contactDialogueRecord = contactDialogueRecord;
  }


}

