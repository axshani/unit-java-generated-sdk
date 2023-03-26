# GetDisputeApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findDisputeById**](GetDisputeApi.md#findDisputeById) | **GET** /disputes/{disputeId}/ | Get Dispute by Id

<a name="findDisputeById"></a>
# **findDisputeById**
> UnitResponse30 findDisputeById(disputeId)

Get Dispute by Id

Get a Dispute from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetDisputeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetDisputeApi apiInstance = new GetDisputeApi();
String disputeId = "disputeId_example"; // String | ID of the dispute to get
try {
    UnitResponse30 result = apiInstance.findDisputeById(disputeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetDisputeApi#findDisputeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **disputeId** | **String**| ID of the dispute to get |

### Return type

[**UnitResponse30**](UnitResponse30.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

