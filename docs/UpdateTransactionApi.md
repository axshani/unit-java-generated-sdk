# UpdateTransactionApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateTransaction**](UpdateTransactionApi.md#updateTransaction) | **PATCH** /accounts/{accountId}/transactions/{transactionId}/ | Update Transaction

<a name="updateTransaction"></a>
# **updateTransaction**
> UnitResponse29 updateTransaction(body, accountId, transactionId)

Update Transaction

Update a Transaction via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdateTransactionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdateTransactionApi apiInstance = new UpdateTransactionApi();
UpdateUnitRequest body = new UpdateUnitRequest(); // UpdateUnitRequest | Update Transaction Request
String accountId = "accountId_example"; // String | ID of the account to update transaction from
String transactionId = "transactionId_example"; // String | ID of the transaction to update
try {
    UnitResponse29 result = apiInstance.updateTransaction(body, accountId, transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateTransactionApi#updateTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateUnitRequest**](UpdateUnitRequest.md)| Update Transaction Request |
 **accountId** | **String**| ID of the account to update transaction from |
 **transactionId** | **String**| ID of the transaction to update |

### Return type

[**UnitResponse29**](UnitResponse29.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

