# IndividualCustomerAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**fullName** | [**FullName**](FullName.md) |  | 
**email** | **String** |  |  [optional]
**phone** | [**Phone**](Phone.md) |  |  [optional]
**ssn** | **String** |  |  [optional]
**passport** | **String** |  |  [optional]
**nationality** | **String** |  |  [optional]
**matriculaConsular** | **String** |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**dateOfBirth** | [**LocalDate**](LocalDate.md) |  |  [optional]
**ein** | **String** |  |  [optional]
**dba** | **String** |  |  [optional]
**soleProprietorship** | **Boolean** |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]
**riskRate** | [**RiskRateEnum**](#RiskRateEnum) |  |  [optional]
**maskedSSN** | **String** |  |  [optional]
**maskedPassport** | **String** |  |  [optional]
**maskedMatriculaConsular** | **String** |  |  [optional]
**authorizedUsers** | [**List&lt;AuthorizedUser&gt;**](AuthorizedUser.md) |  |  [optional]
**jwtSubject** | [**JwtSubject**](JwtSubject.md) |  |  [optional]
**status** | **String** |  | 
**archiveReason** | [**ArchiveReasonEnum**](#ArchiveReasonEnum) |  |  [optional]

<a name="RiskRateEnum"></a>
## Enum: RiskRateEnum
Name | Value
---- | -----
LOW | &quot;low&quot;
MEDIUM | &quot;medium&quot;
HIGH | &quot;high&quot;

<a name="ArchiveReasonEnum"></a>
## Enum: ArchiveReasonEnum
Name | Value
---- | -----
INACTIVE | &quot;Inactive&quot;
FRAUDACHACTIVITY | &quot;FraudACHActivity&quot;
FRAUDCARDACTIVITY | &quot;FraudCardActivity&quot;
FRAUDCHECKACTIVITY | &quot;FraudCheckActivity&quot;
FRAUDAPPLICATIONHISTORY | &quot;FraudApplicationHistory&quot;
FRAUDACCOUNTACTIVITY | &quot;FraudAccountActivity&quot;
FRAUDCLIENTIDENTIFIED | &quot;FraudClientIdentified&quot;
FRAUDLINKEDTOFRAUDULENTCUSTOMER | &quot;FraudLinkedToFraudulentCustomer&quot;
