package com.aspose.ocr.api.models.table;

import com.aspose.ocr.api.Language;

import java.util.List;

/**
 * Request data to recognize specific regions on image.
 */
public class OCRTableRequestData {

    /**
     * Option to enable skew correction algorithm. False bt default
     */
    public boolean MakeSkewCorrect;

    public Language Language;

    public OCRTableRequestData(boolean makeSkewCorrect, Language language) {
        this.MakeSkewCorrect = makeSkewCorrect;
        this.Language = language;
    }
}
