# DeleteCounterpartyApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCounterparty**](DeleteCounterpartyApi.md#deleteCounterparty) | **DELETE** /counterparties/{counterpartyId} | Delete Counterparty by Id

<a name="deleteCounterparty"></a>
# **deleteCounterparty**
> deleteCounterparty(counterpartyId)

Delete Counterparty by Id

Delete Counterparty via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DeleteCounterpartyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DeleteCounterpartyApi apiInstance = new DeleteCounterpartyApi();
String counterpartyId = "counterpartyId_example"; // String | ID of the counterparty to delete
try {
    apiInstance.deleteCounterparty(counterpartyId);
} catch (ApiException e) {
    System.err.println("Exception when calling DeleteCounterpartyApi#deleteCounterparty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterpartyId** | **String**| ID of the counterparty to delete |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

