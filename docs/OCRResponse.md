

# OCRResponse

Response with Recognition result for specific task ID

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The specific Task ID that result was made for |  [optional] |
|**responseStatusCode** | **ResponseStatusCode** |  |  [optional] |
|**taskStatus** | **OCRTaskStatus** |  |  [optional] |
|**results** | [**List&lt;OCRResult&gt;**](OCRResult.md) | List of results - Especially Text or PDF files |  [optional] [readonly] |
|**error** | [**OCRError**](OCRError.md) |  |  [optional] |



