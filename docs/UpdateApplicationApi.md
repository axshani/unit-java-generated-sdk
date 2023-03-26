# UpdateApplicationApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateApplication**](UpdateApplicationApi.md#updateApplication) | **PATCH** /applications/{applicationId} | Update Application

<a name="updateApplication"></a>
# **updateApplication**
> UnitResponse updateApplication(body, applicationId)

Update Application

Update an Application via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdateApplicationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdateApplicationApi apiInstance = new UpdateApplicationApi();
UpdateUnitRequest body = new UpdateUnitRequest(); // UpdateUnitRequest | Update Application Request
String applicationId = "applicationId_example"; // String | ID of the application to update
try {
    UnitResponse result = apiInstance.updateApplication(body, applicationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateApplicationApi#updateApplication");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateUnitRequest**](UpdateUnitRequest.md)| Update Application Request |
 **applicationId** | **String**| ID of the application to update |

### Return type

[**UnitResponse**](UnitResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

