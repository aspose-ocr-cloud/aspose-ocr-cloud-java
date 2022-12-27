# ImageProcessingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResultFile**](ImageProcessingApi.md#getResultFile) | **GET** /v5/ImageProcessing/GetResultFile | GetResultFile |
| [**getResultTask**](ImageProcessingApi.md#getResultTask) | **GET** /v5/ImageProcessing/GetResultTask | GetResultTask |
| [**postBinarizationFile**](ImageProcessingApi.md#postBinarizationFile) | **POST** /v5/ImageProcessing/PostBinarizationFile | PostBinarizationFile |
| [**postDewarpingFile**](ImageProcessingApi.md#postDewarpingFile) | **POST** /v5/ImageProcessing/PostDewarpingFile | PostDewarpingFile |
| [**postSkewCorrectionFile**](ImageProcessingApi.md#postSkewCorrectionFile) | **POST** /v5/ImageProcessing/PostSkewCorrectionFile | PostSkewCorrectionFile |
| [**postUpsamplingFile**](ImageProcessingApi.md#postUpsamplingFile) | **POST** /v5/ImageProcessing/PostUpsamplingImageFile | PostUpsamplingImageFile |


<a name="getResultFile"></a>
# **getResultFile**
> Object getResultFile(id)

GetResultFile

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ImageProcessingApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ImageProcessingApi apiInstance = new ImageProcessingApi(clientId, clientSecret);
    String id = "id_example"; // String | Task id to select the result
    try {
      Object result = apiInstance.getResultFile(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageProcessingApi#getResultFile");
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

**Object**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getResultTask"></a>
# **getResultTask**
> OCRResponse getResultTask(id)

GetResultTask

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ImageProcessingApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ImageProcessingApi apiInstance = new ImageProcessingApi(clientId, clientSecret);
    String id = "id_example"; // String | Task id to select the result
    try {
      OCRResponse result = apiInstance.getResultTask(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageProcessingApi#getResultTask");
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

<a name="postBinarizationFile"></a>
# **postBinarizationFile**
> String postBinarizationFile(_file)

PostBinarizationFile

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ImageProcessingApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ImageProcessingApi apiInstance = new ImageProcessingApi(clientId, clientSecret);
    File _file = new File("/path/to/file"); // File | 
    try {
      String result = apiInstance.postBinarizationFile(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageProcessingApi#postBinarizationFile");
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
| **_file** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |

<a name="postDewarpingFile"></a>
# **postDewarpingFile**
> String postDewarpingFile(_file)

PostDewarpingFile

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ImageProcessingApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ImageProcessingApi apiInstance = new ImageProcessingApi(clientId, clientSecret);
    File _file = new File("/path/to/file"); // File | 
    try {
      String result = apiInstance.postDewarpingFile(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageProcessingApi#postDewarpingFile");
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
| **_file** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |

<a name="postSkewCorrectionFile"></a>
# **postSkewCorrectionFile**
> String postSkewCorrectionFile(_file)

PostSkewCorrectionFile

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ImageProcessingApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ImageProcessingApi apiInstance = new ImageProcessingApi(clientId, clientSecret);
    File _file = new File("/path/to/file"); // File | 
    try {
      String result = apiInstance.postSkewCorrectionFile(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageProcessingApi#postSkewCorrectionFile");
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
| **_file** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |

<a name="postUpsamplingFile"></a>
# **postUpsamplingFile**
> String postUpsamplingFile(_file)

PostUpsamplingImageFile

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.ImageProcessingApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    ImageProcessingApi apiInstance = new ImageProcessingApi(clientId, clientSecret);
    File _file = new File("/path/to/file"); // File | 
    try {
      String result = apiInstance.postUpsamplingFile(_file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ImageProcessingApi#postUpsamplingFile");
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
| **_file** | **File**|  | [optional] |

### Return type

**String**

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |

