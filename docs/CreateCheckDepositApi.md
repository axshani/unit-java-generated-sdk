# CreateCheckDepositApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCheckDeposit**](CreateCheckDepositApi.md#createCheckDeposit) | **POST** /check-deposits/ | Create Check Deposit

<a name="createCheckDeposit"></a>
# **createCheckDeposit**
> UnitResponse23 createCheckDeposit(body)

Create Check Deposit

Create a Check Deposit via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateCheckDepositApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateCheckDepositApi apiInstance = new CreateCheckDepositApi();
CheckdepositsBody body = new CheckdepositsBody(); // CheckdepositsBody | Create Check Deposit Request
try {
    UnitResponse23 result = apiInstance.createCheckDeposit(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateCheckDepositApi#createCheckDeposit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckdepositsBody**](CheckdepositsBody.md)| Create Check Deposit Request |

### Return type

[**UnitResponse23**](UnitResponse23.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

