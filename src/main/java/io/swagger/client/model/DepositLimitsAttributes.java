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
import io.swagger.client.model.DepositLimitsAttributesAch;
import io.swagger.client.model.DepositLimitsAttributesCard;
import io.swagger.client.model.DepositLimitsAttributesCheckDeposit;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DepositLimitsAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class DepositLimitsAttributes {
  @SerializedName("ach")
  private DepositLimitsAttributesAch ach = null;

  @SerializedName("card")
  private DepositLimitsAttributesCard card = null;

  @SerializedName("checkDeposit")
  private DepositLimitsAttributesCheckDeposit checkDeposit = null;

  public DepositLimitsAttributes ach(DepositLimitsAttributesAch ach) {
    this.ach = ach;
    return this;
  }

   /**
   * Get ach
   * @return ach
  **/
  @Schema(required = true, description = "")
  public DepositLimitsAttributesAch getAch() {
    return ach;
  }

  public void setAch(DepositLimitsAttributesAch ach) {
    this.ach = ach;
  }

  public DepositLimitsAttributes card(DepositLimitsAttributesCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @Schema(required = true, description = "")
  public DepositLimitsAttributesCard getCard() {
    return card;
  }

  public void setCard(DepositLimitsAttributesCard card) {
    this.card = card;
  }

  public DepositLimitsAttributes checkDeposit(DepositLimitsAttributesCheckDeposit checkDeposit) {
    this.checkDeposit = checkDeposit;
    return this;
  }

   /**
   * Get checkDeposit
   * @return checkDeposit
  **/
  @Schema(required = true, description = "")
  public DepositLimitsAttributesCheckDeposit getCheckDeposit() {
    return checkDeposit;
  }

  public void setCheckDeposit(DepositLimitsAttributesCheckDeposit checkDeposit) {
    this.checkDeposit = checkDeposit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositLimitsAttributes depositLimitsAttributes = (DepositLimitsAttributes) o;
    return Objects.equals(this.ach, depositLimitsAttributes.ach) &&
        Objects.equals(this.card, depositLimitsAttributes.card) &&
        Objects.equals(this.checkDeposit, depositLimitsAttributes.checkDeposit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ach, card, checkDeposit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositLimitsAttributes {\n");
    
    sb.append("    ach: ").append(toIndentedString(ach)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    checkDeposit: ").append(toIndentedString(checkDeposit)).append("\n");
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