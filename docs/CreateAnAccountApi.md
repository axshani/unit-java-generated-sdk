# CreateAnAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](CreateAnAccountApi.md#createAccount) | **POST** /accounts/ | Create an Account

<a name="createAccount"></a>
# **createAccount**
> UnitResponse4 createAccount(body)

Create an Account

Create an Account via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateAnAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateAnAccountApi apiInstance = new CreateAnAccountApi();
AccountsBody body = new AccountsBody(); // AccountsBody | Create Account Request
try {
    UnitResponse4 result = apiInstance.createAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateAnAccountApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountsBody**](AccountsBody.md)| Create Account Request |

### Return type

[**UnitResponse4**](UnitResponse4.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

