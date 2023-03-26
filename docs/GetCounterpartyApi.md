# GetCounterpartyApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCounterpartyById**](GetCounterpartyApi.md#findCounterpartyById) | **GET** /counterparties/{counterpartyId} | Get Counterparty by Id

<a name="findCounterpartyById"></a>
# **findCounterpartyById**
> UnitResponse11 findCounterpartyById(counterpartyId, included)

Get Counterparty by Id

Get a Counterparty from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetCounterpartyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetCounterpartyApi apiInstance = new GetCounterpartyApi();
String counterpartyId = "counterpartyId_example"; // String | ID of the counterparty to get
String included = "included_example"; // String | 
try {
    UnitResponse11 result = apiInstance.findCounterpartyById(counterpartyId, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetCounterpartyApi#findCounterpartyById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **counterpartyId** | **String**| ID of the counterparty to get |
 **included** | **String**|  | [optional]

### Return type

[**UnitResponse11**](UnitResponse11.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

