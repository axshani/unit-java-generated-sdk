# RecurringDebitAchPaymentAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**amount** | **Integer** |  | 
**description** | **String** |  | 
**addenda** | **String** |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  | 
**schedule** | [**Schedule**](Schedule.md) |  | 
**numberOfPayments** | **Integer** |  | 
**verifyCounterpartyBalance** | **Boolean** |  |  [optional]
**sameDay** | **Boolean** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
ACTIVE | &quot;Active&quot;
COMPLETED | &quot;Completed&quot;
DISABLED | &quot;Disabled&quot;
