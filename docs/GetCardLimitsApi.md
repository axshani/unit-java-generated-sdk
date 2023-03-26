# GetCardLimitsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardLimitsById**](GetCardLimitsApi.md#getCardLimitsById) | **GET** /cards/{cardId}/limits | Get Card by Id

<a name="getCardLimitsById"></a>
# **getCardLimitsById**
> UnitResponse15 getCardLimitsById(cardId)

Get Card by Id

Get a Card from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetCardLimitsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetCardLimitsApi apiInstance = new GetCardLimitsApi();
String cardId = "cardId_example"; // String | ID of the card to get
try {
    UnitResponse15 result = apiInstance.getCardLimitsById(cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetCardLimitsApi#getCardLimitsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardId** | **String**| ID of the card to get |

### Return type

[**UnitResponse15**](UnitResponse15.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

