# GetListAccountsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListAccounts**](GetListAccountsApi.md#findListAccounts) | **GET** /accounts/ | Get List Accounts

<a name="findListAccounts"></a>
# **findListAccounts**
> UnitResponseAccountsList findListAccounts(page, filter)

Get List Accounts

Get List Accounts from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListAccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListAccountsApi apiInstance = new GetListAccountsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter2 filter = new Filter2(); // Filter2 | 
try {
    UnitResponseAccountsList result = apiInstance.findListAccounts(page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListAccountsApi#findListAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter2**](.md)|  | [optional]

### Return type

[**UnitResponseAccountsList**](UnitResponseAccountsList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

