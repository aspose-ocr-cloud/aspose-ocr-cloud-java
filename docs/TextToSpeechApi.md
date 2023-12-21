# TextToSpeechApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTextToSpeechResult**](TextToSpeechApi.md#getTextToSpeechResult) | **GET** /v5.0/ocr/TextToSpeech/GetTextToSpeechResult | GetTextToSpeechResult |
| [**getTextToSpeechResultFile**](TextToSpeechApi.md#getTextToSpeechResultFile) | **GET** /v5.0/ocr/TextToSpeech/GetTextToSpeechResultFile | GetTextToSpeechResultFile |
| [**postTextToSpeech**](TextToSpeechApi.md#postTextToSpeech) | **POST** /v5.0/ocr/TextToSpeech/PostTextToSpeech | PostTextToSpeech |


<a name="getTextToSpeechResult"></a>
# **getTextToSpeechResult**
> TTSResponse getTextToSpeechResult(id)

GetTextToSpeechResult

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.TextToSpeechApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    TextToSpeechApi apiInstance = new TextToSpeechApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      TTSResponse result = apiInstance.getTextToSpeechResult(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextToSpeechApi#getTextToSpeechResult");
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

<a name="getTextToSpeechResultFile"></a>
# **getTextToSpeechResultFile**
> Object getTextToSpeechResultFile(id)

GetTextToSpeechResultFile

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.TextToSpeechApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    TextToSpeechApi apiInstance = new TextToSpeechApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      Object result = apiInstance.getTextToSpeechResultFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextToSpeechApi#getTextToSpeechResultFile");
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

**Object**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **204** | Results expired |  -  |

<a name="postTextToSpeech"></a>
# **postTextToSpeech**
> String postTextToSpeech(ttSBodyDeprecated)

PostTextToSpeech

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.TextToSpeechApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    TextToSpeechApi apiInstance = new TextToSpeechApi(clientId, clientSecret);
    TTSBodyDeprecated ttSBodyDeprecated = new TTSBodyDeprecated(); // TTSBodyDeprecated | 
    try {
      String result = apiInstance.postTextToSpeech(ttSBodyDeprecated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TextToSpeechApi#postTextToSpeech");
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
| **ttSBodyDeprecated** | [**TTSBodyDeprecated**](TTSBodyDeprecated.md)|  | |

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

