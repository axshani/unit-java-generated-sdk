# GetListCounterpartiesApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCounterpartiesList**](GetListCounterpartiesApi.md#getCounterpartiesList) | **GET** /counterparties/ | Get Counterparties List

<a name="getCounterpartiesList"></a>
# **getCounterpartiesList**
> UnitResponse11 getCounterpartiesList()

Get Counterparties List

Get Counterparties List from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListCounterpartiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListCounterpartiesApi apiInstance = new GetListCounterpartiesApi();
try {
    UnitResponse11 result = apiInstance.getCounterpartiesList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListCounterpartiesApi#getCounterpartiesList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnitResponse11**](UnitResponse11.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

