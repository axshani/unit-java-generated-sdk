# DisableWebhookApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableWebhook**](DisableWebhookApi.md#disableWebhook) | **POST** /webhooks/{webhookId}/disable | Disable a Webhook

<a name="disableWebhook"></a>
# **disableWebhook**
> UnitResponse28 disableWebhook(webhookId)

Disable a Webhook

Disable a Webhook via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DisableWebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DisableWebhookApi apiInstance = new DisableWebhookApi();
String webhookId = "webhookId_example"; // String | ID of the webhook to disable
try {
    UnitResponse28 result = apiInstance.disableWebhook(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisableWebhookApi#disableWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| ID of the webhook to disable |

### Return type

[**UnitResponse28**](UnitResponse28.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

