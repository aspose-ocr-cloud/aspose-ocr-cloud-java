package com.aspose.ocr.api.models.pdf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.Serializable;

public class PdfSingleImageResult implements Serializable {

    public String ResultText;
    public String ResultPdf;
    public String ResultHocr;

    public PdfSingleImageResult() {
    }

    public PdfSingleImageResult(String resultText, String resultPdf, String resultHocr) {
        this.ResultText = resultText;
        this.ResultPdf = resultPdf;
        this.ResultHocr = resultHocr;
    }

    public static PdfSingleImageResult Deserialize(ResponseBody apiResponse) throws IOException {
        return Deserialize(apiResponse.string());
    }

    public static PdfSingleImageResult Deserialize(String jsonString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonString, PdfSingleImageResult.class);
    }

}
