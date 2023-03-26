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
import io.swagger.client.model.Card;
import io.swagger.client.model.IndividualVirtualDebitCardAttributes;
import io.swagger.client.model.Relationships9;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * IndividualVirtualDebitCard
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class IndividualVirtualDebitCard extends Card {
  @SerializedName("attributes")
  private IndividualVirtualDebitCardAttributes attributes = null;

  @SerializedName("relationships")
  private Relationships9 relationships = null;

  public IndividualVirtualDebitCard attributes(IndividualVirtualDebitCardAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public IndividualVirtualDebitCardAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(IndividualVirtualDebitCardAttributes attributes) {
    this.attributes = attributes;
  }

  public IndividualVirtualDebitCard relationships(Relationships9 relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @Schema(required = true, description = "")
  public Relationships9 getRelationships() {
    return relationships;
  }

  public void setRelationships(Relationships9 relationships) {
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
    IndividualVirtualDebitCard individualVirtualDebitCard = (IndividualVirtualDebitCard) o;
    return Objects.equals(this.attributes, individualVirtualDebitCard.attributes) &&
        Objects.equals(this.relationships, individualVirtualDebitCard.relationships) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualVirtualDebitCard {\n");
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
