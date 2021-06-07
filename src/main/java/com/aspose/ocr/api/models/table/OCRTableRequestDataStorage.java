package com.aspose.ocr.api.models.table;

import com.aspose.ocr.api.Language;

/**
 * Request data to recognize specific regions on image.
 */
public class OCRTableRequestDataStorage extends OCRTableRequestData {
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


    public OCRTableRequestDataStorage(boolean makeSkewCorrect, com.aspose.ocr.api.Language language,
                                      String fileName, String storage, String folder

    ) {
        super(makeSkewCorrect, language);
        FileName = fileName;
        Storage = storage;
        Folder = folder;
    }
}
