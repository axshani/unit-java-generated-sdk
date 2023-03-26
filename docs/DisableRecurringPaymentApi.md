# DisableRecurringPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableRecurringPayment**](DisableRecurringPaymentApi.md#disableRecurringPayment) | **POST** /recurring-payments/{paymentId}/disable | Disable Recurring Payment

<a name="disableRecurringPayment"></a>
# **disableRecurringPayment**
> UnitResponse13 disableRecurringPayment(paymentId)

Disable Recurring Payment

Disable Recurring Payment via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DisableRecurringPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DisableRecurringPaymentApi apiInstance = new DisableRecurringPaymentApi();
String paymentId = "paymentId_example"; // String | ID of the payment to disable
try {
    UnitResponse13 result = apiInstance.disableRecurringPayment(paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DisableRecurringPaymentApi#disableRecurringPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| ID of the payment to disable |

### Return type

[**UnitResponse13**](UnitResponse13.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

