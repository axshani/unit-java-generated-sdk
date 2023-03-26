# UnfreezeACardApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**unfreezeCard**](UnfreezeACardApi.md#unfreezeCard) | **POST** /cards/{cardId}/unfreeze | Unfreeze a Card

<a name="unfreezeCard"></a>
# **unfreezeCard**
> UnitResponse14 unfreezeCard()

Unfreeze a Card

Unfreeze a Card via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UnfreezeACardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UnfreezeACardApi apiInstance = new UnfreezeACardApi();
try {
    UnitResponse14 result = apiInstance.unfreezeCard();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UnfreezeACardApi#unfreezeCard");
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

