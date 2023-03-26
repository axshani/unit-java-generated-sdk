# FireEventApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fireEventById**](FireEventApi.md#fireEventById) | **POST** /events/{eventId} | Fire Event by Id

<a name="fireEventById"></a>
# **fireEventById**
> UnitResponse20 fireEventById(eventId)

Fire Event by Id

Fire an Event via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FireEventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FireEventApi apiInstance = new FireEventApi();
String eventId = "eventId_example"; // String | ID of the event to fire
try {
    UnitResponse20 result = apiInstance.fireEventById(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FireEventApi#fireEventById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| ID of the event to fire |

### Return type

[**UnitResponse20**](UnitResponse20.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

