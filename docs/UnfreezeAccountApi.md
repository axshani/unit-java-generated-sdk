# UnfreezeAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**unfreezeAccountById**](UnfreezeAccountApi.md#unfreezeAccountById) | **POST** /accounts/{accountId}/unfreeze | Unfreeze Account by Id

<a name="unfreezeAccountById"></a>
# **unfreezeAccountById**
> UnitResponse4 unfreezeAccountById(accountId)

Unfreeze Account by Id

Unfreeze an Account via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UnfreezeAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UnfreezeAccountApi apiInstance = new UnfreezeAccountApi();
String accountId = "accountId_example"; // String | ID of the account to get
try {
    UnitResponse4 result = apiInstance.unfreezeAccountById(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnfreezeAccountApi#unfreezeAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to get |

### Return type

[**UnitResponse4**](UnitResponse4.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

