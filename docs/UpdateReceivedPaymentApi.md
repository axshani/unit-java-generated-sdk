# UpdateReceivedPaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateReceivedPayment**](UpdateReceivedPaymentApi.md#updateReceivedPayment) | **PATCH** /received-payments/{paymentId} | Update Received Payment

<a name="updateReceivedPayment"></a>
# **updateReceivedPayment**
> UnitResponse10 updateReceivedPayment(body, paymentId)

Update Received Payment

Update a Received Payment via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdateReceivedPaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdateReceivedPaymentApi apiInstance = new UpdateReceivedPaymentApi();
UpdateUnitRequest body = new UpdateUnitRequest(); // UpdateUnitRequest | Update Received Payment Request
String paymentId = "paymentId_example"; // String | ID of the payment to update
try {
    UnitResponse10 result = apiInstance.updateReceivedPayment(body, paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateReceivedPaymentApi#updateReceivedPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateUnitRequest**](UpdateUnitRequest.md)| Update Received Payment Request |
 **paymentId** | **String**| ID of the payment to update |

### Return type

[**UnitResponse10**](UnitResponse10.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

