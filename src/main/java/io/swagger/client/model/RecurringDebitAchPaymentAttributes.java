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
import io.swagger.client.model.Schedule;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * RecurringDebitAchPaymentAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class RecurringDebitAchPaymentAttributes {
  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("addenda")
  private String addenda = null;

  @SerializedName("tags")
  private Tags tags = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("Pending"),
    ACTIVE("Active"),
    COMPLETED("Completed"),
    DISABLED("Disabled");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String input) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("schedule")
  private Schedule schedule = null;

  @SerializedName("numberOfPayments")
  private Integer numberOfPayments = null;

  @SerializedName("verifyCounterpartyBalance")
  private Boolean verifyCounterpartyBalance = false;

  @SerializedName("sameDay")
  private Boolean sameDay = false;

  public RecurringDebitAchPaymentAttributes createdAt(OffsetDateTime createdAt) {
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

  public RecurringDebitAchPaymentAttributes updatedAt(OffsetDateTime updatedAt) {
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

  public RecurringDebitAchPaymentAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * minimum: 1
   * @return amount
  **/
  @Schema(required = true, description = "")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public RecurringDebitAchPaymentAttributes description(String description) {
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

  public RecurringDebitAchPaymentAttributes addenda(String addenda) {
    this.addenda = addenda;
    return this;
  }

   /**
   * Get addenda
   * @return addenda
  **/
  @Schema(description = "")
  public String getAddenda() {
    return addenda;
  }

  public void setAddenda(String addenda) {
    this.addenda = addenda;
  }

  public RecurringDebitAchPaymentAttributes tags(Tags tags) {
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

  public RecurringDebitAchPaymentAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RecurringDebitAchPaymentAttributes schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @Schema(required = true, description = "")
  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public RecurringDebitAchPaymentAttributes numberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
    return this;
  }

   /**
   * Get numberOfPayments
   * @return numberOfPayments
  **/
  @Schema(required = true, description = "")
  public Integer getNumberOfPayments() {
    return numberOfPayments;
  }

  public void setNumberOfPayments(Integer numberOfPayments) {
    this.numberOfPayments = numberOfPayments;
  }

  public RecurringDebitAchPaymentAttributes verifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    this.verifyCounterpartyBalance = verifyCounterpartyBalance;
    return this;
  }

   /**
   * Get verifyCounterpartyBalance
   * @return verifyCounterpartyBalance
  **/
  @Schema(description = "")
  public Boolean isVerifyCounterpartyBalance() {
    return verifyCounterpartyBalance;
  }

  public void setVerifyCounterpartyBalance(Boolean verifyCounterpartyBalance) {
    this.verifyCounterpartyBalance = verifyCounterpartyBalance;
  }

  public RecurringDebitAchPaymentAttributes sameDay(Boolean sameDay) {
    this.sameDay = sameDay;
    return this;
  }

   /**
   * Get sameDay
   * @return sameDay
  **/
  @Schema(description = "")
  public Boolean isSameDay() {
    return sameDay;
  }

  public void setSameDay(Boolean sameDay) {
    this.sameDay = sameDay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDebitAchPaymentAttributes recurringDebitAchPaymentAttributes = (RecurringDebitAchPaymentAttributes) o;
    return Objects.equals(this.createdAt, recurringDebitAchPaymentAttributes.createdAt) &&
        Objects.equals(this.updatedAt, recurringDebitAchPaymentAttributes.updatedAt) &&
        Objects.equals(this.amount, recurringDebitAchPaymentAttributes.amount) &&
        Objects.equals(this.description, recurringDebitAchPaymentAttributes.description) &&
        Objects.equals(this.addenda, recurringDebitAchPaymentAttributes.addenda) &&
        Objects.equals(this.tags, recurringDebitAchPaymentAttributes.tags) &&
        Objects.equals(this.status, recurringDebitAchPaymentAttributes.status) &&
        Objects.equals(this.schedule, recurringDebitAchPaymentAttributes.schedule) &&
        Objects.equals(this.numberOfPayments, recurringDebitAchPaymentAttributes.numberOfPayments) &&
        Objects.equals(this.verifyCounterpartyBalance, recurringDebitAchPaymentAttributes.verifyCounterpartyBalance) &&
        Objects.equals(this.sameDay, recurringDebitAchPaymentAttributes.sameDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, amount, description, addenda, tags, status, schedule, numberOfPayments, verifyCounterpartyBalance, sameDay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDebitAchPaymentAttributes {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addenda: ").append(toIndentedString(addenda)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
    sb.append("    verifyCounterpartyBalance: ").append(toIndentedString(verifyCounterpartyBalance)).append("\n");
    sb.append("    sameDay: ").append(toIndentedString(sameDay)).append("\n");
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
