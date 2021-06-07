package com.aspose.ocr.api.models.pdf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * PdfResultData
 */
public class PdfResultPage implements Serializable {

    public int Number;
    public String OriginalText;
    public ArrayList<PdfSingleImageResult> ImageOcrResults;

    public PdfResultPage(){}

    public PdfResultPage(int number, String originalText, ArrayList<PdfSingleImageResult> imageOcrResults){
        this.Number = number;
        this.OriginalText = originalText;
        this.ImageOcrResults = imageOcrResults;
    }

    public static PdfResultPage Deserialize(ResponseBody apiResponse) throws IOException {
        return Deserialize(apiResponse.string());
    }

    public static PdfResultPage Deserialize(String jsonString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonString, PdfResultPage.class);
    }



}
