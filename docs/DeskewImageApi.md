# DeskewImageApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelDeskewImage**](DeskewImageApi.md#cancelDeskewImage) | **DELETE** /v5.0/ocr/DeskewImage | CancelDeskewImage |
| [**getDeskewImage**](DeskewImageApi.md#getDeskewImage) | **GET** /v5.0/ocr/DeskewImage | GetDeskewImage |
| [**postDeskewImage**](DeskewImageApi.md#postDeskewImage) | **POST** /v5.0/ocr/DeskewImage | PostDeskewImage |


<a name="cancelDeskewImage"></a>
# **cancelDeskewImage**
> cancelDeskewImage(id)

CancelDeskewImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DeskewImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DeskewImageApi apiInstance = new DeskewImageApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelDeskewImage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeskewImageApi#cancelDeskewImage");
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

<a name="getDeskewImage"></a>
# **getDeskewImage**
> OCRResponse getDeskewImage(id)

GetDeskewImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DeskewImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DeskewImageApi apiInstance = new DeskewImageApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getDeskewImage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeskewImageApi#getDeskewImage");
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

<a name="postDeskewImage"></a>
# **postDeskewImage**
> String postDeskewImage(ocRDeskewImageBody)

PostDeskewImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DeskewImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DeskewImageApi apiInstance = new DeskewImageApi(clientId, clientSecret);
    OCRDeskewImageBody ocRDeskewImageBody = new OCRDeskewImageBody(); // OCRDeskewImageBody | 
    try {
      String result = apiInstance.postDeskewImage(ocRDeskewImageBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeskewImageApi#postDeskewImage");
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
| **ocRDeskewImageBody** | [**OCRDeskewImageBody**](OCRDeskewImageBody.md)|  | |

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

