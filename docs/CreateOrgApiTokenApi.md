# CreateOrgApiTokenApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrgApiToken**](CreateOrgApiTokenApi.md#createOrgApiToken) | **POST** /users/{userId}/api-tokens | Create Org API Token

<a name="createOrgApiToken"></a>
# **createOrgApiToken**
> UnitResponse24 createOrgApiToken(body)

Create Org API Token

Create an Org API Token via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateOrgApiTokenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateOrgApiTokenApi apiInstance = new CreateOrgApiTokenApi();
UserIdApitokensBody body = new UserIdApitokensBody(); // UserIdApitokensBody | Create Org API Token Request
try {
    UnitResponse24 result = apiInstance.createOrgApiToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateOrgApiTokenApi#createOrgApiToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserIdApitokensBody**](UserIdApitokensBody.md)| Create Org API Token Request |

### Return type

[**UnitResponse24**](UnitResponse24.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

