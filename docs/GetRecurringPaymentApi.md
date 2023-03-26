# GetRecurringPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecurringPayment**](GetRecurringPaymentApi.md#getRecurringPayment) | **GET** /recurring-payments/{paymentId} | Get Recurring Payment

<a name="getRecurringPayment"></a>
# **getRecurringPayment**
> UnitResponse13 getRecurringPayment(paymentId)

Get Recurring Payment

Get Recurring Payment from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetRecurringPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetRecurringPaymentApi apiInstance = new GetRecurringPaymentApi();
String paymentId = "paymentId_example"; // String | ID of the payment to get
try {
    UnitResponse13 result = apiInstance.getRecurringPayment(paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetRecurringPaymentApi#getRecurringPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| ID of the payment to get |

### Return type

[**UnitResponse13**](UnitResponse13.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

