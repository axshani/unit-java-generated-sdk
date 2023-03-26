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
 * CustomerscustomerIdarchiveAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class CustomerscustomerIdarchiveAttributes {
  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    INACTIVE("Inactive"),
    FRAUDACHACTIVITY("FraudACHActivity"),
    FRAUDCARDACTIVITY("FraudCardActivity"),
    FRAUDCHECKACTIVITY("FraudCheckActivity"),
    FRAUDAPPLICATIONHISTORY("FraudApplicationHistory"),
    FRAUDACCOUNTACTIVITY("FraudAccountActivity"),
    FRAUDCLIENTIDENTIFIED("FraudClientIdentified"),
    FRAUDLINKEDTOFRAUDULENTCUSTOMER("FraudLinkedToFraudulentCustomer");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ReasonEnum fromValue(String input) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ReasonEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("reason")
  private ReasonEnum reason = null;

  public CustomerscustomerIdarchiveAttributes reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @Schema(description = "")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerscustomerIdarchiveAttributes customerscustomerIdarchiveAttributes = (CustomerscustomerIdarchiveAttributes) o;
    return Objects.equals(this.reason, customerscustomerIdarchiveAttributes.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerscustomerIdarchiveAttributes {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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