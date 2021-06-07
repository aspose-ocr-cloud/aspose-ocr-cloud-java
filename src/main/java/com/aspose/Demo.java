package com.aspose;

import com.aspose.ocr.ApiClient;
import com.aspose.ocr.Configuration;
import com.aspose.ocr.api.OCRResponse;
import com.aspose.ocr.api.*;
import com.aspose.ocr.api.models.pdf.PdfResultPage;
import com.aspose.ocr.api.models.pdf.PdfSingleImageResult;
import com.aspose.ocr.api.models.receipt.OCRReceiptRequestData;
import com.aspose.ocr.api.models.receipt.OCRReceiptRequestDataStorage;
import com.aspose.ocr.api.models.receipt.OCRReceiptResponse;
import com.aspose.ocr.api.models.table.OCRTableRequestData;
import com.aspose.ocr.api.models.table.OCRTableRequestDataStorage;
import com.aspose.ocr.api.models.table.OCRTableResponse;
import com.aspose.storage.api.StorageApi;
import com.aspose.storage.model.FilesUploadResult;
import okhttp3.*;
import retrofit2.Response;
import retrofit2.Call;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import static com.aspose.ocr.api.OCRAPI.*;
import static java.lang.System.out;


public class Demo {

    // Regular OCR
    private static String recognizeByContent() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "5.png");
            if (!f.exists()) {
                return "Error: recognizeByContentLang: file not found";
            }

            OCRResponse ocrResponse = RecognizeFromContent(f, Language.English);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeByContentLang() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "de_1.jpg");
            if (!f.exists()) {
                return "Error: recognizeByContentLang: file not found";
            }

            OCRResponse ocrResponse = RecognizeFromContent(f, Language.German);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeByURL() {
        try {
            String urlToFile = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";

            OCRResponse ocrResponse = RecognizeFromUrl(urlToFile, Language.English);
            return ocrResponse.text;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


    private static String recognizeFromStorage() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "5.png");
            if (!f.exists()) {
                return "Error: recognizeByContentLang: file not found";
            }

            String filename = f.getName();
            String folder = "";
            String storage = null;
            uploadFile(f, folder);

            OCRResponse ocrResponse = RecognizeFromStorage(filename, folder, storage, Language.English);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


    // Receipt
    private static String recognizeReceiptByURL() {
        try {
            String urlToFile = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/ReceiptSwiss.jpg/800px-ReceiptSwiss.jpg";
            OCRReceiptRequestData ocrReceiptRequestData = new OCRReceiptRequestData(false);
            OCRReceiptResponse ocrResponse = RecognizeOcrReceiptFromUrl(urlToFile, ocrReceiptRequestData);
            return ocrResponse.text;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeReceiptByContent() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "receipt.png");
            if (!f.exists()) {
                return "Error: recognizeReceiptByContent: file not found";
            }
            OCRReceiptRequestData ocrReceiptRequestData = new OCRReceiptRequestData(false);
            OCRReceiptResponse ocrResponse = RecognizeOcrReceiptFromContent(f, ocrReceiptRequestData);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeReceiptByStorage() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "receipt.png");
            if (!f.exists()) {
                return "Error: recognizeReceiptByStorage: file not found";
            }

            String filename = f.getName();
            String folder = "";
            String storage = null;
            uploadFile(f, folder);


            OCRReceiptRequestDataStorage ocrRequestData = new OCRReceiptRequestDataStorage(
                    false,
                    filename,
                    storage,
                    folder);

            OCRReceiptResponse ocrResponse = RecognizeOcrReceiptFromStorage(ocrRequestData);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    // Table
    private static String recognizeTableByURL() {
        try {
            String urlToFile = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";
            OCRTableRequestData ocrTableRequestData = new OCRTableRequestData(false, Language.English);
            OCRTableResponse ocrResponse = RecognizeOcrTableFromUrl(urlToFile, ocrTableRequestData);
            return ocrResponse.text;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeTableByContent() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "5.png");
            if (!f.exists()) {
                return "Error: recognizeTableByContent: file not found";
            }
            OCRTableRequestData ocrTableRequestData = new OCRTableRequestData(false, Language.English);
            OCRTableResponse ocrResponse = RecognizeOcrTableFromContent(f, ocrTableRequestData);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeTableByStorage() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "de_1.jpg");
            if (!f.exists()) {
                return "Error: recognizeTableByStorage: file not found";
            }

            String filename = f.getName();
            String folder = "";
            String storage = null;
            uploadFile(f, folder);

            OCRTableRequestDataStorage ocrTableRequestData = new OCRTableRequestDataStorage(false,
                    Language.English, filename, storage, folder);
            OCRTableResponse ocrResponse = RecognizeOcrTableFromStorage(ocrTableRequestData);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


    // PDF
    private static String recognizePDFByURL() {
        try {
            String urlToFile = "http://www.africau.edu/images/default/sample.pdf";
            OCRRequestData ocrRequestData = new OCRRequestData(null, Language.English, false, DsrConfidence.Default,
                    DsrMode.DsrAndFilter, ResultType.Text);
            OCRPDFResponse ocrResponse = RecognizeOcrPdfFromUrl(urlToFile, ocrRequestData);
            String text = "";
            if (ocrResponse.resultData != null) {
                for (PdfResultPage pdfResult : ocrResponse.resultData) {
                    text = text + '\n' + pdfResult.OriginalText;
//                    if (pdfResult != null) {
//                        for (PdfSingleImageResult pdfSingleImageResult : pdfResult.ImageOcrResults) {
//                            text = text + '\n' + pdfSingleImageResult.ResultText;
//                        }
//                    }
                }
            }
            return text;
        } catch (IOException e) {
            e.printStackTrace();
            return "ocrResponse.text";
        }
    }

    private static String recognizePDFByContent() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "sample.pdf");

            if (!f.exists()) {
                return "Error: recognizeByContentLang: file not found";
            }
            OCRRequestData ocrRequestData = new OCRRequestData(null, Language.English, false, DsrConfidence.Default,
                    DsrMode.DsrAndFilter, ResultType.Text);
            OCRPDFResponse ocrResponse = RecognizeOcrPdfFromContent(f, ocrRequestData);
            String text = "";
            if (ocrResponse.resultData != null) {
                for (PdfResultPage pdfResult : ocrResponse.resultData) {
                    text = text + '\n' + pdfResult.OriginalText;
//                    if (pdfResult != null) {
//                        for (PdfSingleImageResult pdfSingleImageResult : pdfResult.ImageOcrResults) {
//                            text = text + '\n' + pdfSingleImageResult.ResultText;
//                        }
//                    }
                }
            }
            return text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizePDFByStorage() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "de_1.jpg");
            if (!f.exists()) {
                return "Error: recognizeByContentLang: file not found";
            }

            String filename = f.getName();
            String folder = "";
            String storage = null;
            uploadFile(f, folder);

            OCRRequestDataStorage ocrRequestDataStorage = new OCRRequestDataStorage(null, Language.English,
                    false, filename, storage, folder, DsrConfidence.Default,
                    DsrMode.DsrAndFilter, ResultType.Text);

            OCRPDFResponse ocrResponse = RecognizeOcrPdfFromStorage(ocrRequestDataStorage);

            String text = "";
            if (ocrResponse.resultData != null) {
                for (PdfResultPage pdfResult : ocrResponse.resultData) {
                    text = text + '\n' + pdfResult.OriginalText;
//                    if (pdfResult != null) {
//                        for (PdfSingleImageResult pdfSingleImageResult : pdfResult.ImageOcrResults) {
//                            text = text + '\n' + pdfSingleImageResult.ResultText;
//                        }
//                    }
                }
            }
            return text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    private static String recognizeRegionsFromUrl() {
        try {
            List<OCRRegion> mImage5PngRegions = new ArrayList<>();
            mImage5PngRegions.add(new OCRRegion(new OCRRect(243, 308, 2095, 964), 0));
            mImage5PngRegions.add(new OCRRegion(new OCRRect(240, 1045, 2108, 1826), 1));
            mImage5PngRegions.add(new OCRRegion(new OCRRect(237, 1916, 2083, 3180), 2));

            OCRRequestData ocrRequestData = new OCRRequestData(
                    mImage5PngRegions,
                    com.aspose.ocr.api.Language.English,
                    false, DsrConfidence.Default, DsrMode.NoDsrNoFilter, ResultType.Internal
            );

            String urlToFile = "https://iili.io/JP2HFf.png";  // 5.png

            OCRResponse ocrResponse = RecognizeRegionsFromUrl(ocrRequestData, urlToFile);
            return ocrResponse.text;

            //Another example data:
//            List<OCRRegion> mImageBook_of_Abraham_FirstPagePngRegions = new ArrayList<OCRRegion>();
//            mImageBook_of_Abraham_FirstPagePngRegions.add(new OCRRegion(){{Order = 0; Rect = new OCRRect(209,28,283,39 );}});
//            mImageBook_of_Abraham_FirstPagePngRegions.add(new OCRRegion(){{Order = 1; Rect = new OCRRect(24,114,359,185);}});
//            mImageBook_of_Abraham_FirstPagePngRegions.add(new OCRRegion(){{Order = 2; Rect = new OCRRect(21,201,356,451);}});
//            mImageBook_of_Abraham_FirstPagePngRegions.add(new OCRRegion(){{Order = 2; Rect = new OCRRect(21,464,359,558);}});
//
//            OCRRequestData ocrRequestData = new OCRRequestData(){{
//                Regions = mImageBook_of_Abraham_FirstPagePngRegions;
//                MakeSkewCorrect = false;
//            }};
            //String urlToFile = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeRegionsFromContent() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "5.png");
            if (!f.exists()) {
                return "Error: recognizeByContentLang: file not found";
            }

            List<OCRRegion> mImage5PngRegions = new ArrayList<>();
            mImage5PngRegions.add(new OCRRegion(new OCRRect(243, 308, 2095, 964), 0));
            mImage5PngRegions.add(new OCRRegion(new OCRRect(240, 1045, 2108, 1826), 1));
            mImage5PngRegions.add(new OCRRegion(new OCRRect(237, 1916, 2083, 3180), 2));

            OCRRequestData ocrRequestData = new OCRRequestData(
                    mImage5PngRegions,
                    com.aspose.ocr.api.Language.English,
                    false, DsrConfidence.Default, DsrMode.DsrNoFilter, ResultType.Text
            );

            OCRResponse ocrResponse = RecognizeRegionsFromContent(ocrRequestData, f);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeRegionsFromStorage() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "5.png");
            if (!f.exists()) {
                return "Error: recognizeByContentLang: file not found";
            }

            String filename = f.getName();
            String folder = "";
            String storage = null;
            uploadFile(f, folder);

            List<OCRRegion> mImage5PngRegions = new ArrayList<>();
            mImage5PngRegions.add(new OCRRegion(new OCRRect(243, 308, 2095, 964), 0));
            mImage5PngRegions.add(new OCRRegion(new OCRRect(240, 1045, 2108, 1826), 1));
            mImage5PngRegions.add(new OCRRegion(new OCRRect(237, 1916, 2083, 3180), 2));

            OCRRequestDataStorage ocrRequestData = new OCRRequestDataStorage(
                    mImage5PngRegions,
                    Language.English,
                    false,
                    filename,
                    storage,
                    folder, DsrConfidence.Default, DsrMode.DsrNoFilter, ResultType.Internal);

            OCRResponse ocrResponse = RecognizeRegionsFromStorage(ocrRequestData);
            return ocrResponse.text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }


    public static void main(String... args) throws Exception {
        out.println("Warning: Some consoles doesn't support unicode symbols.");

        setUpConfig();
        String text;

        // SDK usage examples
        text = recognizeByURL();
        out.println(text);

//        text = recognizeByContentLang();
//        out.println(text);

//        text = recognizeByContent();
//        out.println(text);

//        text = recognizeFromStorage();
//        out.println(text);

//        text = recognizeRegionsFromStorage();
//        out.println(text);

//        text = recognizeRegionsFromContent();
//        out.println(text);
//
//        text = recognizeRegionsFromUrl();
//        out.println(text);

//        //PDF
//        text = recognizePDFByURL();
//        out.println(text);

//        text = recognizePDFByContent();
//        out.println(text);

//        text =  recognizePDFByStorage();
//        out.println(text);
//
//
//        //Table
//        text = recognizeTableByURL();
//                out.println(text);
//        text = recognizeTableByContent();
//                out.println(text);
//        text = recognizeTableByStorage();
//                out.println(text);

//        //Receipt
//         text = recognizeReceiptByURL();
//                out.println(text);
//        text = recognizeReceiptByContent();
//                out.println(text);
//        text = recognizeReceiptByStorage();
//        out.println(text);

    }

    //Helper class to upload file to Aspose Storage for RecognizeFromStorage requests
    private static void uploadFile(File f, String uploadFolder) throws IOException {
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), f);
        MultipartBody.Part fileToUpload = MultipartBody.Part.createFormData("file", f.getName(), requestBody);

        String path = (uploadFolder == null || uploadFolder.isEmpty()) ? f.getName() : uploadFolder + File.separator + f.getName();

        // Post document to storage
        StorageApi storageApi = new ApiClient().createService(StorageApi.class);
        Call<FilesUploadResult> call = storageApi.uploadFile(path, fileToUpload, null);

        Response<FilesUploadResult> res = call.execute();
    }

    private static void setUpConfig() throws Exception {

        Configuration.setAPP_SID("ocr.cloud");
        Configuration.setAPI_KEY("ocr.cloud");
        Configuration.setAuthPath("https://api.aspose.cloud/connect/token");
        Configuration.setBasePath("https://api.aspose.cloud/v3.0");
        Configuration.setUserAgent("WebKit");
        Configuration.setTestSrcDir("sourceTest");
        Configuration.setTestDstDir("destTest");

        if (Configuration.getAPI_KEY().isEmpty() || Configuration.getAPP_SID().isEmpty()) {
            out.println("! Error: Setup AppSID & AppKey in BaseTest Configuration");
            throw new Exception("Setup AppSID & AppKey in BaseTest Configuration");
        }
    }

}
