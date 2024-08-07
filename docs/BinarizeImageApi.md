# BinarizeImageApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelBinarizeImage**](BinarizeImageApi.md#cancelBinarizeImage) | **DELETE** /v5.0/ocr/BinarizeImage | CancelBinarizeImage |
| [**getBinarizeImage**](BinarizeImageApi.md#getBinarizeImage) | **GET** /v5.0/ocr/BinarizeImage | GetBinarizeImage |
| [**postBinarizeImage**](BinarizeImageApi.md#postBinarizeImage) | **POST** /v5.0/ocr/BinarizeImage | PostBinarizeImage |


<a name="cancelBinarizeImage"></a>
# **cancelBinarizeImage**
> cancelBinarizeImage(id)

CancelBinarizeImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.BinarizeImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    BinarizeImageApi apiInstance = new BinarizeImageApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelBinarizeImage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinarizeImageApi#cancelBinarizeImage");
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

<a name="getBinarizeImage"></a>
# **getBinarizeImage**
> OCRResponse getBinarizeImage(id)

GetBinarizeImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.BinarizeImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    BinarizeImageApi apiInstance = new BinarizeImageApi(clientId, clientSecret);
    String id = "id_example"; // String | Task id to select the result
    try {
      OCRResponse result = apiInstance.getBinarizeImage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinarizeImageApi#getBinarizeImage");
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

<a name="postBinarizeImage"></a>
# **postBinarizeImage**
> String postBinarizeImage(ocRBinarizeImageBody)

PostBinarizeImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.BinarizeImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    BinarizeImageApi apiInstance = new BinarizeImageApi(clientId, clientSecret);
    OCRBinarizeImageBody ocRBinarizeImageBody = new OCRBinarizeImageBody(); // OCRBinarizeImageBody | 
    try {
      String result = apiInstance.postBinarizeImage(ocRBinarizeImageBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinarizeImageApi#postBinarizeImage");
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
| **ocRBinarizeImageBody** | [**OCRBinarizeImageBody**](OCRBinarizeImageBody.md)|  | |

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

