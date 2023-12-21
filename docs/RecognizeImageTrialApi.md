# RecognizeImageTrialApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecognizeImageTrial**](RecognizeImageTrialApi.md#cancelRecognizeImageTrial) | **DELETE** /v5.0/ocr/RecognizeImageTrial | CancelRecognizeImageTrial |
| [**getRecognizeImageTrial**](RecognizeImageTrialApi.md#getRecognizeImageTrial) | **GET** /v5.0/ocr/RecognizeImageTrial | GetRecognizeImageTrial |
| [**postRecognizeImageTrial**](RecognizeImageTrialApi.md#postRecognizeImageTrial) | **POST** /v5.0/ocr/RecognizeImageTrial | PostRecognizeImageTrial |


<a name="cancelRecognizeImageTrial"></a>
# **cancelRecognizeImageTrial**
> cancelRecognizeImageTrial(id)

CancelRecognizeImageTrial

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeImageTrialApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeImageTrialApi apiInstance = new RecognizeImageTrialApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelRecognizeImageTrial(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeImageTrialApi#cancelRecognizeImageTrial");
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

<a name="getRecognizeImageTrial"></a>
# **getRecognizeImageTrial**
> OCRResponse getRecognizeImageTrial(id)

GetRecognizeImageTrial

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeImageTrialApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeImageTrialApi apiInstance = new RecognizeImageTrialApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getRecognizeImageTrial(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeImageTrialApi#getRecognizeImageTrial");
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

<a name="postRecognizeImageTrial"></a>
# **postRecognizeImageTrial**
> String postRecognizeImageTrial(ocRRecognizeImageBody)

PostRecognizeImageTrial

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeImageTrialApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeImageTrialApi apiInstance = new RecognizeImageTrialApi(clientId, clientSecret);
    OCRRecognizeImageBody ocRRecognizeImageBody = new OCRRecognizeImageBody(); // OCRRecognizeImageBody | 
    try {
      String result = apiInstance.postRecognizeImageTrial(ocRRecognizeImageBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeImageTrialApi#postRecognizeImageTrial");
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

