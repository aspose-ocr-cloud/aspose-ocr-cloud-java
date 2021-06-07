package com.aspose.ocr.api;

import com.google.gson.annotations.SerializedName;

public enum DsrConfidence {
    @SerializedName("1")
    Default (1),

    @SerializedName("2")
    Low(2),

    @SerializedName("3")
    LowMid (3),

    @SerializedName("4")
    Mid (4),

    @SerializedName("5")
    MidHigh (5),

    @SerializedName("6")
    High (6),


    @SerializedName("7")
    Ultra(7),

    @SerializedName("8")
    All(8),
    ;

    private final int key;

    DsrConfidence(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public static DsrConfidence fromKey(int key) {
        for(DsrConfidence type : DsrConfidence.values()) {
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
