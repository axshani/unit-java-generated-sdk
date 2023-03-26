# GetListAccountEndOfDayBalancesHistoryApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountEndOfDayList**](GetListAccountEndOfDayBalancesHistoryApi.md#getAccountEndOfDayList) | **GET** /account-end-of-day | Get AccountEndOfDay List

<a name="getAccountEndOfDayList"></a>
# **getAccountEndOfDayList**
> UnitResponse7 getAccountEndOfDayList()

Get AccountEndOfDay List

Get AccountEndOfDay List from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListAccountEndOfDayBalancesHistoryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListAccountEndOfDayBalancesHistoryApi apiInstance = new GetListAccountEndOfDayBalancesHistoryApi();
try {
    UnitResponse7 result = apiInstance.getAccountEndOfDayList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListAccountEndOfDayBalancesHistoryApi#getAccountEndOfDayList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnitResponse7**](UnitResponse7.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

