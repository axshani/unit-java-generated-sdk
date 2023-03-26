# GetListAuthorizationRequestsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListAuthorizationRequests**](GetListAuthorizationRequestsApi.md#findListAuthorizationRequests) | **GET** /authorization-requests/ | Get List Authorization Requests

<a name="findListAuthorizationRequests"></a>
# **findListAuthorizationRequests**
> List&lt;AuthorizationRequest&gt; findListAuthorizationRequests(page, filter, sort)

Get List Authorization Requests

Get List Authorization Requests from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListAuthorizationRequestsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListAuthorizationRequestsApi apiInstance = new GetListAuthorizationRequestsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter6 filter = new Filter6(); // Filter6 | 
String sort = "-createdAt"; // String | 
try {
    List<AuthorizationRequest> result = apiInstance.findListAuthorizationRequests(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListAuthorizationRequestsApi#findListAuthorizationRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter6**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**List&lt;AuthorizationRequest&gt;**](AuthorizationRequest.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

