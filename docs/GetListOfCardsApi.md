# GetListOfCardsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListCards**](GetListOfCardsApi.md#getListCards) | **GET** /cards/ | Get List of Cards

<a name="getListCards"></a>
# **getListCards**
> UnitResponseCardsList getListCards(page, filter)

Get List of Cards

Get List of Cards from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListOfCardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListOfCardsApi apiInstance = new GetListOfCardsApi();
ListPageParametersObject page = new ListPageParametersObject(); // ListPageParametersObject | 
Filter4 filter = new Filter4(); // Filter4 | 
try {
    UnitResponseCardsList result = apiInstance.getListCards(page, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListOfCardsApi#getListCards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | [**ListPageParametersObject**](.md)|  | [optional]
 **filter** | [**Filter4**](.md)|  | [optional]

### Return type

[**UnitResponseCardsList**](UnitResponseCardsList.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

