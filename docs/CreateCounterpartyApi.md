# CreateCounterpartyApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCounterparty**](CreateCounterpartyApi.md#createCounterparty) | **POST** /counterparties/ | Create Counterparty

<a name="createCounterparty"></a>
# **createCounterparty**
> UnitResponse11 createCounterparty(body)

Create Counterparty

Create a counterparty via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateCounterpartyApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateCounterpartyApi apiInstance = new CreateCounterpartyApi();
CounterpartiesBody body = new CounterpartiesBody(); // CounterpartiesBody | Create Counterparty Request
try {
    UnitResponse11 result = apiInstance.createCounterparty(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateCounterpartyApi#createCounterparty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CounterpartiesBody**](CounterpartiesBody.md)| Create Counterparty Request |

### Return type

[**UnitResponse11**](UnitResponse11.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

