# GetApplicationApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findApplicationById**](GetApplicationApi.md#findApplicationById) | **GET** /applications/{applicationId} | Get Application by Id

<a name="findApplicationById"></a>
# **findApplicationById**
> UnitResponse findApplicationById(applicationId, included)

Get Application by Id

Get an Application from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetApplicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetApplicationApi apiInstance = new GetApplicationApi();
String applicationId = "applicationId_example"; // String | ID of the application to get
String included = "included_example"; // String | 
try {
    UnitResponse result = apiInstance.findApplicationById(applicationId, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetApplicationApi#findApplicationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **String**| ID of the application to get |
 **included** | **String**|  | [optional]

### Return type

[**UnitResponse**](UnitResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

