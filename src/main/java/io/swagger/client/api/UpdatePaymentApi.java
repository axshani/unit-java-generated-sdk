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


import io.swagger.client.model.UnitResponse9;
import io.swagger.client.model.UpdateUnitRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdatePaymentApi {
    private ApiClient apiClient;

    public UpdatePaymentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UpdatePaymentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for updatePayment
     * @param body Update Payment Request (required)
     * @param paymentId ID of the payment to update (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePaymentCall(UpdateUnitRequest body, String paymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/payments/{paymentId}"
            .replaceAll("\\{" + "paymentId" + "\\}", apiClient.escapeString(paymentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updatePaymentValidateBeforeCall(UpdateUnitRequest body, String paymentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updatePayment(Async)");
        }
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new ApiException("Missing the required parameter 'paymentId' when calling updatePayment(Async)");
        }
        
        com.squareup.okhttp.Call call = updatePaymentCall(body, paymentId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Payment
     * Update an Payment via API 
     * @param body Update Payment Request (required)
     * @param paymentId ID of the payment to update (required)
     * @return UnitResponse9
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UnitResponse9 updatePayment(UpdateUnitRequest body, String paymentId) throws ApiException {
        ApiResponse<UnitResponse9> resp = updatePaymentWithHttpInfo(body, paymentId);
        return resp.getData();
    }

    /**
     * Update Payment
     * Update an Payment via API 
     * @param body Update Payment Request (required)
     * @param paymentId ID of the payment to update (required)
     * @return ApiResponse&lt;UnitResponse9&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UnitResponse9> updatePaymentWithHttpInfo(UpdateUnitRequest body, String paymentId) throws ApiException {
        com.squareup.okhttp.Call call = updatePaymentValidateBeforeCall(body, paymentId, null, null);
        Type localVarReturnType = new TypeToken<UnitResponse9>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Payment (asynchronously)
     * Update an Payment via API 
     * @param body Update Payment Request (required)
     * @param paymentId ID of the payment to update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePaymentAsync(UpdateUnitRequest body, String paymentId, final ApiCallback<UnitResponse9> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePaymentValidateBeforeCall(body, paymentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UnitResponse9>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
