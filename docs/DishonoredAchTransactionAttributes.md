# DishonoredAchTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**amount** | **Integer** |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**description** | **String** |  | 
**companyName** | **String** |  | 
**counterpartyName** | **String** |  |  [optional]
**counterpartyRoutingNumber** | **String** |  | 
**traceNumber** | **String** |  |  [optional]
**reason** | **String** |  |  [optional]
**secCode** | **String** |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
