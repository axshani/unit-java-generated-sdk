# UpdatePaymentApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updatePayment**](UpdatePaymentApi.md#updatePayment) | **PATCH** /payments/{paymentId} | Update Payment

<a name="updatePayment"></a>
# **updatePayment**
> UnitResponse9 updatePayment(body, paymentId)

Update Payment

Update an Payment via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpdatePaymentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


UpdatePaymentApi apiInstance = new UpdatePaymentApi();
UpdateUnitRequest body = new UpdateUnitRequest(); // UpdateUnitRequest | Update Payment Request
String paymentId = "paymentId_example"; // String | ID of the payment to update
try {
    UnitResponse9 result = apiInstance.updatePayment(body, paymentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdatePaymentApi#updatePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UpdateUnitRequest**](UpdateUnitRequest.md)| Update Payment Request |
 **paymentId** | **String**| ID of the payment to update |

### Return type

[**UnitResponse9**](UnitResponse9.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

