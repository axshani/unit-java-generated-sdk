# GetPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPaymentById**](GetPaymentApi.md#findPaymentById) | **GET** /payments/{paymentId} | Get Payment by Id

<a name="findPaymentById"></a>
# **findPaymentById**
> UnitResponse9 findPaymentById(paymentId, included)

Get Payment by Id

Get a Payment from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetPaymentApi apiInstance = new GetPaymentApi();
String paymentId = "paymentId_example"; // String | ID of the payment to get
String included = "included_example"; // String | 
try {
    UnitResponse9 result = apiInstance.findPaymentById(paymentId, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetPaymentApi#findPaymentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| ID of the payment to get |
 **included** | **String**|  | [optional]

### Return type

[**UnitResponse9**](UnitResponse9.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

