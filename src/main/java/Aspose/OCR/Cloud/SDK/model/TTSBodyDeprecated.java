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
import Aspose.OCR.Cloud.SDK.model.LanguageTTS;
import Aspose.OCR.Cloud.SDK.model.ResultTypeTTS;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * Represents input text data with settings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-21T03:16:37.701975700+03:00[GMT+03:00]")
public class TTSBodyDeprecated {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private LanguageTTS language;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "resultType";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  private ResultTypeTTS resultType;

  public TTSBodyDeprecated() {
  }

  public TTSBodyDeprecated text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Gets or Sets text
   * @return text
  **/
  @javax.annotation.Nonnull

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public TTSBodyDeprecated language(LanguageTTS language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nonnull

  public LanguageTTS getLanguage() {
    return language;
  }


  public void setLanguage(LanguageTTS language) {
    this.language = language;
  }


  public TTSBodyDeprecated resultType(ResultTypeTTS resultType) {
    
    this.resultType = resultType;
    return this;
  }

   /**
   * Get resultType
   * @return resultType
  **/
  @javax.annotation.Nonnull

  public ResultTypeTTS getResultType() {
    return resultType;
  }


  public void setResultType(ResultTypeTTS resultType) {
    this.resultType = resultType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TTSBodyDeprecated ttSBodyDeprecated = (TTSBodyDeprecated) o;
    return Objects.equals(this.text, ttSBodyDeprecated.text) &&
        Objects.equals(this.language, ttSBodyDeprecated.language) &&
        Objects.equals(this.resultType, ttSBodyDeprecated.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, language, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TTSBodyDeprecated {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("language");
    openapiFields.add("resultType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("resultType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TTSBodyDeprecated
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TTSBodyDeprecated.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TTSBodyDeprecated is not found in the empty JSON string", TTSBodyDeprecated.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TTSBodyDeprecated.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TTSBodyDeprecated` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TTSBodyDeprecated.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TTSBodyDeprecated.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TTSBodyDeprecated' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TTSBodyDeprecated> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TTSBodyDeprecated.class));

       return (TypeAdapter<T>) new TypeAdapter<TTSBodyDeprecated>() {
           @Override
           public void write(JsonWriter out, TTSBodyDeprecated value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TTSBodyDeprecated read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TTSBodyDeprecated given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TTSBodyDeprecated
  * @throws IOException if the JSON string is invalid with respect to TTSBodyDeprecated
  */
  public static TTSBodyDeprecated fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TTSBodyDeprecated.class);
  }

 /**
  * Convert an instance of TTSBodyDeprecated to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

