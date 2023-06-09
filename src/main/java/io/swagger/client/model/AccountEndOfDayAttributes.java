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
 * AccountEndOfDayAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class AccountEndOfDayAttributes {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("balance")
  private Integer balance = null;

  @SerializedName("hold")
  private Integer hold = null;

  @SerializedName("available")
  private Integer available = null;

  @SerializedName("overdraftLimit")
  private Integer overdraftLimit = null;

  public AccountEndOfDayAttributes date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @Schema(required = true, description = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public AccountEndOfDayAttributes balance(Integer balance) {
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

  public AccountEndOfDayAttributes hold(Integer hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Get hold
   * @return hold
  **/
  @Schema(required = true, description = "")
  public Integer getHold() {
    return hold;
  }

  public void setHold(Integer hold) {
    this.hold = hold;
  }

  public AccountEndOfDayAttributes available(Integer available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @Schema(required = true, description = "")
  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public AccountEndOfDayAttributes overdraftLimit(Integer overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * Get overdraftLimit
   * @return overdraftLimit
  **/
  @Schema(description = "")
  public Integer getOverdraftLimit() {
    return overdraftLimit;
  }

  public void setOverdraftLimit(Integer overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountEndOfDayAttributes accountEndOfDayAttributes = (AccountEndOfDayAttributes) o;
    return Objects.equals(this.date, accountEndOfDayAttributes.date) &&
        Objects.equals(this.balance, accountEndOfDayAttributes.balance) &&
        Objects.equals(this.hold, accountEndOfDayAttributes.hold) &&
        Objects.equals(this.available, accountEndOfDayAttributes.available) &&
        Objects.equals(this.overdraftLimit, accountEndOfDayAttributes.overdraftLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, balance, hold, available, overdraftLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountEndOfDayAttributes {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
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
