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
import io.swagger.client.model.Customer;
import io.swagger.client.model.IndividualCustomerAttributes;
import io.swagger.client.model.Relationships3;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * IndividualCustomer
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class IndividualCustomer extends Customer {
  @SerializedName("attributes")
  private IndividualCustomerAttributes attributes = null;

  @SerializedName("relationships")
  private Relationships3 relationships = null;

  public IndividualCustomer attributes(IndividualCustomerAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public IndividualCustomerAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(IndividualCustomerAttributes attributes) {
    this.attributes = attributes;
  }

  public IndividualCustomer relationships(Relationships3 relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(description = "")
  public Relationships3 getRelationships() {
    return relationships;
  }

  public void setRelationships(Relationships3 relationships) {
    this.relationships = relationships;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualCustomer individualCustomer = (IndividualCustomer) o;
    return Objects.equals(this.attributes, individualCustomer.attributes) &&
        Objects.equals(this.relationships, individualCustomer.relationships) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualCustomer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
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
