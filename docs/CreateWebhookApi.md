# CreateWebhookApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWebhook**](CreateWebhookApi.md#createWebhook) | **POST** /webhooks/ | Create Webhook

<a name="createWebhook"></a>
# **createWebhook**
> UnitResponse27 createWebhook(body)

Create Webhook

Create a Webhook via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateWebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateWebhookApi apiInstance = new CreateWebhookApi();
WebhooksBody body = new WebhooksBody(); // WebhooksBody | Create Webhook Request
try {
    UnitResponse27 result = apiInstance.createWebhook(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateWebhookApi#createWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**WebhooksBody**](WebhooksBody.md)| Create Webhook Request |

### Return type

[**UnitResponse27**](UnitResponse27.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

