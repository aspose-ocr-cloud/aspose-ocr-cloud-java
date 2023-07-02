<img src="sourceTest/heading.png">

# Aspose OCR Cloud SDK for Java

Aspose OCR Cloud Java SDK is a simple OCR technology, which you can use in your application to convert image to text.

[Aspose.OCR Cloud](https://products.aspose.cloud/ocr/cloud) is a simple SDK used to add text recognition to your app with merely a few lines of code.

In detail, it's a set of SDKs for optical character recognition and document scanning in our Cloud. It supports reading and recognizing text from most commonly used raster image formats. Just pass a specific image to the Aspose.OCR Cloud API, and it will return a response with recognized text.

It is easy to get started with Aspose.OCR Cloud, and there is nothing to install. Create an account at Aspose Cloud and get your application information, then you are ready to use [SDKs](#asposeocr-cloud-sdks)


## What was changed in version 23.6.0

A summary of recent changes, enhancements and bug fixes in **Aspose.OCR Cloud SDK for Java 1.8+ 23.6.0** release:

Key | Summary | Category
--- | ------- | --------
OCR-2893 | Detecting fonts and styles in scans or photographs. | New feature
OCR-3454 | Extracting text from photographed signboards, price tags, plates, food labels, and similar images. | New feature
n/a | Conversion of DjVu files to searchable PDF documents. | New feature
n/a | Image processing APIs were made easier and more consistent: <ul><li>[Skew correction](https://docs.aspose.cloud/ocr/deskew-image/);</li><li>[Dewarping](https://docs.aspose.cloud/ocr/dewarp-image/);</li><li>[Upsampling](https://docs.aspose.cloud/ocr/upsample-image/);</li><li>[Binarization](https://docs.aspose.cloud/ocr/binarize-image/).</li></ul> | Enhancement
n/a | Reworked [text-to-speech conversion](https://docs.aspose.cloud/ocr/text-to-speech/) API. | Enhancement

REST API changes:

- https://releases.aspose.cloud/ocr/release-notes/2023/aspose-ocr-cloud-23-5-0-release-notes/
- https://releases.aspose.cloud/ocr/release-notes/2023/aspose-ocr-cloud-23-6-0-release-notes/

### Deprecation warning

Updated image processing and text-to-speech conversion APIs are not backward compatible. To make code updates easier, previous APIs remain fully functional. All of your existing code will continue to work and you can even make minor updates to it, but be aware that all deprecated endpoints are planned to be removed in upcoming releases in favor of the new API.

## Features
- Automated skew correction
- Automated and manual document layout detection
- Recognize documents with complex layouts in fully automatic mode or with manual corrections.
- Extract and recognize text from images via OCR
- Supports multiple international languages
- High speed with no hardware resources
- Receipt recognition
- Table image recognition
- Supports PDF Recognition
- Text correction using spell checking algorithms
- Various output formats: Text, Searchable PDF, hOCR, Excel for tables.
- Handwritten text recognition

## Recognize text of different languages
Aspose.OCR Cloud supports 45 languages including English, German, French, Italian, Spanish, Portuguese, Polish, Slovene, Slovak, Netherlands, Lithuanian, Latvian, Danish, Norwegian, Finnish, Serbian, Croatian, Czech, Swedish, Estonian, Romanian, Chinese, Arabic, Hindi, Russian, Ukrainian, Bengali, Tibetan, Thai, Urdu, Turkish, Korean, Indonesian, Hebrew, Javanese, Greek, Japanese, Persian, Albanian, Latin, Vietnamese, Uzbek, Georgian, Bulgarian, Azerbaijani  and a lot of other works too.

## How to use the SDK?

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
  <version>23.6.0</version>
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
     implementation "com.aspose:aspose-ocr-cloud:23.6.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/aspose-ocr-cloud-23.6.0.jar`
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

#### 2. Run Demo

  * Checkout the SDK or get from [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-ocr-cloud)
  * Set Your AppSid & AppKey
  * Run Java console [Demo](./src/main/java/com/aspose/example)
 

<p align="center">
  <a title="Download ZIP" href="https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-java/archive/master.zip">
     <img src="sourceTest/download.png" />
  </a>
</p>


## SDK Details:   

### Structure

This project includes:   
- Java console demo application - "./src/main/java/Main.java"
- Module "ocr" - this is SDK located in "[./src/main/java/com/aspose/ocr](./src/main/java/com/aspose/ocr)". You can integrate it in your application.
- Module "storage" - "[./src/main/java/com/aspose/storage](./src/main/java/com/aspose/storage)" is optional dependency, required if you plan to use [Aspose.Storage](https://github.com/aspose-storage-cloud/) features

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-ocr-cloud-java</artifactId>
    <version>23.6.0</version>
    <scope>compile</scope>
</dependency>
<repositories>
   <repository>
        <id>AsposeJavaAPI</id>
        <name>Aspose Java API</name>
        <url>http://repository.aspose.cloud/repo</url>
    </repository>
</repositories>            
```

_________________________

## Aspose.OCR Cloud SDKs in Popular Languages

| .NET | Java | Python| Android | NodeJS |
|---|---|---|---|---|
| [GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-dotnet) |[GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-java) | [GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-python)|[GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-android)|[GitHub](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-nodejs)
| [NuGet](https://www.nuget.org/packages/Aspose.ocr-Cloud/)| [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-ocr-cloud) | [PIP](https://pypi.org/project/aspose-ocr-cloud/) | [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-ocr-cloud) | [NPM](https://www.npmjs.com/package/@asposecloud/aspose-ocr-cloud)

[Product Page](https://products.aspose.cloud/ocr/) | [Documentation](https://docs.aspose.cloud/display/ocrcloud/Home) | [API Reference](https://apireference.aspose.cloud/ocr/) | [Code Samples](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-nodejs) | [Blog](https://blog.aspose.cloud/category/ocr/) | [Free Support](https://forum.aspose.cloud/c/ocr) | [Free Trial](https://dashboard.aspose.cloud/#/apps)
