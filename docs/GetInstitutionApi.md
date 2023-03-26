# GetInstitutionApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findInstitutionByRoutingNumber**](GetInstitutionApi.md#findInstitutionByRoutingNumber) | **GET** /institutions/{routingNumber}/ | Get Institution by Routing Number

<a name="findInstitutionByRoutingNumber"></a>
# **findInstitutionByRoutingNumber**
> UnitResponse21 findInstitutionByRoutingNumber(routingNumber)

Get Institution by Routing Number

Get an Institution from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetInstitutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetInstitutionApi apiInstance = new GetInstitutionApi();
String routingNumber = "routingNumber_example"; // String | routingNumber of the institution to get
try {
    UnitResponse21 result = apiInstance.findInstitutionByRoutingNumber(routingNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetInstitutionApi#findInstitutionByRoutingNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **routingNumber** | **String**| routingNumber of the institution to get |

### Return type

[**UnitResponse21**](UnitResponse21.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

