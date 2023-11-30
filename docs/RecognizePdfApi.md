# RecognizePdfApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecognizePdf**](RecognizePdfApi.md#cancelRecognizePdf) | **DELETE** /v5.0/ocr/RecognizePdf | CancelRecognizePdf |
| [**getRecognizePdf**](RecognizePdfApi.md#getRecognizePdf) | **GET** /v5.0/ocr/RecognizePdf | GetRecognizePdf |
| [**postRecognizePdf**](RecognizePdfApi.md#postRecognizePdf) | **POST** /v5.0/ocr/RecognizePdf | PostRecognizePdf |


<a name="cancelRecognizePdf"></a>
# **cancelRecognizePdf**
> cancelRecognizePdf(id)

CancelRecognizePdf

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizePdfApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizePdfApi apiInstance = new RecognizePdfApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelRecognizePdf(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizePdfApi#cancelRecognizePdf");
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

<a name="getRecognizePdf"></a>
# **getRecognizePdf**
> OCRResponse getRecognizePdf(id)

GetRecognizePdf

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizePdfApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizePdfApi apiInstance = new RecognizePdfApi(clientId, clientSecret);
    String id = "id_example"; // String | Task id to select the result
    try {
      OCRResponse result = apiInstance.getRecognizePdf(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizePdfApi#getRecognizePdf");
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

<a name="postRecognizePdf"></a>
# **postRecognizePdf**
> String postRecognizePdf(ocRRecognizePdfBody)

PostRecognizePdf

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizePdfApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizePdfApi apiInstance = new RecognizePdfApi(clientId, clientSecret);
    OCRRecognizePdfBody ocRRecognizePdfBody = new OCRRecognizePdfBody(); // OCRRecognizePdfBody | 
    try {
      String result = apiInstance.postRecognizePdf(ocRRecognizePdfBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizePdfApi#postRecognizePdf");
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
| **ocRRecognizePdfBody** | [**OCRRecognizePdfBody**](OCRRecognizePdfBody.md)|  | |

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

