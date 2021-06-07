/*
* --------------------------------------------------------------------------------------------------------------------
* <copyright company="Aspose" file="ConversionApi.java">
*   Copyright (c) 2020 Aspose.OCR for Cloud
* </copyright>
* <summary>
*   Permission is hereby granted, free of charge, to any person obtaining a copy
*  of this software and associated documentation files (the "Software"), to deal
*  in the Software without restriction, including without limitation the rights
*  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
*  copies of the Software, and to permit persons to whom the Software is
*  furnished to do so, subject to the following conditions:
*
*  The above copyright notice and this permission notice shall be included in all
*  copies or substantial portions of the Software.
*
*  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
*  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
*  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
*  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
*  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
*  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
*  SOFTWARE.
* </summary>
* --------------------------------------------------------------------------------------------------------------------
*/

package com.aspose.ocr.api;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface OcrApiInvoker {

    /**
     * Recognize image text from some www URL
     * @param url    Image URL in the World Wide Web (required)
     * @return Call<ResponseBody>
     */
    @Headers({"Content-Type:application/json"})
    @POST("ocr/recognize")
    Call<ResponseBody> RecognizeFromUrl(
            @Query("url") String url
    );

    /**
     * Recognize image text from some www URL
     * @param url       Image URL in the World Wide Web (required)
     * @param language  Set recognition language. (optional)
     * @return Call<ResponseBody>
     */
    @Headers({"Content-Type:application/json"})
    @POST("ocr/recognize")
    Call<ResponseBody> RecognizeFromUrl(
            @Query("url") String url,
            @Query("language") Language language,
            @Query("resultType") ResultType resultType,
            @Query("dsrMode") DsrMode dsrMode,
            @Query("dsrConfidence") DsrConfidence dsrConfidence

            );

    /**
     *  Recognize image text from the request body content. Send image on recognition directly.
     * @param file  Request body with file in content as octet-stream (required)
     * @return Call<ResponseBody>
     */
    @POST("ocr/recognize")
    Call<ResponseBody> RecognizeFromContent(
            @Body RequestBody file,
            @Query("language") Language language,
            @Query("resultType") ResultType resultType,
            @Query("dsrMode") DsrMode dsrMode,
            @Query("dsrConfidence") DsrConfidence dsrConfidence

    );

    /**
     *  Recognize image text from the request body content. Send image on recognition directly.
     * @param file  Request body with file in content as octet-stream (required)
     * @return Call<ResponseBody>
     */
    @POST("ocr/recognize")
    Call<ResponseBody> RecognizeFromContent(
            @Body RequestBody file
    );


    /**
     *  Recognize image text from the request body content. Send image on recognition directly.
     * @param file      Request body with file in content as octet-stream (required)
     * @param language  Set recognition language. (optional)
     * @return Call<ResponseBody>
     */
    @POST("ocr/recognize")
    Call<ResponseBody> RecognizeFromContent(
            @Body RequestBody file,
            @Query("language") Language language
    );

    /**
     * Put image in Aspose Cloud Storage and Recognise
     *
     * @param name         Document name. (required)
     * @param folder       The source document folder for storage. (optional)
     * @param storage      The storage name in Aspose Cloud. (optional)
     * @return Call<ResponseBody>
     */
    @GET("ocr/{name}/recognize")
    Call<ResponseBody> RecognizeFromStorage(
            @Path("name") String name,
            @Query("storage") String storage,
            @Query("folder") String folder
    );

    /**
     * Put image in Aspose Cloud Storage and Recognise
     *
     * @param name         Document name. (required)
     * @param folder       The source document folder for storage. (optional)
     * @param storage      The storage name in Aspose Cloud. (optional)
     * @param language     Set recognition language. (optional)
     * @return Call<ResponseBody>
     */
    @GET("ocr/{name}/recognize")
    Call<ResponseBody> RecognizeFromStorage(
            @Path("name") String name,
            @Query("folder") String folder,
            @Query("storage") String storage,
            @Query("language") Language language,
            @Query("resultType") ResultType resultType,
            @Query("dsrMode") DsrMode dsrMode,
            @Query("dsrConfidence") DsrConfidence dsrConfidence

    );

    /**
     * Put image in Aspose Cloud Storage and Recognise
     *
     * @param name         Document name. (required)
     * @param folder       The source document folder for storage. (optional)
     * @param storage      The storage name in Aspose Cloud. (optional)
     * @param language     Set recognition language. (optional)
     * @return Call<ResponseBody>
     */
    @GET("ocr/{name}/recognize")
    Call<ResponseBody> RecognizeFromStorage(
            @Path("name") String name,
            @Query("folder") String folder,
            @Query("storage") String storage,
            @Query("language") Language language
    );

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-regions-url")
    Call<ResponseBody> RecognizeRegionsFromUrl(
            @Part("url") RequestBody url,
            @Part("requestData") RequestBody requestData
    );

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-regions-content")
    Call<ResponseBody> RecognizeRegionsFromContent(
            @Part("requestData") RequestBody requestData,
            @Part MultipartBody.Part file
    );

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-regions-storage")
    Call<ResponseBody> RecognizeRegionsFromStorage(
            @Part("requestData") RequestBody requestData
    );

    // RECEIPT

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-receipt-url")
    Call<ResponseBody> RecognizeReceiptFromUrl(
            @Part("url") RequestBody url,
            @Part("requestData") RequestBody requestData
    );


    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-receipt-content")
    Call<ResponseBody> RecognizeReceiptFromContent(
            @Part("requestData") RequestBody requestData,
            @Part MultipartBody.Part file
    );

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-receipt-storage")
    Call<ResponseBody> RecognizeReceiptFromStorage(
            @Part("requestData") RequestBody requestData
    );

    // TABLE

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-table-url")
    Call<ResponseBody> RecognizeTableFromUrl(
            @Part("url") RequestBody url,
            @Part("requestData") RequestBody requestData
    );


    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-table-content")
    Call<ResponseBody> RecognizeTableFromContent(
            @Part("requestData") RequestBody requestData,
            @Part MultipartBody.Part file
    );

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-table-storage")
    Call<ResponseBody> RecognizeTableFromStorage(
            @Part("requestData") RequestBody requestData
    );

// PDF

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-pdf-url")
    Call<ResponseBody> RecognizePDFFromUrl(
            @Part("url") RequestBody url,
            @Part("requestData") RequestBody requestData
    );


    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-pdf-content")
    Call<ResponseBody> RecognizePDFFromContent(
            @Part("requestData") RequestBody requestData,
            @Part MultipartBody.Part file
    );

    /**
     * Recognize image selected text regions from some www URL
     * @return Call<ResponseBody>
     */
    @Multipart
    @POST("ocr/recognize-pdf-storage")
    Call<ResponseBody> RecognizePDFStorage(
            @Part("requestData") RequestBody requestData
    );


}
