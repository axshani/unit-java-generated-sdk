# GetListOrgApiTokensApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListOrgApiTokens**](GetListOrgApiTokensApi.md#findListOrgApiTokens) | **GET** /users/ | Get List Org API Tokens

<a name="findListOrgApiTokens"></a>
# **findListOrgApiTokens**
> List&lt;ApiToken&gt; findListOrgApiTokens(page, filter, sort)

Get List Org API Tokens

Get List Org API Tokens from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListOrgApiTokensApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListOrgApiTokensApi apiInstance = new GetListOrgApiTokensApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter9 filter = new Filter9(); // Filter9 | 
String sort = "-createdAt"; // String | 
try {
    List<ApiToken> result = apiInstance.findListOrgApiTokens(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListOrgApiTokensApi#findListOrgApiTokens");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter9**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**List&lt;ApiToken&gt;**](ApiToken.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

