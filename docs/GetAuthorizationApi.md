# GetAuthorizationApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAuthorizationId**](GetAuthorizationApi.md#findAuthorizationId) | **GET** /authorizations/{authorizationId} | Get Authorization by Id

<a name="findAuthorizationId"></a>
# **findAuthorizationId**
> UnitResponse16 findAuthorizationId(authorizationId, includeNoneAuthorized)

Get Authorization by Id

Get a Authorization from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetAuthorizationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetAuthorizationApi apiInstance = new GetAuthorizationApi();
String authorizationId = "authorizationId_example"; // String | ID of the authorization to get
Boolean includeNoneAuthorized = true; // Boolean | 
try {
    UnitResponse16 result = apiInstance.findAuthorizationId(authorizationId, includeNoneAuthorized);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetAuthorizationApi#findAuthorizationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizationId** | **String**| ID of the authorization to get |
 **includeNoneAuthorized** | **Boolean**|  | [optional]

### Return type

[**UnitResponse16**](UnitResponse16.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

