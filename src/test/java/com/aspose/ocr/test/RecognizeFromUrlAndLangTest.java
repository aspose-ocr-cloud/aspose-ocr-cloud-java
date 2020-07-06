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
import com.aspose.ocr.api.OcrApiInvoker;
import com.aspose.ocr.api.Language;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import static java.lang.System.out;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(Parameterized.class)
public class RecognizeFromUrlAndLangTest extends BaseTest {

    private String url;
    private Language language;
    private OcrApiInvoker api;

    //Constructor that takes test data.
    public RecognizeFromUrlAndLangTest(
            String url,
            Language language
    ) throws Exception {
        super();
        this.url = url;
        this.language = language;
    }

    @Before
    public void initialize() {
        api = new ApiClient().createService(OcrApiInvoker.class);
    }

    @Parameterized.Parameters
    public static Collection testData() {
        return Arrays.asList(new Object[][]
            {
                {"https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png", Language.English},
                {"https://github.com/aspose-ocr-cloud/aspose-ocr-cloud-dotnet/raw/master/Aspose.Ocr.Cloud.Sdk.Demo/de_1.jpg", Language.German}
            });
    }

    @Test
    public void RecognizeFromUrlAndLang() {
        out.println("Test url: " + url + " + language: " + language.getKey());
        try {
             Call<ResponseBody> call = api.RecognizeFromUrl(url, language);

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
