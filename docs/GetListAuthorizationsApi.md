# GetListAuthorizationsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListAuthorizations**](GetListAuthorizationsApi.md#findListAuthorizations) | **GET** /authorizations/ | Get List authorizations

<a name="findListAuthorizations"></a>
# **findListAuthorizations**
> List&lt;Authorization&gt; findListAuthorizations(page, filter, sort)

Get List authorizations

Get List Authorizations from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListAuthorizationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListAuthorizationsApi apiInstance = new GetListAuthorizationsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter5 filter = new Filter5(); // Filter5 | 
String sort = "-createdAt"; // String | 
try {
    List<Authorization> result = apiInstance.findListAuthorizations(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListAuthorizationsApi#findListAuthorizations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter5**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**List&lt;Authorization&gt;**](Authorization.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

