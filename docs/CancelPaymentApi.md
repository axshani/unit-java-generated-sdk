# CancelPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelPaymentById**](CancelPaymentApi.md#cancelPaymentById) | **POST** /payments/{paymentId}/cancel | Cancel a Payment by Id

<a name="cancelPaymentById"></a>
# **cancelPaymentById**
> UnitResponse9 cancelPaymentById(paymentId)

Cancel a Payment by Id

Cancel a Payment via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CancelPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CancelPaymentApi apiInstance = new CancelPaymentApi();
String paymentId = "paymentId_example"; // String | ID of the payment to cancel
try {
    UnitResponse9 result = apiInstance.cancelPaymentById(paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancelPaymentApi#cancelPaymentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| ID of the payment to cancel |

### Return type

[**UnitResponse9**](UnitResponse9.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

