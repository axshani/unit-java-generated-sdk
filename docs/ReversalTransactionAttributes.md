# ReversalTransactionAttributes

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
**internationalServiceFee** | **OneOfReversalTransactionAttributesInternationalServiceFee** |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
