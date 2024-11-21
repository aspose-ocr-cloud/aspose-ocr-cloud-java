# Aspose.OCR Cloud for Java SDK 24.11.0

[![License](https://img.shields.io/github/license/aspose-ocr-cloud/aspose-ocr-cloud-dotnet)](LICENSE)
[![Nuget](https://img.shields.io/nuget/v/Aspose.OCR-Cloud)](https://www.nuget.org/packages/Aspose.OCR-Cloud/)

[Aspose.OCR Cloud](https://products.aspose.cloud/ocr/) is an optical character recognition as a service. With it, you can easily add OCR functionality to almost any device or platform, including netbooks, mini PCs, or even entry-level smartphones.

Our engine can read text from images, photos, screenshots and scanned PDFs in a wide variety of European, Cyrillic and Oriental fonts, returning results in the most popular document formats. Powerful built-in image processing filters based on neural networks automatically correct skewed and distorted images, automatically remove dirt, smudges, scratches, glare and other image defects that can affect recognition accuracy. To further improve the results, Aspose.OCR Cloud has a built-in spell checker that automatically replaces misspelled words and saves you the trouble of manually correcting the recognition results.

Even the complex recognition tasks can be done with a couple of API calls. To make interacting with Aspose.OCR Cloud services from .NET applications even easier, we provide the software development kit (SDK) for .NET. It handles all the routine operations such as establishing connections, sending API requests, and parsing responses, wrapping all these tasks into a few simple classes.

Aspose.OCR Cloud SDK for .NET is open source under the MIT license. You can freely use it for any projects, including commercial and proprietary applications, as well as modify any part of its code.

## Try Online
[Image to Text](https://products.aspose.app/ocr/scan-image) | [Image to Searchable PDF](https://products.aspose.app/ocr/ocr-to-pdf) | [PDF OCR](https://products.aspose.app/ocr/pdf-ocr)| [Receipt Scanner](https://products.aspose.app/ocr/scan-receipt)
:---: | :---: | :---:| :---:
[![Scan Image](https://products.aspose.app/ocr/scan-image/img/ocr-recognize-48.png)](https://products.aspose.app/ocr/scan-image) | [![Image to Searchable PDF](https://products.aspose.app/ocr/scan-image/img/ocr-to-pdf-4-48.png)](https://products.aspose.app/ocr/ocr-to-pdf) | [![PDF OCR](https://products.aspose.app/ocr/scan-image/img/ocr-to-pdf-2-48.png)](https://products.aspose.app/ocr/pdf-ocr) | [![Receipt Scanner](https://products.aspose.app/ocr/scan-image/img/aspose-scan-receipt-48.png)](https://products.aspose.app/ocr/scan-receipt) 

## What was changed in version 24.11.0

A summary of recent changes, enhancements and bug fixes in **Aspose.OCR Cloud SDK for Java 24.11.0** release:

Key | Summary | Category
--- | ------- | --------
OCR-3977 | Added recognition of the Uyghur language, including mixed Uyghur/English texts. | New feature
OCR-3978 | Added recognition of the Telugu language, including mixed Telugu/English texts. | New feature
OCR-3979 | Added recognition of the Kannada language, including mixed Kannada/English texts. | New feature
OCR-3980 | Added recognition of the Tamil language, including mixed Tamil/English texts. | New feature
OCR-3985 | Added recognition of the Devanagari-based scripts, including mixed Devanagari/English texts. | New feature
OCR-3986 | Added support for mixed Arabic/English texts. | Enhancement
OCR-3984 | Added support for mixed Japanese/English texts. | Enhancement
OCR-3983 | Added support for mixed Korean/English texts. | Enhancement
OCR-3982 | Added support for mixed Chinese/English texts. | Enhancement
OCR-3987 | Added support for mixed Persian/English texts. | Enhancement

REST API changes: https://releases.aspose.cloud/ocr/release-notes/2024/aspose-ocr-cloud-24-11-0-release-notes/

#### New recognition languages

The following recognition languages have been added:

Script     | REST API
---------- | --------
Uyghur     | `Language.Uyghur`
Telugu     | `Language.Telugu`
Kannada    | `Language.Kannada`
Tamil      | `Language.Tamil`
Devanagari-based languages | `Language.Devanagari`


All of the OCR languages mentioned above also support the recognition of mixed texts, including those with Latin characters.

### Mixed language support

Aspose.OCR Cloud now supports the recognition of texts which include both native and Latin characters for the following languages:

- Arabic (`Language.Arabic`)
- Chinese (`Language.Chinese`)
- Japanese (`Language.Japanese`)
- Korean (`Language.Korean`)
- Persian (`Language.Persian`)


#### Updated public APIs:

_No changes_

#### Removed public APIs:

_No changes._


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
  <version>24.11.0</version>
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
     implementation "com.aspose:aspose-ocr-cloud:24.11.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/aspose-ocr-cloud-24.11.0.jar`
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

### Running demo

1. Open [Examples](/example) demo project.
2. Provide your **Client ID** and **Client Secret** (see _Authorization_ above).
3. Run the project.


### Authorization

Aspose.OCR Cloud follows industry standards and best practices to keep your data secure. All communication with OCR REST API is done using JWT authentication, which provides an open-standard, highly secure way to exchange information. Time-limited JWT tokens are generated using _Client ID_ and _Client Secret_ credentials that are specific for each application. To obtain the credentials:

1. Sign in to [Aspose Cloud API Dashboard](https://dashboard.aspose.cloud/).
2. Go to [**Applications**](https://dashboard.aspose.cloud/applications) page.
3. Click **Create New Application** button.
4. Give the application an easily recognizable name so it can be quickly found in a long list, and provide an optional detailed description.
5. Create the cloud storage by clicking the _plus_ icon and following the required steps. You can also reuse existing storage, if available.   
   Aspose.OCR Cloud uses its own internal storage, so you can provide the bare minimum storage options:

    - Type: **Internal storage**
    - Storage name: _Any name you like_
    - Storage mode: **Retain files for 24 hours**

6. Click **Save** button.
7. Click the newly created application and copy the values from **Client Id** and **Client Secret** fields.
8. Pass in the values from the **Client ID** and **Client Secret** fields when initializing the required OCR API.

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BinarizeImageApi* | [**cancelBinarizeImage**](docs/BinarizeImageApi.md#cancelBinarizeImage) | **DELETE** /v5.0/ocr/BinarizeImage | CancelBinarizeImage
*BinarizeImageApi* | [**getBinarizeImage**](docs/BinarizeImageApi.md#getBinarizeImage) | **GET** /v5.0/ocr/BinarizeImage | GetBinarizeImage
*BinarizeImageApi* | [**postBinarizeImage**](docs/BinarizeImageApi.md#postBinarizeImage) | **POST** /v5.0/ocr/BinarizeImage | PostBinarizeImage
*ConvertTextToSpeechApi* | [**cancelConvertTextToSpeech**](docs/ConvertTextToSpeechApi.md#cancelConvertTextToSpeech) | **DELETE** /v5.0/ocr/ConvertTextToSpeech | CancelConvertTextToSpeech
*ConvertTextToSpeechApi* | [**getConvertTextToSpeech**](docs/ConvertTextToSpeechApi.md#getConvertTextToSpeech) | **GET** /v5.0/ocr/ConvertTextToSpeech | GetConvertTextToSpeech
*ConvertTextToSpeechApi* | [**postConvertTextToSpeech**](docs/ConvertTextToSpeechApi.md#postConvertTextToSpeech) | **POST** /v5.0/ocr/ConvertTextToSpeech | PostConvertTextToSpeech
*ConvertTextToSpeechTrialApi* | [**cancelConvertTextToSpeechTrial**](docs/ConvertTextToSpeechTrialApi.md#cancelConvertTextToSpeechTrial) | **DELETE** /v5.0/ocr/ConvertTextToSpeechTrial | CancelConvertTextToSpeechTrial
*ConvertTextToSpeechTrialApi* | [**getConvertTextToSpeechTrial**](docs/ConvertTextToSpeechTrialApi.md#getConvertTextToSpeechTrial) | **GET** /v5.0/ocr/ConvertTextToSpeechTrial | GetConvertTextToSpeechTrial
*ConvertTextToSpeechTrialApi* | [**postConvertTextToSpeechTrial**](docs/ConvertTextToSpeechTrialApi.md#postConvertTextToSpeechTrial) | **POST** /v5.0/ocr/ConvertTextToSpeechTrial | PostConvertTextToSpeechTrial
*DeskewImageApi* | [**cancelDeskewImage**](docs/DeskewImageApi.md#cancelDeskewImage) | **DELETE** /v5.0/ocr/DeskewImage | CancelDeskewImage
*DeskewImageApi* | [**getDeskewImage**](docs/DeskewImageApi.md#getDeskewImage) | **GET** /v5.0/ocr/DeskewImage | GetDeskewImage
*DeskewImageApi* | [**postDeskewImage**](docs/DeskewImageApi.md#postDeskewImage) | **POST** /v5.0/ocr/DeskewImage | PostDeskewImage
*DetectRegionsApi* | [**cancelDetectRegions**](docs/DetectRegionsApi.md#cancelDetectRegions) | **DELETE** /v5.0/ocr/DetectRegions | CancelDetectRegions
*DetectRegionsApi* | [**getDetectRegions**](docs/DetectRegionsApi.md#getDetectRegions) | **GET** /v5.0/ocr/DetectRegions | GetDetectRegions
*DetectRegionsApi* | [**postDetectRegions**](docs/DetectRegionsApi.md#postDetectRegions) | **POST** /v5.0/ocr/DetectRegions | PostDetectRegions
*DewarpImageApi* | [**cancelDewarpImage**](docs/DewarpImageApi.md#cancelDewarpImage) | **DELETE** /v5.0/ocr/DewarpImage | CancelDewarpImage
*DewarpImageApi* | [**getDewarpImage**](docs/DewarpImageApi.md#getDewarpImage) | **GET** /v5.0/ocr/DewarpImage | GetDewarpImage
*DewarpImageApi* | [**postDewarpImage**](docs/DewarpImageApi.md#postDewarpImage) | **POST** /v5.0/ocr/DewarpImage | PostDewarpImage
*DjVu2PdfApi* | [**cancelDjVu2PDF**](docs/DjVu2PdfApi.md#cancelDjVu2PDF) | **DELETE** /v5.0/ocr/DjVu2PDF | CancelDjVu2PDF
*DjVu2PdfApi* | [**getDjVu2PDF**](docs/DjVu2PdfApi.md#getDjVu2PDF) | **GET** /v5.0/ocr/DjVu2PDF | GetDjVu2PDF
*DjVu2PdfApi* | [**postDjVu2PDF**](docs/DjVu2PdfApi.md#postDjVu2PDF) | **POST** /v5.0/ocr/DjVu2PDF | PostDjVu2PDF
*IdentifyFontApi* | [**cancelIdentifyFont**](docs/IdentifyFontApi.md#cancelIdentifyFont) | **DELETE** /v5.0/ocr/IdentifyFont | CancelIdentifyFont
*IdentifyFontApi* | [**getIdentifyFont**](docs/IdentifyFontApi.md#getIdentifyFont) | **GET** /v5.0/ocr/IdentifyFont | GetIdentifyFont
*IdentifyFontApi* | [**postIdentifyFont**](docs/IdentifyFontApi.md#postIdentifyFont) | **POST** /v5.0/ocr/IdentifyFont | PostIdentifyFont
*ImageProcessingApi* | [**getResultFile**](docs/ImageProcessingApi.md#getResultFile) | **GET** /v5.0/ocr/ImageProcessing/GetResultFile | GetResultFile
*ImageProcessingApi* | [**getResultTask**](docs/ImageProcessingApi.md#getResultTask) | **GET** /v5.0/ocr/ImageProcessing/GetResultTask | GetResultTask
*ImageProcessingApi* | [**postBinarizationFile**](docs/ImageProcessingApi.md#postBinarizationFile) | **POST** /v5.0/ocr/ImageProcessing/PostBinarizationFile | PostBinarizationFile
*ImageProcessingApi* | [**postDewarpingFile**](docs/ImageProcessingApi.md#postDewarpingFile) | **POST** /v5.0/ocr/ImageProcessing/PostDewarpingFile | PostDewarpingFile
*ImageProcessingApi* | [**postSkewCorrectionFile**](docs/ImageProcessingApi.md#postSkewCorrectionFile) | **POST** /v5.0/ocr/ImageProcessing/PostSkewCorrectionFile | PostSkewCorrectionFile
*ImageProcessingApi* | [**postUpsamplingFile**](docs/ImageProcessingApi.md#postUpsamplingFile) | **POST** /v5.0/ocr/ImageProcessing/PostUpsamplingImageFile | PostUpsamplingImageFile
*RecognizeAndParseInvoiceApi* | [**cancelRecognizeAndParseInvoice**](docs/RecognizeAndParseInvoiceApi.md#cancelRecognizeAndParseInvoice) | **DELETE** /v5.0/ocr/RecognizeAndParseInvoice | CancelRecognizeAndParseInvoice
*RecognizeAndParseInvoiceApi* | [**getRecognizeAndParseInvoice**](docs/RecognizeAndParseInvoiceApi.md#getRecognizeAndParseInvoice) | **GET** /v5.0/ocr/RecognizeAndParseInvoice | GetRecognizeAndParseInvoice
*RecognizeAndParseInvoiceApi* | [**postRecognizeAndParseInvoice**](docs/RecognizeAndParseInvoiceApi.md#postRecognizeAndParseInvoice) | **POST** /v5.0/ocr/RecognizeAndParseInvoice | PostRecognizeAndParseInvoice
*RecognizeImageApi* | [**cancelRecognizeImage**](docs/RecognizeImageApi.md#cancelRecognizeImage) | **DELETE** /v5.0/ocr/RecognizeImage | CancelRecognizeImage
*RecognizeImageApi* | [**getRecognizeImage**](docs/RecognizeImageApi.md#getRecognizeImage) | **GET** /v5.0/ocr/RecognizeImage | GetRecognizeImage
*RecognizeImageApi* | [**postRecognizeImage**](docs/RecognizeImageApi.md#postRecognizeImage) | **POST** /v5.0/ocr/RecognizeImage | PostRecognizeImage
*RecognizeImageTrialApi* | [**cancelRecognizeImageTrial**](docs/RecognizeImageTrialApi.md#cancelRecognizeImageTrial) | **DELETE** /v5.0/ocr/RecognizeImageTrial | CancelRecognizeImageTrial
*RecognizeImageTrialApi* | [**getRecognizeImageTrial**](docs/RecognizeImageTrialApi.md#getRecognizeImageTrial) | **GET** /v5.0/ocr/RecognizeImageTrial | GetRecognizeImageTrial
*RecognizeImageTrialApi* | [**postRecognizeImageTrial**](docs/RecognizeImageTrialApi.md#postRecognizeImageTrial) | **POST** /v5.0/ocr/RecognizeImageTrial | PostRecognizeImageTrial
*RecognizeLabelApi* | [**cancelRecognizeLabel**](docs/RecognizeLabelApi.md#cancelRecognizeLabel) | **DELETE** /v5.0/ocr/RecognizeLabel | CancelRecognizeLabel
*RecognizeLabelApi* | [**getRecognizeLabel**](docs/RecognizeLabelApi.md#getRecognizeLabel) | **GET** /v5.0/ocr/RecognizeLabel | GetRecognizeLabel
*RecognizeLabelApi* | [**postRecognizeLabel**](docs/RecognizeLabelApi.md#postRecognizeLabel) | **POST** /v5.0/ocr/RecognizeLabel | PostRecognizeLabel
*RecognizePdfApi* | [**cancelRecognizePdf**](docs/RecognizePdfApi.md#cancelRecognizePdf) | **DELETE** /v5.0/ocr/RecognizePdf | CancelRecognizePdf
*RecognizePdfApi* | [**getRecognizePdf**](docs/RecognizePdfApi.md#getRecognizePdf) | **GET** /v5.0/ocr/RecognizePdf | GetRecognizePdf
*RecognizePdfApi* | [**postRecognizePdf**](docs/RecognizePdfApi.md#postRecognizePdf) | **POST** /v5.0/ocr/RecognizePdf | PostRecognizePdf
*RecognizeReceiptApi* | [**cancelRecognizeReceipt**](docs/RecognizeReceiptApi.md#cancelRecognizeReceipt) | **DELETE** /v5.0/ocr/RecognizeReceipt | CancelRecognizeReceipt
*RecognizeReceiptApi* | [**getRecognizeReceipt**](docs/RecognizeReceiptApi.md#getRecognizeReceipt) | **GET** /v5.0/ocr/RecognizeReceipt | GetRecognizeReceipt
*RecognizeReceiptApi* | [**postRecognizeReceipt**](docs/RecognizeReceiptApi.md#postRecognizeReceipt) | **POST** /v5.0/ocr/RecognizeReceipt | PostRecognizeReceipt
*RecognizeRegionsApi* | [**cancelRecognizeRegions**](docs/RecognizeRegionsApi.md#cancelRecognizeRegions) | **DELETE** /v5.0/ocr/RecognizeRegions | CancelRecognizeRegions
*RecognizeRegionsApi* | [**getRecognizeRegions**](docs/RecognizeRegionsApi.md#getRecognizeRegions) | **GET** /v5.0/ocr/RecognizeRegions | GetRecognizeRegions
*RecognizeRegionsApi* | [**postRecognizeRegions**](docs/RecognizeRegionsApi.md#postRecognizeRegions) | **POST** /v5.0/ocr/RecognizeRegions | PostRecognizeRegions
*RecognizeTableApi* | [**cancelRecognizeTable**](docs/RecognizeTableApi.md#cancelRecognizeTable) | **DELETE** /v5.0/ocr/RecognizeTable | CancelRecognizeTable
*RecognizeTableApi* | [**getRecognizeTable**](docs/RecognizeTableApi.md#getRecognizeTable) | **GET** /v5.0/ocr/RecognizeTable | GetRecognizeTable
*RecognizeTableApi* | [**postRecognizeTable**](docs/RecognizeTableApi.md#postRecognizeTable) | **POST** /v5.0/ocr/RecognizeTable | PostRecognizeTable
*TextToSpeechApi* | [**getTextToSpeechResult**](docs/TextToSpeechApi.md#getTextToSpeechResult) | **GET** /v5.0/ocr/TextToSpeech/GetTextToSpeechResult | GetTextToSpeechResult
*TextToSpeechApi* | [**getTextToSpeechResultFile**](docs/TextToSpeechApi.md#getTextToSpeechResultFile) | **GET** /v5.0/ocr/TextToSpeech/GetTextToSpeechResultFile | GetTextToSpeechResultFile
*TextToSpeechApi* | [**postTextToSpeech**](docs/TextToSpeechApi.md#postTextToSpeech) | **POST** /v5.0/ocr/TextToSpeech/PostTextToSpeech | PostTextToSpeech
*UpscaleImageApi* | [**cancelUpscaleImage**](docs/UpscaleImageApi.md#cancelUpscaleImage) | **DELETE** /v5.0/ocr/UpscaleImage | CancelUpscaleImage
*UpscaleImageApi* | [**getUpscaleImage**](docs/UpscaleImageApi.md#getUpscaleImage) | **GET** /v5.0/ocr/UpscaleImage | GetUpscaleImage
*UpscaleImageApi* | [**postUpscaleImage**](docs/UpscaleImageApi.md#postUpscaleImage) | **POST** /v5.0/ocr/UpscaleImage | PostUpscaleImage
*UtilitiesApi* | [**getTaskStatus**](docs/UtilitiesApi.md#getTaskStatus) | **GET** /v5.0/ocr/Utilities/GetTaskStatus | GetTaskStatus


## Documentation for Models

 - [DsrConfidence](docs/DsrConfidence.md)
 - [DsrMode](docs/DsrMode.md)
 - [Language](docs/Language.md)
 - [LanguageTTS](docs/LanguageTTS.md)
 - [OCRBinarizeImageBody](docs/OCRBinarizeImageBody.md)
 - [OCRDeskewImageBody](docs/OCRDeskewImageBody.md)
 - [OCRDetectRegionsBody](docs/OCRDetectRegionsBody.md)
 - [OCRDewarpImageBody](docs/OCRDewarpImageBody.md)
 - [OCRDjVu2PDFBody](docs/OCRDjVu2PDFBody.md)
 - [OCRError](docs/OCRError.md)
 - [OCRRecognizeAndParseInvoiceBody](docs/OCRRecognizeAndParseInvoiceBody.md)
 - [OCRRecognizeFontBody](docs/OCRRecognizeFontBody.md)
 - [OCRRecognizeImageBody](docs/OCRRecognizeImageBody.md)
 - [OCRRecognizeLabelBody](docs/OCRRecognizeLabelBody.md)
 - [OCRRecognizePdfBody](docs/OCRRecognizePdfBody.md)
 - [OCRRecognizeReceiptBody](docs/OCRRecognizeReceiptBody.md)
 - [OCRRecognizeRegionsBody](docs/OCRRecognizeRegionsBody.md)
 - [OCRRecognizeTableBody](docs/OCRRecognizeTableBody.md)
 - [OCRRect](docs/OCRRect.md)
 - [OCRRegion](docs/OCRRegion.md)
 - [OCRResponse](docs/OCRResponse.md)
 - [OCRResult](docs/OCRResult.md)
 - [OCRSettingsDetectRegions](docs/OCRSettingsDetectRegions.md)
 - [OCRSettingsDjVu2PDF](docs/OCRSettingsDjVu2PDF.md)
 - [OCRSettingsRecognizeAndParseInvoice](docs/OCRSettingsRecognizeAndParseInvoice.md)
 - [OCRSettingsRecognizeFont](docs/OCRSettingsRecognizeFont.md)
 - [OCRSettingsRecognizeImage](docs/OCRSettingsRecognizeImage.md)
 - [OCRSettingsRecognizeLabel](docs/OCRSettingsRecognizeLabel.md)
 - [OCRSettingsRecognizePdf](docs/OCRSettingsRecognizePdf.md)
 - [OCRSettingsRecognizeReceipt](docs/OCRSettingsRecognizeReceipt.md)
 - [OCRSettingsRecognizeRegions](docs/OCRSettingsRecognizeRegions.md)
 - [OCRSettingsRecognizeTable](docs/OCRSettingsRecognizeTable.md)
 - [OCRTaskStatus](docs/OCRTaskStatus.md)
 - [OCRUpscaleImageBody](docs/OCRUpscaleImageBody.md)
 - [PostUpsamplingFileRequest](docs/PostUpsamplingFileRequest.md)
 - [ProblemDetails](docs/ProblemDetails.md)
 - [ResponseStatusCode](docs/ResponseStatusCode.md)
 - [ResultType](docs/ResultType.md)
 - [ResultTypeTTS](docs/ResultTypeTTS.md)
 - [ResultTypeTable](docs/ResultTypeTable.md)
 - [TTSBody](docs/TTSBody.md)
 - [TTSBodyDeprecated](docs/TTSBodyDeprecated.md)
 - [TTSError](docs/TTSError.md)
 - [TTSResponse](docs/TTSResponse.md)
 - [TTSResult](docs/TTSResult.md)
 - [TTSSettings](docs/TTSSettings.md)
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



