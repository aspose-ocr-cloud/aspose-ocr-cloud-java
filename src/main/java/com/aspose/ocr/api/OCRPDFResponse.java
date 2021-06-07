package com.aspose.ocr.api;

import com.aspose.ocr.api.models.pdf.PdfResultPage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class OCRPDFResponse implements Serializable {

    public ArrayList<PdfResultPage> resultData;

    public int Code;

    public OCRPDFResponse(){}

    public OCRPDFResponse(ArrayList<PdfResultPage> resultData, int code) {
        this.resultData = resultData;

        this.Code = code;
    }

    public static OCRPDFResponse Deserialize(ResponseBody apiResponse) throws IOException {
        return Deserialize(apiResponse.string());
    }

    public static OCRPDFResponse Deserialize(String jsonString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonString, OCRPDFResponse.class);
    }
}
