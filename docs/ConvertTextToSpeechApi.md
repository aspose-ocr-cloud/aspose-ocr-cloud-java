# ConvertTextToSpeechApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelConvertTextToSpeech**](ConvertTextToSpeechApi.md#cancelConvertTextToSpeech) | **DELETE** /v5.0/ocr/ConvertTextToSpeech | CancelConvertTextToSpeech |
| [**getConvertTextToSpeech**](ConvertTextToSpeechApi.md#getConvertTextToSpeech) | **GET** /v5.0/ocr/ConvertTextToSpeech | GetConvertTextToSpeech |
| [**postConvertTextToSpeech**](ConvertTextToSpeechApi.md#postConvertTextToSpeech) | **POST** /v5.0/ocr/ConvertTextToSpeech | PostConvertTextToSpeech |


<a name="cancelConvertTextToSpeech"></a>
# **cancelConvertTextToSpeech**
> cancelConvertTextToSpeech(id)

CancelConvertTextToSpeech

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ConvertTextToSpeechApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ConvertTextToSpeechApi apiInstance = new ConvertTextToSpeechApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelConvertTextToSpeech(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertTextToSpeechApi#cancelConvertTextToSpeech");
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

<a name="getConvertTextToSpeech"></a>
# **getConvertTextToSpeech**
> TTSResponse getConvertTextToSpeech(id)

GetConvertTextToSpeech

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ConvertTextToSpeechApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ConvertTextToSpeechApi apiInstance = new ConvertTextToSpeechApi(clientId, clientSecret);
    String id = "id_example"; // String | Task id to select the result
    try {
      TTSResponse result = apiInstance.getConvertTextToSpeech(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertTextToSpeechApi#getConvertTextToSpeech");
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

[**TTSResponse**](TTSResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |

<a name="postConvertTextToSpeech"></a>
# **postConvertTextToSpeech**
> String postConvertTextToSpeech(ttSBody)

PostConvertTextToSpeech

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ConvertTextToSpeechApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ConvertTextToSpeechApi apiInstance = new ConvertTextToSpeechApi(clientId, clientSecret);
    TTSBody ttSBody = new TTSBody(); // TTSBody | 
    try {
      String result = apiInstance.postConvertTextToSpeech(ttSBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertTextToSpeechApi#postConvertTextToSpeech");
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
| **ttSBody** | [**TTSBody**](TTSBody.md)|  | |

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

