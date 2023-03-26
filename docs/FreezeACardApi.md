# FreezeACardApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**freezeCard**](FreezeACardApi.md#freezeCard) | **POST** /cards/{cardId}/freeze | Freeze a Card

<a name="freezeCard"></a>
# **freezeCard**
> UnitResponse14 freezeCard()

Freeze a Card

Freeze a Card via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FreezeACardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FreezeACardApi apiInstance = new FreezeACardApi();
try {
    UnitResponse14 result = apiInstance.freezeCard();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FreezeACardApi#freezeCard");
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

