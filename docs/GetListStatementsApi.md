# GetListStatementsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListStatements**](GetListStatementsApi.md#findListStatements) | **GET** /statements/ | Get List Statements

<a name="findListStatements"></a>
# **findListStatements**
> List&lt;Object&gt; findListStatements(page, filter, sort)

Get List Statements

Get List Statements from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListStatementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListStatementsApi apiInstance = new GetListStatementsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter7 filter = new Filter7(); // Filter7 | 
String sort = "-createdAt"; // String | 
try {
    List<Object> result = apiInstance.findListStatements(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListStatementsApi#findListStatements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter7**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

