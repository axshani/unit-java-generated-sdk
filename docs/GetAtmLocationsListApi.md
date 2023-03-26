# GetAtmLocationsListApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListOfATMLocations**](GetAtmLocationsListApi.md#findListOfATMLocations) | **GET** /atm-locations/ | Get List ATM Locations

<a name="findListOfATMLocations"></a>
# **findListOfATMLocations**
> List&lt;Object&gt; findListOfATMLocations(page, filter, sort)

Get List ATM Locations

Get List ATM Locations from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetAtmLocationsListApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetAtmLocationsListApi apiInstance = new GetAtmLocationsListApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter11 filter = new Filter11(); // Filter11 | 
String sort = "-createdAt"; // String | 
try {
    List<Object> result = apiInstance.findListOfATMLocations(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetAtmLocationsListApi#findListOfATMLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter11**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

**List&lt;Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

