# WebhookAttributes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lebel** | **String** |  |  [optional]
**url** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) |  |  [optional]
**deliveryMode** | [**DeliveryModeEnum**](#DeliveryModeEnum) |  |  [optional]
**token** | **String** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ENABLED | &quot;Enabled&quot;
DISABLED | &quot;Disabled&quot;

<a name="ContentTypeEnum"></a>
## Enum: ContentTypeEnum
Name | Value
---- | -----
JSON | &quot;Json&quot;
JSONAPI | &quot;JsonAPI&quot;

<a name="DeliveryModeEnum"></a>
## Enum: DeliveryModeEnum
Name | Value
---- | -----
ATMOSTONCE | &quot;AtMostOnce&quot;
ATLEASTONCE | &quot;AtLeastOnce&quot;
