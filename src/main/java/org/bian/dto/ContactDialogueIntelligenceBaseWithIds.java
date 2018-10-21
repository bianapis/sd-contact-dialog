package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueIntelligenceBaseWithIds
 */
public class ContactDialogueIntelligenceBaseWithIds   {
  private String contactDialogueRecordReference = null;

  private String contactDialogueIntelligenceTaskReference = null;

  private String customerReference = null;

  private String contactReference = null;

  private Object contactDialogueRecord = null;

  private String contactDialogueLogReference = null;

  private String customerInsightType = null;

  private String customerInsight = null;


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
   * @return contactDialogueIntelligenceTaskReference
  **/

  public String getContactDialogueIntelligenceTaskReference() {
    return contactDialogueIntelligenceTaskReference;
  }

  public void setContactDialogueIntelligenceTaskReference(String contactDialogueIntelligenceTaskReference) {
    this.contactDialogueIntelligenceTaskReference = contactDialogueIntelligenceTaskReference;
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
   * `status: Provisionally Registered` bian-reference: RepresentativeOfCustomer general-info:  \"all details relating to the contact where the insight obtained\" 
   * @return contactReference
  **/

  public String getContactReference() {
    return contactReference;
  }

  public void setContactReference(String contactReference) {
    this.contactReference = contactReference;
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
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction 
   * @return contactDialogueLogReference
  **/

  public String getContactDialogueLogReference() {
    return contactDialogueLogReference;
  }

  public void setContactDialogueLogReference(String contactDialogueLogReference) {
    this.contactDialogueLogReference = contactDialogueLogReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerInsightType
  **/

  public String getCustomerInsightType() {
    return customerInsightType;
  }

  public void setCustomerInsightType(String customerInsightType) {
    this.customerInsightType = customerInsightType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  \"description of insight\" 
   * @return customerInsight
  **/

  public String getCustomerInsight() {
    return customerInsight;
  }

  public void setCustomerInsight(String customerInsight) {
    this.customerInsight = customerInsight;
  }


}

