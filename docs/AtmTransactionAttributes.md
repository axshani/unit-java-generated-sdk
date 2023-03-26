# AtmTransactionAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**amount** | **Integer** |  | 
**balance** | **Integer** |  | 
**summary** | **String** |  | 
**cardLast4Digits** | **String** |  | 
**atmName** | **String** |  | 
**atmLocation** | **String** |  |  [optional]
**surcharge** | **Integer** |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]
**networkTransactionId** | **String** |  |  [optional]
**interchange** | **OneOfAtmTransactionAttributesInterchange** |  |  [optional]
**internationalServiceFee** | **OneOfAtmTransactionAttributesInternationalServiceFee** |  |  [optional]
**cardNetwork** | **String** |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;
