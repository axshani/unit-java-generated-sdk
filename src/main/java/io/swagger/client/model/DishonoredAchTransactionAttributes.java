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
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * DishonoredAchTransactionAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class DishonoredAchTransactionAttributes {
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

  @SerializedName("description")
  private String description = null;

  @SerializedName("companyName")
  private String companyName = null;

  @SerializedName("counterpartyName")
  private String counterpartyName = null;

  @SerializedName("counterpartyRoutingNumber")
  private String counterpartyRoutingNumber = null;

  @SerializedName("traceNumber")
  private String traceNumber = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("secCode")
  private String secCode = null;

  @SerializedName("tags")
  private Tags tags = null;

  public DishonoredAchTransactionAttributes createdAt(OffsetDateTime createdAt) {
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

  public DishonoredAchTransactionAttributes direction(DirectionEnum direction) {
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

  public DishonoredAchTransactionAttributes amount(Integer amount) {
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

  public DishonoredAchTransactionAttributes balance(Integer balance) {
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

  public DishonoredAchTransactionAttributes summary(String summary) {
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

  public DishonoredAchTransactionAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DishonoredAchTransactionAttributes companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Get companyName
   * @return companyName
  **/
  @Schema(required = true, description = "")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public DishonoredAchTransactionAttributes counterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
    return this;
  }

   /**
   * Get counterpartyName
   * @return counterpartyName
  **/
  @Schema(description = "")
  public String getCounterpartyName() {
    return counterpartyName;
  }

  public void setCounterpartyName(String counterpartyName) {
    this.counterpartyName = counterpartyName;
  }

  public DishonoredAchTransactionAttributes counterpartyRoutingNumber(String counterpartyRoutingNumber) {
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
    return this;
  }

   /**
   * Get counterpartyRoutingNumber
   * @return counterpartyRoutingNumber
  **/
  @Schema(required = true, description = "")
  public String getCounterpartyRoutingNumber() {
    return counterpartyRoutingNumber;
  }

  public void setCounterpartyRoutingNumber(String counterpartyRoutingNumber) {
    this.counterpartyRoutingNumber = counterpartyRoutingNumber;
  }

  public DishonoredAchTransactionAttributes traceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
    return this;
  }

   /**
   * Get traceNumber
   * @return traceNumber
  **/
  @Schema(description = "")
  public String getTraceNumber() {
    return traceNumber;
  }

  public void setTraceNumber(String traceNumber) {
    this.traceNumber = traceNumber;
  }

  public DishonoredAchTransactionAttributes reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public DishonoredAchTransactionAttributes secCode(String secCode) {
    this.secCode = secCode;
    return this;
  }

   /**
   * Get secCode
   * @return secCode
  **/
  @Schema(description = "")
  public String getSecCode() {
    return secCode;
  }

  public void setSecCode(String secCode) {
    this.secCode = secCode;
  }

  public DishonoredAchTransactionAttributes tags(Tags tags) {
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
    DishonoredAchTransactionAttributes dishonoredAchTransactionAttributes = (DishonoredAchTransactionAttributes) o;
    return Objects.equals(this.createdAt, dishonoredAchTransactionAttributes.createdAt) &&
        Objects.equals(this.direction, dishonoredAchTransactionAttributes.direction) &&
        Objects.equals(this.amount, dishonoredAchTransactionAttributes.amount) &&
        Objects.equals(this.balance, dishonoredAchTransactionAttributes.balance) &&
        Objects.equals(this.summary, dishonoredAchTransactionAttributes.summary) &&
        Objects.equals(this.description, dishonoredAchTransactionAttributes.description) &&
        Objects.equals(this.companyName, dishonoredAchTransactionAttributes.companyName) &&
        Objects.equals(this.counterpartyName, dishonoredAchTransactionAttributes.counterpartyName) &&
        Objects.equals(this.counterpartyRoutingNumber, dishonoredAchTransactionAttributes.counterpartyRoutingNumber) &&
        Objects.equals(this.traceNumber, dishonoredAchTransactionAttributes.traceNumber) &&
        Objects.equals(this.reason, dishonoredAchTransactionAttributes.reason) &&
        Objects.equals(this.secCode, dishonoredAchTransactionAttributes.secCode) &&
        Objects.equals(this.tags, dishonoredAchTransactionAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, description, companyName, counterpartyName, counterpartyRoutingNumber, traceNumber, reason, secCode, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DishonoredAchTransactionAttributes {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    counterpartyName: ").append(toIndentedString(counterpartyName)).append("\n");
    sb.append("    counterpartyRoutingNumber: ").append(toIndentedString(counterpartyRoutingNumber)).append("\n");
    sb.append("    traceNumber: ").append(toIndentedString(traceNumber)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    secCode: ").append(toIndentedString(secCode)).append("\n");
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
