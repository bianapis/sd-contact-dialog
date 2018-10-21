package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactDialogueBase
 */
public class ContactDialogueBase   {
  private String contactReference = null;

  private Object contactRecord = null;

  private String customerReference = null;

  private String employeeReference = null;

  private String servicingPositionReference = null;

  private String sessionMechanism = null;

  private String sessionStartEndTime = null;

  private Object contactDialogueRecord = null;

  private String contactDialogueType = null;

  private String contactDialogueScript = null;

  private String contactDialogueLogReference = null;

  private String contactDialogueLog = null;


  /**
   * `status: Provisionally Registered` bian-reference: RepresentativeOfCustomer general-info:  \"the overarching customer contact that includes this dialogue\" 
   * @return contactReference
  **/

  public String getContactReference() {
    return contactReference;
  }

  public void setContactReference(String contactReference) {
    this.contactReference = contactReference;
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
   * `status: Provisionally Registered` bian-reference: RepresentativeOfCustomer.RepresentedCustomer general-info:  \"extracted from Contact Record or provided by customer\" 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerServiceAgent general-info:  \"the servicing resource for assisted customer exchanges\" 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info:  \"the servicing location/desk for assisted customer exchanges\" 
   * @return servicingPositionReference
  **/

  public String getServicingPositionReference() {
    return servicingPositionReference;
  }

  public void setServicingPositionReference(String servicingPositionReference) {
    this.servicingPositionReference = servicingPositionReference;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession(as Session).CommunicationChannel 
   * @return sessionMechanism
  **/

  public String getSessionMechanism() {
    return sessionMechanism;
  }

  public void setSessionMechanism(String sessionMechanism) {
    this.sessionMechanism = sessionMechanism;
  }


  /**
   * Get sessionStartEndTime
   * @return sessionStartEndTime
  **/

  public String getSessionStartEndTime() {
    return sessionStartEndTime;
  }

  public void setSessionStartEndTime(String sessionStartEndTime) {
    this.sessionStartEndTime = sessionStartEndTime;
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
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ContactType general-info:  \"contact dialogue type\" 
   * @return contactDialogueType
  **/

  public String getContactDialogueType() {
    return contactDialogueType;
  }

  public void setContactDialogueType(String contactDialogueType) {
    this.contactDialogueType = contactDialogueType;
  }


  /**
   * `status: Provisionally Registered` bian-reference: CustomerDialogueSystem.CustomerContactSession.ExecutedInteraction.Type.ScriptedAction general-info:  \"a prompt provided to structure the interaction for self-service and assisted interactions\" 
   * @return contactDialogueScript
  **/

  public String getContactDialogueScript() {
    return contactDialogueScript;
  }

  public void setContactDialogueScript(String contactDialogueScript) {
    this.contactDialogueScript = contactDialogueScript;
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
   * @return contactDialogueLog
  **/

  public String getContactDialogueLog() {
    return contactDialogueLog;
  }

  public void setContactDialogueLog(String contactDialogueLog) {
    this.contactDialogueLog = contactDialogueLog;
  }


}

