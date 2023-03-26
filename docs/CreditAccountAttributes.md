# CreditAccountAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**name** | **String** |  | 
**creditTerms** | **String** |  | 
**currency** | **String** |  | 
**balance** | **Integer** |  | 
**hold** | **Integer** |  | 
**available** | **Integer** |  | 
**tags** | [**Tags**](Tags.md) |  | 
**status** | **String** |  | 
**closeReason** | [**CloseReasonEnum**](#CloseReasonEnum) |  |  [optional]
**fraudReason** | [**FraudReasonEnum**](#FraudReasonEnum) |  |  [optional]
**closeReasonText** | **String** |  |  [optional]
**freezeReason** | **String** |  |  [optional]
**creditLimit** | **Integer** |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="CloseReasonEnum"></a>
## Enum: CloseReasonEnum
Name | Value
---- | -----
BYCUSTOMER | &quot;ByCustomer&quot;
FRAUD | &quot;Fraud&quot;
OVERDUE | &quot;Overdue&quot;

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
