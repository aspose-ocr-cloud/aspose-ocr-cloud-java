package com.aspose.ocr.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Request data to recognize specific regions on image.
 */
public class OCRRequestData {
    /**
     * Region on image to recognize in specific format.
     */
    public List<OCRRegion> Regions;

    /**
     * Recognition language. English by default.
     */
    public Language Language;

    /**
     * Option to enable skew correction algorithm. False bt default
     */
    public boolean MakeSkewCorrect;

    public OCRRequestData(){}

    public OCRRequestData(List<OCRRegion> regions, Language language, boolean makeSkewCorrect) {
        this.Regions = regions;
        this.Language = language;
        this.MakeSkewCorrect = makeSkewCorrect;
    }
}
