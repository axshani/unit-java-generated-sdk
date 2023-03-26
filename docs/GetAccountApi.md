# GetAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAccountById**](GetAccountApi.md#findAccountById) | **GET** /accounts/{accountId} | Get Account by Id

<a name="findAccountById"></a>
# **findAccountById**
> UnitResponse4 findAccountById(accountId, included)

Get Account by Id

Get an Account from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetAccountApi apiInstance = new GetAccountApi();
String accountId = "accountId_example"; // String | ID of the account to get
String included = "included_example"; // String | 
try {
    UnitResponse4 result = apiInstance.findAccountById(accountId, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetAccountApi#findAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to get |
 **included** | **String**|  | [optional]

### Return type

[**UnitResponse4**](UnitResponse4.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

