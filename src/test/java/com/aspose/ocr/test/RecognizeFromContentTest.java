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

import com.aspose.ocr.*;
import com.aspose.ocr.api.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import static java.lang.System.out;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class RecognizeFromContentTest extends BaseTest {

    private String fileName;
    private OcrApiInvoker api;

    //Constructor that takes test data.
    public RecognizeFromContentTest(
            String fileName
    ) throws Exception {
        super();
        this.fileName = fileName;
    }

    @Before
    public void initialize() {
        api = new ApiClient().createService(OcrApiInvoker.class);
    }

    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(new Object[][]
            {
                {"5.png"}
            });
    }

    @Test
    public void RecognizeFromContent() {
        out.println("Test file: " + fileName);
        try {
            File f = new File(Configuration.getTestSrcDir(), fileName);
            if(!f.exists()){
                out.println("file not found");
                fail();
            }

            RequestBody requestBody = RequestBody.create( MediaType.parse("application/octet-stream"), f);
            Call<ResponseBody> call = api.RecognizeFromContent(requestBody);
            Response<ResponseBody> res = call.execute();
            assertTrue(res.isSuccessful());

            ResponseBody answer = res.body();
            assertNotNull("Answer is null, ", answer);

            String text = answer.string();
            assertNotNull("Text is empty" + res.toString(), text);

            out.println(text);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
