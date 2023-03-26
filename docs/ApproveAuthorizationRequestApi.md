# ApproveAuthorizationRequestApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approveAuthorizationRequestById**](ApproveAuthorizationRequestApi.md#approveAuthorizationRequestById) | **POST** /authorization-requests/{authorizationId}/approve | Approve Authorization Request by Id

<a name="approveAuthorizationRequestById"></a>
# **approveAuthorizationRequestById**
> UnitResponse17 approveAuthorizationRequestById(authorizationId)

Approve Authorization Request by Id

Approve a Authorization Request via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApproveAuthorizationRequestApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ApproveAuthorizationRequestApi apiInstance = new ApproveAuthorizationRequestApi();
String authorizationId = "authorizationId_example"; // String | ID of the authorization request to approve
try {
    UnitResponse17 result = apiInstance.approveAuthorizationRequestById(authorizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApproveAuthorizationRequestApi#approveAuthorizationRequestById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizationId** | **String**| ID of the authorization request to approve |

### Return type

[**UnitResponse17**](UnitResponse17.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

