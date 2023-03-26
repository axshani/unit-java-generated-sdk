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
/**
 * CreateDepositAccountAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class CreateDepositAccountAttributes {
  @SerializedName("depositProduct")
  private String depositProduct = null;

  @SerializedName("tags")
  private Object tags = null;

  @SerializedName("idempotencyKey")
  private String idempotencyKey = null;

  public CreateDepositAccountAttributes depositProduct(String depositProduct) {
    this.depositProduct = depositProduct;
    return this;
  }

   /**
   * Get depositProduct
   * @return depositProduct
  **/
  @Schema(required = true, description = "")
  public String getDepositProduct() {
    return depositProduct;
  }

  public void setDepositProduct(String depositProduct) {
    this.depositProduct = depositProduct;
  }

  public CreateDepositAccountAttributes tags(Object tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public Object getTags() {
    return tags;
  }

  public void setTags(Object tags) {
    this.tags = tags;
  }

  public CreateDepositAccountAttributes idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * Get idempotencyKey
   * @return idempotencyKey
  **/
  @Schema(description = "")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDepositAccountAttributes createDepositAccountAttributes = (CreateDepositAccountAttributes) o;
    return Objects.equals(this.depositProduct, createDepositAccountAttributes.depositProduct) &&
        Objects.equals(this.tags, createDepositAccountAttributes.tags) &&
        Objects.equals(this.idempotencyKey, createDepositAccountAttributes.idempotencyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depositProduct, tags, idempotencyKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDepositAccountAttributes {\n");
    
    sb.append("    depositProduct: ").append(toIndentedString(depositProduct)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
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
