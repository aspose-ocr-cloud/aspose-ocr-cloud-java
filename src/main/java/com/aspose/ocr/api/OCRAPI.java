package com.aspose.ocr.api;

import com.aspose.ocr.ApiClient;
import com.aspose.ocr.api.models.receipt.OCRReceiptRequestData;
import com.aspose.ocr.api.models.receipt.OCRReceiptRequestDataStorage;
import com.aspose.ocr.api.models.receipt.OCRReceiptResponse;
import com.aspose.ocr.api.models.table.OCRTableRequestData;
import com.aspose.ocr.api.models.table.OCRTableRequestDataStorage;
import com.aspose.ocr.api.models.table.OCRTableResponse;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.File;
import java.io.IOException;

/**
 * Aspose.Ocr for Cloud API
 */
public class OCRAPI {
    private static OcrApiInvoker api = new ApiClient().createService(OcrApiInvoker.class);
    private static final Gson gson = new Gson();


    public static OCRResponse RecognizeFromUrl(String fileWebUrl, Language language) throws IOException {
        return RecognizeFromUrl(fileWebUrl, language, ResultType.Text, DsrMode.DsrAndFilter, DsrConfidence.Default);
    }

    public static OCRResponse RecognizeFromContent(File file, Language language) throws IOException {
        return RecognizeFromContent(file, language, ResultType.Text, DsrMode.DsrAndFilter, DsrConfidence.Default);
    }

    public static OCRResponse RecognizeFromStorage(String fileName, String folderName, String storage, Language language) throws IOException {
        return RecognizeFromStorage(fileName, folderName, storage, language, ResultType.Text, DsrMode.DsrAndFilter, DsrConfidence.Default);
    }

    /**
     * Recognize image text from some url if provided or from the request body content
     *
     * @param fileWebUrl The image file url
     * @param language   Recognition Language
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeFromUrl(String fileWebUrl, Language language, ResultType resultType, DsrMode dsrMode, DsrConfidence dsrConfidence) throws IOException {
        Call<ResponseBody> call = api.RecognizeFromUrl(fileWebUrl, language, resultType, dsrMode, dsrConfidence);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param f        File to upload
     * @param language Recognition Language
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeFromContent(File f, Language language, ResultType resultType, DsrMode dsrMode, DsrConfidence dsrConfidence) throws IOException {
        RequestBody requestBody = RequestBody.create(MediaType.parse("application/octet-stream"), f);
        Call<ResponseBody> call = api.RecognizeFromContent(requestBody, language, resultType, dsrMode, dsrConfidence);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param fileName Filename that you have already put in Aspose Storage. *Required
     * @param folder   Folder name in Aspose Storage. *Null for root folder
     * @param storage  Storage name in Aspose Storage. Null for DefaultStorage
     * @param language Recognition Language
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeFromStorage(String fileName, String folder, String storage, Language language, ResultType resultType, DsrMode dsrMode, DsrConfidence dsrConfidence) throws IOException {
        Call<ResponseBody> call = api.RecognizeFromStorage(fileName, folder, storage, language);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param ocrRequestData Request data to recognize specific regions on image.
     * @param fileWebUrl     The image file url
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeRegionsFromUrl(OCRRequestData ocrRequestData, String fileWebUrl) throws IOException {
        ocrRequestData.DsrMode = DsrMode.NoDsrNoFilter;
        String ocrRequestDataJson = gson.toJson(ocrRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
        RequestBody url = RequestBody.create(MediaType.parse("text/plain"), "\"" + fileWebUrl + "\"");

        Call<ResponseBody> call = api.RecognizeRegionsFromUrl(url, requestData);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param ocrRequestData Request data to recognize specific regions on image.
     * @param f              File to recognize
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeRegionsFromContent(OCRRequestData ocrRequestData, File f) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
        RequestBody requestFile = RequestBody.create(f, MediaType.parse("application/octet-stream"));

        MultipartBody.Part bodyFile = MultipartBody.Part.createFormData("picture", f.getName(), requestFile);

        api = new ApiClient().createService(OcrApiInvoker.class);
        Call<ResponseBody> call = api.RecognizeRegionsFromContent(requestData, bodyFile);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param ocrRequestData Request data to recognize specific regions on image.
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeRegionsFromStorage(OCRRequestDataStorage ocrRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);

        api = new ApiClient().createService(OcrApiInvoker.class);
        Call<ResponseBody> call = api.RecognizeRegionsFromStorage(requestData);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Receipt

    /**
     * @param fileWebUrl            The image file url
     * @param ocrReceiptRequestData ocr ReceiptRequestData
     * @return OCRReceiptResponse
     */

    public static OCRReceiptResponse RecognizeOcrReceiptFromUrl(String fileWebUrl, OCRReceiptRequestData ocrReceiptRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrReceiptRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
        RequestBody url = RequestBody.create(MediaType.parse("text/plain"), "\"" + fileWebUrl + "\"");

        Call<ResponseBody> call = api.RecognizeReceiptFromUrl(url, requestData);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRReceiptResponse.Deserialize(answer);
    }


    /**
     * @param f File to upload
     * @return OCRReceiptResponse
     */
    public static OCRReceiptResponse RecognizeOcrReceiptFromContent(File f, OCRReceiptRequestData ocrReceiptRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrReceiptRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
        RequestBody requestFile = RequestBody.create(f, MediaType.parse("application/octet-stream"));

        MultipartBody.Part bodyFile = MultipartBody.Part.createFormData("picture", f.getName(), requestFile);

        api = new ApiClient().createService(OcrApiInvoker.class);
        Call<ResponseBody> call = api.RecognizeReceiptFromContent(requestData, bodyFile);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRReceiptResponse.Deserialize(answer);
    }


    public static OCRReceiptResponse RecognizeOcrReceiptFromStorage(OCRReceiptRequestDataStorage ocrRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);

        api = new ApiClient().createService(OcrApiInvoker.class);
        Call<ResponseBody> call = api.RecognizeReceiptFromStorage(requestData);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRReceiptResponse.Deserialize(answer);
    }


    //Table

    public static OCRTableResponse RecognizeOcrTableFromUrl(String fileWebUrl, OCRTableRequestData ocrTableRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrTableRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
        RequestBody url = RequestBody.create(MediaType.parse("text/plain"), "\"" + fileWebUrl + "\"");

        Call<ResponseBody> call = api.RecognizeTableFromUrl(url, requestData);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRTableResponse.Deserialize(answer);
    }


    public static OCRTableResponse RecognizeOcrTableFromContent(File f, OCRTableRequestData ocrTableRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrTableRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
        RequestBody requestFile = RequestBody.create(f, MediaType.parse("application/octet-stream"));

        MultipartBody.Part bodyFile = MultipartBody.Part.createFormData("picture", f.getName(), requestFile);

        api = new ApiClient().createService(OcrApiInvoker.class);
        Call<ResponseBody> call = api.RecognizeTableFromContent(requestData, bodyFile);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRTableResponse.Deserialize(answer);
    }


    public static OCRTableResponse RecognizeOcrTableFromStorage(OCRTableRequestDataStorage ocrTableRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrTableRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
        Call<ResponseBody> call = api.RecognizeTableFromStorage(requestData);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRTableResponse.Deserialize(answer);
    }


    //PDF

    public static OCRPDFResponse RecognizeOcrPdfFromUrl(String fileWebUrl, OCRRequestData ocrRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);

        RequestBody url = RequestBody.create(MediaType.parse("text/plain"), "\"" + fileWebUrl + "\"");
        Call<ResponseBody> call = api.RecognizePDFFromUrl(url, requestData);

        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRPDFResponse.Deserialize(answer);
    }

    public static OCRPDFResponse RecognizeOcrPdfFromContent(File f, OCRRequestData ocrRequestData) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrRequestData);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);

        RequestBody requestFile = RequestBody.create(MediaType.parse("application/octet-stream"), f);
        MultipartBody.Part bodyFile = MultipartBody.Part.createFormData("picture", f.getName(), requestFile);

        Call<ResponseBody> call = api.RecognizePDFFromContent(requestData, bodyFile);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRPDFResponse.Deserialize(answer);
    }


    public static OCRPDFResponse RecognizeOcrPdfFromStorage(OCRRequestDataStorage ocrRequestDataStorage) throws IOException {
        String ocrRequestDataJson = gson.toJson(ocrRequestDataStorage);
        RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);

        Call<ResponseBody> call = api.RecognizePDFStorage(requestData);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRPDFResponse.Deserialize(answer);
    }

}
