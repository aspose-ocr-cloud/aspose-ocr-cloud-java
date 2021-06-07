package com.aspose.ocr.api.models.table;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.Serializable;

public class OCRTableResponse implements Serializable {

    public int Code;
    public String text;
    public String Excel;
    public String CSV;

    public OCRTableResponse(int code, String text, String excel, String CSV) {
        this.Code = code;
        this.text = text;
        this.Excel = excel;
        this.CSV = CSV;
    }

    public static OCRTableResponse Deserialize(ResponseBody apiResponse) throws IOException {
        return Deserialize(apiResponse.string());
    }

    public static OCRTableResponse Deserialize(String jsonString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonString, OCRTableResponse.class);
    }
}
