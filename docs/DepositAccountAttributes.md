# DepositAccountAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**name** | **String** |  | 
**depositProduct** | **String** |  | 
**routingNumber** | **String** |  | 
**accountNumber** | **String** |  |  [optional]
**secondaryAccountNumber** | [**DepositAccountAttributesSecondaryAccountNumber**](DepositAccountAttributesSecondaryAccountNumber.md) |  |  [optional]
**currency** | **String** |  | 
**balance** | **Integer** |  | 
**overdraftLimit** | **Integer** |  |  [optional]
**hold** | **Integer** |  | 
**available** | **Integer** |  | 
**tags** | [**Tags**](Tags.md) |  | 
**status** | **String** |  | 
**closeReason** | [**CloseReasonEnum**](#CloseReasonEnum) |  |  [optional]
**fraudReason** | [**FraudReasonEnum**](#FraudReasonEnum) |  |  [optional]
**closeReasonText** | **String** |  |  [optional]
**freezeReason** | **String** |  |  [optional]
**maskedAccountNumber** | **String** |  |  [optional]
**isOverdrawnWithinLimit** | **Boolean** |  |  [optional]
**dacaStatus** | **String** |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="CloseReasonEnum"></a>
## Enum: CloseReasonEnum
Name | Value
---- | -----
BYCUSTOMER | &quot;ByCustomer&quot;
FRAUD | &quot;Fraud&quot;

<a name="FraudReasonEnum"></a>
## Enum: FraudReasonEnum
Name | Value
---- | -----
ACHACTIVITY | &quot;ACHActivity&quot;
CARDACTIVITY | &quot;CardActivity&quot;
CHECKACTIVITY | &quot;CheckActivity&quot;
APPLICATIONHISTORY | &quot;ApplicationHistory&quot;
ACCOUNTACTIVITY | &quot;AccountActivity&quot;
CLIENTIDENTIFIED | &quot;ClientIdentified&quot;
IDENTITYTHEFT | &quot;IdentityTheft&quot;
LINKEDTOFRAUDULENTCUSTOMER | &quot;LinkedToFraudulentCustomer&quot;
