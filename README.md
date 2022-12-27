# aspose-ocr-cloud

Aspose OCR Cloud 5.0 API
- API version: 5.0
  - Build date: 2022-12-26T18:15:47.000572Z[Etc/UTC]

Aspose OCR Cloud 5.0 API

  For more information, please visit [https://about.aspose.cloud/contact](https://about.aspose.cloud/contact)


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.aspose</groupId>
  <artifactId>aspose-ocr-cloud</artifactId>
  <version>22.12.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'aspose-ocr-cloud' jar has been published to maven central.
    mavenLocal()       // Needed if the 'aspose-ocr-cloud' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.aspose:aspose-ocr-cloud:22.12.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/aspose-ocr-cloud-22.12.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import Aspose.OCR.Cloud.SDK.RecognizeImageApi;
import Aspose.OCR.Cloud.SDK.model.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Example {
  public static void main(String[] args) {
    String clientId = "";
    String clientSecret = "";
    // Creating new API instance with your credentials
    RecognizeImageApi api = new RecognizeImageApi(clientId, clientSecret);

    // Creating recognition settings object
    OCRSettingsRecognizeImage settings = new OCRSettingsRecognizeImage();
    settings.setLanguage(Language.ENGLISH);
    settings.setDsrConfidence(DsrConfidence.DEFAULT);
    settings.setDsrMode(DsrMode.NODSRNOFILTER);
    settings.setMakeBinarization(false);
    settings.setMakeSkewCorrect(false);
    settings.setMakeContrastCorrection(false);
    settings.setMakeUpsampling(false);
    settings.setResultType(ResultType.TEXT);

    // Reading image file to array of bytes
    String imageFileName = "samples\\latin.png";
    byte[] imageData = Files.readAllBytes(Path.of(imageFileName));

    // Combining settings and image to request body
    OCRRecognizeImageBody requestBody = new OCRRecognizeImageBody();
    requestBody.setImage(imageData);
    requestBody.setSettings(settings);

    // Sending request to cloud API and getting task ID
    String taskId = api.postRecognizeImage(requestBody);

    // Getting result data with second request
    OCRResponse apiResponse = api.getRecognizeImage(taskId);

    // Extracting result text from response
    System.out.println(new String(apiResponse.getResults().get(0).getData(), StandardCharsets.UTF_8) + "\n\n");

  }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

| Class                 | Method                                                                             | HTTP request                                         | Description               |
|-----------------------|------------------------------------------------------------------------------------|------------------------------------------------------|---------------------------|
| *DetectRegionsApi*    | [**cancelDetectRegions**](docs/DetectRegionsApi.md#cancelDetectRegions)            | **DELETE** /v5/DetectRegions                         | CancelDetectRegions       |
| *DetectRegionsApi*    | [**getDetectRegions**](docs/DetectRegionsApi.md#getDetectRegions)                  | **GET** /v5/DetectRegions                            | GetDetectRegions          |
| *DetectRegionsApi*    | [**postDetectRegions**](docs/DetectRegionsApi.md#postDetectRegions)                | **POST** /v5/DetectRegions                           | PostDetectRegions         |
| *ImageProcessingApi*  | [**getResultFile**](docs/ImageProcessingApi.md#getResultFile)                      | **GET** /v5/ImageProcessing/GetResultFile            | GetResultFile             |
| *ImageProcessingApi*  | [**getResultTask**](docs/ImageProcessingApi.md#getResultTask)                      | **GET** /v5/ImageProcessing/GetResultTask            | GetResultTask             |
| *ImageProcessingApi*  | [**postBinarizationFile**](docs/ImageProcessingApi.md#postBinarizationFile)        | **POST** /v5/ImageProcessing/PostBinarizationFile    | PostBinarizationFile      |
| *ImageProcessingApi*  | [**postDewarpingFile**](docs/ImageProcessingApi.md#postDewarpingFile)              | **POST** /v5/ImageProcessing/PostDewarpingFile       | PostDewarpingFile         |
| *ImageProcessingApi*  | [**postSkewCorrectionFile**](docs/ImageProcessingApi.md#postSkewCorrectionFile)    | **POST** /v5/ImageProcessing/PostSkewCorrectionFile  | PostSkewCorrectionFile    |
| *ImageProcessingApi*  | [**postUpsamplingFile**](docs/ImageProcessingApi.md#postUpsamplingFile)            | **POST** /v5/ImageProcessing/PostUpsamplingImageFile | PostUpsamplingImageFile   |
| *RecognizeImageApi*   | [**cancelRecognizeImage**](docs/RecognizeImageApi.md#cancelRecognizeImage)         | **DELETE** /v5/RecognizeImage                        | CancelRecognizeImage      |
| *RecognizeImageApi*   | [**getRecognizeImage**](docs/RecognizeImageApi.md#getRecognizeImage)               | **GET** /v5/RecognizeImage                           | GetRecognizeImage         |
| *RecognizeImageApi*   | [**postRecognizeImage**](docs/RecognizeImageApi.md#postRecognizeImage)             | **POST** /v5/RecognizeImage                          | PostRecognizeImage        |
| *RecognizePdfApi*     | [**cancelRecognizePdf**](docs/RecognizePdfApi.md#cancelRecognizePdf)               | **DELETE** /v5/RecognizePdf                          | CancelRecognizePdf        |
| *RecognizePdfApi*     | [**getRecognizePdf**](docs/RecognizePdfApi.md#getRecognizePdf)                     | **GET** /v5/RecognizePdf                             | GetRecognizePdf           |
| *RecognizePdfApi*     | [**postRecognizePdf**](docs/RecognizePdfApi.md#postRecognizePdf)                   | **POST** /v5/RecognizePdf                            | PostRecognizePdf          |
| *RecognizeReceiptApi* | [**cancelRecognizeReceipt**](docs/RecognizeReceiptApi.md#cancelRecognizeReceipt)   | **DELETE** /v5/RecognizeReceipt                      | CancelRecognizeReceipt    |
| *RecognizeReceiptApi* | [**getRecognizeReceipt**](docs/RecognizeReceiptApi.md#getRecognizeReceipt)         | **GET** /v5/RecognizeReceipt                         | GetRecognizeReceipt       |
| *RecognizeReceiptApi* | [**postRecognizeReceipt**](docs/RecognizeReceiptApi.md#postRecognizeReceipt)       | **POST** /v5/RecognizeReceipt                        | PostRecognizeReceipt      |
| *RecognizeRegionsApi* | [**cancelRecognizeRegions**](docs/RecognizeRegionsApi.md#cancelRecognizeRegions)   | **DELETE** /v5/RecognizeRegions                      | CancelRecognizeRegions    |
| *RecognizeRegionsApi* | [**getRecognizeRegions**](docs/RecognizeRegionsApi.md#getRecognizeRegions)         | **GET** /v5/RecognizeRegions                         | GetRecognizeRegions       |
| *RecognizeRegionsApi* | [**postRecognizeRegions**](docs/RecognizeRegionsApi.md#postRecognizeRegions)       | **POST** /v5/RecognizeRegions                        | PostRecognizeRegions      |
| *RecognizeTableApi*   | [**cancelRecognizeTable**](docs/RecognizeTableApi.md#cancelRecognizeTable)         | **DELETE** /v5/RecognizeTable                        | CancelRecognizeTable      |
| *RecognizeTableApi*   | [**getRecognizeTable**](docs/RecognizeTableApi.md#getRecognizeTable)               | **GET** /v5/RecognizeTable                           | GetRecognizeTable         |
| *RecognizeTableApi*   | [**postRecognizeTable**](docs/RecognizeTableApi.md#postRecognizeTable)             | **POST** /v5/RecognizeTable                          | PostRecognizeTable        |
| *TextToSpeechApi*     | [**getTextToSpeechResult**](docs/TextToSpeechApi.md#getTextToSpeechResult)         | **GET** /v5/TextToSpeech/GetTextToSpeechResult       | GetTextToSpeechResult     |
| *TextToSpeechApi*     | [**getTextToSpeechResultFile**](docs/TextToSpeechApi.md#getTextToSpeechResultFile) | **GET** /v5/TextToSpeech/GetTextToSpeechResultFile   | GetTextToSpeechResultFile |
| *TextToSpeechApi*     | [**postTextToSpeech**](docs/TextToSpeechApi.md#postTextToSpeech)                   | **POST** /v5/TextToSpeech/PostTextToSpeech           | PostTextToSpeech          |

## Documentation for Models

 - [DsrConfidence](docs/DsrConfidence.md)
 - [DsrMode](docs/DsrMode.md)
 - [Language](docs/Language.md)
 - [LanguageTTS](docs/LanguageTTS.md)
 - [OCRDetectRegionsBody](docs/OCRDetectRegionsBody.md)
 - [OCRError](docs/OCRError.md)
 - [OCRRecognizeImageBody](docs/OCRRecognizeImageBody.md)
 - [OCRRecognizePdfBody](docs/OCRRecognizePdfBody.md)
 - [OCRRecognizeReceiptBody](docs/OCRRecognizeReceiptBody.md)
 - [OCRRecognizeRegionsBody](docs/OCRRecognizeRegionsBody.md)
 - [OCRRecognizeTableBody](docs/OCRRecognizeTableBody.md)
 - [OCRRect](docs/OCRRect.md)
 - [OCRRegion](docs/OCRRegion.md)
 - [OCRResponse](docs/OCRResponse.md)
 - [OCRResult](docs/OCRResult.md)
 - [OCRSettingsDetectRegions](docs/OCRSettingsDetectRegions.md)
 - [OCRSettingsRecognizeImage](docs/OCRSettingsRecognizeImage.md)
 - [OCRSettingsRecognizePdf](docs/OCRSettingsRecognizePdf.md)
 - [OCRSettingsRecognizeReceipt](docs/OCRSettingsRecognizeReceipt.md)
 - [OCRSettingsRecognizeRegions](docs/OCRSettingsRecognizeRegions.md)
 - [OCRSettingsRecognizeTable](docs/OCRSettingsRecognizeTable.md)
 - [OCRTaskStatus](docs/OCRTaskStatus.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ResponseStatusCode](docs/ResponseStatusCode.md)
 - [ResultType](docs/ResultType.md)
 - [ResultTypeTTS](docs/ResultTypeTTS.md)
 - [ResultTypeTable](docs/ResultTypeTable.md)
 - [TTSBody](docs/TTSBody.md)
 - [TTSError](docs/TTSError.md)
 - [TTSResponse](docs/TTSResponse.md)
 - [TTSResult](docs/TTSResult.md)
 - [TTSTaskStatus](docs/TTSTaskStatus.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### JWT

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



