# GetListCustomersApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCustomersList**](GetListCustomersApi.md#getCustomersList) | **GET** /customers | Get Customers List

<a name="getCustomersList"></a>
# **getCustomersList**
> UnitResponse8 getCustomersList()

Get Customers List

Get Customers List from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListCustomersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListCustomersApi apiInstance = new GetListCustomersApi();
try {
    UnitResponse8 result = apiInstance.getCustomersList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListCustomersApi#getCustomersList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnitResponse8**](UnitResponse8.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

