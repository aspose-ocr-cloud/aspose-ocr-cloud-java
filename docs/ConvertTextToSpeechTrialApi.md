# ConvertTextToSpeechTrialApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelConvertTextToSpeechTrial**](ConvertTextToSpeechTrialApi.md#cancelConvertTextToSpeechTrial) | **DELETE** /v5.0/ocr/ConvertTextToSpeechTrial | CancelConvertTextToSpeechTrial |
| [**getConvertTextToSpeechTrial**](ConvertTextToSpeechTrialApi.md#getConvertTextToSpeechTrial) | **GET** /v5.0/ocr/ConvertTextToSpeechTrial | GetConvertTextToSpeechTrial |
| [**postConvertTextToSpeechTrial**](ConvertTextToSpeechTrialApi.md#postConvertTextToSpeechTrial) | **POST** /v5.0/ocr/ConvertTextToSpeechTrial | PostConvertTextToSpeechTrial |


<a name="cancelConvertTextToSpeechTrial"></a>
# **cancelConvertTextToSpeechTrial**
> cancelConvertTextToSpeechTrial(id)

CancelConvertTextToSpeechTrial

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ConvertTextToSpeechTrialApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ConvertTextToSpeechTrialApi apiInstance = new ConvertTextToSpeechTrialApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelConvertTextToSpeechTrial(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertTextToSpeechTrialApi#cancelConvertTextToSpeechTrial");
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

<a name="getConvertTextToSpeechTrial"></a>
# **getConvertTextToSpeechTrial**
> TTSResponse getConvertTextToSpeechTrial(id)

GetConvertTextToSpeechTrial

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ConvertTextToSpeechTrialApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ConvertTextToSpeechTrialApi apiInstance = new ConvertTextToSpeechTrialApi(clientId, clientSecret);
    String id = "id_example"; // String | Task id to select the result
    try {
      TTSResponse result = apiInstance.getConvertTextToSpeechTrial(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertTextToSpeechTrialApi#getConvertTextToSpeechTrial");
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

<a name="postConvertTextToSpeechTrial"></a>
# **postConvertTextToSpeechTrial**
> String postConvertTextToSpeechTrial(ttSBody)

PostConvertTextToSpeechTrial

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ConvertTextToSpeechTrialApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ConvertTextToSpeechTrialApi apiInstance = new ConvertTextToSpeechTrialApi(clientId, clientSecret);
    TTSBody ttSBody = new TTSBody(); // TTSBody | 
    try {
      String result = apiInstance.postConvertTextToSpeechTrial(ttSBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConvertTextToSpeechTrialApi#postConvertTextToSpeechTrial");
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

