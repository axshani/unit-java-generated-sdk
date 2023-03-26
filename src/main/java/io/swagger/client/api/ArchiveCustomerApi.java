/*
 * Unit Python SDK
 * An API for testing openapi-python-client for unit-sdk
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.CustomerIdArchiveBody;
import io.swagger.client.model.UnitResponse8;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArchiveCustomerApi {
    private ApiClient apiClient;

    public ArchiveCustomerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ArchiveCustomerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for archiveCustomerById
     * @param body Update Payment Request (required)
     * @param customerId ID of the customer to archive (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call archiveCustomerByIdCall(CustomerIdArchiveBody body, String customerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/customers/{customerId}/archive"
            .replaceAll("\\{" + "customerId" + "\\}", apiClient.escapeString(customerId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json; charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/vnd.api+json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call archiveCustomerByIdValidateBeforeCall(CustomerIdArchiveBody body, String customerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling archiveCustomerById(Async)");
        }
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new ApiException("Missing the required parameter 'customerId' when calling archiveCustomerById(Async)");
        }
        
        com.squareup.okhttp.Call call = archiveCustomerByIdCall(body, customerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Archive Customer by Id
     * Archive a Customer via API 
     * @param body Update Payment Request (required)
     * @param customerId ID of the customer to archive (required)
     * @return UnitResponse8
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UnitResponse8 archiveCustomerById(CustomerIdArchiveBody body, String customerId) throws ApiException {
        ApiResponse<UnitResponse8> resp = archiveCustomerByIdWithHttpInfo(body, customerId);
        return resp.getData();
    }

    /**
     * Archive Customer by Id
     * Archive a Customer via API 
     * @param body Update Payment Request (required)
     * @param customerId ID of the customer to archive (required)
     * @return ApiResponse&lt;UnitResponse8&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UnitResponse8> archiveCustomerByIdWithHttpInfo(CustomerIdArchiveBody body, String customerId) throws ApiException {
        com.squareup.okhttp.Call call = archiveCustomerByIdValidateBeforeCall(body, customerId, null, null);
        Type localVarReturnType = new TypeToken<UnitResponse8>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Archive Customer by Id (asynchronously)
     * Archive a Customer via API 
     * @param body Update Payment Request (required)
     * @param customerId ID of the customer to archive (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call archiveCustomerByIdAsync(CustomerIdArchiveBody body, String customerId, final ApiCallback<UnitResponse8> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = archiveCustomerByIdValidateBeforeCall(body, customerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UnitResponse8>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
