# EnableWebhookApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enableWebhook**](EnableWebhookApi.md#enableWebhook) | **POST** /webhooks/{webhookId}/enable | Enable Webhook

<a name="enableWebhook"></a>
# **enableWebhook**
> UnitResponse28 enableWebhook(webhookId)

Enable Webhook

Enable a Webhook via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnableWebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnableWebhookApi apiInstance = new EnableWebhookApi();
String webhookId = "webhookId_example"; // String | ID of the webhook to enable
try {
    UnitResponse28 result = apiInstance.enableWebhook(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnableWebhookApi#enableWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| ID of the webhook to enable |

### Return type

[**UnitResponse28**](UnitResponse28.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

