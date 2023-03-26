# BusinessCustomerAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**name** | **String** |  | 
**dba** | **Object** |  |  [optional]
**ein** | **String** |  |  [optional]
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  | 
**dateOfIncorporation** | [**LocalDate**](LocalDate.md) |  |  [optional]
**stateOfIncorporation** | **String** |  | 
**purpose** | **String** |  |  [optional]
**phone** | [**Phone**](Phone.md) |  |  [optional]
**address** | [**Address**](Address.md) |  |  [optional]
**contact** | [**Contact**](Contact.md) |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**riskRate** | [**RiskRateEnum**](#RiskRateEnum) |  |  [optional]
**authorizedUsers** | [**List&lt;AuthorizedUser&gt;**](AuthorizedUser.md) |  |  [optional]
**status** | **String** |  | 
**archiveReason** | [**ArchiveReasonEnum**](#ArchiveReasonEnum) |  |  [optional]

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
CORPORATION | &quot;Corporation&quot;
LLC | &quot;LLC&quot;
PARTNERSHIP | &quot;Partnership&quot;

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
