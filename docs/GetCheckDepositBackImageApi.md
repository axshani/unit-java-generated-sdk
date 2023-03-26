# GetCheckDepositBackImageApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBackCheckDepositImageById**](GetCheckDepositBackImageApi.md#getBackCheckDepositImageById) | **GET** /check-deposits/{checkDepositId}/back | Get Back Check Deposit Image by Id

<a name="getBackCheckDepositImageById"></a>
# **getBackCheckDepositImageById**
> UnitResponse18 getBackCheckDepositImageById(checkDepositId)

Get Back Check Deposit Image by Id

Get Back Check Deposit Image from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetCheckDepositBackImageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetCheckDepositBackImageApi apiInstance = new GetCheckDepositBackImageApi();
String checkDepositId = "checkDepositId_example"; // String | ID of the check deposit to get
try {
    UnitResponse18 result = apiInstance.getBackCheckDepositImageById(checkDepositId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetCheckDepositBackImageApi#getBackCheckDepositImageById");
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

