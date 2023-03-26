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
import java.math.BigDecimal;
/**
 * CounterpartyBalanceAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class CounterpartyBalanceAttributes {
  @SerializedName("balance")
  private BigDecimal balance = null;

  @SerializedName("available")
  private BigDecimal available = null;

  public CounterpartyBalanceAttributes balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @Schema(required = true, description = "")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public CounterpartyBalanceAttributes available(BigDecimal available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @Schema(description = "")
  public BigDecimal getAvailable() {
    return available;
  }

  public void setAvailable(BigDecimal available) {
    this.available = available;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CounterpartyBalanceAttributes counterpartyBalanceAttributes = (CounterpartyBalanceAttributes) o;
    return Objects.equals(this.balance, counterpartyBalanceAttributes.balance) &&
        Objects.equals(this.available, counterpartyBalanceAttributes.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, available);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CounterpartyBalanceAttributes {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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
