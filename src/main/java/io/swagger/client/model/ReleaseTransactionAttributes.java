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
import io.swagger.client.model.Counterparty;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * ReleaseTransactionAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class ReleaseTransactionAttributes {
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

  @SerializedName("senderName")
  private String senderName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("senderAccountNumber")
  private String senderAccountNumber = null;

  @SerializedName("senderAddress")
  private Address senderAddress = null;

  @SerializedName("counterparty")
  private Counterparty counterparty = null;

  @SerializedName("tags")
  private Tags tags = null;

  public ReleaseTransactionAttributes createdAt(OffsetDateTime createdAt) {
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

  public ReleaseTransactionAttributes direction(DirectionEnum direction) {
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

  public ReleaseTransactionAttributes amount(Integer amount) {
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

  public ReleaseTransactionAttributes balance(Integer balance) {
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

  public ReleaseTransactionAttributes summary(String summary) {
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

  public ReleaseTransactionAttributes senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Get senderName
   * @return senderName
  **/
  @Schema(description = "")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public ReleaseTransactionAttributes description(String description) {
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

  public ReleaseTransactionAttributes senderAccountNumber(String senderAccountNumber) {
    this.senderAccountNumber = senderAccountNumber;
    return this;
  }

   /**
   * Get senderAccountNumber
   * @return senderAccountNumber
  **/
  @Schema(description = "")
  public String getSenderAccountNumber() {
    return senderAccountNumber;
  }

  public void setSenderAccountNumber(String senderAccountNumber) {
    this.senderAccountNumber = senderAccountNumber;
  }

  public ReleaseTransactionAttributes senderAddress(Address senderAddress) {
    this.senderAddress = senderAddress;
    return this;
  }

   /**
   * Get senderAddress
   * @return senderAddress
  **/
  @Schema(description = "")
  public Address getSenderAddress() {
    return senderAddress;
  }

  public void setSenderAddress(Address senderAddress) {
    this.senderAddress = senderAddress;
  }

  public ReleaseTransactionAttributes counterparty(Counterparty counterparty) {
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

  public ReleaseTransactionAttributes tags(Tags tags) {
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
    ReleaseTransactionAttributes releaseTransactionAttributes = (ReleaseTransactionAttributes) o;
    return Objects.equals(this.createdAt, releaseTransactionAttributes.createdAt) &&
        Objects.equals(this.direction, releaseTransactionAttributes.direction) &&
        Objects.equals(this.amount, releaseTransactionAttributes.amount) &&
        Objects.equals(this.balance, releaseTransactionAttributes.balance) &&
        Objects.equals(this.summary, releaseTransactionAttributes.summary) &&
        Objects.equals(this.senderName, releaseTransactionAttributes.senderName) &&
        Objects.equals(this.description, releaseTransactionAttributes.description) &&
        Objects.equals(this.senderAccountNumber, releaseTransactionAttributes.senderAccountNumber) &&
        Objects.equals(this.senderAddress, releaseTransactionAttributes.senderAddress) &&
        Objects.equals(this.counterparty, releaseTransactionAttributes.counterparty) &&
        Objects.equals(this.tags, releaseTransactionAttributes.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, direction, amount, balance, summary, senderName, description, senderAccountNumber, senderAddress, counterparty, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTransactionAttributes {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    senderAccountNumber: ").append(toIndentedString(senderAccountNumber)).append("\n");
    sb.append("    senderAddress: ").append(toIndentedString(senderAddress)).append("\n");
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
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
