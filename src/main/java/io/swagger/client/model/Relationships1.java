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
import io.swagger.client.model.Relationships1Application;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Relationships1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class Relationships1 {
  @SerializedName("application")
  private Relationships1Application application = null;

  public Relationships1 application(Relationships1Application application) {
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @Schema(description = "")
  public Relationships1Application getApplication() {
    return application;
  }

  public void setApplication(Relationships1Application application) {
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
    Relationships1 relationships1 = (Relationships1) o;
    return Objects.equals(this.application, relationships1.application);
  }

  @Override
  public int hashCode() {
    return Objects.hash(application);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relationships1 {\n");
    
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
