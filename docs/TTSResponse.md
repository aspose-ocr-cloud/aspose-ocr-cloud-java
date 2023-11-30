

# TTSResponse

Response with Recognition result for specific task ID

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The specific Task ID that result was made for |  [optional] |
|**responseStatusCode** | **ResponseStatusCode** |  |  [optional] |
|**taskStatus** | **TTSTaskStatus** |  |  [optional] |
|**results** | [**List&lt;TTSResult&gt;**](TTSResult.md) | List of results - Especially Text or PDF files |  [optional] [readonly] |
|**error** | [**TTSError**](TTSError.md) |  |  [optional] |



