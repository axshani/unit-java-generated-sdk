# BillPaymentAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**amount** | **Integer** |  | 
**direction** | [**DirectionEnum**](#DirectionEnum) |  | 
**description** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**reason** | **Object** |  |  [optional]

<a name="DirectionEnum"></a>
## Enum: DirectionEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INITIALIZED | &quot;Initialized&quot;
PENDING | &quot;Pending&quot;
REJECTED | &quot;Rejected&quot;
CLEARING | &quot;Clearing&quot;
SENT | &quot;Sent&quot;
CANCELED | &quot;Canceled&quot;
RETURNED | &quot;Returned&quot;
