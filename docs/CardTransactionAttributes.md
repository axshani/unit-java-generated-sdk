# CardTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**amount** | **Integer** |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**cardLast4Digits** | **String** |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**networkTransactionId** | **String** |  |  [optional]
**interchange** | **OneOfCardTransactionAttributesInterchange** |  |  [optional]
**internationalServiceFee** | **OneOfCardTransactionAttributesInternationalServiceFee** |  |  [optional]
**merchant** | [**Merchant**](Merchant.md) |  | 
**recurring** | **Boolean** |  | 
**paymentMethod** | **String** |  |  [optional]
**digitalWallet** | **String** |  |  [optional]
**cardVerificationData** | [**CardVerificationData**](CardVerificationData.md) |  |  [optional]
**cardNetwork** | **String** |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
