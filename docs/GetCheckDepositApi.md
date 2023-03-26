# GetCheckDepositApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCheckDepositById**](GetCheckDepositApi.md#findCheckDepositById) | **GET** /check-deposits/{checkDepositId} | Get Check Deposit by Id

<a name="findCheckDepositById"></a>
# **findCheckDepositById**
> UnitResponse23 findCheckDepositById(checkDepositId)

Get Check Deposit by Id

Get a Check Deposit from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetCheckDepositApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetCheckDepositApi apiInstance = new GetCheckDepositApi();
String checkDepositId = "checkDepositId_example"; // String | ID of the check deposit to get
try {
    UnitResponse23 result = apiInstance.findCheckDepositById(checkDepositId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetCheckDepositApi#findCheckDepositById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkDepositId** | **String**| ID of the check deposit to get |

### Return type

[**UnitResponse23**](UnitResponse23.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

