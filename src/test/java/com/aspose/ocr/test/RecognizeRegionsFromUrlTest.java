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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.lang.System.out;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class RecognizeRegionsFromUrlTest extends BaseTest {

    private String url;
    private OcrApiInvoker api;
    private OCRRequestData ocrRequestData;

    //Constructor that takes test data.
    public RecognizeRegionsFromUrlTest(
            String url,
            OCRRequestData ocrRequestData
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

        List<OCRRegion> mImage5PngRegions = new ArrayList<>();
        mImage5PngRegions.add(new OCRRegion(new OCRRect(243,308,2095,964), 0));
        mImage5PngRegions.add(new OCRRegion(new OCRRect(240,1045,2108,1826), 1));
        mImage5PngRegions.add(new OCRRegion(new OCRRect(237,1916,2083,3180), 2));

        OCRRequestData ocrRequestData = new OCRRequestData(
                mImage5PngRegions,
                com.aspose.ocr.api.Language.English,
                false
        );

        return Arrays.asList(new Object[][]
            {
                {"https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png", ocrRequestData}
            });
    }

    @Test
    public void RecognizeRegionsFromUrl() {
        out.println("Test url " + url + " + lang 1 ");
        try {

            Gson gson = new Gson();
            String ocrRequestDataJson = gson.toJson(ocrRequestData);

            RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);
            RequestBody url = RequestBody.create(MediaType.parse("text/plain"), "https://iili.io/JP2HFf.png");

            api = new ApiClient().createService(OcrApiInvoker.class);
            Call<ResponseBody> call = api.RecognizeRegionsFromUrl(url, requestData);
            Response<ResponseBody> res = call.execute();

            assertTrue(res.isSuccessful());
            ResponseBody answer = res.body();
            assertNotNull("Answer is null, ", answer);

            com.aspose.ocr.OCRResponse ocrResponse = com.aspose.ocr.OCRResponse.Deserialize(answer);
            String text = ocrResponse.text;
            out.println("Deserialized to OCRResponse: " + text);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
