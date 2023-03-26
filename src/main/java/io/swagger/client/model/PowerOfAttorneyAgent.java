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
import io.swagger.client.model.FullName;
import io.swagger.client.model.Phone;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
/**
 * PowerOfAttorneyAgent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class PowerOfAttorneyAgent {
  @SerializedName("status")
  private String status = null;

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
  private Object address = null;

  @SerializedName("dateOfBirth")
  private LocalDate dateOfBirth = null;

  @SerializedName("evaluationId")
  private String evaluationId = null;

  @SerializedName("evaluationFlags")
  private List<String> evaluationFlags = null;

  @SerializedName("maskedSSN")
  private String maskedSSN = null;

  @SerializedName("maskedPassport")
  private String maskedPassport = null;

  @SerializedName("maskedMatriculaConsular")
  private String maskedMatriculaConsular = null;

  @SerializedName("idTheftScore")
  private Integer idTheftScore = null;

  public PowerOfAttorneyAgent status(String status) {
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

  public PowerOfAttorneyAgent fullName(FullName fullName) {
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

  public PowerOfAttorneyAgent email(String email) {
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

  public PowerOfAttorneyAgent phone(Phone phone) {
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

  public PowerOfAttorneyAgent ssn(String ssn) {
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

  public PowerOfAttorneyAgent passport(String passport) {
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

  public PowerOfAttorneyAgent nationality(String nationality) {
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

  public PowerOfAttorneyAgent matriculaConsular(String matriculaConsular) {
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

  public PowerOfAttorneyAgent address(Object address) {
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

  public PowerOfAttorneyAgent dateOfBirth(LocalDate dateOfBirth) {
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

  public PowerOfAttorneyAgent evaluationId(String evaluationId) {
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

  public PowerOfAttorneyAgent evaluationFlags(List<String> evaluationFlags) {
    this.evaluationFlags = evaluationFlags;
    return this;
  }

  public PowerOfAttorneyAgent addEvaluationFlagsItem(String evaluationFlagsItem) {
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

  public PowerOfAttorneyAgent maskedSSN(String maskedSSN) {
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

  public PowerOfAttorneyAgent maskedPassport(String maskedPassport) {
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

  public PowerOfAttorneyAgent maskedMatriculaConsular(String maskedMatriculaConsular) {
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

  public PowerOfAttorneyAgent idTheftScore(Integer idTheftScore) {
    this.idTheftScore = idTheftScore;
    return this;
  }

   /**
   * Get idTheftScore
   * @return idTheftScore
  **/
  @Schema(description = "")
  public Integer getIdTheftScore() {
    return idTheftScore;
  }

  public void setIdTheftScore(Integer idTheftScore) {
    this.idTheftScore = idTheftScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PowerOfAttorneyAgent powerOfAttorneyAgent = (PowerOfAttorneyAgent) o;
    return Objects.equals(this.status, powerOfAttorneyAgent.status) &&
        Objects.equals(this.fullName, powerOfAttorneyAgent.fullName) &&
        Objects.equals(this.email, powerOfAttorneyAgent.email) &&
        Objects.equals(this.phone, powerOfAttorneyAgent.phone) &&
        Objects.equals(this.ssn, powerOfAttorneyAgent.ssn) &&
        Objects.equals(this.passport, powerOfAttorneyAgent.passport) &&
        Objects.equals(this.nationality, powerOfAttorneyAgent.nationality) &&
        Objects.equals(this.matriculaConsular, powerOfAttorneyAgent.matriculaConsular) &&
        Objects.equals(this.address, powerOfAttorneyAgent.address) &&
        Objects.equals(this.dateOfBirth, powerOfAttorneyAgent.dateOfBirth) &&
        Objects.equals(this.evaluationId, powerOfAttorneyAgent.evaluationId) &&
        Objects.equals(this.evaluationFlags, powerOfAttorneyAgent.evaluationFlags) &&
        Objects.equals(this.maskedSSN, powerOfAttorneyAgent.maskedSSN) &&
        Objects.equals(this.maskedPassport, powerOfAttorneyAgent.maskedPassport) &&
        Objects.equals(this.maskedMatriculaConsular, powerOfAttorneyAgent.maskedMatriculaConsular) &&
        Objects.equals(this.idTheftScore, powerOfAttorneyAgent.idTheftScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, fullName, email, phone, ssn, passport, nationality, matriculaConsular, address, dateOfBirth, evaluationId, evaluationFlags, maskedSSN, maskedPassport, maskedMatriculaConsular, idTheftScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PowerOfAttorneyAgent {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluationFlags: ").append(toIndentedString(evaluationFlags)).append("\n");
    sb.append("    maskedSSN: ").append(toIndentedString(maskedSSN)).append("\n");
    sb.append("    maskedPassport: ").append(toIndentedString(maskedPassport)).append("\n");
    sb.append("    maskedMatriculaConsular: ").append(toIndentedString(maskedMatriculaConsular)).append("\n");
    sb.append("    idTheftScore: ").append(toIndentedString(idTheftScore)).append("\n");
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
