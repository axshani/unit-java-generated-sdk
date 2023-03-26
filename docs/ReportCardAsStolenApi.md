# ReportCardAsStolenApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reportStolenCard**](ReportCardAsStolenApi.md#reportStolenCard) | **POST** /cards/{cardId}/report-stolen | Report card as stolen

<a name="reportStolenCard"></a>
# **reportStolenCard**
> UnitResponse14 reportStolenCard()

Report card as stolen

Report card as stolen via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReportCardAsStolenApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportCardAsStolenApi apiInstance = new ReportCardAsStolenApi();
try {
    UnitResponse14 result = apiInstance.reportStolenCard();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportCardAsStolenApi#reportStolenCard");
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

