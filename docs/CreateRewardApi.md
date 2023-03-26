# CreateRewardApi

All URIs are relative to *https://api.s.unit.sh*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReward**](CreateRewardApi.md#createReward) | **POST** /rewards | Create Reward

<a name="createReward"></a>
# **createReward**
> UnitResponse19 createReward(body)

Create Reward

Create a Reward via API 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreateRewardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CreateRewardApi apiInstance = new CreateRewardApi();
RewardsBody body = new RewardsBody(); // RewardsBody | Create Reward Request
try {
    UnitResponse19 result = apiInstance.createReward(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateRewardApi#createReward");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RewardsBody**](RewardsBody.md)| Create Reward Request |

### Return type

[**UnitResponse19**](UnitResponse19.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/vnd.api+json
 - **Accept**: application/vnd.api+json

