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
import io.swagger.client.model.Prefilled;
import io.swagger.client.model.RequireIdVerification;
import io.swagger.client.model.SettingsOverride;
import io.swagger.client.model.Tags;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CreateApplicationFormAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class CreateApplicationFormAttributes {
  @SerializedName("email")
  private String email = null;

  @SerializedName("tags")
  private Tags tags = null;

  @SerializedName("applicantDetails")
  private Prefilled applicantDetails = null;

  @SerializedName("settingsOverride")
  private SettingsOverride settingsOverride = null;

  @SerializedName("requireIdVerification")
  private RequireIdVerification requireIdVerification = null;

  /**
   * Gets or Sets allowedApplicationTypes
   */
  @JsonAdapter(AllowedApplicationTypesEnum.Adapter.class)
  public enum AllowedApplicationTypesEnum {
    INDIVIDUAL("Individual"),
    BUSINESS("Business"),
    SOLEPROPRIETORSHIP("SoleProprietorship");

    private String value;

    AllowedApplicationTypesEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static AllowedApplicationTypesEnum fromValue(String input) {
      for (AllowedApplicationTypesEnum b : AllowedApplicationTypesEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<AllowedApplicationTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedApplicationTypesEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public AllowedApplicationTypesEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return AllowedApplicationTypesEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("allowedApplicationTypes")
  private List<AllowedApplicationTypesEnum> allowedApplicationTypes = null;

  /**
   * Gets or Sets lang
   */
  @JsonAdapter(LangEnum.Adapter.class)
  public enum LangEnum {
    EN("en"),
    ES("es");

    private String value;

    LangEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static LangEnum fromValue(String input) {
      for (LangEnum b : LangEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<LangEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LangEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public LangEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return LangEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("lang")
  private LangEnum lang = null;

  @SerializedName("hideApplicationProgressTracker")
  private Boolean hideApplicationProgressTracker = null;

  public CreateApplicationFormAttributes email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateApplicationFormAttributes tags(Tags tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(description = "")
  public Tags getTags() {
    return tags;
  }

  public void setTags(Tags tags) {
    this.tags = tags;
  }

  public CreateApplicationFormAttributes applicantDetails(Prefilled applicantDetails) {
    this.applicantDetails = applicantDetails;
    return this;
  }

   /**
   * Get applicantDetails
   * @return applicantDetails
  **/
  @Schema(description = "")
  public Prefilled getApplicantDetails() {
    return applicantDetails;
  }

  public void setApplicantDetails(Prefilled applicantDetails) {
    this.applicantDetails = applicantDetails;
  }

  public CreateApplicationFormAttributes settingsOverride(SettingsOverride settingsOverride) {
    this.settingsOverride = settingsOverride;
    return this;
  }

   /**
   * Get settingsOverride
   * @return settingsOverride
  **/
  @Schema(description = "")
  public SettingsOverride getSettingsOverride() {
    return settingsOverride;
  }

  public void setSettingsOverride(SettingsOverride settingsOverride) {
    this.settingsOverride = settingsOverride;
  }

  public CreateApplicationFormAttributes requireIdVerification(RequireIdVerification requireIdVerification) {
    this.requireIdVerification = requireIdVerification;
    return this;
  }

   /**
   * Get requireIdVerification
   * @return requireIdVerification
  **/
  @Schema(description = "")
  public RequireIdVerification getRequireIdVerification() {
    return requireIdVerification;
  }

  public void setRequireIdVerification(RequireIdVerification requireIdVerification) {
    this.requireIdVerification = requireIdVerification;
  }

  public CreateApplicationFormAttributes allowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    this.allowedApplicationTypes = allowedApplicationTypes;
    return this;
  }

  public CreateApplicationFormAttributes addAllowedApplicationTypesItem(AllowedApplicationTypesEnum allowedApplicationTypesItem) {
    if (this.allowedApplicationTypes == null) {
      this.allowedApplicationTypes = new ArrayList<AllowedApplicationTypesEnum>();
    }
    this.allowedApplicationTypes.add(allowedApplicationTypesItem);
    return this;
  }

   /**
   * Get allowedApplicationTypes
   * @return allowedApplicationTypes
  **/
  @Schema(description = "")
  public List<AllowedApplicationTypesEnum> getAllowedApplicationTypes() {
    return allowedApplicationTypes;
  }

  public void setAllowedApplicationTypes(List<AllowedApplicationTypesEnum> allowedApplicationTypes) {
    this.allowedApplicationTypes = allowedApplicationTypes;
  }

  public CreateApplicationFormAttributes lang(LangEnum lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Get lang
   * @return lang
  **/
  @Schema(description = "")
  public LangEnum getLang() {
    return lang;
  }

  public void setLang(LangEnum lang) {
    this.lang = lang;
  }

  public CreateApplicationFormAttributes hideApplicationProgressTracker(Boolean hideApplicationProgressTracker) {
    this.hideApplicationProgressTracker = hideApplicationProgressTracker;
    return this;
  }

   /**
   * Get hideApplicationProgressTracker
   * @return hideApplicationProgressTracker
  **/
  @Schema(description = "")
  public Boolean isHideApplicationProgressTracker() {
    return hideApplicationProgressTracker;
  }

  public void setHideApplicationProgressTracker(Boolean hideApplicationProgressTracker) {
    this.hideApplicationProgressTracker = hideApplicationProgressTracker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicationFormAttributes createApplicationFormAttributes = (CreateApplicationFormAttributes) o;
    return Objects.equals(this.email, createApplicationFormAttributes.email) &&
        Objects.equals(this.tags, createApplicationFormAttributes.tags) &&
        Objects.equals(this.applicantDetails, createApplicationFormAttributes.applicantDetails) &&
        Objects.equals(this.settingsOverride, createApplicationFormAttributes.settingsOverride) &&
        Objects.equals(this.requireIdVerification, createApplicationFormAttributes.requireIdVerification) &&
        Objects.equals(this.allowedApplicationTypes, createApplicationFormAttributes.allowedApplicationTypes) &&
        Objects.equals(this.lang, createApplicationFormAttributes.lang) &&
        Objects.equals(this.hideApplicationProgressTracker, createApplicationFormAttributes.hideApplicationProgressTracker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, tags, applicantDetails, settingsOverride, requireIdVerification, allowedApplicationTypes, lang, hideApplicationProgressTracker);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicationFormAttributes {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    applicantDetails: ").append(toIndentedString(applicantDetails)).append("\n");
    sb.append("    settingsOverride: ").append(toIndentedString(settingsOverride)).append("\n");
    sb.append("    requireIdVerification: ").append(toIndentedString(requireIdVerification)).append("\n");
    sb.append("    allowedApplicationTypes: ").append(toIndentedString(allowedApplicationTypes)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    hideApplicationProgressTracker: ").append(toIndentedString(hideApplicationProgressTracker)).append("\n");
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
