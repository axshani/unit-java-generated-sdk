# EnterControlAgreementForAccountApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterDacaAccountById**](EnterControlAgreementForAccountApi.md#enterDacaAccountById) | **POST** /accounts/{accountId}/enter-daca | Enter Account Control Agreement by Id

<a name="enterDacaAccountById"></a>
# **enterDacaAccountById**
> UnitResponse6 enterDacaAccountById(accountId)

Enter Account Control Agreement by Id

Enter Control Agreement for Account via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EnterControlAgreementForAccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EnterControlAgreementForAccountApi apiInstance = new EnterControlAgreementForAccountApi();
String accountId = "accountId_example"; // String | ID of the account
try {
    UnitResponse6 result = apiInstance.enterDacaAccountById(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterControlAgreementForAccountApi#enterDacaAccountById");
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

