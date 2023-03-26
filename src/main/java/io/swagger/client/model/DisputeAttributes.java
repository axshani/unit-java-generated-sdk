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
import io.swagger.client.model.DisputeAttributesStatusHistory;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * DisputeAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-26T12:59:56.018830800+03:00[Asia/Jerusalem]")
public class DisputeAttributes {
  /**
   * Gets or Sets source
   */
  @JsonAdapter(SourceEnum.Adapter.class)
  public enum SourceEnum {
    DEBITCARD("DebitCard"),
    ACH("ACH");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SourceEnum fromValue(String input) {
      for (SourceEnum b : SourceEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SourceEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SourceEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("source")
  private SourceEnum source = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("statusHistory")
  private List<DisputeAttributesStatusHistory> statusHistory = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("decisionReason")
  private String decisionReason = null;

  public DisputeAttributes source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @Schema(required = true, description = "")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public DisputeAttributes externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @Schema(required = true, description = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public DisputeAttributes link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @Schema(description = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public DisputeAttributes description(String description) {
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

  public DisputeAttributes amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @Schema(required = true, description = "")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public DisputeAttributes status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DisputeAttributes statusHistory(List<DisputeAttributesStatusHistory> statusHistory) {
    this.statusHistory = statusHistory;
    return this;
  }

  public DisputeAttributes addStatusHistoryItem(DisputeAttributesStatusHistory statusHistoryItem) {
    if (this.statusHistory == null) {
      this.statusHistory = new ArrayList<DisputeAttributesStatusHistory>();
    }
    this.statusHistory.add(statusHistoryItem);
    return this;
  }

   /**
   * Get statusHistory
   * @return statusHistory
  **/
  @Schema(description = "")
  public List<DisputeAttributesStatusHistory> getStatusHistory() {
    return statusHistory;
  }

  public void setStatusHistory(List<DisputeAttributesStatusHistory> statusHistory) {
    this.statusHistory = statusHistory;
  }

  public DisputeAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DisputeAttributes decisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
    return this;
  }

   /**
   * Get decisionReason
   * @return decisionReason
  **/
  @Schema(description = "")
  public String getDecisionReason() {
    return decisionReason;
  }

  public void setDecisionReason(String decisionReason) {
    this.decisionReason = decisionReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisputeAttributes disputeAttributes = (DisputeAttributes) o;
    return Objects.equals(this.source, disputeAttributes.source) &&
        Objects.equals(this.externalId, disputeAttributes.externalId) &&
        Objects.equals(this.link, disputeAttributes.link) &&
        Objects.equals(this.description, disputeAttributes.description) &&
        Objects.equals(this.amount, disputeAttributes.amount) &&
        Objects.equals(this.status, disputeAttributes.status) &&
        Objects.equals(this.statusHistory, disputeAttributes.statusHistory) &&
        Objects.equals(this.createdAt, disputeAttributes.createdAt) &&
        Objects.equals(this.decisionReason, disputeAttributes.decisionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, externalId, link, description, amount, status, statusHistory, createdAt, decisionReason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisputeAttributes {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    decisionReason: ").append(toIndentedString(decisionReason)).append("\n");
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
