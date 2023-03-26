# GetRewardApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findRewardById**](GetRewardApi.md#findRewardById) | **GET** /rewards/{rewardId} | Get Reward by Id

<a name="findRewardById"></a>
# **findRewardById**
> UnitResponse19 findRewardById(rewardId)

Get Reward by Id

Get a Reward from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetRewardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetRewardApi apiInstance = new GetRewardApi();
String rewardId = "rewardId_example"; // String | ID of the reward to get
try {
    UnitResponse19 result = apiInstance.findRewardById(rewardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetRewardApi#findRewardById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rewardId** | **String**| ID of the reward to get |

### Return type

[**UnitResponse19**](UnitResponse19.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

