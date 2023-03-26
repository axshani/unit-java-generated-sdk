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
import io.swagger.client.model.Counterparty;
import io.swagger.client.model.Tags;
import io.swagger.client.model.WirePaymentAttributesImadOmad;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * WireTransactionAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class WireTransactionAttributes {
  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  /**
   * Gets or Sets direction
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    CREDIT("Credit"),
    DEBIT("Debit");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DirectionEnum fromValue(String input) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DirectionEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("direction")
  private DirectionEnum direction = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("balance")
  private Integer balance = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("counterparty")
  private Counterparty counterparty = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("senderReference")
  private String senderReference = null;

  @SerializedName("referenceForBeneficiary")
  private String referenceForBeneficiary = null;

  @SerializedName("originatorToBeneficiaryInformation")
  private String originatorToBeneficiaryInformation = null;

  @SerializedName("beneficiaryInformation")
  private String beneficiaryInformation = null;

  @SerializedName("beneficiaryAdviceInformation")
  private String beneficiaryAdviceInformation = null;

  @SerializedName("imadOmad")
  private WirePaymentAttributesImadOmad imadOmad = null;

  @SerializedName("tags")
  private Tags tags = null;

  public WireTransactionAttributes createdAt(OffsetDateTime createdAt) {
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

  public WireTransactionAttributes direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @Schema(required = true, description = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public WireTransactionAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(required = true, description = "")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public WireTransactionAttributes balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @Schema(required = true, description = "")
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public WireTransactionAttributes summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @Schema(required = true, description = "")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public WireTransactionAttributes counterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * Get counterparty
   * @return counterparty
  **/
  @Schema(required = true, description = "")
  public Counterparty getCounterparty() {
    return counterparty;
  }

  public void setCounterparty(Counterparty counterparty) {
    this.counterparty = counterparty;
  }

  public WireTransactionAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WireTransactionAttributes senderReference(String senderReference) {
    this.senderReference = senderReference;
    return this;
  }

   /**
   * Get senderReference
   * @return senderReference
  **/
  @Schema(description = "")
  public String getSenderReference() {
    return senderReference;
  }

  public void setSenderReference(String senderReference) {
    this.senderReference = senderReference;
  }

  public WireTransactionAttributes referenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
    return this;
  }

   /**
   * Get referenceForBeneficiary
   * @return referenceForBeneficiary
  **/
  @Schema(description = "")
  public String getReferenceForBeneficiary() {
    return referenceForBeneficiary;
  }

  public void setReferenceForBeneficiary(String referenceForBeneficiary) {
    this.referenceForBeneficiary = referenceForBeneficiary;
  }

  public WireTransactionAttributes originatorToBeneficiaryInformation(String originatorToBeneficiaryInformation) {
    this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation;
    return this;
  }

   /**
   * Get originatorToBeneficiaryInformation
   * @return originatorToBeneficiaryInformation
  **/
  @Schema(description = "")
  public String getOriginatorToBeneficiaryInformation() {
    return originatorToBeneficiaryInformation;
  }

  public void setOriginatorToBeneficiaryInformation(String originatorToBeneficiaryInformation) {
    this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation;
  }

  public WireTransactionAttributes beneficiaryInformation(String beneficiaryInformation) {
    this.beneficiaryInformation = beneficiaryInformation;
    return this;
  }

   /**
   * Get beneficiaryInformation
   * @return beneficiaryInformation
  **/
  @Schema(description = "")
  public String getBeneficiaryInformation() {
    return beneficiaryInformation;
  }

  public void setBeneficiaryInformation(String beneficiaryInformation) {
    this.beneficiaryInformation = beneficiaryInformation;
  }

  public WireTransactionAttributes beneficiaryAdviceInformation(String beneficiaryAdviceInformation) {
    this.beneficiaryAdviceInformation = beneficiaryAdviceInformation;
    return this;
  }

   /**
   * Get beneficiaryAdviceInformation
   * @return beneficiaryAdviceInformation
  **/
  @Schema(description = "")
  public String getBeneficiaryAdviceInformation() {
    return beneficiaryAdviceInformation;
  }

  public void setBeneficiaryAdviceInformation(String beneficiaryAdviceInformation) {
    this.beneficiaryAdviceInformation = beneficiaryAdviceInformation;
  }

  public WireTransactionAttributes imadOmad(WirePaymentAttributesImadOmad imadOmad) {
    this.imadOmad = imadOmad;
    return this;
  }

   /**
   * Get imadOmad
   * @return imadOmad
  **/
  @Schema(description = "")
  public WirePaymentAttributesImadOmad getImadOmad() {
    return imadOmad;
  }

  public void setImadOmad(WirePaymentAttributesImadOmad imadOmad) {
    this.imadOmad = imadOmad;
  }

  public WireTransactionAttributes tags(Tags tags) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WireTransactionAttributes wireTransactionAttributes = (WireTransactionAttributes) o;
    return Objects.equals(this.createdAt, wireTransactionAttributes.createdAt) &&
        Objects.equals(this.direction, wireTransactionAttributes.direction) &&
        Objects.equals(this.amount, wireTransactionAttributes.amount) &&
        Objects.equals(this.balance, wireTransactionAttributes.balance) &&
        Objects.equals(this.summary, wireTransactionAttributes.summary) &&
        Objects.equals(this.counterparty, wireTransactionAttributes.counterparty) &&
        Objects.equals(this.description, wireTransactionAttributes.description) &&
        Objects.equals(this.senderReference, wireTransactionAttributes.senderReference) &&
        Objects.equals(this.referenceForBeneficiary, wireTransactionAttributes.referenceForBeneficiary) &&
        Objects.equals(this.originatorToBeneficiaryInformation, wireTransactionAttributes.originatorToBeneficiaryInformation) &&
        Objects.equals(this.beneficiaryInformation, wireTransactionAttributes.beneficiaryInformation) &&
        Objects.equals(this.beneficiaryAdviceInformation, wireTransactionAttributes.beneficiaryAdviceInformation) &&
        Objects.equals(this.imadOmad, wireTransactionAttributes.imadOmad) &&
        Objects.equals(this.tags, wireTransactionAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, counterparty, description, senderReference, referenceForBeneficiary, originatorToBeneficiaryInformation, beneficiaryInformation, beneficiaryAdviceInformation, imadOmad, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WireTransactionAttributes {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    senderReference: ").append(toIndentedString(senderReference)).append("\n");
    sb.append("    referenceForBeneficiary: ").append(toIndentedString(referenceForBeneficiary)).append("\n");
    sb.append("    originatorToBeneficiaryInformation: ").append(toIndentedString(originatorToBeneficiaryInformation)).append("\n");
    sb.append("    beneficiaryInformation: ").append(toIndentedString(beneficiaryInformation)).append("\n");
    sb.append("    beneficiaryAdviceInformation: ").append(toIndentedString(beneficiaryAdviceInformation)).append("\n");
    sb.append("    imadOmad: ").append(toIndentedString(imadOmad)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
