package com.aspose.ocr.api;

public class BaseStructure {

    public enum LanguageEnum {
        English,
        German,
        French,
        Italian,
        Spanish,
        Portuguese,
        Polish,
        Slovene,
        Slovak,
        Netherlands,
        Lithuanian,
        Latvian,
        Danish,
        Norwegian,
        Finnish,
        Serbian,
        Croatian,
        Czech,
        Swedish,
        Estonian,
        Romanian,
        Chinese
    }

    public enum ResultType {
        Text,
        Pdf,
        HOCR,
        Internal
    }

    public enum DsrMode {
        DsrNoFilter,
        DsrAndFilter,
        TextDetector,
        DsrPlusDetector
    }

    private enum DsrConfidence {
        Default,
        Low,
        LowMid,
        Mid,
        MidHigh,
        High,
        Ultra,
        All

    }

}
