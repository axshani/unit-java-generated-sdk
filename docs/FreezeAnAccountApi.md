# FreezeAnAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**freezeAccountById**](FreezeAnAccountApi.md#freezeAccountById) | **POST** /accounts/{accountId}/freeze | Freeze an Account by Id

<a name="freezeAccountById"></a>
# **freezeAccountById**
> UnitResponse4 freezeAccountById(body, accountId)

Freeze an Account by Id

Freeze an Account via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FreezeAnAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FreezeAnAccountApi apiInstance = new FreezeAnAccountApi();
Object body = null; // Object | Freeze Account Request
String accountId = "accountId_example"; // String | ID of the account to freeze
try {
    UnitResponse4 result = apiInstance.freezeAccountById(body, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FreezeAnAccountApi#freezeAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Freeze Account Request |
 **accountId** | **String**| ID of the account to freeze |

### Return type

[**UnitResponse4**](UnitResponse4.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

