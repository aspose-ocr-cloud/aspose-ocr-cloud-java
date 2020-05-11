package com.aspose;

import com.aspose.ocr.ApiClient;
import com.aspose.ocr.Configuration;
import com.aspose.ocr.OCRResponse;
import com.aspose.ocr.api.Language;
import com.aspose.ocr.api.OcrApi;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;

import java.io.File;
import java.io.IOException;


import static java.lang.System.out;


public class Demo {
    private static OcrApi api;
    private static final String url = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";

    private static String recognizeByContent() {
        try {
            File f = new File(Configuration.getTestSrcDir(), "5.png");
            if (!f.exists()) {
                return "Error: recognizeByContentLang: file not found";
            }

            api = new ApiClient().createService(OcrApi.class);
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"), f);
            Call<ResponseBody> call = api.RecognizeFromContent(requestBody);
            Response<ResponseBody> res = call.execute();

            ResponseBody answer = res.body();

            OCRResponse ocrResponse = OCRResponse.Deserialize(answer);
            String text = ocrResponse.text;

            return text;

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

            api = new ApiClient().createService(OcrApi.class);
            RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"), f);
            Call<ResponseBody> call = api.RecognizeFromContent(requestBody, Language.German);
            Response<ResponseBody> res = call.execute();

            ResponseBody answer = res.body();

            OCRResponse ocrResponse = OCRResponse.Deserialize(answer);
            String text = ocrResponse.text;

            return text;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String recognizeByURL() {
        try {

            api = new ApiClient().createService(OcrApi.class);
            Call<ResponseBody> call = api.RecognizeFromUrl(url);
            Response<ResponseBody> res = call.execute();
            ResponseBody answer = res.body();

            OCRResponse ocrResponse = OCRResponse.Deserialize(answer);
            String text = ocrResponse.text;

            return text;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }


    }


    public static void main(String... args) throws Exception {
        out.println("Warning: Some consoles doesn't support unicode symbols.");

        setUpConfig();
        String text;

        text = recognizeByURL();
        out.println(text);

        text = recognizeByContentLang();
        out.println(text);

        text = recognizeByContent();
        out.println(text);

    }

    private static void setUpConfig() throws Exception {
        Configuration.setAPP_SID("148f05be-abe6-46e3-9182-f93375ec866f");
        Configuration.setAPI_KEY("b1dfcdbf9b602463cc9a03c50b5ae7b4");

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
