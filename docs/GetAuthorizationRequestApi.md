# GetAuthorizationRequestApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findAuthorizationRequestById**](GetAuthorizationRequestApi.md#findAuthorizationRequestById) | **GET** /authorization-requests/{authorizationId} | Get Authorization Request by Id
[**findAuthorizationRequestById_0**](GetAuthorizationRequestApi.md#findAuthorizationRequestById_0) | **POST** /authorization-requests/{authorizationId}/decline | Get Authorization Request by Id

<a name="findAuthorizationRequestById"></a>
# **findAuthorizationRequestById**
> UnitResponse17 findAuthorizationRequestById(authorizationId)

Get Authorization Request by Id

Get a Authorization Request from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetAuthorizationRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetAuthorizationRequestApi apiInstance = new GetAuthorizationRequestApi();
String authorizationId = "authorizationId_example"; // String | ID of the authorization request to get
try {
    UnitResponse17 result = apiInstance.findAuthorizationRequestById(authorizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetAuthorizationRequestApi#findAuthorizationRequestById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizationId** | **String**| ID of the authorization request to get |

### Return type

[**UnitResponse17**](UnitResponse17.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

<a name="findAuthorizationRequestById_0"></a>
# **findAuthorizationRequestById_0**
> UnitResponse17 findAuthorizationRequestById_0(authorizationId)

Get Authorization Request by Id

Get a Authorization Request from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetAuthorizationRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetAuthorizationRequestApi apiInstance = new GetAuthorizationRequestApi();
String authorizationId = "authorizationId_example"; // String | ID of the authorization request to get
try {
    UnitResponse17 result = apiInstance.findAuthorizationRequestById_0(authorizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetAuthorizationRequestApi#findAuthorizationRequestById_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizationId** | **String**| ID of the authorization request to get |

### Return type

[**UnitResponse17**](UnitResponse17.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

