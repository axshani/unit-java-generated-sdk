# GetCheckDepositFrontImageApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFrontCheckDepositImageById**](GetCheckDepositFrontImageApi.md#getFrontCheckDepositImageById) | **GET** /check-deposits/{checkDepositId}/front | Get Front Check Deposit Image by Id

<a name="getFrontCheckDepositImageById"></a>
# **getFrontCheckDepositImageById**
> UnitResponse18 getFrontCheckDepositImageById(checkDepositId)

Get Front Check Deposit Image by Id

Get Front Check Deposit Image from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetCheckDepositFrontImageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetCheckDepositFrontImageApi apiInstance = new GetCheckDepositFrontImageApi();
String checkDepositId = "checkDepositId_example"; // String | ID of the check deposit to get
try {
    UnitResponse18 result = apiInstance.getFrontCheckDepositImageById(checkDepositId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetCheckDepositFrontImageApi#getFrontCheckDepositImageById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkDepositId** | **String**| ID of the check deposit to get |

### Return type

[**UnitResponse18**](UnitResponse18.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

