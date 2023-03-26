# GetListTransactionsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListTransactions**](GetListTransactionsApi.md#findListTransactions) | **GET** /transactions | Get List Transactions

<a name="findListTransactions"></a>
# **findListTransactions**
> List&lt;Transaction&gt; findListTransactions(page, filter, sort)

Get List Transactions

Get List Transactions from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListTransactionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListTransactionsApi apiInstance = new GetListTransactionsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter12 filter = new Filter12(); // Filter12 | 
String sort = "-createdAt"; // String | 
try {
    List<Transaction> result = apiInstance.findListTransactions(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListTransactionsApi#findListTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter12**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**List&lt;Transaction&gt;**](Transaction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

