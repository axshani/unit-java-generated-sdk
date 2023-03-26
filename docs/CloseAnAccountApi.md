# CloseAnAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closeAccountById**](CloseAnAccountApi.md#closeAccountById) | **POST** /accounts/{accountId}/close | Close an Account by Id

<a name="closeAccountById"></a>
# **closeAccountById**
> UnitResponse4 closeAccountById(body, accountId)

Close an Account by Id

Close an Account via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloseAnAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CloseAnAccountApi apiInstance = new CloseAnAccountApi();
AccountIdCloseBody body = new AccountIdCloseBody(); // AccountIdCloseBody | Close Account Request
String accountId = "accountId_example"; // String | ID of the account to close
try {
    UnitResponse4 result = apiInstance.closeAccountById(body, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloseAnAccountApi#closeAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountIdCloseBody**](AccountIdCloseBody.md)| Close Account Request |
 **accountId** | **String**| ID of the account to close |

### Return type

[**UnitResponse4**](UnitResponse4.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

