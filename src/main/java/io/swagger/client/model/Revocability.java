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
 * Gets or Sets revocability
 */
@JsonAdapter(Revocability.Adapter.class)
public enum Revocability {
  REVOCABLE("Revocable"),
  IRREVOCABLE("Irrevocable");

  private String value;

  Revocability(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Revocability fromValue(String input) {
    for (Revocability b : Revocability.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Revocability> {
    @Override
    public void write(final JsonWriter jsonWriter, final Revocability enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public Revocability read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return Revocability.fromValue((String)(value));
    }
  }
}