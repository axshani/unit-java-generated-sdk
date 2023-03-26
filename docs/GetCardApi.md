# GetCardApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCardById**](GetCardApi.md#findCardById) | **GET** /cards/{cardId} | Get Card by Id

<a name="findCardById"></a>
# **findCardById**
> UnitResponse14 findCardById(cardId, included)

Get Card by Id

Get a Card from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetCardApi apiInstance = new GetCardApi();
String cardId = "cardId_example"; // String | ID of the card to get
String included = "included_example"; // String | 
try {
    UnitResponse14 result = apiInstance.findCardById(cardId, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetCardApi#findCardById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **String**| ID of the card to get |
 **included** | **String**|  | [optional]

### Return type

[**UnitResponse14**](UnitResponse14.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

