# ReopenAnAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reopenAccountById**](ReopenAnAccountApi.md#reopenAccountById) | **POST** /accounts/{accountId}/reopen | Reopen an Account by Id

<a name="reopenAccountById"></a>
# **reopenAccountById**
> UnitResponse6 reopenAccountById(accountId)

Reopen an Account by Id

Reopen an Account via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReopenAnAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReopenAnAccountApi apiInstance = new ReopenAnAccountApi();
String accountId = "accountId_example"; // String | ID of the account to close
try {
    UnitResponse6 result = apiInstance.reopenAccountById(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReopenAnAccountApi#reopenAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to close |

### Return type

[**UnitResponse6**](UnitResponse6.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

