# UpdateCheckDepositApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateCheckDeposit**](UpdateCheckDepositApi.md#updateCheckDeposit) | **PATCH** /check-deposits/{checkDepositId} | Update Check Deposit

<a name="updateCheckDeposit"></a>
# **updateCheckDeposit**
> UnitResponse23 updateCheckDeposit(body, checkDepositId)

Update Check Deposit

Update a Check Deposit via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdateCheckDepositApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdateCheckDepositApi apiInstance = new UpdateCheckDepositApi();
UpdateUnitRequest body = new UpdateUnitRequest(); // UpdateUnitRequest | Update Check Deposit Request
String checkDepositId = "checkDepositId_example"; // String | ID of the check deposit to update
try {
    UnitResponse23 result = apiInstance.updateCheckDeposit(body, checkDepositId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateCheckDepositApi#updateCheckDeposit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateUnitRequest**](UpdateUnitRequest.md)| Update Check Deposit Request |
 **checkDepositId** | **String**| ID of the check deposit to update |

### Return type

[**UnitResponse23**](UnitResponse23.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

