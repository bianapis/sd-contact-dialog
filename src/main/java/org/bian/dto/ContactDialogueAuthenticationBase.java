package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueAuthenticationBase
 */
public class ContactDialogueAuthenticationBase   {
  private Object contactRecord = null;

  private String requestedAuthenticationLevel = null;


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

