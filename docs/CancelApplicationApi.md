# CancelApplicationApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelApplicationById**](CancelApplicationApi.md#cancelApplicationById) | **POST** /applications/{applicationId}/cancel | Cancel Application by Id

<a name="cancelApplicationById"></a>
# **cancelApplicationById**
> UnitResponse1 cancelApplicationById(body, applicationId)

Cancel Application by Id

Cancel a Application via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CancelApplicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CancelApplicationApi apiInstance = new CancelApplicationApi();
ApplicationIdCancelBody body = new ApplicationIdCancelBody(); // ApplicationIdCancelBody | Cancel Application Request
String applicationId = "applicationId_example"; // String | ID of the application to get
try {
    UnitResponse1 result = apiInstance.cancelApplicationById(body, applicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancelApplicationApi#cancelApplicationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApplicationIdCancelBody**](ApplicationIdCancelBody.md)| Cancel Application Request |
 **applicationId** | **String**| ID of the application to get |

### Return type

[**UnitResponse1**](UnitResponse1.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

