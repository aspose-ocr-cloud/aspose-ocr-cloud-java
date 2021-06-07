package com.aspose.ocr.api.models.receipt;

public class OCRReceiptRequestDataStorage extends OCRReceiptRequestData {
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


    public OCRReceiptRequestDataStorage(boolean makeSkewCorrect,
                                        String fileName, String storage, String folder
    ) {
        super(makeSkewCorrect);
        FileName = fileName;
        Storage = storage;
        Folder = folder;
    }

}
