# CreateRecurringPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRecurringPayment**](CreateRecurringPaymentApi.md#createRecurringPayment) | **POST** /recurring-payments | Create Recurring Payment

<a name="createRecurringPayment"></a>
# **createRecurringPayment**
> UnitResponse13 createRecurringPayment(body)

Create Recurring Payment

Create a Recurring Payment via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateRecurringPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateRecurringPaymentApi apiInstance = new CreateRecurringPaymentApi();
RecurringpaymentsBody body = new RecurringpaymentsBody(); // RecurringpaymentsBody | Create Recurring Payment Request
try {
    UnitResponse13 result = apiInstance.createRecurringPayment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateRecurringPaymentApi#createRecurringPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RecurringpaymentsBody**](RecurringpaymentsBody.md)| Create Recurring Payment Request |

### Return type

[**UnitResponse13**](UnitResponse13.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

