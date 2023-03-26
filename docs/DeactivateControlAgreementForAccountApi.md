# DeactivateControlAgreementForAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deactivateDacaAccountById**](DeactivateControlAgreementForAccountApi.md#deactivateDacaAccountById) | **POST** /accounts/{accountId}/deactivate-daca | Deactivate Account Control Agreement by Id

<a name="deactivateDacaAccountById"></a>
# **deactivateDacaAccountById**
> UnitResponse6 deactivateDacaAccountById(accountId)

Deactivate Account Control Agreement by Id

Deactivate Control Agreement for Account via API

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeactivateControlAgreementForAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DeactivateControlAgreementForAccountApi apiInstance = new DeactivateControlAgreementForAccountApi();
String accountId = "accountId_example"; // String | ID of the account
try {
    UnitResponse6 result = apiInstance.deactivateDacaAccountById(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeactivateControlAgreementForAccountApi#deactivateDacaAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account |

### Return type

[**UnitResponse6**](UnitResponse6.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

