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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.LocalDate;
/**
 * Schedule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class Schedule {
  @SerializedName("startTime")
  private LocalDate startTime = null;

  @SerializedName("endTime")
  private LocalDate endTime = null;

  /**
   * Gets or Sets interval
   */
  @JsonAdapter(IntervalEnum.Adapter.class)
  public enum IntervalEnum {
    MONTHLY("Monthly");

    private String value;

    IntervalEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static IntervalEnum fromValue(String input) {
      for (IntervalEnum b : IntervalEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<IntervalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final IntervalEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public IntervalEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return IntervalEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("interval")
  private IntervalEnum interval = null;

  @SerializedName("dayOfMonth")
  private Integer dayOfMonth = null;

  @SerializedName("nextScheduledAction")
  private LocalDate nextScheduledAction = null;

  @SerializedName("totalNumberOfPayments")
  private Integer totalNumberOfPayments = null;

  public Schedule startTime(LocalDate startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public LocalDate getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDate startTime) {
    this.startTime = startTime;
  }

  public Schedule endTime(LocalDate endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public LocalDate getEndTime() {
    return endTime;
  }

  public void setEndTime(LocalDate endTime) {
    this.endTime = endTime;
  }

  public Schedule interval(IntervalEnum interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @Schema(required = true, description = "")
  public IntervalEnum getInterval() {
    return interval;
  }

  public void setInterval(IntervalEnum interval) {
    this.interval = interval;
  }

  public Schedule dayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

   /**
   * Get dayOfMonth
   * minimum: -5
   * maximum: 28
   * @return dayOfMonth
  **/
  @Schema(description = "")
  public Integer getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(Integer dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public Schedule nextScheduledAction(LocalDate nextScheduledAction) {
    this.nextScheduledAction = nextScheduledAction;
    return this;
  }

   /**
   * Get nextScheduledAction
   * @return nextScheduledAction
  **/
  @Schema(required = true, description = "")
  public LocalDate getNextScheduledAction() {
    return nextScheduledAction;
  }

  public void setNextScheduledAction(LocalDate nextScheduledAction) {
    this.nextScheduledAction = nextScheduledAction;
  }

  public Schedule totalNumberOfPayments(Integer totalNumberOfPayments) {
    this.totalNumberOfPayments = totalNumberOfPayments;
    return this;
  }

   /**
   * Get totalNumberOfPayments
   * minimum: 1
   * @return totalNumberOfPayments
  **/
  @Schema(description = "")
  public Integer getTotalNumberOfPayments() {
    return totalNumberOfPayments;
  }

  public void setTotalNumberOfPayments(Integer totalNumberOfPayments) {
    this.totalNumberOfPayments = totalNumberOfPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.startTime, schedule.startTime) &&
        Objects.equals(this.endTime, schedule.endTime) &&
        Objects.equals(this.interval, schedule.interval) &&
        Objects.equals(this.dayOfMonth, schedule.dayOfMonth) &&
        Objects.equals(this.nextScheduledAction, schedule.nextScheduledAction) &&
        Objects.equals(this.totalNumberOfPayments, schedule.totalNumberOfPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, interval, dayOfMonth, nextScheduledAction, totalNumberOfPayments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    nextScheduledAction: ").append(toIndentedString(nextScheduledAction)).append("\n");
    sb.append("    totalNumberOfPayments: ").append(toIndentedString(totalNumberOfPayments)).append("\n");
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
