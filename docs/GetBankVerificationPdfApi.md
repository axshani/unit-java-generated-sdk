# GetBankVerificationPdfApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBankVerificationPdf**](GetBankVerificationPdfApi.md#getBankVerificationPdf) | **GET** /statements/{accountId}/bank/pdf | Get Bank verification PDF

<a name="getBankVerificationPdf"></a>
# **getBankVerificationPdf**
> UnitResponse18 getBankVerificationPdf(accountId)

Get Bank verification PDF

Get Get Bank verification PDF from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetBankVerificationPdfApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetBankVerificationPdfApi apiInstance = new GetBankVerificationPdfApi();
String accountId = "accountId_example"; // String | ID of the account to get
try {
    UnitResponse18 result = apiInstance.getBankVerificationPdf(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetBankVerificationPdfApi#getBankVerificationPdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| ID of the account to get |

### Return type

[**UnitResponse18**](UnitResponse18.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

