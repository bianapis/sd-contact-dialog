package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueQueryBaseWithIds
 */
public class ContactDialogueQueryBaseWithIds   {
  private String contactDialogueRecordReference = null;

  private String contactDialogueQueryTaskReference = null;

  private Object contactRecord = null;

  private Object contactDialogueRecord = null;

  private String queryType = null;

  private String queryStartEndTime = null;

  private String queryResult = null;


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
   * @return contactDialogueQueryTaskReference
  **/

  public String getContactDialogueQueryTaskReference() {
    return contactDialogueQueryTaskReference;
  }

  public void setContactDialogueQueryTaskReference(String contactDialogueQueryTaskReference) {
    this.contactDialogueQueryTaskReference = contactDialogueQueryTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  \"the type of question or answer addressed in the session\" 
   * @return queryType
  **/

  public String getQueryType() {
    return queryType;
  }

  public void setQueryType(String queryType) {
    this.queryType = queryType;
  }


  /**
   * Get queryStartEndTime
   * @return queryStartEndTime
  **/

  public String getQueryStartEndTime() {
    return queryStartEndTime;
  }

  public void setQueryStartEndTime(String queryStartEndTime) {
    this.queryStartEndTime = queryStartEndTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info:  query result 
   * @return queryResult
  **/

  public String getQueryResult() {
    return queryResult;
  }

  public void setQueryResult(String queryResult) {
    this.queryResult = queryResult;
  }


}

