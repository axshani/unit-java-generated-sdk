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
import io.swagger.client.model.Relationships9Account;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Relationships13
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class Relationships13 {
  @SerializedName("fundingAccount")
  private Relationships9Account fundingAccount = null;

  @SerializedName("receivingAccount")
  private Relationships9Account receivingAccount = null;

  @SerializedName("rewardedTransaction")
  private Relationships2Customer rewardedTransaction = null;

  public Relationships13 fundingAccount(Relationships9Account fundingAccount) {
    this.fundingAccount = fundingAccount;
    return this;
  }

   /**
   * Get fundingAccount
   * @return fundingAccount
  **/
  @Schema(description = "")
  public Relationships9Account getFundingAccount() {
    return fundingAccount;
  }

  public void setFundingAccount(Relationships9Account fundingAccount) {
    this.fundingAccount = fundingAccount;
  }

  public Relationships13 receivingAccount(Relationships9Account receivingAccount) {
    this.receivingAccount = receivingAccount;
    return this;
  }

   /**
   * Get receivingAccount
   * @return receivingAccount
  **/
  @Schema(required = true, description = "")
  public Relationships9Account getReceivingAccount() {
    return receivingAccount;
  }

  public void setReceivingAccount(Relationships9Account receivingAccount) {
    this.receivingAccount = receivingAccount;
  }

  public Relationships13 rewardedTransaction(Relationships2Customer rewardedTransaction) {
    this.rewardedTransaction = rewardedTransaction;
    return this;
  }

   /**
   * Get rewardedTransaction
   * @return rewardedTransaction
  **/
  @Schema(description = "")
  public Relationships2Customer getRewardedTransaction() {
    return rewardedTransaction;
  }

  public void setRewardedTransaction(Relationships2Customer rewardedTransaction) {
    this.rewardedTransaction = rewardedTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationships13 relationships13 = (Relationships13) o;
    return Objects.equals(this.fundingAccount, relationships13.fundingAccount) &&
        Objects.equals(this.receivingAccount, relationships13.receivingAccount) &&
        Objects.equals(this.rewardedTransaction, relationships13.rewardedTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundingAccount, receivingAccount, rewardedTransaction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationships13 {\n");
    
    sb.append("    fundingAccount: ").append(toIndentedString(fundingAccount)).append("\n");
    sb.append("    receivingAccount: ").append(toIndentedString(receivingAccount)).append("\n");
    sb.append("    rewardedTransaction: ").append(toIndentedString(rewardedTransaction)).append("\n");
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
