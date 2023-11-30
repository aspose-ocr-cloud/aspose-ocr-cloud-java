package org.example;

import Aspose.OCR.Cloud.SDK.RecognizeAndParseInvoiceApi;
import Aspose.OCR.Cloud.SDK.RecognizeImageApi;
import Aspose.OCR.Cloud.SDK.model.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecognizeAndParseInvoiceExample {

    public static void run(String clientId, String clientSecret) {
        System.out.println("Warning: the following action will reduce the number of API calls available " +
                "to your account in the current period. Continue? (y/n)\n ");
        Scanner scanner = new Scanner(System.in);
        char confirmation = scanner.next().charAt(0);
        if ( confirmation == 'y'){
            try {
                RecognizeAndParseInvoiceApi api = new RecognizeAndParseInvoiceApi(clientId, clientSecret);
                OCRSettingsRecognizeAndParseInvoice settings = new OCRSettingsRecognizeAndParseInvoice();
                settings.setMakeBinarization(false);
                settings.setMakeSkewCorrect(false);
                settings.setMakeContrastCorrection(false);
                settings.setMakeUpsampling(false);
                settings.setResultType(ResultType.TEXT);

                String imageFileName = "samples\\invoice_english_01.jpg";
                byte[] imageData = Files.readAllBytes(Path.of(imageFileName));

                OCRRecognizeAndParseInvoiceBody requestBody = new OCRRecognizeAndParseInvoiceBody();
                requestBody.setImage(imageData);
                requestBody.setSettings(settings);

                System.out.println("Sending sample image (" + imageFileName +") to RecognizeAndParseInvoiceApi...");
                String taskId = api.postRecognizeAndParseInvoice(requestBody);

                System.out.println("File successfully sent. Your credentials accepted. " +
                        "Your task ID is " + taskId + "\nGetting task results...");
                boolean taskCompleted = UtilitiesExample.getTaskStatus(taskId);
                if (taskCompleted){

                    OCRResponse apiResponse = api.getRecognizeAndParseInvoice(taskId);

                    String fileExtension = "";
                    switch(apiResponse.getResults().get(0).getType()) {
                        case "Text":
                            fileExtension = "txt";
                            break;
                        default:
                            fileExtension = "txt";
                    };
                    String resultFileName = "results\\" + apiResponse.getId() + "." + fileExtension;
                    Files.createDirectories(Paths.get("results"));
                    Files.write(Path.of(resultFileName), apiResponse.getResults().get(0).getData());

                    System.out.println(new String(apiResponse.getResults().get(0).getData(), StandardCharsets.UTF_8) + "\n\n");
                    System.out.println("Respose received with status " + apiResponse.getTaskStatus().getValue() +"\n\n" +
                            "Your results saved to " + resultFileName + "\n\n" +
                            "Press any key to continue\n");
                    System.in.read();
                }

            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
