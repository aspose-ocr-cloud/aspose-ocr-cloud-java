# RecognizeAndParseInvoiceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecognizeAndParseInvoice**](RecognizeAndParseInvoiceApi.md#cancelRecognizeAndParseInvoice) | **DELETE** /v5.0/ocr/RecognizeAndParseInvoice | CancelRecognizeAndParseInvoice |
| [**getRecognizeAndParseInvoice**](RecognizeAndParseInvoiceApi.md#getRecognizeAndParseInvoice) | **GET** /v5.0/ocr/RecognizeAndParseInvoice | GetRecognizeAndParseInvoice |
| [**postRecognizeAndParseInvoice**](RecognizeAndParseInvoiceApi.md#postRecognizeAndParseInvoice) | **POST** /v5.0/ocr/RecognizeAndParseInvoice | PostRecognizeAndParseInvoice |


<a name="cancelRecognizeAndParseInvoice"></a>
# **cancelRecognizeAndParseInvoice**
> cancelRecognizeAndParseInvoice(id)

CancelRecognizeAndParseInvoice

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeAndParseInvoiceApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeAndParseInvoiceApi apiInstance = new RecognizeAndParseInvoiceApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelRecognizeAndParseInvoice(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeAndParseInvoiceApi#cancelRecognizeAndParseInvoice");
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

<a name="getRecognizeAndParseInvoice"></a>
# **getRecognizeAndParseInvoice**
> OCRResponse getRecognizeAndParseInvoice(id)

GetRecognizeAndParseInvoice

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeAndParseInvoiceApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeAndParseInvoiceApi apiInstance = new RecognizeAndParseInvoiceApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getRecognizeAndParseInvoice(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeAndParseInvoiceApi#getRecognizeAndParseInvoice");
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

<a name="postRecognizeAndParseInvoice"></a>
# **postRecognizeAndParseInvoice**
> String postRecognizeAndParseInvoice(ocRRecognizeAndParseInvoiceBody)

PostRecognizeAndParseInvoice

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeAndParseInvoiceApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeAndParseInvoiceApi apiInstance = new RecognizeAndParseInvoiceApi(clientId, clientSecret);
    OCRRecognizeAndParseInvoiceBody ocRRecognizeAndParseInvoiceBody = new OCRRecognizeAndParseInvoiceBody(); // OCRRecognizeAndParseInvoiceBody | 
    try {
      String result = apiInstance.postRecognizeAndParseInvoice(ocRRecognizeAndParseInvoiceBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeAndParseInvoiceApi#postRecognizeAndParseInvoice");
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
| **ocRRecognizeAndParseInvoiceBody** | [**OCRRecognizeAndParseInvoiceBody**](OCRRecognizeAndParseInvoiceBody.md)|  | |

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

