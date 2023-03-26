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
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets industry
 */
@JsonAdapter(Industry.Adapter.class)
public enum Industry {
  RETAIL("Retail"),
  WHOLESALE("Wholesale"),
  RESTAURANTS("Restaurants"),
  HOSPITALS("Hospitals"),
  CONSTRUCTION("Construction"),
  INSURANCE("Insurance"),
  UNIONS("Unions"),
  REALESTATE("RealEstate"),
  FREELANCEPROFESSIONAL("FreelanceProfessional"),
  OTHERPROFESSIONALSERVICES("OtherProfessionalServices"),
  ONLINERETAILER("OnlineRetailer"),
  OTHEREDUCATIONSERVICES("OtherEducationServices");

  private String value;

  Industry(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Industry fromValue(String input) {
    for (Industry b : Industry.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Industry> {
    @Override
    public void write(final JsonWriter jsonWriter, final Industry enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public Industry read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return Industry.fromValue((String)(value));
    }
  }
}