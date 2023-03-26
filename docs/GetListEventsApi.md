# GetListEventsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventsList**](GetListEventsApi.md#getEventsList) | **GET** /events | Get Events List

<a name="getEventsList"></a>
# **getEventsList**
> UnitResponse20 getEventsList()

Get Events List

Get Events List from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListEventsApi apiInstance = new GetListEventsApi();
try {
    UnitResponse20 result = apiInstance.getEventsList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListEventsApi#getEventsList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnitResponse20**](UnitResponse20.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

