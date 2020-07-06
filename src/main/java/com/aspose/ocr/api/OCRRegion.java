package com.aspose.ocr.api;
import com.google.gson.annotations.SerializedName;
/**
 *      Represents information about strict regions to recognize text
 */
public class OCRRegion {
    /**
     * Coordinates of a rectangle to recognize
     */
    @SerializedName("Rect")
    public OCRRect Rect;

    /**
     * The serial number of the region for the formation of the text
     */
    @SerializedName("Order")
    public int Order;

    public OCRRegion(){}

    public OCRRegion(OCRRect rect, int order) {
        Rect = rect;
        Order = order;
    }
}
