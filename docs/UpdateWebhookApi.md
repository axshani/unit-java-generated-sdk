# UpdateWebhookApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateWebhook**](UpdateWebhookApi.md#updateWebhook) | **PATCH** /webhooks/{webhookId} | Update Webhook

<a name="updateWebhook"></a>
# **updateWebhook**
> UnitResponse28 updateWebhook(body, webhookId)

Update Webhook

Update a Webhook via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdateWebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdateWebhookApi apiInstance = new UpdateWebhookApi();
UpdateUnitRequest body = new UpdateUnitRequest(); // UpdateUnitRequest | Update Webhook Request
String webhookId = "webhookId_example"; // String | ID of the Webhook to update
try {
    UnitResponse28 result = apiInstance.updateWebhook(body, webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateWebhookApi#updateWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateUnitRequest**](UpdateUnitRequest.md)| Update Webhook Request |
 **webhookId** | **String**| ID of the Webhook to update |

### Return type

[**UnitResponse28**](UnitResponse28.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

