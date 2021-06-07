package com.aspose.ocr.api;

import com.google.gson.annotations.SerializedName;

public enum ResultType {
    @SerializedName("1")
    Text (1),

    @SerializedName("2")
    Pdf(2),

    @SerializedName("4")
    HOCR (4),

    @SerializedName("8")
    Internal (8),
    ;

    private final int key;

    ResultType(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public static ResultType fromKey(int key) {
        for(ResultType type : ResultType.values()) {
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
