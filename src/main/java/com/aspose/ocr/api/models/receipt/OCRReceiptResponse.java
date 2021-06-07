package com.aspose.ocr.api.models.receipt;

import com.aspose.ocr.api.TextRegion;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class OCRReceiptResponse implements Serializable {

    public String text;
    public ArrayList<TextRegion>  structuredData;


    public OCRReceiptResponse(String text, ArrayList<TextRegion>  structuredData){

        this.text = text;
        this.structuredData = structuredData;
    }

    public static OCRReceiptResponse Deserialize(ResponseBody apiResponse) throws IOException {
        return Deserialize(apiResponse.string());
    }

    public static OCRReceiptResponse Deserialize(String jsonString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonString, OCRReceiptResponse.class);
    }
}
