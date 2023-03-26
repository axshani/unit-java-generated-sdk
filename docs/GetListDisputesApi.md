# GetListDisputesApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findListDisputes**](GetListDisputesApi.md#findListDisputes) | **GET** /disputes/ | Get List Disputes

<a name="findListDisputes"></a>
# **findListDisputes**
> List&lt;Dispute&gt; findListDisputes(page, filter, sort)

Get List Disputes

Get List Disputes from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListDisputesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListDisputesApi apiInstance = new GetListDisputesApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter13 filter = new Filter13(); // Filter13 | 
String sort = "-createdAt"; // String | 
try {
    List<Dispute> result = apiInstance.findListDisputes(page, filter, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListDisputesApi#findListDisputes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter13**](.md)|  | [optional]
 **sort** | **String**|  | [optional] [default to -createdAt] [enum: createdAt, -createdAt]

### Return type

[**List&lt;Dispute&gt;**](Dispute.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

