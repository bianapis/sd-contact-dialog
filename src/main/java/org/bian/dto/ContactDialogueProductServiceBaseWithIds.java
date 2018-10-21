package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueProductServiceBaseWithIds
 */
public class ContactDialogueProductServiceBaseWithIds   {
  private String contactDialogueRecordReference = null;

  private String contactDialogueProductServiceAccessTaskReference = null;

  private Object contactRecord = null;

  private Object contactDialogueRecord = null;

  private String customerReference = null;

  private String productServiceReference = null;

  private String productInstanceReference = null;

  private String productServiceAccessStartEndTime = null;

  private String productServiceAccessResult = null;


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
   * @return contactDialogueProductServiceAccessTaskReference
  **/

  public String getContactDialogueProductServiceAccessTaskReference() {
    return contactDialogueProductServiceAccessTaskReference;
  }

  public void setContactDialogueProductServiceAccessTaskReference(String contactDialogueProductServiceAccessTaskReference) {
    this.contactDialogueProductServiceAccessTaskReference = contactDialogueProductServiceAccessTaskReference;
  }


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info:  \"type of product or service being accessed\" 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info:  \"account number\" 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * Get productServiceAccessStartEndTime
   * @return productServiceAccessStartEndTime
  **/

  public String getProductServiceAccessStartEndTime() {
    return productServiceAccessStartEndTime;
  }

  public void setProductServiceAccessStartEndTime(String productServiceAccessStartEndTime) {
    this.productServiceAccessStartEndTime = productServiceAccessStartEndTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  \"product or service access result\" 
   * @return productServiceAccessResult
  **/

  public String getProductServiceAccessResult() {
    return productServiceAccessResult;
  }

  public void setProductServiceAccessResult(String productServiceAccessResult) {
    this.productServiceAccessResult = productServiceAccessResult;
  }


}

