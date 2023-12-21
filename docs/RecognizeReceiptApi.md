# RecognizeReceiptApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecognizeReceipt**](RecognizeReceiptApi.md#cancelRecognizeReceipt) | **DELETE** /v5.0/ocr/RecognizeReceipt | CancelRecognizeReceipt |
| [**getRecognizeReceipt**](RecognizeReceiptApi.md#getRecognizeReceipt) | **GET** /v5.0/ocr/RecognizeReceipt | GetRecognizeReceipt |
| [**postRecognizeReceipt**](RecognizeReceiptApi.md#postRecognizeReceipt) | **POST** /v5.0/ocr/RecognizeReceipt | PostRecognizeReceipt |


<a name="cancelRecognizeReceipt"></a>
# **cancelRecognizeReceipt**
> cancelRecognizeReceipt(id)

CancelRecognizeReceipt

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeReceiptApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeReceiptApi apiInstance = new RecognizeReceiptApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelRecognizeReceipt(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeReceiptApi#cancelRecognizeReceipt");
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

<a name="getRecognizeReceipt"></a>
# **getRecognizeReceipt**
> OCRResponse getRecognizeReceipt(id)

GetRecognizeReceipt

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeReceiptApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeReceiptApi apiInstance = new RecognizeReceiptApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getRecognizeReceipt(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeReceiptApi#getRecognizeReceipt");
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

<a name="postRecognizeReceipt"></a>
# **postRecognizeReceipt**
> String postRecognizeReceipt(ocRRecognizeReceiptBody)

PostRecognizeReceipt

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeReceiptApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeReceiptApi apiInstance = new RecognizeReceiptApi(clientId, clientSecret);
    OCRRecognizeReceiptBody ocRRecognizeReceiptBody = new OCRRecognizeReceiptBody(); // OCRRecognizeReceiptBody | 
    try {
      String result = apiInstance.postRecognizeReceipt(ocRRecognizeReceiptBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeReceiptApi#postRecognizeReceipt");
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
| **ocRRecognizeReceiptBody** | [**OCRRecognizeReceiptBody**](OCRRecognizeReceiptBody.md)|  | |

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
| **401** | Unauthorized |  -  |
| **200** | Task unique ID |  -  |

