/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FirstTest.java">
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


package com.aspose.ocr.test;

import com.aspose.ocr.ApiClient;
import com.aspose.ocr.Configuration;
import com.aspose.ocr.api.*;
import com.aspose.ocr.api.models.pdf.PdfResultPage;
import com.aspose.ocr.api.models.pdf.PdfSingleImageResult;
import com.aspose.ocr.api.models.receipt.OCRReceiptRequestData;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import retrofit2.Call;
import retrofit2.Response;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import static java.lang.System.out;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RecognizeReceiptFromContentTest extends BaseTest {

    private String fileName;
    private OcrApiInvoker api;
    private OCRRequestData ocrRequestData;

    public RecognizeReceiptFromContentTest(
            String fileName, OCRRequestData ocrRequestData
    ) throws Exception {
        super();
        this.fileName = fileName;
        this.ocrRequestData = ocrRequestData;
    }

    @Before
    public void initialize() {
        api = new ApiClient().createService(OcrApiInvoker.class);
    }

    @Parameterized.Parameters
    public static Collection testData() {

        OCRReceiptRequestData ocrRequestData = new OCRReceiptRequestData(false);


        return Arrays.asList(new Object[][]
                {
                        {"5.png", ocrRequestData}
                });
    }

    @Test
    public void RecognizeReceiptFromContent() {
        out.println("Test file: " + fileName);
        try {

            File f = new File(Configuration.getTestSrcDir(), fileName);
            if (!f.exists()) {
                out.println("file not found");
                fail();
            }
            Gson gson = new Gson();

            String ocrRequestDataJson = gson.toJson(ocrRequestData);
            RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);

            RequestBody requestFile = RequestBody.create(MediaType.parse("application/octet-stream"), f);
            MultipartBody.Part bodyFile = MultipartBody.Part.createFormData("picture", f.getName(), requestFile);

            Call<ResponseBody> call = api.RecognizeReceiptFromContent(requestData, bodyFile);

            Response<ResponseBody> res = call.execute();
            assertTrue(res.isSuccessful());
            ResponseBody answer = res.body();

            assertNotNull("Answer is null, ", answer);

            OCRPDFResponse ocrResponse = OCRPDFResponse.Deserialize(answer);

            String text = "";
            if (ocrResponse.resultData != null) {
                for (PdfResultPage pdfResult : ocrResponse.resultData) {
                    if (pdfResult != null) {
                        for (PdfSingleImageResult pdfSingleImageResult : pdfResult.ImageOcrResults) {
                            text = text + '\n' + pdfSingleImageResult.ResultText;
                        }
                    }
                }
            }
            assertNotNull("Answer is null, ", text);
            out.println("Deserialized to OCRResponse: " + text);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
