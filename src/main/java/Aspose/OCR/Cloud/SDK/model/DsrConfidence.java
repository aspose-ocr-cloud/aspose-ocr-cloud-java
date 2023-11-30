/*
 * Aspose OCR Cloud 5.0 API
 * Aspose OCR Cloud 5.0 API
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Aspose.OCR.Cloud.SDK.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Region filtering threshold. Filtering by the algorithm confidence scale. Higher mode - more aggressive filtering. Default &#x3D;&#x3D; Medium
 */
@JsonAdapter(DsrConfidence.Adapter.class)
public enum DsrConfidence {
  
  DEFAULT("Default"),
  
  LOW("Low"),
  
  LOWMID("LowMid"),
  
  MID("Mid"),
  
  MIDHIGH("MidHigh"),
  
  HIGH("High"),
  
  ULTRA("Ultra"),
  
  ALL("All");

  private String value;

  DsrConfidence(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DsrConfidence fromValue(String value) {
    for (DsrConfidence b : DsrConfidence.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DsrConfidence> {
    @Override
    public void write(final JsonWriter jsonWriter, final DsrConfidence enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DsrConfidence read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DsrConfidence.fromValue(value);
    }
  }
}
