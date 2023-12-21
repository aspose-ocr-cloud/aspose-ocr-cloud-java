package org.example;

import Aspose.OCR.Cloud.SDK.RecognizeImageTrialApi;
import Aspose.OCR.Cloud.SDK.model.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecognizeImageTrialExample {

    public static void run() {
        try {
            RecognizeImageTrialApi api = new RecognizeImageTrialApi();
            OCRSettingsRecognizeImage settings = new OCRSettingsRecognizeImage();
            settings.setLanguage(Language.ENGLISH);
            settings.setDsrConfidence(DsrConfidence.DEFAULT);
            settings.setDsrMode(DsrMode.NODSRNOFILTER);
            settings.setMakeBinarization(false);
            settings.setMakeSkewCorrect(false);
            settings.setMakeContrastCorrection(false);
            settings.setMakeUpsampling(false);
            settings.setResultType(ResultType.TEXT);

            String imageFileName = "samples\\latin.png";
            byte[] imageData = Files.readAllBytes(Path.of(imageFileName));

            OCRRecognizeImageBody requestBody = new OCRRecognizeImageBody();
            requestBody.setImage(imageData);
            requestBody.setSettings(settings);

            System.out.println("Sending sample image (" + imageFileName +") to RecognizeImageTrialApi...");
            String taskId = api.postRecognizeImageTrial(requestBody);

            System.out.println("File successfully sent. " +
                    "Your task ID is " + taskId + "\nGetting task results...");
            OCRResponse apiResponse = api.getRecognizeImageTrial(taskId);

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
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
