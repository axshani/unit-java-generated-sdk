# GetListPaymentsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListPayments**](GetListPaymentsApi.md#getListPayments) | **GET** /payments/ | Get List Payments

<a name="getListPayments"></a>
# **getListPayments**
> InlineResponse200 getListPayments(page, filter)

Get List Payments

Get List Payments from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListPaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListPaymentsApi apiInstance = new GetListPaymentsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter3 filter = new Filter3(); // Filter3 | 
try {
    InlineResponse200 result = apiInstance.getListPayments(page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListPaymentsApi#getListPayments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter3**](.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

