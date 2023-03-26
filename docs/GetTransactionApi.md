# GetTransactionApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findTransactionId**](GetTransactionApi.md#findTransactionId) | **GET** /accounts/{accountId}/transactions/{transactionId}/ | Get Transaction by Id

<a name="findTransactionId"></a>
# **findTransactionId**
> UnitResponse29 findTransactionId(accountId, transactionId)

Get Transaction by Id

Get a Transaction from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetTransactionApi apiInstance = new GetTransactionApi();
String accountId = "accountId_example"; // String | ID of the account to get transaction from
String transactionId = "transactionId_example"; // String | ID of the transaction
try {
    UnitResponse29 result = apiInstance.findTransactionId(accountId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetTransactionApi#findTransactionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to get transaction from |
 **transactionId** | **String**| ID of the transaction |

### Return type

[**UnitResponse29**](UnitResponse29.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

