# GetWebhookApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findWebhookById**](GetWebhookApi.md#findWebhookById) | **GET** /webhooks/{webhookId} | Get Webhook Id

<a name="findWebhookById"></a>
# **findWebhookById**
> UnitResponse28 findWebhookById(webhookId)

Get Webhook Id

Get a Webhook from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetWebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetWebhookApi apiInstance = new GetWebhookApi();
String webhookId = "webhookId_example"; // String | ID of the webhook to get
try {
    UnitResponse28 result = apiInstance.findWebhookById(webhookId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetWebhookApi#findWebhookById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookId** | **String**| ID of the webhook to get |

### Return type

[**UnitResponse28**](UnitResponse28.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

