# RecurringCreditBookPaymentAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**amount** | **Integer** |  | 
**description** | **String** |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**schedule** | [**Schedule**](Schedule.md) |  | 
**numberOfPayments** | **Integer** |  | 
**tags** | [**Tags**](Tags.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
ACTIVE | &quot;Active&quot;
COMPLETED | &quot;Completed&quot;
DISABLED | &quot;Disabled&quot;
