# GetListRewardsApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRewardsList**](GetListRewardsApi.md#getRewardsList) | **GET** /rewards | Get Rewards List

<a name="getRewardsList"></a>
# **getRewardsList**
> UnitResponse19 getRewardsList()

Get Rewards List

Get Rewards List from API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GetListRewardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


GetListRewardsApi apiInstance = new GetListRewardsApi();
try {
    UnitResponse19 result = apiInstance.getRewardsList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GetListRewardsApi#getRewardsList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UnitResponse19**](UnitResponse19.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.api+json; charset=utf-8

