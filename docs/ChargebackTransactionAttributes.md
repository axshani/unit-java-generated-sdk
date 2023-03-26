# ChargebackTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**counterparty** | [**Counterparty**](Counterparty.md) |  |  [optional]
**amount** | **Integer** |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
