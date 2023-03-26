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
import io.swagger.client.model.ApplicationFormAdditionalDisclosures;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SettingsOverride
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class SettingsOverride {
  @SerializedName("redirectUrl")
  private String redirectUrl = null;

  @SerializedName("privacyPolicyUrl")
  private String privacyPolicyUrl = null;

  @SerializedName("electronicDisclosuresUrl")
  private String electronicDisclosuresUrl = null;

  @SerializedName("depositTermsUrl")
  private String depositTermsUrl = null;

  @SerializedName("clientTermsUrl")
  private String clientTermsUrl = null;

  @SerializedName("cardholderTermsUrl")
  private String cardholderTermsUrl = null;

  @SerializedName("cashAdvancedTermsUrl")
  private String cashAdvancedTermsUrl = null;

  @SerializedName("debitCardDisclosureUrl")
  private String debitCardDisclosureUrl = null;

  @SerializedName("additionalDisclosures")
  private ApplicationFormAdditionalDisclosures additionalDisclosures = null;

  @SerializedName("validatePhoneNumber")
  private Boolean validatePhoneNumber = null;

  public SettingsOverride redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  @Schema(description = "")
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public SettingsOverride privacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
    return this;
  }

   /**
   * Get privacyPolicyUrl
   * @return privacyPolicyUrl
  **/
  @Schema(description = "")
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  public SettingsOverride electronicDisclosuresUrl(String electronicDisclosuresUrl) {
    this.electronicDisclosuresUrl = electronicDisclosuresUrl;
    return this;
  }

   /**
   * Get electronicDisclosuresUrl
   * @return electronicDisclosuresUrl
  **/
  @Schema(description = "")
  public String getElectronicDisclosuresUrl() {
    return electronicDisclosuresUrl;
  }

  public void setElectronicDisclosuresUrl(String electronicDisclosuresUrl) {
    this.electronicDisclosuresUrl = electronicDisclosuresUrl;
  }

  public SettingsOverride depositTermsUrl(String depositTermsUrl) {
    this.depositTermsUrl = depositTermsUrl;
    return this;
  }

   /**
   * Get depositTermsUrl
   * @return depositTermsUrl
  **/
  @Schema(description = "")
  public String getDepositTermsUrl() {
    return depositTermsUrl;
  }

  public void setDepositTermsUrl(String depositTermsUrl) {
    this.depositTermsUrl = depositTermsUrl;
  }

  public SettingsOverride clientTermsUrl(String clientTermsUrl) {
    this.clientTermsUrl = clientTermsUrl;
    return this;
  }

   /**
   * Get clientTermsUrl
   * @return clientTermsUrl
  **/
  @Schema(description = "")
  public String getClientTermsUrl() {
    return clientTermsUrl;
  }

  public void setClientTermsUrl(String clientTermsUrl) {
    this.clientTermsUrl = clientTermsUrl;
  }

  public SettingsOverride cardholderTermsUrl(String cardholderTermsUrl) {
    this.cardholderTermsUrl = cardholderTermsUrl;
    return this;
  }

   /**
   * Get cardholderTermsUrl
   * @return cardholderTermsUrl
  **/
  @Schema(description = "")
  public String getCardholderTermsUrl() {
    return cardholderTermsUrl;
  }

  public void setCardholderTermsUrl(String cardholderTermsUrl) {
    this.cardholderTermsUrl = cardholderTermsUrl;
  }

  public SettingsOverride cashAdvancedTermsUrl(String cashAdvancedTermsUrl) {
    this.cashAdvancedTermsUrl = cashAdvancedTermsUrl;
    return this;
  }

   /**
   * Get cashAdvancedTermsUrl
   * @return cashAdvancedTermsUrl
  **/
  @Schema(description = "")
  public String getCashAdvancedTermsUrl() {
    return cashAdvancedTermsUrl;
  }

  public void setCashAdvancedTermsUrl(String cashAdvancedTermsUrl) {
    this.cashAdvancedTermsUrl = cashAdvancedTermsUrl;
  }

  public SettingsOverride debitCardDisclosureUrl(String debitCardDisclosureUrl) {
    this.debitCardDisclosureUrl = debitCardDisclosureUrl;
    return this;
  }

   /**
   * Get debitCardDisclosureUrl
   * @return debitCardDisclosureUrl
  **/
  @Schema(description = "")
  public String getDebitCardDisclosureUrl() {
    return debitCardDisclosureUrl;
  }

  public void setDebitCardDisclosureUrl(String debitCardDisclosureUrl) {
    this.debitCardDisclosureUrl = debitCardDisclosureUrl;
  }

  public SettingsOverride additionalDisclosures(ApplicationFormAdditionalDisclosures additionalDisclosures) {
    this.additionalDisclosures = additionalDisclosures;
    return this;
  }

   /**
   * Get additionalDisclosures
   * @return additionalDisclosures
  **/
  @Schema(description = "")
  public ApplicationFormAdditionalDisclosures getAdditionalDisclosures() {
    return additionalDisclosures;
  }

  public void setAdditionalDisclosures(ApplicationFormAdditionalDisclosures additionalDisclosures) {
    this.additionalDisclosures = additionalDisclosures;
  }

  public SettingsOverride validatePhoneNumber(Boolean validatePhoneNumber) {
    this.validatePhoneNumber = validatePhoneNumber;
    return this;
  }

   /**
   * Get validatePhoneNumber
   * @return validatePhoneNumber
  **/
  @Schema(description = "")
  public Boolean getValidatePhoneNumber() {
    return validatePhoneNumber;
  }

  public void setValidatePhoneNumber(Boolean validatePhoneNumber) {
    this.validatePhoneNumber = validatePhoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsOverride settingsOverride = (SettingsOverride) o;
    return Objects.equals(this.redirectUrl, settingsOverride.redirectUrl) &&
        Objects.equals(this.privacyPolicyUrl, settingsOverride.privacyPolicyUrl) &&
        Objects.equals(this.electronicDisclosuresUrl, settingsOverride.electronicDisclosuresUrl) &&
        Objects.equals(this.depositTermsUrl, settingsOverride.depositTermsUrl) &&
        Objects.equals(this.clientTermsUrl, settingsOverride.clientTermsUrl) &&
        Objects.equals(this.cardholderTermsUrl, settingsOverride.cardholderTermsUrl) &&
        Objects.equals(this.cashAdvancedTermsUrl, settingsOverride.cashAdvancedTermsUrl) &&
        Objects.equals(this.debitCardDisclosureUrl, settingsOverride.debitCardDisclosureUrl) &&
        Objects.equals(this.additionalDisclosures, settingsOverride.additionalDisclosures) &&
        Objects.equals(this.validatePhoneNumber, settingsOverride.validatePhoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectUrl, privacyPolicyUrl, electronicDisclosuresUrl, depositTermsUrl, clientTermsUrl, cardholderTermsUrl, cashAdvancedTermsUrl, debitCardDisclosureUrl, additionalDisclosures, validatePhoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsOverride {\n");
    
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
    sb.append("    electronicDisclosuresUrl: ").append(toIndentedString(electronicDisclosuresUrl)).append("\n");
    sb.append("    depositTermsUrl: ").append(toIndentedString(depositTermsUrl)).append("\n");
    sb.append("    clientTermsUrl: ").append(toIndentedString(clientTermsUrl)).append("\n");
    sb.append("    cardholderTermsUrl: ").append(toIndentedString(cardholderTermsUrl)).append("\n");
    sb.append("    cashAdvancedTermsUrl: ").append(toIndentedString(cashAdvancedTermsUrl)).append("\n");
    sb.append("    debitCardDisclosureUrl: ").append(toIndentedString(debitCardDisclosureUrl)).append("\n");
    sb.append("    additionalDisclosures: ").append(toIndentedString(additionalDisclosures)).append("\n");
    sb.append("    validatePhoneNumber: ").append(toIndentedString(validatePhoneNumber)).append("\n");
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
