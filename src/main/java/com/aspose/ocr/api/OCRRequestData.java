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
     * Result type, can be text, pdf, hocr
     */
    public ResultType ResultType;

    /**
     * DSR mode
     */
    public DsrMode DsrMode;

    /**
     * DSR Confidence
     */
    public DsrConfidence DsrConfidence;

    /**
     * Option to enable skew correction algorithm. False bt default
     */
    public boolean MakeSkewCorrect;

    public OCRRequestData(){}

    public OCRRequestData(List<OCRRegion> regions, Language language, boolean makeSkewCorrect,
                          DsrConfidence DsrConfidence, DsrMode DsrMode, ResultType ResultType) {
        this.Regions = regions;
        this.Language = language;
        this.MakeSkewCorrect = makeSkewCorrect;
        this.DsrConfidence = DsrConfidence;
        this.DsrMode = DsrMode;
        this.ResultType = ResultType;

    }
}
