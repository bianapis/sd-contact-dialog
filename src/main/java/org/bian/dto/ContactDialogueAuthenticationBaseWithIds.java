package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueAuthenticationBaseWithIds
 */
public class ContactDialogueAuthenticationBaseWithIds   {
  private String contactDialogueRecordReference = null;

  private String contactDialogueAuthenticationTaskReference = null;

  private Object contactRecord = null;

  private String requestedAuthenticationLevel = null;


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
   * @return contactDialogueAuthenticationTaskReference
  **/

  public String getContactDialogueAuthenticationTaskReference() {
    return contactDialogueAuthenticationTaskReference;
  }

  public void setContactDialogueAuthenticationTaskReference(String contactDialogueAuthenticationTaskReference) {
    this.contactDialogueAuthenticationTaskReference = contactDialogueAuthenticationTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  \"orchestrates increased authentication on request\" 
   * @return requestedAuthenticationLevel
  **/

  public String getRequestedAuthenticationLevel() {
    return requestedAuthenticationLevel;
  }

  public void setRequestedAuthenticationLevel(String requestedAuthenticationLevel) {
    this.requestedAuthenticationLevel = requestedAuthenticationLevel;
  }


}

