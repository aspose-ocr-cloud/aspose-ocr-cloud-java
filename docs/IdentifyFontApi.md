# IdentifyFontApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelIdentifyFont**](IdentifyFontApi.md#cancelIdentifyFont) | **DELETE** /v5.0/ocr/IdentifyFont | CancelIdentifyFont |
| [**getIdentifyFont**](IdentifyFontApi.md#getIdentifyFont) | **GET** /v5.0/ocr/IdentifyFont | GetIdentifyFont |
| [**postIdentifyFont**](IdentifyFontApi.md#postIdentifyFont) | **POST** /v5.0/ocr/IdentifyFont | PostIdentifyFont |


<a name="cancelIdentifyFont"></a>
# **cancelIdentifyFont**
> cancelIdentifyFont(id)

CancelIdentifyFont

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.IdentifyFontApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    IdentifyFontApi apiInstance = new IdentifyFontApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelIdentifyFont(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentifyFontApi#cancelIdentifyFont");
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

<a name="getIdentifyFont"></a>
# **getIdentifyFont**
> OCRResponse getIdentifyFont(id)

GetIdentifyFont

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.IdentifyFontApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    IdentifyFontApi apiInstance = new IdentifyFontApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getIdentifyFont(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentifyFontApi#getIdentifyFont");
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

<a name="postIdentifyFont"></a>
# **postIdentifyFont**
> String postIdentifyFont(ocRRecognizeFontBody)

PostIdentifyFont

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.IdentifyFontApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    IdentifyFontApi apiInstance = new IdentifyFontApi(clientId, clientSecret);
    OCRRecognizeFontBody ocRRecognizeFontBody = new OCRRecognizeFontBody(); // OCRRecognizeFontBody | 
    try {
      String result = apiInstance.postIdentifyFont(ocRRecognizeFontBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentifyFontApi#postIdentifyFont");
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
| **ocRRecognizeFontBody** | [**OCRRecognizeFontBody**](OCRRecognizeFontBody.md)|  | |

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

