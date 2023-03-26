# CreateApplicationApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplication**](CreateApplicationApi.md#createApplication) | **POST** /applications | Create Application

<a name="createApplication"></a>
# **createApplication**
> UnitResponse1 createApplication(body)

Create Application

Create an Application via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateApplicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateApplicationApi apiInstance = new CreateApplicationApi();
ApplicationsBody body = new ApplicationsBody(); // ApplicationsBody | Create Application Request
try {
    UnitResponse1 result = apiInstance.createApplication(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateApplicationApi#createApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationsBody**](ApplicationsBody.md)| Create Application Request |

### Return type

[**UnitResponse1**](UnitResponse1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

