# PurchaseTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**amount** | **Integer** |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**cardLast4Digits** | **String** |  | 
**merchant** | [**Merchant**](Merchant.md) |  | 
**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional]
**recurring** | **Boolean** |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**networkTransactionId** | **String** |  |  [optional]
**interchange** | **OneOfPurchaseTransactionAttributesInterchange** |  |  [optional]
**ecommerce** | **Boolean** |  | 
**cardPresent** | **Boolean** |  | 
**internationalServiceFee** | **OneOfPurchaseTransactionAttributesInternationalServiceFee** |  |  [optional]
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
