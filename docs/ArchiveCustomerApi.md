# ArchiveCustomerApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveCustomerById**](ArchiveCustomerApi.md#archiveCustomerById) | **POST** /customers/{customerId}/archive | Archive Customer by Id

<a name="archiveCustomerById"></a>
# **archiveCustomerById**
> UnitResponse8 archiveCustomerById(body, customerId)

Archive Customer by Id

Archive a Customer via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ArchiveCustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ArchiveCustomerApi apiInstance = new ArchiveCustomerApi();
CustomerIdArchiveBody body = new CustomerIdArchiveBody(); // CustomerIdArchiveBody | Update Payment Request
String customerId = "customerId_example"; // String | ID of the customer to archive
try {
    UnitResponse8 result = apiInstance.archiveCustomerById(body, customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArchiveCustomerApi#archiveCustomerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CustomerIdArchiveBody**](CustomerIdArchiveBody.md)| Update Payment Request |
 **customerId** | **String**| ID of the customer to archive |

### Return type

[**UnitResponse8**](UnitResponse8.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json; charset=utf-8

