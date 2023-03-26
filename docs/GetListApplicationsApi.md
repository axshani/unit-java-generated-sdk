# GetListApplicationsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListApplication**](GetListApplicationsApi.md#findListApplication) | **GET** /applications | Get List Application

<a name="findListApplication"></a>
# **findListApplication**
> UnitResponseListApplications findListApplication(page, filter, sort)

Get List Application

Get List Applications from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListApplicationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListApplicationsApi apiInstance = new GetListApplicationsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter filter = new Filter(); // Filter | 
String sort = "-createdAt"; // String | 
try {
    UnitResponseListApplications result = apiInstance.findListApplication(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListApplicationsApi#findListApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**UnitResponseListApplications**](UnitResponseListApplications.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json

