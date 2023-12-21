# DetectRegionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelDetectRegions**](DetectRegionsApi.md#cancelDetectRegions) | **DELETE** /v5.0/ocr/DetectRegions | CancelDetectRegions |
| [**getDetectRegions**](DetectRegionsApi.md#getDetectRegions) | **GET** /v5.0/ocr/DetectRegions | GetDetectRegions |
| [**postDetectRegions**](DetectRegionsApi.md#postDetectRegions) | **POST** /v5.0/ocr/DetectRegions | PostDetectRegions |


<a name="cancelDetectRegions"></a>
# **cancelDetectRegions**
> cancelDetectRegions(id)

CancelDetectRegions

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DetectRegionsApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DetectRegionsApi apiInstance = new DetectRegionsApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelDetectRegions(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectRegionsApi#cancelDetectRegions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDetectRegions"></a>
# **getDetectRegions**
> OCRResponse getDetectRegions(id)

GetDetectRegions

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DetectRegionsApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DetectRegionsApi apiInstance = new DetectRegionsApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getDetectRegions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectRegionsApi#getDetectRegions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**OCRResponse**](OCRResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="postDetectRegions"></a>
# **postDetectRegions**
> String postDetectRegions(ocRDetectRegionsBody)

PostDetectRegions

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DetectRegionsApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DetectRegionsApi apiInstance = new DetectRegionsApi(clientId, clientSecret);
    OCRDetectRegionsBody ocRDetectRegionsBody = new OCRDetectRegionsBody(); // OCRDetectRegionsBody | 
    try {
      String result = apiInstance.postDetectRegions(ocRDetectRegionsBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DetectRegionsApi#postDetectRegions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ocRDetectRegionsBody** | [**OCRDetectRegionsBody**](OCRDetectRegionsBody.md)|  | |

### Return type

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |

