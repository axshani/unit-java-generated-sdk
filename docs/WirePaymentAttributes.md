# WirePaymentAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**amount** | **Integer** |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**description** | **String** |  | 
**counterparty** | [**WireCounterparty**](WireCounterparty.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**settlementDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**reason** | **Object** |  |  [optional]
**imadOmad** | [**WirePaymentAttributesImadOmad**](WirePaymentAttributesImadOmad.md) |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
REJECTED | &quot;Rejected&quot;
CLEARING | &quot;Clearing&quot;
SENT | &quot;Sent&quot;
CANCELED | &quot;Canceled&quot;
RETURNED | &quot;Returned&quot;
