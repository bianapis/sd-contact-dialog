package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueSalesBaseWithIds
 */
public class ContactDialogueSalesBaseWithIds   {
  private String contactDialogueRecordReference = null;

  private String contactDialogueSalesTaskReference = null;

  private Object contactRecord = null;

  private Object contactDialogueRecord = null;

  private String productServiceReference = null;

  private String productServiceSalesMaterial = null;

  private String leadOpportunityReference = null;

  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String leadOpportunityDescription = null;

  private String dateTime = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactDialogueSalesTaskReference
  **/

  public String getContactDialogueSalesTaskReference() {
    return contactDialogueSalesTaskReference;
  }

  public void setContactDialogueSalesTaskReference(String contactDialogueSalesTaskReference) {
    this.contactDialogueSalesTaskReference = contactDialogueSalesTaskReference;
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
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.SalesLead.ProductToSell general-info:  \"type of product or service being offered\" 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  \"descriptive materials or brochures\" 
   * @return productServiceSalesMaterial
  **/

  public String getProductServiceSalesMaterial() {
    return productServiceSalesMaterial;
  }

  public void setProductServiceSalesMaterial(String productServiceSalesMaterial) {
    this.productServiceSalesMaterial = productServiceSalesMaterial;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.SalesLead 
   * @return leadOpportunityReference
  **/

  public String getLeadOpportunityReference() {
    return leadOpportunityReference;
  }

  public void setLeadOpportunityReference(String leadOpportunityReference) {
    this.leadOpportunityReference = leadOpportunityReference;
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
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.CustomerServiceAgent(as RepresentativeOfficer).BusinessUnit general-info:  \"used for commissions if applicable\" 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.SalesLead.Description general-info:  \"narrative or description of opportunity\" 
   * @return leadOpportunityDescription
  **/

  public String getLeadOpportunityDescription() {
    return leadOpportunityDescription;
  }

  public void setLeadOpportunityDescription(String leadOpportunityDescription) {
    this.leadOpportunityDescription = leadOpportunityDescription;
  }


  /**
   * Get dateTime
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }


}

