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
 * Result document type for Table OCR process
 */
@JsonAdapter(ResultTypeTable.Adapter.class)
public enum ResultTypeTable {
  
  TEXT("Text"),
  
  EXCEL("Excel"),
  
  CSV("Csv"),
  
  CSV_AND_EXCEL("CsvAndExcel");

  private String value;

  ResultTypeTable(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResultTypeTable fromValue(String value) {
    for (ResultTypeTable b : ResultTypeTable.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResultTypeTable> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResultTypeTable enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResultTypeTable read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResultTypeTable.fromValue(value);
    }
  }
}

