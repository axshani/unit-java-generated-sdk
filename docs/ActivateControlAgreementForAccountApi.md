# ActivateControlAgreementForAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateDacaAccountById**](ActivateControlAgreementForAccountApi.md#activateDacaAccountById) | **POST** /accounts/{accountId}/activate-daca | Activate Account Control Agreement by Id

<a name="activateDacaAccountById"></a>
# **activateDacaAccountById**
> UnitResponse6 activateDacaAccountById(accountId)

Activate Account Control Agreement by Id

Activate Control Agreement for Account via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActivateControlAgreementForAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ActivateControlAgreementForAccountApi apiInstance = new ActivateControlAgreementForAccountApi();
String accountId = "accountId_example"; // String | ID of the account
try {
    UnitResponse6 result = apiInstance.activateDacaAccountById(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivateControlAgreementForAccountApi#activateDacaAccountById");
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

