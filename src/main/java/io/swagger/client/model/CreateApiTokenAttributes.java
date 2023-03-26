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
import io.swagger.client.model.CreateApiTokenAttributesResources;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * CreateApiTokenAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class CreateApiTokenAttributes {
  @SerializedName("scope")
  private String scope = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("expiration")
  private OffsetDateTime expiration = null;

  @SerializedName("sourceIp")
  private String sourceIp = null;

  @SerializedName("resources")
  private List<CreateApiTokenAttributesResources> resources = null;

  public CreateApiTokenAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @Schema(description = "")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public CreateApiTokenAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateApiTokenAttributes expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  public CreateApiTokenAttributes sourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
    return this;
  }

   /**
   * Get sourceIp
   * @return sourceIp
  **/
  @Schema(description = "")
  public String getSourceIp() {
    return sourceIp;
  }

  public void setSourceIp(String sourceIp) {
    this.sourceIp = sourceIp;
  }

  public CreateApiTokenAttributes resources(List<CreateApiTokenAttributesResources> resources) {
    this.resources = resources;
    return this;
  }

  public CreateApiTokenAttributes addResourcesItem(CreateApiTokenAttributesResources resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<CreateApiTokenAttributesResources>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @Schema(description = "")
  public List<CreateApiTokenAttributesResources> getResources() {
    return resources;
  }

  public void setResources(List<CreateApiTokenAttributesResources> resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApiTokenAttributes createApiTokenAttributes = (CreateApiTokenAttributes) o;
    return Objects.equals(this.scope, createApiTokenAttributes.scope) &&
        Objects.equals(this.description, createApiTokenAttributes.description) &&
        Objects.equals(this.expiration, createApiTokenAttributes.expiration) &&
        Objects.equals(this.sourceIp, createApiTokenAttributes.sourceIp) &&
        Objects.equals(this.resources, createApiTokenAttributes.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, description, expiration, sourceIp, resources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApiTokenAttributes {\n");
    
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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