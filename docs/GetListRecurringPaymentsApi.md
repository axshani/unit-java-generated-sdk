# GetListRecurringPaymentsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecurringPaymentsList**](GetListRecurringPaymentsApi.md#getRecurringPaymentsList) | **GET** /recurring-payments | Get Recurring Payments List

<a name="getRecurringPaymentsList"></a>
# **getRecurringPaymentsList**
> UnitResponse13 getRecurringPaymentsList()

Get Recurring Payments List

Get Recurring Payments List from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListRecurringPaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListRecurringPaymentsApi apiInstance = new GetListRecurringPaymentsApi();
try {
    UnitResponse13 result = apiInstance.getRecurringPaymentsList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListRecurringPaymentsApi#getRecurringPaymentsList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnitResponse13**](UnitResponse13.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

