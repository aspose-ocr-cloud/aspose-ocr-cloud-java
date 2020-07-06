package com.aspose.ocr.api;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;

public enum Language {
    @SerializedName("1")
    English (1),

    @SerializedName("2")
    German(2),

    @SerializedName("3")
    French (3),

    @SerializedName("4")
    Spanish (4),

    @SerializedName("5")
    Portuguese (5),

    @SerializedName("6")
    Italian (6)
    ;

    private final int key;

    Language(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public static Language fromKey(int key) {
        for(Language type : Language.values()) {
            if(type.getKey() == key) {
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return Integer.toString(this.key);
    }
}
