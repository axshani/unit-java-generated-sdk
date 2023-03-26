# UpdateCardApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateCard**](UpdateCardApi.md#updateCard) | **PATCH** /cards/{cardId} | Update Card

<a name="updateCard"></a>
# **updateCard**
> UnitResponse14 updateCard(body, cardId)

Update Card

Update a Card via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdateCardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdateCardApi apiInstance = new UpdateCardApi();
UpdateUnitRequest body = new UpdateUnitRequest(); // UpdateUnitRequest | Update Card Request
String cardId = "cardId_example"; // String | ID of the card to update
try {
    UnitResponse14 result = apiInstance.updateCard(body, cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateCardApi#updateCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateUnitRequest**](UpdateUnitRequest.md)| Update Card Request |
 **cardId** | **String**| ID of the card to update |

### Return type

[**UnitResponse14**](UnitResponse14.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

