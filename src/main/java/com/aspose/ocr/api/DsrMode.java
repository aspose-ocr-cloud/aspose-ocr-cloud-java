package com.aspose.ocr.api;

import com.google.gson.annotations.SerializedName;

public enum DsrMode {
    @SerializedName("1")
    DsrNoFilter (1),

    @SerializedName("2")
    DsrAndFilter(2),

    @SerializedName("3")
    NoDsrNoFilter (3),

    @SerializedName("4")
    TextDetector (4),

    @SerializedName("5")
    DsrPlusDetector (5),
    ;

    private final int key;

    DsrMode(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public static DsrMode fromKey(int key) {
        for(DsrMode type : DsrMode.values()) {
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
