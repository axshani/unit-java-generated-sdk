# IndividualApplicationAttributes

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
**fullName** | [**FullName**](FullName.md) |  | 
**email** | **String** |  |  [optional]
**phone** | [**Phone**](Phone.md) |  |  [optional]
**ssn** | **String** |  |  [optional]
**passport** | **String** |  |  [optional]
**nationality** | **String** |  |  [optional]
**matriculaConsular** | **String** |  |  [optional]
**address** | **Object** |  |  [optional]
**dateOfBirth** | [**LocalDate**](LocalDate.md) |  |  [optional]
**dba** | **String** |  |  [optional]
**ein** | **String** |  |  [optional]
**ip** | **String** |  |  [optional]
**soleProprietorship** | **Boolean** |  |  [optional]
**decisionMethod** | [**DecisionMethodEnum**](#DecisionMethodEnum) |  |  [optional]
**decisionUserId** | **String** |  |  [optional]
**decisionReason** | **String** |  |  [optional]
**decisionDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]
**riskRate** | [**RiskRateEnum**](#RiskRateEnum) |  |  [optional]
**evaluationFlags** | **List&lt;String&gt;** |  |  [optional]
**evaluationScores** | **Object** |  |  [optional]
**ipLocationDetails** | **Object** |  |  [optional]
**phoneLocationDetails** | **Object** |  |  [optional]
**maskedSSN** | **String** |  |  [optional]
**maskedPassport** | **String** |  |  [optional]
**maskedMatriculaConsular** | **String** |  |  [optional]
**jwtSubject** | [**JwtSubject**](JwtSubject.md) |  |  [optional]
**archived** | **Boolean** |  |  [optional]
**powerOfAttorneyAgent** | [**PowerOfAttorneyAgent**](PowerOfAttorneyAgent.md) |  |  [optional]
**industry** | [**Industry**](Industry.md) |  |  [optional]
**idTheftScore** | **Integer** |  |  [optional]

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
