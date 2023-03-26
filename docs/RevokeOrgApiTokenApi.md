# RevokeOrgApiTokenApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**revokeOrgApiToken**](RevokeOrgApiTokenApi.md#revokeOrgApiToken) | **DELETE** /users/{userId}/api-tokens/{tokenId} | Get Reward by Id

<a name="revokeOrgApiToken"></a>
# **revokeOrgApiToken**
> UnitResponse24 revokeOrgApiToken(userId, tokenId)

Get Reward by Id

Get a Reward from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RevokeOrgApiTokenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


RevokeOrgApiTokenApi apiInstance = new RevokeOrgApiTokenApi();
String userId = "userId_example"; // String | ID of the user to revoke token
String tokenId = "tokenId_example"; // String | ID of the token to revoke
try {
    UnitResponse24 result = apiInstance.revokeOrgApiToken(userId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RevokeOrgApiTokenApi#revokeOrgApiToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| ID of the user to revoke token |
 **tokenId** | **String**| ID of the token to revoke |

### Return type

[**UnitResponse24**](UnitResponse24.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

