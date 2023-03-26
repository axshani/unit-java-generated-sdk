# GetReceivedPaymentsListApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReceivedPayments**](GetReceivedPaymentsListApi.md#getReceivedPayments) | **GET** /received-payments | Get Received Payments List

<a name="getReceivedPayments"></a>
# **getReceivedPayments**
> UnitResponse9 getReceivedPayments(paymentId, included)

Get Received Payments List

Get Received Payments from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetReceivedPaymentsListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetReceivedPaymentsListApi apiInstance = new GetReceivedPaymentsListApi();
String paymentId = "paymentId_example"; // String | ID of the payment to get
String included = "included_example"; // String | 
try {
    UnitResponse9 result = apiInstance.getReceivedPayments(paymentId, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetReceivedPaymentsListApi#getReceivedPayments");
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

