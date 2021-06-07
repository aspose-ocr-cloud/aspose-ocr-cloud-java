package com.aspose.ocr.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class TextRegion implements Serializable {

    public String text;
    public ArrayList<Integer> rect;

    public TextRegion() {
    }

    public TextRegion(String text, ArrayList<Integer> rect) {
        this.text = text;
        this.rect = rect;
    }
    public static TextRegion Deserialize(ResponseBody apiResponse) throws IOException {
        return Deserialize(apiResponse.string());
    }

    public static TextRegion Deserialize(String jsonString) {
        Gson gson = new GsonBuilder().create();
        return gson.fromJson(jsonString, TextRegion.class);
    }

}
