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
import com.aspose.ocr.OCRResponse;
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
public class RecognizeRegionsFromStorageTest extends BaseTest {

    private String fileName;
    private String folder;
    private String storage;
    private OcrApiInvoker api;
    private Language language = null;
    private List<OCRRegion> mImage5PngRegions;

    //Constructor that takes test data.
    public RecognizeRegionsFromStorageTest(
            String fileName,
            Language language,
            List<OCRRegion> mImage5PngRegions
    ) throws Exception {
        super();
        this.fileName = fileName;
        this.folder = "";
        this.storage = null;
        this.language = language;
        this.mImage5PngRegions = mImage5PngRegions;
    }


    @Before
    public void initialize() {
        api = new ApiClient().createService(OcrApiInvoker.class);
    }

    @Parameterized.Parameters
    public static Collection testData() {

        List<OCRRegion> mImage5PngRegions = new ArrayList<>();
        mImage5PngRegions.add(new OCRRegion(new OCRRect(243, 308, 2095, 964), 0));
        mImage5PngRegions.add(new OCRRegion(new OCRRect(240, 1045, 2108, 1826), 1));
        mImage5PngRegions.add(new OCRRegion(new OCRRect(237, 1916, 2083, 3180), 2));


        return Arrays.asList(new Object[][]
                {
                        {"5.png", Language.English, mImage5PngRegions},
                        {"de_1.jpg", Language.German, mImage5PngRegions}
                });
    }

    @Test(timeout = 200000)
    public void RecognizeRegionsFromStorage() {
        out.println("Test file: " + fileName);


        try {
            TestHelper.uploadFile(fileName, folder);

            OCRRequestDataStorage ocrRequestData = new OCRRequestDataStorage(
                    mImage5PngRegions,
                    Language.English,
                    false,
                    fileName,
                    storage,
                    folder
            );

            Gson gson = new Gson();
            String ocrRequestDataJson = gson.toJson(ocrRequestData);

            RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);

            api = new ApiClient().createService(OcrApiInvoker.class);
            Call<ResponseBody> call = api.RecognizeRegionsFromStorage(requestData);
            Response<ResponseBody> res = call.execute();
            assertTrue(res.isSuccessful());
            ResponseBody answer = res.body();
            assertNotNull("Answer is null, ", answer);
            com.aspose.ocr.OCRResponse ocrResponse = OCRResponse.Deserialize(answer);
            String text = ocrResponse.text;
            assertNotNull("Text is empty" + res.toString(), text);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    @Test(timeout = 200000)
    public void RecognizeRegionsFromStorageWithLanguage() {
        out.println("Test file: " + fileName + " Language: " + language);
        try {
            TestHelper.uploadFile(fileName, folder);

            OCRRequestDataStorage ocrRequestData = new OCRRequestDataStorage(
                    mImage5PngRegions,
                    Language.English,
                    false,
                    fileName,
                    storage,
                    folder
            );

            Gson gson = new Gson();
            String ocrRequestDataJson = gson.toJson(ocrRequestData);

            RequestBody requestData = RequestBody.create(MediaType.parse("application/json"), ocrRequestDataJson);

            api = new ApiClient().createService(OcrApiInvoker.class);
            Call<ResponseBody> call = api.RecognizeRegionsFromStorage(requestData);
            Response<ResponseBody> res = call.execute();
            assertTrue(res.isSuccessful());
            ResponseBody answer = res.body();
            assertNotNull("Answer is null, ", answer);
            com.aspose.ocr.OCRResponse ocrResponse = OCRResponse.Deserialize(answer);
            String text = ocrResponse.text;
            assertNotNull("Text is empty" + res.toString(), text);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
