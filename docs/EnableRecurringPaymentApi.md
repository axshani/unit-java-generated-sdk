# EnableRecurringPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enableRecurringPayment**](EnableRecurringPaymentApi.md#enableRecurringPayment) | **POST** /recurring-payments/{paymentId}/enable | Enable Recurring Payment

<a name="enableRecurringPayment"></a>
# **enableRecurringPayment**
> UnitResponse13 enableRecurringPayment(paymentId)

Enable Recurring Payment

Enable Recurring Payment via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnableRecurringPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnableRecurringPaymentApi apiInstance = new EnableRecurringPaymentApi();
String paymentId = "paymentId_example"; // String | ID of the payment to enable
try {
    UnitResponse13 result = apiInstance.enableRecurringPayment(paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnableRecurringPaymentApi#enableRecurringPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| ID of the payment to enable |

### Return type

[**UnitResponse13**](UnitResponse13.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

