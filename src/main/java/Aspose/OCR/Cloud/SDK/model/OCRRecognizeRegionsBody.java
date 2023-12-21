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
import Aspose.OCR.Cloud.SDK.model.OCRSettingsRecognizeRegions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Aspose.OCR.Cloud.SDK.JSON;

/**
 * OCRRecognizeRegionsBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-22T01:04:00.512+03:00[GMT+03:00]")
public class OCRRecognizeRegionsBody {
  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private byte[] image;

  public static final String SERIALIZED_NAME_SETTINGS = "settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private OCRSettingsRecognizeRegions settings;

  public OCRRecognizeRegionsBody() {
  }

  public OCRRecognizeRegionsBody image(byte[] image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nonnull

  public byte[] getImage() {
    return image;
  }


  public void setImage(byte[] image) {
    this.image = image;
  }


  public OCRRecognizeRegionsBody settings(OCRSettingsRecognizeRegions settings) {
    
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @javax.annotation.Nonnull

  public OCRSettingsRecognizeRegions getSettings() {
    return settings;
  }


  public void setSettings(OCRSettingsRecognizeRegions settings) {
    this.settings = settings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCRRecognizeRegionsBody ocRRecognizeRegionsBody = (OCRRecognizeRegionsBody) o;
    return Arrays.equals(this.image, ocRRecognizeRegionsBody.image) &&
        Objects.equals(this.settings, ocRRecognizeRegionsBody.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(image), settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCRRecognizeRegionsBody {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("image");
    openapiFields.add("settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image");
    openapiRequiredFields.add("settings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OCRRecognizeRegionsBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OCRRecognizeRegionsBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OCRRecognizeRegionsBody is not found in the empty JSON string", OCRRecognizeRegionsBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OCRRecognizeRegionsBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OCRRecognizeRegionsBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OCRRecognizeRegionsBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `settings`
      OCRSettingsRecognizeRegions.validateJsonObject(jsonObj.getAsJsonObject("settings"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OCRRecognizeRegionsBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OCRRecognizeRegionsBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OCRRecognizeRegionsBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OCRRecognizeRegionsBody.class));

       return (TypeAdapter<T>) new TypeAdapter<OCRRecognizeRegionsBody>() {
           @Override
           public void write(JsonWriter out, OCRRecognizeRegionsBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OCRRecognizeRegionsBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OCRRecognizeRegionsBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OCRRecognizeRegionsBody
  * @throws IOException if the JSON string is invalid with respect to OCRRecognizeRegionsBody
  */
  public static OCRRecognizeRegionsBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OCRRecognizeRegionsBody.class);
  }

 /**
  * Convert an instance of OCRRecognizeRegionsBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

