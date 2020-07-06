package com.aspose.ocr.api;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Represents a rectangle: Left-Top (X1-Y1) to Right-Bottom (X2-Y2)
 */
public class OCRRect {
    public OCRRect(int topLeftX, int topLeftY, int bottomRightX, int bBottomRightY)
    {
        this.TopLeftX = topLeftX;
        this.TopLeftY = topLeftY;
        this.BottomRightX = bottomRightX;
        this.BottomRightY = bBottomRightY;
    }

    /**
     *  X-Coordinate of top left corner
     */
    @SerializedName("TopLeftX")
    public int TopLeftX;

    /**
     *  Y-Coordinate of top left corner
     */
    @SerializedName("TopLeftY")
    public int TopLeftY;

    /**
     *  X-Coordinate of bottom right corner
     */
    @SerializedName("BottomRightX")
    public int BottomRightX;

    /**
     *  Y-Coordinate of bottom right corner
     */
    @SerializedName("BottomRightY")
    public int BottomRightY;

    /**
     *  Return coordinates as List of integers for internal purpose
     */
    public int[] ToIntArray()
    {
        return new int[]{ TopLeftX, TopLeftY, BottomRightX, BottomRightY };
    }
}
