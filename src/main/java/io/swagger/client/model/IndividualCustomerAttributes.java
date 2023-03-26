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
import io.swagger.client.model.Address;
import io.swagger.client.model.AuthorizedUser;
import io.swagger.client.model.FullName;
import io.swagger.client.model.JwtSubject;
import io.swagger.client.model.Phone;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
/**
 * IndividualCustomerAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class IndividualCustomerAttributes {
  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("fullName")
  private FullName fullName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("phone")
  private Phone phone = null;

  @SerializedName("ssn")
  private String ssn = null;

  @SerializedName("passport")
  private String passport = null;

  @SerializedName("nationality")
  private String nationality = null;

  @SerializedName("matriculaConsular")
  private String matriculaConsular = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @SerializedName("ein")
  private String ein = null;

  @SerializedName("dba")
  private String dba = null;

  @SerializedName("soleProprietorship")
  private Boolean soleProprietorship = false;

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

  @SerializedName("maskedSSN")
  private String maskedSSN = null;

  @SerializedName("maskedPassport")
  private String maskedPassport = null;

  @SerializedName("maskedMatriculaConsular")
  private String maskedMatriculaConsular = null;

  @SerializedName("authorizedUsers")
  private List<AuthorizedUser> authorizedUsers = null;

  @SerializedName("jwtSubject")
  private JwtSubject jwtSubject = null;

  @SerializedName("status")
  private String status = null;

  /**
   * Gets or Sets archiveReason
   */
  @JsonAdapter(ArchiveReasonEnum.Adapter.class)
  public enum ArchiveReasonEnum {
    INACTIVE("Inactive"),
    FRAUDACHACTIVITY("FraudACHActivity"),
    FRAUDCARDACTIVITY("FraudCardActivity"),
    FRAUDCHECKACTIVITY("FraudCheckActivity"),
    FRAUDAPPLICATIONHISTORY("FraudApplicationHistory"),
    FRAUDACCOUNTACTIVITY("FraudAccountActivity"),
    FRAUDCLIENTIDENTIFIED("FraudClientIdentified"),
    FRAUDLINKEDTOFRAUDULENTCUSTOMER("FraudLinkedToFraudulentCustomer");

    private String value;

    ArchiveReasonEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ArchiveReasonEnum fromValue(String input) {
      for (ArchiveReasonEnum b : ArchiveReasonEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ArchiveReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArchiveReasonEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ArchiveReasonEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ArchiveReasonEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("archiveReason")
  private ArchiveReasonEnum archiveReason = null;

  public IndividualCustomerAttributes createdAt(OffsetDateTime createdAt) {
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

  public IndividualCustomerAttributes fullName(FullName fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @Schema(required = true, description = "")
  public FullName getFullName() {
    return fullName;
  }

  public void setFullName(FullName fullName) {
    this.fullName = fullName;
  }

  public IndividualCustomerAttributes email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public IndividualCustomerAttributes phone(Phone phone) {
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

  public IndividualCustomerAttributes ssn(String ssn) {
    this.ssn = ssn;
    return this;
  }

   /**
   * Get ssn
   * @return ssn
  **/
  @Schema(description = "")
  public String getSsn() {
    return ssn;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  public IndividualCustomerAttributes passport(String passport) {
    this.passport = passport;
    return this;
  }

   /**
   * Get passport
   * @return passport
  **/
  @Schema(description = "")
  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  public IndividualCustomerAttributes nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  @Schema(description = "")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public IndividualCustomerAttributes matriculaConsular(String matriculaConsular) {
    this.matriculaConsular = matriculaConsular;
    return this;
  }

   /**
   * Get matriculaConsular
   * @return matriculaConsular
  **/
  @Schema(description = "")
  public String getMatriculaConsular() {
    return matriculaConsular;
  }

  public void setMatriculaConsular(String matriculaConsular) {
    this.matriculaConsular = matriculaConsular;
  }

  public IndividualCustomerAttributes address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public IndividualCustomerAttributes dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @Schema(description = "")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public IndividualCustomerAttributes ein(String ein) {
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

  public IndividualCustomerAttributes dba(String dba) {
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

  public IndividualCustomerAttributes soleProprietorship(Boolean soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
    return this;
  }

   /**
   * Get soleProprietorship
   * @return soleProprietorship
  **/
  @Schema(description = "")
  public Boolean isSoleProprietorship() {
    return soleProprietorship;
  }

  public void setSoleProprietorship(Boolean soleProprietorship) {
    this.soleProprietorship = soleProprietorship;
  }

  public IndividualCustomerAttributes tags(Tags tags) {
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

  public IndividualCustomerAttributes riskRate(RiskRateEnum riskRate) {
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

  public IndividualCustomerAttributes maskedSSN(String maskedSSN) {
    this.maskedSSN = maskedSSN;
    return this;
  }

   /**
   * Get maskedSSN
   * @return maskedSSN
  **/
  @Schema(description = "")
  public String getMaskedSSN() {
    return maskedSSN;
  }

  public void setMaskedSSN(String maskedSSN) {
    this.maskedSSN = maskedSSN;
  }

  public IndividualCustomerAttributes maskedPassport(String maskedPassport) {
    this.maskedPassport = maskedPassport;
    return this;
  }

   /**
   * Get maskedPassport
   * @return maskedPassport
  **/
  @Schema(description = "")
  public String getMaskedPassport() {
    return maskedPassport;
  }

  public void setMaskedPassport(String maskedPassport) {
    this.maskedPassport = maskedPassport;
  }

  public IndividualCustomerAttributes maskedMatriculaConsular(String maskedMatriculaConsular) {
    this.maskedMatriculaConsular = maskedMatriculaConsular;
    return this;
  }

   /**
   * Get maskedMatriculaConsular
   * @return maskedMatriculaConsular
  **/
  @Schema(description = "")
  public String getMaskedMatriculaConsular() {
    return maskedMatriculaConsular;
  }

  public void setMaskedMatriculaConsular(String maskedMatriculaConsular) {
    this.maskedMatriculaConsular = maskedMatriculaConsular;
  }

  public IndividualCustomerAttributes authorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
    return this;
  }

  public IndividualCustomerAttributes addAuthorizedUsersItem(AuthorizedUser authorizedUsersItem) {
    if (this.authorizedUsers == null) {
      this.authorizedUsers = new ArrayList<AuthorizedUser>();
    }
    this.authorizedUsers.add(authorizedUsersItem);
    return this;
  }

   /**
   * Get authorizedUsers
   * @return authorizedUsers
  **/
  @Schema(description = "")
  public List<AuthorizedUser> getAuthorizedUsers() {
    return authorizedUsers;
  }

  public void setAuthorizedUsers(List<AuthorizedUser> authorizedUsers) {
    this.authorizedUsers = authorizedUsers;
  }

  public IndividualCustomerAttributes jwtSubject(JwtSubject jwtSubject) {
    this.jwtSubject = jwtSubject;
    return this;
  }

   /**
   * Get jwtSubject
   * @return jwtSubject
  **/
  @Schema(description = "")
  public JwtSubject getJwtSubject() {
    return jwtSubject;
  }

  public void setJwtSubject(JwtSubject jwtSubject) {
    this.jwtSubject = jwtSubject;
  }

  public IndividualCustomerAttributes status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IndividualCustomerAttributes archiveReason(ArchiveReasonEnum archiveReason) {
    this.archiveReason = archiveReason;
    return this;
  }

   /**
   * Get archiveReason
   * @return archiveReason
  **/
  @Schema(description = "")
  public ArchiveReasonEnum getArchiveReason() {
    return archiveReason;
  }

  public void setArchiveReason(ArchiveReasonEnum archiveReason) {
    this.archiveReason = archiveReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualCustomerAttributes individualCustomerAttributes = (IndividualCustomerAttributes) o;
    return Objects.equals(this.createdAt, individualCustomerAttributes.createdAt) &&
        Objects.equals(this.fullName, individualCustomerAttributes.fullName) &&
        Objects.equals(this.email, individualCustomerAttributes.email) &&
        Objects.equals(this.phone, individualCustomerAttributes.phone) &&
        Objects.equals(this.ssn, individualCustomerAttributes.ssn) &&
        Objects.equals(this.passport, individualCustomerAttributes.passport) &&
        Objects.equals(this.nationality, individualCustomerAttributes.nationality) &&
        Objects.equals(this.matriculaConsular, individualCustomerAttributes.matriculaConsular) &&
        Objects.equals(this.address, individualCustomerAttributes.address) &&
        Objects.equals(this.dateOfBirth, individualCustomerAttributes.dateOfBirth) &&
        Objects.equals(this.ein, individualCustomerAttributes.ein) &&
        Objects.equals(this.dba, individualCustomerAttributes.dba) &&
        Objects.equals(this.soleProprietorship, individualCustomerAttributes.soleProprietorship) &&
        Objects.equals(this.tags, individualCustomerAttributes.tags) &&
        Objects.equals(this.riskRate, individualCustomerAttributes.riskRate) &&
        Objects.equals(this.maskedSSN, individualCustomerAttributes.maskedSSN) &&
        Objects.equals(this.maskedPassport, individualCustomerAttributes.maskedPassport) &&
        Objects.equals(this.maskedMatriculaConsular, individualCustomerAttributes.maskedMatriculaConsular) &&
        Objects.equals(this.authorizedUsers, individualCustomerAttributes.authorizedUsers) &&
        Objects.equals(this.jwtSubject, individualCustomerAttributes.jwtSubject) &&
        Objects.equals(this.status, individualCustomerAttributes.status) &&
        Objects.equals(this.archiveReason, individualCustomerAttributes.archiveReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, fullName, email, phone, ssn, passport, nationality, matriculaConsular, address, dateOfBirth, ein, dba, soleProprietorship, tags, riskRate, maskedSSN, maskedPassport, maskedMatriculaConsular, authorizedUsers, jwtSubject, status, archiveReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualCustomerAttributes {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    ein: ").append(toIndentedString(ein)).append("\n");
    sb.append("    dba: ").append(toIndentedString(dba)).append("\n");
    sb.append("    soleProprietorship: ").append(toIndentedString(soleProprietorship)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    riskRate: ").append(toIndentedString(riskRate)).append("\n");
    sb.append("    maskedSSN: ").append(toIndentedString(maskedSSN)).append("\n");
    sb.append("    maskedPassport: ").append(toIndentedString(maskedPassport)).append("\n");
    sb.append("    maskedMatriculaConsular: ").append(toIndentedString(maskedMatriculaConsular)).append("\n");
    sb.append("    authorizedUsers: ").append(toIndentedString(authorizedUsers)).append("\n");
    sb.append("    jwtSubject: ").append(toIndentedString(jwtSubject)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    archiveReason: ").append(toIndentedString(archiveReason)).append("\n");
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