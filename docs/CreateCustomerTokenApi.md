# CreateCustomerTokenApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerToken**](CreateCustomerTokenApi.md#createCustomerToken) | **POST** /customers/{customerId}/token | Create Customer Token

<a name="createCustomerToken"></a>
# **createCustomerToken**
> UnitResponse25 createCustomerToken(body, customerId)

Create Customer Token

Create a Customer Token via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateCustomerTokenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateCustomerTokenApi apiInstance = new CreateCustomerTokenApi();
Object body = null; // Object | Create Customer Token Request
String customerId = "customerId_example"; // String | ID of the customer to create token for
try {
    UnitResponse25 result = apiInstance.createCustomerToken(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateCustomerTokenApi#createCustomerToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Create Customer Token Request |
 **customerId** | **String**| ID of the customer to create token for |

### Return type

[**UnitResponse25**](UnitResponse25.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

