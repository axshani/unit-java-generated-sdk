# ReturnedCheckPaymentTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**amount** | **Integer** |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**reason** | **String** |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
