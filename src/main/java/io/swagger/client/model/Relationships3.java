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
import io.swagger.client.model.Relationships3Application;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Relationships3
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class Relationships3 {
  @SerializedName("org")
  private OrgRelationship org = null;

  @SerializedName("application")
  private Relationships3Application application = null;

  public Relationships3 org(OrgRelationship org) {
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

  public Relationships3 application(Relationships3Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @Schema(description = "")
  public Relationships3Application getApplication() {
    return application;
  }

  public void setApplication(Relationships3Application application) {
    this.application = application;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Relationships3 relationships3 = (Relationships3) o;
    return Objects.equals(this.org, relationships3.org) &&
        Objects.equals(this.application, relationships3.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(org, application);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationships3 {\n");
    
    sb.append("    org: ").append(toIndentedString(org)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
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
