# ReceivedPaymentAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**status** | [**StatusEnum**](#StatusEnum) |  | 
**amount** | **Integer** |  | 
**completionDate** | **String** |  | 
**wasAdvanced** | **Boolean** |  |  [optional]
**companyName** | **String** |  | 
**counterpartyRoutingNumber** | **String** |  | 
**description** | **String** |  | 
**addenda** | **String** |  |  [optional]
**traceNumber** | **String** |  | 
**secCode** | **String** |  | 
**returnReason** | **String** |  |  [optional]
**tags** | [**Tags**](Tags.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
ADVANCED | &quot;Advanced&quot;
COMPLETED | &quot;Completed&quot;
RETURNED | &quot;Returned&quot;
