# DjVu2PdfApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelDjVu2PDF**](DjVu2PdfApi.md#cancelDjVu2PDF) | **DELETE** /v5/DjVu2PDF | CancelDjVu2PDF |
| [**getDjVu2PDF**](DjVu2PdfApi.md#getDjVu2PDF) | **GET** /v5/DjVu2PDF | GetDjVu2PDF |
| [**postDjVu2PDF**](DjVu2PdfApi.md#postDjVu2PDF) | **POST** /v5/DjVu2PDF | PostDjVu2PDF |


<a name="cancelDjVu2PDF"></a>
# **cancelDjVu2PDF**
> cancelDjVu2PDF(id)

CancelDjVu2PDF

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DjVu2PdfApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DjVu2PdfApi apiInstance = new DjVu2PdfApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelDjVu2PDF(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DjVu2PdfApi#cancelDjVu2PDF");
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

<a name="getDjVu2PDF"></a>
# **getDjVu2PDF**
> OCRResponse getDjVu2PDF(id)

GetDjVu2PDF

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DjVu2PdfApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DjVu2PdfApi apiInstance = new DjVu2PdfApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getDjVu2PDF(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DjVu2PdfApi#getDjVu2PDF");
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

<a name="postDjVu2PDF"></a>
# **postDjVu2PDF**
> String postDjVu2PDF(ocRDjVu2PDFBody)

PostDjVu2PDF

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DjVu2PdfApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DjVu2PdfApi apiInstance = new DjVu2PdfApi(clientId, clientSecret);
    OCRDjVu2PDFBody ocRDjVu2PDFBody = new OCRDjVu2PDFBody(); // OCRDjVu2PDFBody | 
    try {
      String result = apiInstance.postDjVu2PDF(ocRDjVu2PDFBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DjVu2PdfApi#postDjVu2PDF");
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
| **ocRDjVu2PDFBody** | [**OCRDjVu2PDFBody**](OCRDjVu2PDFBody.md)|  | |

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

