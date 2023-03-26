# DisputeAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**SourceEnum**](#SourceEnum) |  | 
**externalId** | **String** |  | 
**link** | **String** |  |  [optional]
**description** | **String** |  | 
**amount** | **Integer** |  | 
**status** | **String** |  | 
**statusHistory** | [**List&lt;DisputeAttributesStatusHistory&gt;**](DisputeAttributesStatusHistory.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**decisionReason** | **String** |  |  [optional]

<a name="SourceEnum"></a>
## Enum: SourceEnum
Name | Value
---- | -----
DEBITCARD | &quot;DebitCard&quot;
ACH | &quot;ACH&quot;
