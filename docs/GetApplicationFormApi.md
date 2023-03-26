# GetApplicationFormApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findApplicationFormById**](GetApplicationFormApi.md#findApplicationFormById) | **GET** /application-forms/{applicationFormId} | Get ApplicationForm by Id

<a name="findApplicationFormById"></a>
# **findApplicationFormById**
> UnitResponse3 findApplicationFormById(applicationFormId, included)

Get ApplicationForm by Id

Get an Application Form from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetApplicationFormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetApplicationFormApi apiInstance = new GetApplicationFormApi();
String applicationFormId = "applicationFormId_example"; // String | ID of the application form to get
String included = "included_example"; // String | 
try {
    UnitResponse3 result = apiInstance.findApplicationFormById(applicationFormId, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetApplicationFormApi#findApplicationFormById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationFormId** | **String**| ID of the application form to get |
 **included** | **String**|  | [optional]

### Return type

[**UnitResponse3**](UnitResponse3.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

