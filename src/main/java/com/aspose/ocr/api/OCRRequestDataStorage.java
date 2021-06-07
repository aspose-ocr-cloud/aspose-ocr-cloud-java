package com.aspose.ocr.api;

import java.util.List;

import com.aspose.ocr.api.Language;

/**
 * Request Form Data for Aspose storage file info
 */
public class OCRRequestDataStorage extends OCRRequestData {
    /**
     * Filename that you have already put in Aspose Storage. *Required
     */
    public String FileName;


    /**
     * Storage name in Aspose Storage. Null for DefaultStorage
     */
    public String Storage;


    /**
     * Folder name in Aspose Storage. *Null for root folder
     */
    public String Folder;


    public OCRRequestDataStorage(List<OCRRegion> regions, Language language, boolean makeSkewCorrect, String fileName,
                                 String storage, String folder, DsrConfidence DsrConfidence, DsrMode DsrMode, ResultType ResultType) {
        super(regions, language, makeSkewCorrect, DsrConfidence, DsrMode, ResultType);
        FileName = fileName;
        Storage = storage;
        Folder = folder;
    }
}
