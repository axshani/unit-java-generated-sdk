# CloseACardApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**closeCard**](CloseACardApi.md#closeCard) | **POST** /cards/{cardId}/close | Close a Card

<a name="closeCard"></a>
# **closeCard**
> UnitResponse14 closeCard()

Close a Card

Close a Card via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloseACardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CloseACardApi apiInstance = new CloseACardApi();
try {
    UnitResponse14 result = apiInstance.closeCard();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloseACardApi#closeCard");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnitResponse14**](UnitResponse14.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

