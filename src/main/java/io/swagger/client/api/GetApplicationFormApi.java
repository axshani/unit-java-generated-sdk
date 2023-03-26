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


import io.swagger.client.model.UnitResponse3;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetApplicationFormApi {
    private ApiClient apiClient;

    public GetApplicationFormApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GetApplicationFormApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for findApplicationFormById
     * @param applicationFormId ID of the application form to get (required)
     * @param included  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findApplicationFormByIdCall(String applicationFormId, String included, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/application-forms/{applicationFormId}"
            .replaceAll("\\{" + "applicationFormId" + "\\}", apiClient.escapeString(applicationFormId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (included != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("included", included));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.api+json; charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call findApplicationFormByIdValidateBeforeCall(String applicationFormId, String included, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'applicationFormId' is set
        if (applicationFormId == null) {
            throw new ApiException("Missing the required parameter 'applicationFormId' when calling findApplicationFormById(Async)");
        }
        
        com.squareup.okhttp.Call call = findApplicationFormByIdCall(applicationFormId, included, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get ApplicationForm by Id
     * Get an Application Form from API 
     * @param applicationFormId ID of the application form to get (required)
     * @param included  (optional)
     * @return UnitResponse3
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UnitResponse3 findApplicationFormById(String applicationFormId, String included) throws ApiException {
        ApiResponse<UnitResponse3> resp = findApplicationFormByIdWithHttpInfo(applicationFormId, included);
        return resp.getData();
    }

    /**
     * Get ApplicationForm by Id
     * Get an Application Form from API 
     * @param applicationFormId ID of the application form to get (required)
     * @param included  (optional)
     * @return ApiResponse&lt;UnitResponse3&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UnitResponse3> findApplicationFormByIdWithHttpInfo(String applicationFormId, String included) throws ApiException {
        com.squareup.okhttp.Call call = findApplicationFormByIdValidateBeforeCall(applicationFormId, included, null, null);
        Type localVarReturnType = new TypeToken<UnitResponse3>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get ApplicationForm by Id (asynchronously)
     * Get an Application Form from API 
     * @param applicationFormId ID of the application form to get (required)
     * @param included  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findApplicationFormByIdAsync(String applicationFormId, String included, final ApiCallback<UnitResponse3> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findApplicationFormByIdValidateBeforeCall(applicationFormId, included, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UnitResponse3>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
