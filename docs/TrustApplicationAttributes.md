# TrustApplicationAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**ApplicationStatus**](ApplicationStatus.md) |  | 
**message** | **String** |  |  [optional]
**evaluationOutcome** | **String** |  |  [optional]
**evaluationId** | **String** |  |  [optional]
**evaluationEntityId** | **String** |  |  [optional]
**name** | **String** |  | 
**dateOfIncorporation** | [**LocalDate**](LocalDate.md) |  |  [optional]
**stateOfIncorporation** | **String** |  | 
**revocability** | [**Revocability**](Revocability.md) |  |  [optional]
**sourceOfFunds** | [**SourceOfFunds**](SourceOfFunds.md) |  |  [optional]
**taxId** | **String** |  |  [optional]
**contact** | [**TrustContact**](TrustContact.md) |  | 
**trustees** | [**List&lt;Trustee&gt;**](Trustee.md) |  |  [optional]
**grantor** | [**Grantor**](Grantor.md) |  |  [optional]
**ip** | **String** |  |  [optional]
**decisionMethod** | [**DecisionMethodEnum**](#DecisionMethodEnum) |  |  [optional]
**decisionUserId** | **String** |  |  [optional]
**decisionReason** | **String** |  |  [optional]
**decisionDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]
**riskRate** | [**RiskRateEnum**](#RiskRateEnum) |  |  [optional]
**evaluationFlags** | **List&lt;String&gt;** |  |  [optional]
**ipLocationDetails** | **Object** |  |  [optional]
**phoneLocationDetails** | **Object** |  |  [optional]
**archived** | **Boolean** |  |  [optional]

<a name="DecisionMethodEnum"></a>
## Enum: DecisionMethodEnum
Name | Value
---- | -----
MANUALLY | &quot;Manually&quot;
AUTOMATICALLY | &quot;Automatically&quot;

<a name="RiskRateEnum"></a>
## Enum: RiskRateEnum
Name | Value
---- | -----
LOW | &quot;low&quot;
MEDIUM | &quot;medium&quot;
HIGH | &quot;high&quot;
