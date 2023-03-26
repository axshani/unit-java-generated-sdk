# ConfirmCheckDepositApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmCheckDeposit**](ConfirmCheckDepositApi.md#confirmCheckDeposit) | **POST** /check-deposits/{checkDepositId}/confirm | Confirm by Id

<a name="confirmCheckDeposit"></a>
# **confirmCheckDeposit**
> UnitResponse23 confirmCheckDeposit(checkDepositId)

Confirm by Id

Confirm a Check Deposit from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConfirmCheckDepositApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ConfirmCheckDepositApi apiInstance = new ConfirmCheckDepositApi();
String checkDepositId = "checkDepositId_example"; // String | ID of the check deposit to confirm
try {
    UnitResponse23 result = apiInstance.confirmCheckDeposit(checkDepositId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfirmCheckDepositApi#confirmCheckDeposit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **checkDepositId** | **String**| ID of the check deposit to confirm |

### Return type

[**UnitResponse23**](UnitResponse23.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

