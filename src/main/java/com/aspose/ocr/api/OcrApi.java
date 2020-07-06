package com.aspose.ocr.api;

import com.aspose.ocr.ApiClient;
import com.aspose.ocr.OCRResponse;
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


    /**
     * Recognize image text from some url if provided or from the request body content
     * @param fileWebUrl The image file url
     * @param language Recognition Language
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeFromUrl(String fileWebUrl, Language language) throws IOException {
        Call<ResponseBody> call = api.RecognizeFromUrl(fileWebUrl, language);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param f File to upload
     * @param language Recognition Language
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeFromContent(File f, Language language) throws IOException {
        RequestBody requestBody = RequestBody.create( MediaType.parse("application/octet-stream"), f);
        Call<ResponseBody> call = api.RecognizeFromContent(requestBody);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param fileName  Filename that you have already put in Aspose Storage. *Required
     * @param folder Folder name in Aspose Storage. *Null for root folder
     * @param storage Storage name in Aspose Storage. Null for DefaultStorage
     * @param language Recognition Language
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeFromStorage(String fileName,String folder, String storage, Language language) throws IOException {
        Call<ResponseBody> call = api.RecognizeFromStorage(fileName, folder, storage, language);
        Response<ResponseBody> res = call.execute();
        ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param ocrRequestData Request data to recognize specific regions on image.
     * @param fileWebUrl The image file url
     * @return OCRResponse
     * @throws IOException .
     */
    public static OCRResponse RecognizeRegionsFromUrl(OCRRequestData ocrRequestData, String fileWebUrl) throws IOException {
            String ocrRequestDataJson = gson.toJson(ocrRequestData);
            RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
            RequestBody url = RequestBody.create(MediaType.parse("text/plain"), fileWebUrl);

            Call<ResponseBody> call = api.RecognizeRegionsFromUrl(url, requestData);
            Response<ResponseBody> res = call.execute();
            ResponseBody answer = res.body();

        assert answer != null;
        return OCRResponse.Deserialize(answer);
    }

    /**
     * @param ocrRequestData Request data to recognize specific regions on image.
     * @param f File to recognize
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
}
