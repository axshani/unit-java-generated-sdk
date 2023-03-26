# GetCustomerApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCustomerById**](GetCustomerApi.md#findCustomerById) | **GET** /customers/{customerId} | Get Customer by Id

<a name="findCustomerById"></a>
# **findCustomerById**
> UnitResponse8 findCustomerById(customerId)

Get Customer by Id

Get a Customer from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetCustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetCustomerApi apiInstance = new GetCustomerApi();
String customerId = "customerId_example"; // String | ID of the customer to get
try {
    UnitResponse8 result = apiInstance.findCustomerById(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetCustomerApi#findCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **String**| ID of the customer to get |

### Return type

[**UnitResponse8**](UnitResponse8.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

