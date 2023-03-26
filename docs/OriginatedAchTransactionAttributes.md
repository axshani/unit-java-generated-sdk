# OriginatedAchTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**amount** | **Integer** |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**description** | **String** |  | 
**addenda** | **String** |  |  [optional]
**counterparty** | [**Counterparty**](Counterparty.md) |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**secCode** | **String** |  |  [optional]
**traceNumber** | **String** |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
