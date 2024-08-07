//package org.example;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}
package org.example;
// Import classes:
import Aspose.OCR.Cloud.SDK.*;
import Aspose.OCR.Cloud.SDK.auth.*;
import Aspose.OCR.Cloud.SDK.model.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("This is Aspose OCR Cloud SDK for Java v24.8.0 example usage project\n" +
                "Please make sure you have entered the correct client id and secret in the appropriate variables");

        String clientId = "";
        String clientSecret = "";

        TextToSpeechTrialExample.run();
        RecognizeImageExample.run(clientId, clientSecret);
        RecognizeAndParseInvoiceExample.run(clientId, clientSecret);
    }

}