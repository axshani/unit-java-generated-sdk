# CreateCustomerTokenVerificationApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerTokenVerification**](CreateCustomerTokenVerificationApi.md#createCustomerTokenVerification) | **POST** /customers/{customerId}/token/verification | Create Customer Token Verification

<a name="createCustomerTokenVerification"></a>
# **createCustomerTokenVerification**
> UnitResponse26 createCustomerTokenVerification(body, customerId)

Create Customer Token Verification

Create a Customer Token Verification via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateCustomerTokenVerificationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateCustomerTokenVerificationApi apiInstance = new CreateCustomerTokenVerificationApi();
Object body = null; // Object | Create Customer Token Verification Request
String customerId = "customerId_example"; // String | ID of the customer to create token for
try {
    UnitResponse26 result = apiInstance.createCustomerTokenVerification(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateCustomerTokenVerificationApi#createCustomerTokenVerification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Create Customer Token Verification Request |
 **customerId** | **String**| ID of the customer to create token for |

### Return type

[**UnitResponse26**](UnitResponse26.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

