# AdvanceReceivedPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advanceReceivedPaymentById**](AdvanceReceivedPaymentApi.md#advanceReceivedPaymentById) | **POST** /received-payments/{paymentId}/advance | Advance Received Payment by Id

<a name="advanceReceivedPaymentById"></a>
# **advanceReceivedPaymentById**
> UnitResponse10 advanceReceivedPaymentById(paymentId)

Advance Received Payment by Id

Advance a Received Payment via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdvanceReceivedPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AdvanceReceivedPaymentApi apiInstance = new AdvanceReceivedPaymentApi();
String paymentId = "paymentId_example"; // String | ID of the payment to advance
try {
    UnitResponse10 result = apiInstance.advanceReceivedPaymentById(paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvanceReceivedPaymentApi#advanceReceivedPaymentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| ID of the payment to advance |

### Return type

[**UnitResponse10**](UnitResponse10.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

