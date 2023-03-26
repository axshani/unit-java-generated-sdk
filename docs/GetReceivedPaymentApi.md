# GetReceivedPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findReceivedPaymentById**](GetReceivedPaymentApi.md#findReceivedPaymentById) | **GET** /received-payments/{paymentId} | Get Received Payment by Id

<a name="findReceivedPaymentById"></a>
# **findReceivedPaymentById**
> UnitResponse10 findReceivedPaymentById(paymentId, included)

Get Received Payment by Id

Get a Received Payment from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetReceivedPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetReceivedPaymentApi apiInstance = new GetReceivedPaymentApi();
String paymentId = "paymentId_example"; // String | ID of the payment to get
String included = "included_example"; // String | 
try {
    UnitResponse10 result = apiInstance.findReceivedPaymentById(paymentId, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetReceivedPaymentApi#findReceivedPaymentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| ID of the payment to get |
 **included** | **String**|  | [optional]

### Return type

[**UnitResponse10**](UnitResponse10.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

