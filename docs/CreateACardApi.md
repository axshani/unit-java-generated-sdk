# CreateACardApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCard**](CreateACardApi.md#createCard) | **POST** /cards/ | Create a Card
[**createCard_0**](CreateACardApi.md#createCard_0) | **POST** /cards/{cardId}/secure-data/pin/status | Create a Card

<a name="createCard"></a>
# **createCard**
> UnitResponse14 createCard(body)

Create a Card

Create a Card via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateACardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateACardApi apiInstance = new CreateACardApi();
Object body = null; // Object | Create Card Request
try {
    UnitResponse14 result = apiInstance.createCard(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateACardApi#createCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Create Card Request |

### Return type

[**UnitResponse14**](UnitResponse14.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

<a name="createCard_0"></a>
# **createCard_0**
> UnitResponse14 createCard_0(body)

Create a Card

Create a Card via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateACardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateACardApi apiInstance = new CreateACardApi();
Object body = null; // Object | Create Card Request
try {
    UnitResponse14 result = apiInstance.createCard_0(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateACardApi#createCard_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| Create Card Request |

### Return type

[**UnitResponse14**](UnitResponse14.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

