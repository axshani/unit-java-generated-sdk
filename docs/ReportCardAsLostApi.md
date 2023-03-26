# ReportCardAsLostApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportLostCard**](ReportCardAsLostApi.md#reportLostCard) | **POST** /cards/{cardId}/report-lost | Report lost as stolen

<a name="reportLostCard"></a>
# **reportLostCard**
> UnitResponse14 reportLostCard()

Report lost as stolen

Report lost as stolen via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportCardAsLostApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportCardAsLostApi apiInstance = new ReportCardAsLostApi();
try {
    UnitResponse14 result = apiInstance.reportLostCard();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportCardAsLostApi#reportLostCard");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnitResponse14**](UnitResponse14.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

