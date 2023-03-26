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
import io.swagger.client.model.EvaluationParams;
import io.swagger.client.model.FullName;
import io.swagger.client.model.Phone;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.LocalDate;
/**
 * BeneficialOwner1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class BeneficialOwner1 {
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

  @SerializedName("percentage")
  private Integer percentage = null;

  @SerializedName("evaluationParams")
  private EvaluationParams evaluationParams = null;

  public BeneficialOwner1 fullName(FullName fullName) {
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

  public BeneficialOwner1 email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(required = true, description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BeneficialOwner1 phone(Phone phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @Schema(required = true, description = "")
  public Phone getPhone() {
    return phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }

  public BeneficialOwner1 ssn(String ssn) {
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

  public BeneficialOwner1 passport(String passport) {
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

  public BeneficialOwner1 nationality(String nationality) {
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

  public BeneficialOwner1 matriculaConsular(String matriculaConsular) {
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

  public BeneficialOwner1 address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(required = true, description = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public BeneficialOwner1 dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @Schema(required = true, description = "")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public BeneficialOwner1 percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Get percentage
   * minimum: 0
   * maximum: 100
   * @return percentage
  **/
  @Schema(description = "")
  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  public BeneficialOwner1 evaluationParams(EvaluationParams evaluationParams) {
    this.evaluationParams = evaluationParams;
    return this;
  }

   /**
   * Get evaluationParams
   * @return evaluationParams
  **/
  @Schema(description = "")
  public EvaluationParams getEvaluationParams() {
    return evaluationParams;
  }

  public void setEvaluationParams(EvaluationParams evaluationParams) {
    this.evaluationParams = evaluationParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficialOwner1 beneficialOwner1 = (BeneficialOwner1) o;
    return Objects.equals(this.fullName, beneficialOwner1.fullName) &&
        Objects.equals(this.email, beneficialOwner1.email) &&
        Objects.equals(this.phone, beneficialOwner1.phone) &&
        Objects.equals(this.ssn, beneficialOwner1.ssn) &&
        Objects.equals(this.passport, beneficialOwner1.passport) &&
        Objects.equals(this.nationality, beneficialOwner1.nationality) &&
        Objects.equals(this.matriculaConsular, beneficialOwner1.matriculaConsular) &&
        Objects.equals(this.address, beneficialOwner1.address) &&
        Objects.equals(this.dateOfBirth, beneficialOwner1.dateOfBirth) &&
        Objects.equals(this.percentage, beneficialOwner1.percentage) &&
        Objects.equals(this.evaluationParams, beneficialOwner1.evaluationParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, email, phone, ssn, passport, nationality, matriculaConsular, address, dateOfBirth, percentage, evaluationParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficialOwner1 {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    matriculaConsular: ").append(toIndentedString(matriculaConsular)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    evaluationParams: ").append(toIndentedString(evaluationParams)).append("\n");
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
