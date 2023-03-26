# CreateApplicationFormApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApplicationForm**](CreateApplicationFormApi.md#createApplicationForm) | **POST** /application-forms | Create Application Form

<a name="createApplicationForm"></a>
# **createApplicationForm**
> UnitResponse2 createApplicationForm(body)

Create Application Form

Create an Application Form via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateApplicationFormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateApplicationFormApi apiInstance = new CreateApplicationFormApi();
ApplicationformsBody body = new ApplicationformsBody(); // ApplicationformsBody | Create Application Form Request
try {
    UnitResponse2 result = apiInstance.createApplicationForm(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateApplicationFormApi#createApplicationForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationformsBody**](ApplicationformsBody.md)| Create Application Form Request |

### Return type

[**UnitResponse2**](UnitResponse2.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

