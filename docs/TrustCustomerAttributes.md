# TrustCustomerAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**name** | **String** |  | 
**stateOfIncorporation** | **String** |  | 
**contact** | [**TrustContact**](TrustContact.md) |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**revocability** | [**Revocability**](Revocability.md) |  |  [optional]
**sourceOfFunds** | [**SourceOfFunds**](SourceOfFunds.md) |  |  [optional]
**taxId** | **String** |  |  [optional]
**riskRate** | [**RiskRateEnum**](#RiskRateEnum) |  |  [optional]
**authorizedUsers** | [**List&lt;AuthorizedUser&gt;**](AuthorizedUser.md) |  |  [optional]
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
