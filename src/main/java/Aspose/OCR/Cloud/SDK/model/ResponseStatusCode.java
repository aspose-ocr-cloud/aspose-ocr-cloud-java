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
 * Status code showing the status of the request, operation, and result processing.
 */
@JsonAdapter(ResponseStatusCode.Adapter.class)
public enum ResponseStatusCode {
  
  OK("Ok"),
  
  PARTIALLYNOTFOUND("PartiallyNotFound"),
  
  NOANYRESULTDATA("NoAnyResultData"),
  
  RESULTDATALOST("ResultDataLost"),
  
  TASKNOTFOUND("TaskNotFound"),
  
  NOTREADY("NotReady"),
  
  ERROR("Error");

  private String value;

  ResponseStatusCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResponseStatusCode fromValue(String value) {
    for (ResponseStatusCode b : ResponseStatusCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResponseStatusCode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResponseStatusCode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResponseStatusCode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResponseStatusCode.fromValue(value);
    }
  }
}

