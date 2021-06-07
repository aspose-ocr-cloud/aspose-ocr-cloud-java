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
    Italian (4),

    @SerializedName("5")
    Spanish (5),

    @SerializedName("6")
    Portuguese (6),


    @SerializedName("7")
    Polish(7),

    @SerializedName("8")
    Slovene(8),

    @SerializedName("9")
    Slovak(9),

    @SerializedName("10")
    Netherlands(10),

    @SerializedName("11")
    Lithuanian(11),

    @SerializedName("12")
    Latvian(12),

    @SerializedName("13")
    Danish(13),

    @SerializedName("14")
    Norwegian(14),

    @SerializedName("15")
    Finnish(15),

    @SerializedName("16")
    Serbian(16),

    @SerializedName("17")
    Croatian(17),

    @SerializedName("18")
    Czech(18),

    @SerializedName("19")
    Swedis (19),

    @SerializedName("20")
    Estonian (20),

    @SerializedName("21")
    Romanian (21),

    @SerializedName("22")
    Chinese (22)

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
