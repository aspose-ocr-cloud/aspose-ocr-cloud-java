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
import com.aspose.ocr.api.*;
import com.aspose.ocr.api.models.pdf.PdfResultPage;
import com.aspose.ocr.api.models.pdf.PdfSingleImageResult;
import com.aspose.ocr.api.models.receipt.OCRReceiptRequestData;
import com.aspose.ocr.api.models.receipt.OCRReceiptResponse;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import retrofit2.Call;
import retrofit2.Response;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.System.out;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RecognizeReceiptFromUrlTest extends BaseTest {

    private String url;
    private OcrApiInvoker api;
    private OCRReceiptRequestData ocrRequestData;

    //Constructor that takes test data.
    public RecognizeReceiptFromUrlTest(
            String url,
            OCRReceiptRequestData ocrRequestData
    ) throws Exception {
        super();
        this.url = url;
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
                {"https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png", ocrRequestData}
            });
    }

    @Test
    public void RecognizePDFFromUrl() {
        out.println("Test url " + url + " + lang 1 ");
        try {
            Gson gson = new Gson();
            String fileWebUrl = url;
            String ocrRequestDataJson = gson.toJson(ocrRequestData);
            RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
            RequestBody url = RequestBody.create(MediaType.parse("text/plain"), "\"" + fileWebUrl + "\"");

            Call<ResponseBody> call = api.RecognizeReceiptFromUrl(url, requestData);

            Response<ResponseBody> res = call.execute();
            assertTrue(res.isSuccessful());
            ResponseBody answer = res.body();
            assertNotNull("Answer is null, ", answer);

            OCRReceiptResponse ocrResponse  = OCRReceiptResponse.Deserialize(answer);
            String text = ocrResponse.text;
            assertNotNull("Text is empty" + res.toString(), text);



        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
