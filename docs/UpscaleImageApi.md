# UpscaleImageApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelUpscaleImage**](UpscaleImageApi.md#cancelUpscaleImage) | **DELETE** /v5.0/ocr/UpscaleImage | CancelUpscaleImage |
| [**getUpscaleImage**](UpscaleImageApi.md#getUpscaleImage) | **GET** /v5.0/ocr/UpscaleImage | GetUpscaleImage |
| [**postUpscaleImage**](UpscaleImageApi.md#postUpscaleImage) | **POST** /v5.0/ocr/UpscaleImage | PostUpscaleImage |


<a name="cancelUpscaleImage"></a>
# **cancelUpscaleImage**
> cancelUpscaleImage(id)

CancelUpscaleImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.UpscaleImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    UpscaleImageApi apiInstance = new UpscaleImageApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelUpscaleImage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpscaleImageApi#cancelUpscaleImage");
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

<a name="getUpscaleImage"></a>
# **getUpscaleImage**
> OCRResponse getUpscaleImage(id)

GetUpscaleImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.UpscaleImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    UpscaleImageApi apiInstance = new UpscaleImageApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getUpscaleImage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpscaleImageApi#getUpscaleImage");
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

<a name="postUpscaleImage"></a>
# **postUpscaleImage**
> String postUpscaleImage(ocRUpscaleImageBody)

PostUpscaleImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.UpscaleImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    UpscaleImageApi apiInstance = new UpscaleImageApi(clientId, clientSecret);
    OCRUpscaleImageBody ocRUpscaleImageBody = new OCRUpscaleImageBody(); // OCRUpscaleImageBody | 
    try {
      String result = apiInstance.postUpscaleImage(ocRUpscaleImageBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UpscaleImageApi#postUpscaleImage");
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
| **ocRUpscaleImageBody** | [**OCRUpscaleImageBody**](OCRUpscaleImageBody.md)|  | |

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

