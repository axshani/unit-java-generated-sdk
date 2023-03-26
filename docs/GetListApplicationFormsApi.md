# GetListApplicationFormsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListApplicationForms**](GetListApplicationFormsApi.md#findListApplicationForms) | **GET** /application-forms | Get List Application Forms

<a name="findListApplicationForms"></a>
# **findListApplicationForms**
> List&lt;ApplicationForm&gt; findListApplicationForms(page, filter, sort)

Get List Application Forms

Get List Application Forms from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListApplicationFormsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListApplicationFormsApi apiInstance = new GetListApplicationFormsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter1 filter = new Filter1(); // Filter1 | 
String sort = "-createdAt"; // String | 
try {
    List<ApplicationForm> result = apiInstance.findListApplicationForms(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListApplicationFormsApi#findListApplicationForms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter1**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**List&lt;ApplicationForm&gt;**](ApplicationForm.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

