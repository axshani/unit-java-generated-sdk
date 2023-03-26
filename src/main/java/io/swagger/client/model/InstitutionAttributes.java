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
 * InstitutionAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class InstitutionAttributes {
  @SerializedName("routingNumber")
  private String routingNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("isWireSupported")
  private Boolean isWireSupported = null;

  @SerializedName("isACHSupported")
  private Boolean isACHSupported = null;

  public InstitutionAttributes routingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Get routingNumber
   * @return routingNumber
  **/
  @Schema(required = true, description = "")
  public String getRoutingNumber() {
    return routingNumber;
  }

  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public InstitutionAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InstitutionAttributes address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public InstitutionAttributes isWireSupported(Boolean isWireSupported) {
    this.isWireSupported = isWireSupported;
    return this;
  }

   /**
   * Get isWireSupported
   * @return isWireSupported
  **/
  @Schema(required = true, description = "")
  public Boolean isIsWireSupported() {
    return isWireSupported;
  }

  public void setIsWireSupported(Boolean isWireSupported) {
    this.isWireSupported = isWireSupported;
  }

  public InstitutionAttributes isACHSupported(Boolean isACHSupported) {
    this.isACHSupported = isACHSupported;
    return this;
  }

   /**
   * Get isACHSupported
   * @return isACHSupported
  **/
  @Schema(required = true, description = "")
  public Boolean isIsACHSupported() {
    return isACHSupported;
  }

  public void setIsACHSupported(Boolean isACHSupported) {
    this.isACHSupported = isACHSupported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionAttributes institutionAttributes = (InstitutionAttributes) o;
    return Objects.equals(this.routingNumber, institutionAttributes.routingNumber) &&
        Objects.equals(this.name, institutionAttributes.name) &&
        Objects.equals(this.address, institutionAttributes.address) &&
        Objects.equals(this.isWireSupported, institutionAttributes.isWireSupported) &&
        Objects.equals(this.isACHSupported, institutionAttributes.isACHSupported);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routingNumber, name, address, isWireSupported, isACHSupported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionAttributes {\n");
    
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    isWireSupported: ").append(toIndentedString(isWireSupported)).append("\n");
    sb.append("    isACHSupported: ").append(toIndentedString(isACHSupported)).append("\n");
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
