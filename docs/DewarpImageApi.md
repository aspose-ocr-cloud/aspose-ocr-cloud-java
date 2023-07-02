# DewarpImageApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelDewarpImage**](DewarpImageApi.md#cancelDewarpImage) | **DELETE** /v5/DewarpImage | CancelDewarpImage |
| [**getDewarpImage**](DewarpImageApi.md#getDewarpImage) | **GET** /v5/DewarpImage | GetDewarpImage |
| [**postDewarpImage**](DewarpImageApi.md#postDewarpImage) | **POST** /v5/DewarpImage | PostDewarpImage |


<a name="cancelDewarpImage"></a>
# **cancelDewarpImage**
> cancelDewarpImage(id)

CancelDewarpImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DewarpImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DewarpImageApi apiInstance = new DewarpImageApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelDewarpImage(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DewarpImageApi#cancelDewarpImage");
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

<a name="getDewarpImage"></a>
# **getDewarpImage**
> OCRResponse getDewarpImage(id)

GetDewarpImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DewarpImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DewarpImageApi apiInstance = new DewarpImageApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      OCRResponse result = apiInstance.getDewarpImage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DewarpImageApi#getDewarpImage");
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

<a name="postDewarpImage"></a>
# **postDewarpImage**
> String postDewarpImage(ocRDewarpImageBody)

PostDewarpImage

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.DewarpImageApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    DewarpImageApi apiInstance = new DewarpImageApi(clientId, clientSecret);
    OCRDewarpImageBody ocRDewarpImageBody = new OCRDewarpImageBody(); // OCRDewarpImageBody | 
    try {
      String result = apiInstance.postDewarpImage(ocRDewarpImageBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DewarpImageApi#postDewarpImage");
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
| **ocRDewarpImageBody** | [**OCRDewarpImageBody**](OCRDewarpImageBody.md)|  | |

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

