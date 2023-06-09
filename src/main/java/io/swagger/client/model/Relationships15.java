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
import io.swagger.client.model.OrgRelationship;
import io.swagger.client.model.Relationships12ReceivingAccount;
import io.swagger.client.model.Relationships2Customer;
import io.swagger.client.model.Relationships5Customer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Relationships15
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class Relationships15 {
  @SerializedName("org")
  private OrgRelationship org = null;

  @SerializedName("account")
  private Relationships12ReceivingAccount account = null;

  @SerializedName("customer")
  private Relationships5Customer customer = null;

  @SerializedName("transaction")
  private Relationships2Customer transaction = null;

  public Relationships15 org(OrgRelationship org) {
    this.org = org;
    return this;
  }

   /**
   * Get org
   * @return org
  **/
  @Schema(description = "")
  public OrgRelationship getOrg() {
    return org;
  }

  public void setOrg(OrgRelationship org) {
    this.org = org;
  }

  public Relationships15 account(Relationships12ReceivingAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @Schema(required = true, description = "")
  public Relationships12ReceivingAccount getAccount() {
    return account;
  }

  public void setAccount(Relationships12ReceivingAccount account) {
    this.account = account;
  }

  public Relationships15 customer(Relationships5Customer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @Schema(description = "")
  public Relationships5Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Relationships5Customer customer) {
    this.customer = customer;
  }

  public Relationships15 transaction(Relationships2Customer transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @Schema(description = "")
  public Relationships2Customer getTransaction() {
    return transaction;
  }

  public void setTransaction(Relationships2Customer transaction) {
    this.transaction = transaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationships15 relationships15 = (Relationships15) o;
    return Objects.equals(this.org, relationships15.org) &&
        Objects.equals(this.account, relationships15.account) &&
        Objects.equals(this.customer, relationships15.customer) &&
        Objects.equals(this.transaction, relationships15.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, account, customer, transaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationships15 {\n");
    
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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
