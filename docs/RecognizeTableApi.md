# RecognizeTableApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRecognizeTable**](RecognizeTableApi.md#cancelRecognizeTable) | **DELETE** /v5/RecognizeTable | CancelRecognizeTable |
| [**getRecognizeTable**](RecognizeTableApi.md#getRecognizeTable) | **GET** /v5/RecognizeTable | GetRecognizeTable |
| [**postRecognizeTable**](RecognizeTableApi.md#postRecognizeTable) | **POST** /v5/RecognizeTable | PostRecognizeTable |


<a name="cancelRecognizeTable"></a>
# **cancelRecognizeTable**
> cancelRecognizeTable(id)

CancelRecognizeTable

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeTableApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeTableApi apiInstance = new RecognizeTableApi(clientId, clientSecret);
    String id = "id_example"; // String | 
    try {
      apiInstance.cancelRecognizeTable(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeTableApi#cancelRecognizeTable");
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

<a name="getRecognizeTable"></a>
# **getRecognizeTable**
> OCRResponse getRecognizeTable(id)

GetRecognizeTable

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeTableApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeTableApi apiInstance = new RecognizeTableApi(clientId, clientSecret);
    String id = "id_example"; // String | Task id to select the result
    try {
      OCRResponse result = apiInstance.getRecognizeTable(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeTableApi#getRecognizeTable");
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

<a name="postRecognizeTable"></a>
# **postRecognizeTable**
> String postRecognizeTable(ocRRecognizeTableBody)

PostRecognizeTable

### Example
```java
// Import classes:
import Aspose.OCR.Cloud.SDK.ApiClient;
import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.Configuration;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.models.*;
import Aspose.OCR.Cloud.SDK.RecognizeTableApi;

public class Example {
  public static void main(String[] args) {
    
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeTableApi apiInstance = new RecognizeTableApi(clientId, clientSecret);
    OCRRecognizeTableBody ocRRecognizeTableBody = new OCRRecognizeTableBody(); // OCRRecognizeTableBody | 
    try {
      String result = apiInstance.postRecognizeTable(ocRRecognizeTableBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RecognizeTableApi#postRecognizeTable");
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
| **ocRRecognizeTableBody** | [**OCRRecognizeTableBody**](OCRRecognizeTableBody.md)|  | |

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

