# GetStatementApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findHtmlStatementById**](GetStatementApi.md#findHtmlStatementById) | **GET** /statements/{statementId}/html | Get HTML Statement by Id
[**findPdfStatementById**](GetStatementApi.md#findPdfStatementById) | **GET** /statements/{statementId}/pdf | Get PDF Statement by Id

<a name="findHtmlStatementById"></a>
# **findHtmlStatementById**
> UnitResponse18 findHtmlStatementById(statementId)

Get HTML Statement by Id

Get a HTML Statement from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetStatementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetStatementApi apiInstance = new GetStatementApi();
String statementId = "statementId_example"; // String | ID of the statement to get
try {
    UnitResponse18 result = apiInstance.findHtmlStatementById(statementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetStatementApi#findHtmlStatementById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statementId** | **String**| ID of the statement to get |

### Return type

[**UnitResponse18**](UnitResponse18.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

<a name="findPdfStatementById"></a>
# **findPdfStatementById**
> UnitResponse18 findPdfStatementById(statementId)

Get PDF Statement by Id

Get a PDF Statement from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetStatementApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetStatementApi apiInstance = new GetStatementApi();
String statementId = "statementId_example"; // String | ID of the statement to get
try {
    UnitResponse18 result = apiInstance.findPdfStatementById(statementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetStatementApi#findPdfStatementById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statementId** | **String**| ID of the statement to get |

### Return type

[**UnitResponse18**](UnitResponse18.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

