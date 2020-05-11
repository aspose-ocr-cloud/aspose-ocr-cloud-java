package com.aspose.ocr.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.Serializable;
import okhttp3.ResponseBody;

public class OCRResponse implements Serializable {
    public OCRResponse(int code, String text){
        this.code = code;
        this.text = text;
    }

    public static OCRResponse Deserialize(ResponseBody apiResponse) throws IOException {
        return Deserialize(apiResponse.string());
    }

    public static OCRResponse Deserialize(String jsonString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonString, OCRResponse.class);
    }

    public int code;
    public String text;
}
