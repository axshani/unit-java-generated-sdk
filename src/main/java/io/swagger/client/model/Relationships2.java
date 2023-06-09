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
import io.swagger.client.model.Relationships2Customer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Relationships2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class Relationships2 {
  @SerializedName("customer")
  private Relationships2Customer customer = null;

  @SerializedName("account")
  private Relationships2Customer account = null;

  public Relationships2 customer(Relationships2Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public Relationships2Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Relationships2Customer customer) {
    this.customer = customer;
  }

  public Relationships2 account(Relationships2Customer account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(required = true, description = "")
  public Relationships2Customer getAccount() {
    return account;
  }

  public void setAccount(Relationships2Customer account) {
    this.account = account;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationships2 relationships2 = (Relationships2) o;
    return Objects.equals(this.customer, relationships2.customer) &&
        Objects.equals(this.account, relationships2.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, account);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationships2 {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
