# GetAccountLimitsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountLimits**](GetAccountLimitsApi.md#getAccountLimits) | **GET** /accounts/{accountId}/limits | Get Account Limits by Id

<a name="getAccountLimits"></a>
# **getAccountLimits**
> UnitResponse5 getAccountLimits(accountId)

Get Account Limits by Id

Get Account Limits from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetAccountLimitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetAccountLimitsApi apiInstance = new GetAccountLimitsApi();
String accountId = "accountId_example"; // String | ID of the account to get
try {
    UnitResponse5 result = apiInstance.getAccountLimits(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetAccountLimitsApi#getAccountLimits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to get |

### Return type

[**UnitResponse5**](UnitResponse5.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

