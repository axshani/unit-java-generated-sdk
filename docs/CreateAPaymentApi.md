# CreateAPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayment**](CreateAPaymentApi.md#createPayment) | **POST** /payments/ | Create a Payment

<a name="createPayment"></a>
# **createPayment**
> UnitResponse9 createPayment(body)

Create a Payment

Create a Payment via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateAPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateAPaymentApi apiInstance = new CreateAPaymentApi();
Object body = null; // Object | Create Payment Request
try {
    UnitResponse9 result = apiInstance.createPayment(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateAPaymentApi#createPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Create Payment Request |

### Return type

[**UnitResponse9**](UnitResponse9.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

