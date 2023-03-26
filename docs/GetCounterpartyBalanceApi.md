# GetCounterpartyBalanceApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCounterpartyBalance**](GetCounterpartyBalanceApi.md#getCounterpartyBalance) | **GET** /counterparties/{counterpartyId}/balance | Get Counterparty Balance

<a name="getCounterpartyBalance"></a>
# **getCounterpartyBalance**
> UnitResponse12 getCounterpartyBalance(counterpartyId)

Get Counterparty Balance

Get Recurring Payment from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetCounterpartyBalanceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetCounterpartyBalanceApi apiInstance = new GetCounterpartyBalanceApi();
String counterpartyId = "counterpartyId_example"; // String | ID of the counterparty to get
try {
    UnitResponse12 result = apiInstance.getCounterpartyBalance(counterpartyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetCounterpartyBalanceApi#getCounterpartyBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterpartyId** | **String**| ID of the counterparty to get |

### Return type

[**UnitResponse12**](UnitResponse12.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

