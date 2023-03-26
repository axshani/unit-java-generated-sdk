# BusinessApplicationAttributes

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
**dba** | **String** |  |  [optional]
**ein** | **String** |  |  [optional]
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  | 
**dateOfIncorporation** | [**LocalDate**](LocalDate.md) |  |  [optional]
**stateOfIncorporation** | **String** |  | 
**purpose** | **String** |  |  [optional]
**phone** | [**Phone**](Phone.md) |  |  [optional]
**address** | **Object** |  |  [optional]
**contact** | [**Contact**](Contact.md) |  | 
**officer** | [**Officer**](Officer.md) |  | 
**ip** | **String** |  |  [optional]
**website** | **String** |  |  [optional]
**beneficialOwners** | [**List&lt;BeneficialOwner&gt;**](BeneficialOwner.md) |  | 
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
**industry** | [**Industry**](Industry.md) |  |  [optional]

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
CORPORATION | &quot;Corporation&quot;
LLC | &quot;LLC&quot;
PARTNERSHIP | &quot;Partnership&quot;

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
