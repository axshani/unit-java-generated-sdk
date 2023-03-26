# ReleaseTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**amount** | **Integer** |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**senderName** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**senderAccountNumber** | **String** |  |  [optional]
**senderAddress** | [**Address**](Address.md) |  |  [optional]
**counterparty** | [**Counterparty**](Counterparty.md) |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
