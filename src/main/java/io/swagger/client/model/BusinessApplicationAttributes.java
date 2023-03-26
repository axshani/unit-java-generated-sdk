/*
 * Unit Python SDK
 * An API for testing openapi-python-client for unit-sdk
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ApplicationStatus;
import io.swagger.client.model.BeneficialOwner;
import io.swagger.client.model.Contact;
import io.swagger.client.model.Industry;
import io.swagger.client.model.Officer;
import io.swagger.client.model.Phone;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
/**
 * BusinessApplicationAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class BusinessApplicationAttributes {
  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  @SerializedName("status")
  private ApplicationStatus status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("evaluationOutcome")
  private String evaluationOutcome = null;

  @SerializedName("evaluationId")
  private String evaluationId = null;

  @SerializedName("evaluationEntityId")
  private String evaluationEntityId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dba")
  private String dba = null;

  @SerializedName("ein")
  private String ein = null;

  /**
   * Gets or Sets entityType
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    CORPORATION("Corporation"),
    LLC("LLC"),
    PARTNERSHIP("Partnership");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EntityTypeEnum fromValue(String input) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EntityTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("entityType")
  private EntityTypeEnum entityType = null;

  @SerializedName("dateOfIncorporation")
  private LocalDate dateOfIncorporation = null;

  @SerializedName("stateOfIncorporation")
  private String stateOfIncorporation = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("phone")
  private Phone phone = null;

  @SerializedName("address")
  private Object address = null;

  @SerializedName("contact")
  private Contact contact = null;

  @SerializedName("officer")
  private Officer officer = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("beneficialOwners")
  private List<BeneficialOwner> beneficialOwners = new ArrayList<BeneficialOwner>();

  /**
   * Gets or Sets decisionMethod
   */
  @JsonAdapter(DecisionMethodEnum.Adapter.class)
  public enum DecisionMethodEnum {
    MANUALLY("Manually"),
    AUTOMATICALLY("Automatically");

    private String value;

    DecisionMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DecisionMethodEnum fromValue(String input) {
      for (DecisionMethodEnum b : DecisionMethodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DecisionMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DecisionMethodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DecisionMethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DecisionMethodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("decisionMethod")
  private DecisionMethodEnum decisionMethod = null;

  @SerializedName("decisionUserId")
  private String decisionUserId = null;

  @SerializedName("decisionReason")
  private String decisionReason = null;

  @SerializedName("decisionDateTime")
  private OffsetDateTime decisionDateTime = null;

  @SerializedName("tags")
  private Tags tags = null;

  /**
   * Gets or Sets riskRate
   */
  @JsonAdapter(RiskRateEnum.Adapter.class)
  public enum RiskRateEnum {
    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    private String value;

    RiskRateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RiskRateEnum fromValue(String input) {
      for (RiskRateEnum b : RiskRateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RiskRateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RiskRateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RiskRateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RiskRateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("riskRate")
  private RiskRateEnum riskRate = null;

  @SerializedName("evaluationFlags")
  private List<String> evaluationFlags = null;

  @SerializedName("ipLocationDetails")
  private Object ipLocationDetails = null;

  @SerializedName("phoneLocationDetails")
  private Object phoneLocationDetails = null;

  @SerializedName("archived")
  private Boolean archived = null;

  @SerializedName("industry")
  private Industry industry = null;

  public BusinessApplicationAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BusinessApplicationAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public BusinessApplicationAttributes status(ApplicationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public ApplicationStatus getStatus() {
    return status;
  }

  public void setStatus(ApplicationStatus status) {
    this.status = status;
  }

  public BusinessApplicationAttributes message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @Schema(description = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BusinessApplicationAttributes evaluationOutcome(String evaluationOutcome) {
    this.evaluationOutcome = evaluationOutcome;
    return this;
  }

   /**
   * Get evaluationOutcome
   * @return evaluationOutcome
  **/
  @Schema(description = "")
  public String getEvaluationOutcome() {
    return evaluationOutcome;
  }

  public void setEvaluationOutcome(String evaluationOutcome) {
    this.evaluationOutcome = evaluationOutcome;
  }

  public BusinessApplicationAttributes evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

   /**
   * Get evaluationId
   * @return evaluationId
  **/
  @Schema(description = "")
  public String getEvaluationId() {
    return evaluationId;
  }

  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }

  public BusinessApplicationAttributes evaluationEntityId(String evaluationEntityId) {
    this.evaluationEntityId = evaluationEntityId;
    return this;
  }

   /**
   * Get evaluationEntityId
   * @return evaluationEntityId
  **/
  @Schema(description = "")
  public String getEvaluationEntityId() {
    return evaluationEntityId;
  }

  public void setEvaluationEntityId(String evaluationEntityId) {
    this.evaluationEntityId = evaluationEntityId;
  }

  public BusinessApplicationAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BusinessApplicationAttributes dba(String dba) {
    this.dba = dba;
    return this;
  }

   /**
   * Get dba
   * @return dba
  **/
  @Schema(description = "")
  public String getDba() {
    return dba;
  }

  public void setDba(String dba) {
    this.dba = dba;
  }

  public BusinessApplicationAttributes ein(String ein) {
    this.ein = ein;
    return this;
  }

   /**
   * Get ein
   * @return ein
  **/
  @Schema(description = "")
  public String getEin() {
    return ein;
  }

  public void setEin(String ein) {
    this.ein = ein;
  }

  public BusinessApplicationAttributes entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @Schema(required = true, description = "")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public BusinessApplicationAttributes dateOfIncorporation(LocalDate dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
    return this;
  }

   /**
   * Get dateOfIncorporation
   * @return dateOfIncorporation
  **/
  @Schema(description = "")
  public LocalDate getDateOfIncorporation() {
    return dateOfIncorporation;
  }

  public void setDateOfIncorporation(LocalDate dateOfIncorporation) {
    this.dateOfIncorporation = dateOfIncorporation;
  }

  public BusinessApplicationAttributes stateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
    return this;
  }

   /**
   * Get stateOfIncorporation
   * @return stateOfIncorporation
  **/
  @Schema(required = true, description = "")
  public String getStateOfIncorporation() {
    return stateOfIncorporation;
  }

  public void setStateOfIncorporation(String stateOfIncorporation) {
    this.stateOfIncorporation = stateOfIncorporation;
  }

  public BusinessApplicationAttributes purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Get purpose
   * @return purpose
  **/
  @Schema(description = "")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public BusinessApplicationAttributes phone(Phone phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(description = "")
  public Phone getPhone() {
    return phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public BusinessApplicationAttributes address(Object address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public Object getAddress() {
    return address;
  }

  public void setAddress(Object address) {
    this.address = address;
  }

  public BusinessApplicationAttributes contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @Schema(required = true, description = "")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public BusinessApplicationAttributes officer(Officer officer) {
    this.officer = officer;
    return this;
  }

   /**
   * Get officer
   * @return officer
  **/
  @Schema(required = true, description = "")
  public Officer getOfficer() {
    return officer;
  }

  public void setOfficer(Officer officer) {
    this.officer = officer;
  }

  public BusinessApplicationAttributes ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public BusinessApplicationAttributes website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @Schema(description = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public BusinessApplicationAttributes beneficialOwners(List<BeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
    return this;
  }

  public BusinessApplicationAttributes addBeneficialOwnersItem(BeneficialOwner beneficialOwnersItem) {
    this.beneficialOwners.add(beneficialOwnersItem);
    return this;
  }

   /**
   * Get beneficialOwners
   * @return beneficialOwners
  **/
  @Schema(required = true, description = "")
  public List<BeneficialOwner> getBeneficialOwners() {
    return beneficialOwners;
  }

  public void setBeneficialOwners(List<BeneficialOwner> beneficialOwners) {
    this.beneficialOwners = beneficialOwners;
  }

  public BusinessApplicationAttributes decisionMethod(DecisionMethodEnum decisionMethod) {
    this.decisionMethod = decisionMethod;
    return this;
  }

   /**
   * Get decisionMethod
   * @return decisionMethod
  **/
  @Schema(description = "")
  public DecisionMethodEnum getDecisionMethod() {
    return decisionMethod;
  }

  public void setDecisionMethod(DecisionMethodEnum decisionMethod) {
    this.decisionMethod = decisionMethod;
  }

  public BusinessApplicationAttributes decisionUserId(String decisionUserId) {
    this.decisionUserId = decisionUserId;
    return this;
  }

   /**
   * Get decisionUserId
   * @return decisionUserId
  **/
  @Schema(description = "")
  public String getDecisionUserId() {
    return decisionUserId;
  }

  public void setDecisionUserId(String decisionUserId) {
    this.decisionUserId = decisionUserId;
  }

  public BusinessApplicationAttributes decisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
    return this;
  }

   /**
   * Get decisionReason
   * @return decisionReason
  **/
  @Schema(description = "")
  public String getDecisionReason() {
    return decisionReason;
  }

  public void setDecisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
  }

  public BusinessApplicationAttributes decisionDateTime(OffsetDateTime decisionDateTime) {
    this.decisionDateTime = decisionDateTime;
    return this;
  }

   /**
   * Get decisionDateTime
   * @return decisionDateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getDecisionDateTime() {
    return decisionDateTime;
  }

  public void setDecisionDateTime(OffsetDateTime decisionDateTime) {
    this.decisionDateTime = decisionDateTime;
  }

  public BusinessApplicationAttributes tags(Tags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public Tags getTags() {
    return tags;
  }

  public void setTags(Tags tags) {
    this.tags = tags;
  }

  public BusinessApplicationAttributes riskRate(RiskRateEnum riskRate) {
    this.riskRate = riskRate;
    return this;
  }

   /**
   * Get riskRate
   * @return riskRate
  **/
  @Schema(description = "")
  public RiskRateEnum getRiskRate() {
    return riskRate;
  }

  public void setRiskRate(RiskRateEnum riskRate) {
    this.riskRate = riskRate;
  }

  public BusinessApplicationAttributes evaluationFlags(List<String> evaluationFlags) {
    this.evaluationFlags = evaluationFlags;
    return this;
  }

  public BusinessApplicationAttributes addEvaluationFlagsItem(String evaluationFlagsItem) {
    if (this.evaluationFlags == null) {
      this.evaluationFlags = new ArrayList<String>();
    }
    this.evaluationFlags.add(evaluationFlagsItem);
    return this;
  }

   /**
   * Get evaluationFlags
   * @return evaluationFlags
  **/
  @Schema(description = "")
  public List<String> getEvaluationFlags() {
    return evaluationFlags;
  }

  public void setEvaluationFlags(List<String> evaluationFlags) {
    this.evaluationFlags = evaluationFlags;
  }

  public BusinessApplicationAttributes ipLocationDetails(Object ipLocationDetails) {
    this.ipLocationDetails = ipLocationDetails;
    return this;
  }

   /**
   * Get ipLocationDetails
   * @return ipLocationDetails
  **/
  @Schema(description = "")
  public Object getIpLocationDetails() {
    return ipLocationDetails;
  }

  public void setIpLocationDetails(Object ipLocationDetails) {
    this.ipLocationDetails = ipLocationDetails;
  }

  public BusinessApplicationAttributes phoneLocationDetails(Object phoneLocationDetails) {
    this.phoneLocationDetails = phoneLocationDetails;
    return this;
  }

   /**
   * Get phoneLocationDetails
   * @return phoneLocationDetails
  **/
  @Schema(description = "")
  public Object getPhoneLocationDetails() {
    return phoneLocationDetails;
  }

  public void setPhoneLocationDetails(Object phoneLocationDetails) {
    this.phoneLocationDetails = phoneLocationDetails;
  }

  public BusinessApplicationAttributes archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Get archived
   * @return archived
  **/
  @Schema(description = "")
  public Boolean isArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public BusinessApplicationAttributes industry(Industry industry) {
    this.industry = industry;
    return this;
  }

   /**
   * Get industry
   * @return industry
  **/
  @Schema(description = "")
  public Industry getIndustry() {
    return industry;
  }

  public void setIndustry(Industry industry) {
    this.industry = industry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessApplicationAttributes businessApplicationAttributes = (BusinessApplicationAttributes) o;
    return Objects.equals(this.createdAt, businessApplicationAttributes.createdAt) &&
        Objects.equals(this.updatedAt, businessApplicationAttributes.updatedAt) &&
        Objects.equals(this.status, businessApplicationAttributes.status) &&
        Objects.equals(this.message, businessApplicationAttributes.message) &&
        Objects.equals(this.evaluationOutcome, businessApplicationAttributes.evaluationOutcome) &&
        Objects.equals(this.evaluationId, businessApplicationAttributes.evaluationId) &&
        Objects.equals(this.evaluationEntityId, businessApplicationAttributes.evaluationEntityId) &&
        Objects.equals(this.name, businessApplicationAttributes.name) &&
        Objects.equals(this.dba, businessApplicationAttributes.dba) &&
        Objects.equals(this.ein, businessApplicationAttributes.ein) &&
        Objects.equals(this.entityType, businessApplicationAttributes.entityType) &&
        Objects.equals(this.dateOfIncorporation, businessApplicationAttributes.dateOfIncorporation) &&
        Objects.equals(this.stateOfIncorporation, businessApplicationAttributes.stateOfIncorporation) &&
        Objects.equals(this.purpose, businessApplicationAttributes.purpose) &&
        Objects.equals(this.phone, businessApplicationAttributes.phone) &&
        Objects.equals(this.address, businessApplicationAttributes.address) &&
        Objects.equals(this.contact, businessApplicationAttributes.contact) &&
        Objects.equals(this.officer, businessApplicationAttributes.officer) &&
        Objects.equals(this.ip, businessApplicationAttributes.ip) &&
        Objects.equals(this.website, businessApplicationAttributes.website) &&
        Objects.equals(this.beneficialOwners, businessApplicationAttributes.beneficialOwners) &&
        Objects.equals(this.decisionMethod, businessApplicationAttributes.decisionMethod) &&
        Objects.equals(this.decisionUserId, businessApplicationAttributes.decisionUserId) &&
        Objects.equals(this.decisionReason, businessApplicationAttributes.decisionReason) &&
        Objects.equals(this.decisionDateTime, businessApplicationAttributes.decisionDateTime) &&
        Objects.equals(this.tags, businessApplicationAttributes.tags) &&
        Objects.equals(this.riskRate, businessApplicationAttributes.riskRate) &&
        Objects.equals(this.evaluationFlags, businessApplicationAttributes.evaluationFlags) &&
        Objects.equals(this.ipLocationDetails, businessApplicationAttributes.ipLocationDetails) &&
        Objects.equals(this.phoneLocationDetails, businessApplicationAttributes.phoneLocationDetails) &&
        Objects.equals(this.archived, businessApplicationAttributes.archived) &&
        Objects.equals(this.industry, businessApplicationAttributes.industry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, status, message, evaluationOutcome, evaluationId, evaluationEntityId, name, dba, ein, entityType, dateOfIncorporation, stateOfIncorporation, purpose, phone, address, contact, officer, ip, website, beneficialOwners, decisionMethod, decisionUserId, decisionReason, decisionDateTime, tags, riskRate, evaluationFlags, ipLocationDetails, phoneLocationDetails, archived, industry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessApplicationAttributes {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    evaluationOutcome: ").append(toIndentedString(evaluationOutcome)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluationEntityId: ").append(toIndentedString(evaluationEntityId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    dateOfIncorporation: ").append(toIndentedString(dateOfIncorporation)).append("\n");
    sb.append("    stateOfIncorporation: ").append(toIndentedString(stateOfIncorporation)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    officer: ").append(toIndentedString(officer)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    beneficialOwners: ").append(toIndentedString(beneficialOwners)).append("\n");
    sb.append("    decisionMethod: ").append(toIndentedString(decisionMethod)).append("\n");
    sb.append("    decisionUserId: ").append(toIndentedString(decisionUserId)).append("\n");
    sb.append("    decisionReason: ").append(toIndentedString(decisionReason)).append("\n");
    sb.append("    decisionDateTime: ").append(toIndentedString(decisionDateTime)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    riskRate: ").append(toIndentedString(riskRate)).append("\n");
    sb.append("    evaluationFlags: ").append(toIndentedString(evaluationFlags)).append("\n");
    sb.append("    ipLocationDetails: ").append(toIndentedString(ipLocationDetails)).append("\n");
    sb.append("    phoneLocationDetails: ").append(toIndentedString(phoneLocationDetails)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}