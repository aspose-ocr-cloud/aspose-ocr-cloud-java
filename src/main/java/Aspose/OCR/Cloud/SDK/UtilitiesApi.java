/*
 * Aspose OCR Cloud 5.0 API
 * Aspose OCR Cloud 5.0 API
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Aspose.OCR.Cloud.SDK;

import Aspose.OCR.Cloud.SDK.ApiCallback;
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.ApiResponse;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.Pair;
import Aspose.OCR.Cloud.SDK.ProgressRequestBody;
import Aspose.OCR.Cloud.SDK.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Aspose.OCR.Cloud.SDK.model.OCRResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;
import java.util.regex.Pattern;

public class UtilitiesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UtilitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UtilitiesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public UtilitiesApi(String clientId, String clientSecret) {
        this(new ApiClient(clientId, clientSecret, null));
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getTaskStatus
     * @param id Task id to select the result (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTaskStatusCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = getAdjustedPath("/v5.0/ocr/Utilities/GetTaskStatus");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "JWT" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTaskStatusValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTaskStatus(Async)");
        }

        return getTaskStatusCall(id, _callback);

    }

    /**
     * GetTaskStatus
     * 
     * @param id Task id to select the result (required)
     * @return OCRResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public OCRResponse getTaskStatus(String id) throws ApiException {
        ApiResponse<OCRResponse> localVarResp = getTaskStatusWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * GetTaskStatus
     * 
     * @param id Task id to select the result (required)
     * @return ApiResponse&lt;OCRResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OCRResponse> getTaskStatusWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getTaskStatusValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<OCRResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetTaskStatus (asynchronously)
     * 
     * @param id Task id to select the result (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTaskStatusAsync(String id, final ApiCallback<OCRResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTaskStatusValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<OCRResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    
  /**
    * Returns adjusted path in case if base path contains version identifier
    *
    * @param  srcPath
    * @return Path to controller

  **/
  private String getAdjustedPath(String srcPath)
  {
    if ("https://api.aspose.cloud/v5.0/ocr".equals(this.localVarApiClient.getBasePath())) {
            Pattern pattern = Pattern.compile("/v5.0/ocr");
            return pattern.matcher(srcPath).replaceFirst("");
        } else {
            return srcPath;
        }
  }

}
