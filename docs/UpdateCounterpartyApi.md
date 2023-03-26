# UpdateCounterpartyApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateCounterparty**](UpdateCounterpartyApi.md#updateCounterparty) | **PATCH** /counterparties/{counterpartyId} | Update Counterparty

<a name="updateCounterparty"></a>
# **updateCounterparty**
> UnitResponse11 updateCounterparty(body, counterpartyId)

Update Counterparty

Update a Counterparty via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdateCounterpartyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdateCounterpartyApi apiInstance = new UpdateCounterpartyApi();
UpdateUnitRequest body = new UpdateUnitRequest(); // UpdateUnitRequest | Update Counterparty Request
String counterpartyId = "counterpartyId_example"; // String | ID of the counterparty to update
try {
    UnitResponse11 result = apiInstance.updateCounterparty(body, counterpartyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateCounterpartyApi#updateCounterparty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateUnitRequest**](UpdateUnitRequest.md)| Update Counterparty Request |
 **counterpartyId** | **String**| ID of the counterparty to update |

### Return type

[**UnitResponse11**](UnitResponse11.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

