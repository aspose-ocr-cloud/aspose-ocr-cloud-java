# RecognizeImageApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecognizeImage**](RecognizeImageApi.md#cancelRecognizeImage) | **DELETE** /v5/RecognizeImage | CancelRecognizeImage |
| [**getRecognizeImage**](RecognizeImageApi.md#getRecognizeImage) | **GET** /v5/RecognizeImage | GetRecognizeImage |
| [**postRecognizeImage**](RecognizeImageApi.md#postRecognizeImage) | **POST** /v5/RecognizeImage | PostRecognizeImage |


<a name="cancelRecognizeImage"></a>
# **cancelRecognizeImage**
> cancelRecognizeImage(id)

CancelRecognizeImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeImageApi apiInstance = new RecognizeImageApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelRecognizeImage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeImageApi#cancelRecognizeImage");
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

<a name="getRecognizeImage"></a>
# **getRecognizeImage**
> OCRResponse getRecognizeImage(id)

GetRecognizeImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeImageApi apiInstance = new RecognizeImageApi(clientId, clientSecret);
    String id = "id_example"; // String | Task id to select the result
    try {
      OCRResponse result = apiInstance.getRecognizeImage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeImageApi#getRecognizeImage");
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
| **id** | **String**| Task id to select the result | |

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

<a name="postRecognizeImage"></a>
# **postRecognizeImage**
> String postRecognizeImage(ocRRecognizeImageBody)

PostRecognizeImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeImageApi apiInstance = new RecognizeImageApi(clientId, clientSecret);
    OCRRecognizeImageBody ocRRecognizeImageBody = new OCRRecognizeImageBody(); // OCRRecognizeImageBody | 
    try {
      String result = apiInstance.postRecognizeImage(ocRRecognizeImageBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeImageApi#postRecognizeImage");
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
| **ocRRecognizeImageBody** | [**OCRRecognizeImageBody**](OCRRecognizeImageBody.md)|  | |

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
| **200** | Task unique ID |  -  |
| **401** | Unauthorized |  -  |

