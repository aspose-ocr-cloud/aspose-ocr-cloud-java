package com.aspose.ocr.test;

import com.aspose.ocr.Configuration;

import static java.lang.System.out;

public class BaseTest {

    BaseTest() throws Exception {
        //Todo: Setup App_SID & App_Key; You can get them in your Aspose Dashboard https://dashboard.aspose.cloud

        Configuration.setAPP_SID("ocr.cloud");
        Configuration.setAPI_KEY("ocr.cloud");

        Configuration.setAuthPath("https://api.aspose.cloud/connect/token");
        Configuration.setBasePath("https://api.aspose.cloud/v3.0");


        Configuration.setUserAgent("WebKit");
        Configuration.setDebug(true);
        Configuration.setTestSrcDir("sourceTest");
        Configuration.setTestDstDir("destTest");

        if (Configuration.getAPI_KEY().isEmpty() || Configuration.getAPP_SID().isEmpty()) {
            out.println("! Error: Setup AppSID & AppKey in BaseTest Configuration");
            throw new Exception("Setup AppSID & AppKey in BaseTest Configuration");
        }
    }
}
