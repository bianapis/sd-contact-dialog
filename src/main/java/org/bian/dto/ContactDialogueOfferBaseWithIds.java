package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueOfferBaseWithIds
 */
public class ContactDialogueOfferBaseWithIds   {
  private String contactDialogueRecordReference = null;

  private String contactDialogueOfferTaskReference = null;

  private Object contactRecord = null;

  private Object contactDialogueRecord = null;

  private String customerReference = null;

  private String productServiceReference = null;

  private String customerOfferReference = null;

  private String customerOfferAccessStartEndTime = null;

  private String customerOfferAccessResult = null;


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
   * @return contactDialogueOfferTaskReference
  **/

  public String getContactDialogueOfferTaskReference() {
    return contactDialogueOfferTaskReference;
  }

  public void setContactDialogueOfferTaskReference(String contactDialogueOfferTaskReference) {
    this.contactDialogueOfferTaskReference = contactDialogueOfferTaskReference;
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
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.CustomerOffer.OfferedAgreement(as MasterAgreement).GovernedContract(as Agreement).Product general-info:  \"type of product or service being offered\" 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.CustomerOffer general-info:  \"Reference to the customer offer\" 
   * @return customerOfferReference
  **/

  public String getCustomerOfferReference() {
    return customerOfferReference;
  }

  public void setCustomerOfferReference(String customerOfferReference) {
    this.customerOfferReference = customerOfferReference;
  }


  /**
   * Get customerOfferAccessStartEndTime
   * @return customerOfferAccessStartEndTime
  **/

  public String getCustomerOfferAccessStartEndTime() {
    return customerOfferAccessStartEndTime;
  }

  public void setCustomerOfferAccessStartEndTime(String customerOfferAccessStartEndTime) {
    this.customerOfferAccessStartEndTime = customerOfferAccessStartEndTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  \"customer offer access result\" 
   * @return customerOfferAccessResult
  **/

  public String getCustomerOfferAccessResult() {
    return customerOfferAccessResult;
  }

  public void setCustomerOfferAccessResult(String customerOfferAccessResult) {
    this.customerOfferAccessResult = customerOfferAccessResult;
  }


}

