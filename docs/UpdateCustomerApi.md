# UpdateCustomerApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateCustomer**](UpdateCustomerApi.md#updateCustomer) | **PATCH** /customers/{customerId} | Update Customer

<a name="updateCustomer"></a>
# **updateCustomer**
> UnitResponse8 updateCustomer(body, customerId)

Update Customer

Update an Customer via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdateCustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdateCustomerApi apiInstance = new UpdateCustomerApi();
UpdateCustomer body = new UpdateCustomer(); // UpdateCustomer | Update Customer Request
String customerId = "customerId_example"; // String | ID of the customer to update
try {
    UnitResponse8 result = apiInstance.updateCustomer(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateCustomerApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateCustomer**](UpdateCustomer.md)| Update Customer Request |
 **customerId** | **String**| ID of the customer to update |

### Return type

[**UnitResponse8**](UnitResponse8.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

