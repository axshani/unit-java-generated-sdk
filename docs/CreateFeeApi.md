# CreateFeeApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFee**](CreateFeeApi.md#createFee) | **POST** /fees/ | Create Fee

<a name="createFee"></a>
# **createFee**
> UnitResponse22 createFee(body)

Create Fee

Create a Fee via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateFeeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateFeeApi apiInstance = new CreateFeeApi();
FeesBody body = new FeesBody(); // FeesBody | Create Fee Request
try {
    UnitResponse22 result = apiInstance.createFee(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateFeeApi#createFee");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FeesBody**](FeesBody.md)| Create Fee Request |

### Return type

[**UnitResponse22**](UnitResponse22.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

