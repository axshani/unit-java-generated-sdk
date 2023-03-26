# GetEventApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findEventById**](GetEventApi.md#findEventById) | **GET** /events/{eventId} | Get Event by Id

<a name="findEventById"></a>
# **findEventById**
> UnitResponse20 findEventById(eventId)

Get Event by Id

Get an Event from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetEventApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetEventApi apiInstance = new GetEventApi();
String eventId = "eventId_example"; // String | ID of the event to get
try {
    UnitResponse20 result = apiInstance.findEventById(eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetEventApi#findEventById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **String**| ID of the event to get |

### Return type

[**UnitResponse20**](UnitResponse20.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

