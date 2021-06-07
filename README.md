<img src="sourceTest/heading.png">

# Aspose OCR Cloud SDK for Java

Aspose OCR Cloud Java SDK is a simple OCR technology, which you can use in your application to convert image to text.

[Aspose.OCR Cloud](https://products.aspose.cloud/ocr/cloud) is a simple SDK used to add text recognition to your app with merely a few lines of code.

In detail, it's a set of SDKs for optical character recognition and document scanning in our Cloud. It supports reading and recognizing text from most commonly used raster image formats. Just pass a specific image to the Aspose.OCR Cloud API, and it will return a response with recognized text.

It is easy to get started with Aspose.OCR Cloud, and there is nothing to install. Create an account at Aspose Cloud and get your application information, then you are ready to use [SDKs](#asposeocr-cloud-sdks)

## Release 21.6:

22 Language support: English, German, French, Italian, Spanish, Portuguese, Polish, Slovene, Slovak , Netherlands, Lithuania, Latvian, Danish , Norwegian, Finnish, Serbian, Croatian, Czech, Swedish, Estonian, Romanian, Chinese
Spell Correction.
Receipt Recognition.
Multipage PDF as input format.


New feature:

Tables OCR: API for table image recognition. Supported outputs: Formatted TXT, Excel, CSV


Option to select or disable the Document Structure Recognition algorithm.

----
Added Chinese language support
New feature: Tables OCR: API for table image recognition. Supported outputs: Formatted TXT, Excel, CSV


## Features:

- Automatic skew correction
- Automatic and manual document layout detection
- Advanced automated image pre-processing
- Extract and recognize text from images via OCR
- Supports multiple international languages
- High speed with no hardware resources

## How to use the SDK?

Our API is completely independent of your operating system, database system, or development language. You can use any language and platform that supports HTTP to interact with our API. However, manually writing client code can be difficult, error-prone, and time-consuming. Therefore, we have provided and support [SDKs](#asposeocr-cloud-sdks) in many development languages to make it easier to integrate with us.

## Examples

```java
import com.aspose.ocr.api.*;

private static void setUpConfig() throws Exception {
        Configuration.setAPP_SID("XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX");
        Configuration.setAPI_KEY("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

public String RecognizeFromUrl(String url) {
    String urlToFile = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";
    OCRResponse ocrResponse = RecognizeFromUrl(urlToFile, Language.English);
    return ocrResponse.text;
}

static String RecognizeFromContent(File f) {
    File f = new File(Configuration.getTestSrcDir(), "de_1.jpg");
    OCRResponse ocrResponse = RecognizeFromContent(f, Language.German);
    return ocrResp.text;
}
```
_________________________



## Quickstart

Make your solution using [SDK](#asposeocr-cloud-sdks), follow these steps:

#### 1. Get API keys if you haven't

Make a personal account on [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/#/) and click _Get Keys_. These keys are useful for all Aspose Cloud products. If you have any trouble, look at this [detailed manual](https://docs.aspose.cloud/display/totalcloud/Create+New+App+and+Get+App+Key+and+SID).

#### 2. Run Demo

  * Checkout the SDK or get from [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-ocr-cloud)
  * Set Your AppSid & AppKey
  * Run Java console [Demo](./src/main/java/com/aspose/Demo.java) or UnitTests
 

<p align="center">
  <a title="Download ZIP" href="https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-java/archive/master.zip">
     <img src="sourceTest/download.png" />
  </a>
</p>


## SDK Detailes:   

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
    <version>21.6.0</version>
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



### Dependencies
[See build.gradle](./build.gradle#L27)
_________________________

## Aspose.OCR Cloud SDKs

||||||||||
|--------------|----------|-------|-------|-------|---------|---------|----------|-------|
|[.NET & Core](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-dotnet)|[Java](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-java)|PHP|Ruby|Python|Node.js|[Android](https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-android)|Objective-C|Perl|

## Resources

- **Website:** [https://www.aspose.cloud](https://www.aspose.cloud)
- **Product Home:** [Aspose.OCR Cloud](https://products.aspose.cloud/ocr/family)
- **Documentation:** [Aspose.OCR Cloud Documentation](https://docs.aspose.cloud/display/ocrcloud/Home)
- **Forum:** [Aspose.OCR Cloud Forum](https://forum.aspose.cloud/c/ocr)
- **Blog:** [Aspose.OCR Cloud Blog](https://blog.aspose.cloud/category/ocr/)
- **Pricing:** [Aspose Cloud Pricing](https://purchase.aspose.cloud/pricing)
- **Try out Aspose OCR online for free** [Aspose Image to Text](https://products.aspose.app/ocr/scan-image).
