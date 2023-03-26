# GetListWebhooksApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListOfWebhooks**](GetListWebhooksApi.md#findListOfWebhooks) | **GET** /webhooks/ | Get List Webhooks

<a name="findListOfWebhooks"></a>
# **findListOfWebhooks**
> List&lt;Webhook&gt; findListOfWebhooks(page, filter, sort)

Get List Webhooks

Get List Webhooks from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListWebhooksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListWebhooksApi apiInstance = new GetListWebhooksApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter10 filter = new Filter10(); // Filter10 | 
String sort = "-createdAt"; // String | 
try {
    List<Webhook> result = apiInstance.findListOfWebhooks(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListWebhooksApi#findListOfWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter10**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**List&lt;Webhook&gt;**](Webhook.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

