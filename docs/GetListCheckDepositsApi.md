# GetListCheckDepositsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListCheckDeposits**](GetListCheckDepositsApi.md#findListCheckDeposits) | **GET** /check-deposits/ | Get List Check Deposits

<a name="findListCheckDeposits"></a>
# **findListCheckDeposits**
> List&lt;CheckDeposit&gt; findListCheckDeposits(page, filter, sort)

Get List Check Deposits

Get List Check Deposits from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListCheckDepositsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListCheckDepositsApi apiInstance = new GetListCheckDepositsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter8 filter = new Filter8(); // Filter8 | 
String sort = "-createdAt"; // String | 
try {
    List<CheckDeposit> result = apiInstance.findListCheckDeposits(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListCheckDepositsApi#findListCheckDeposits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter8**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**List&lt;CheckDeposit&gt;**](CheckDeposit.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

