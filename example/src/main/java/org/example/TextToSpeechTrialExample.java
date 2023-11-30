package org.example;

import Aspose.OCR.Cloud.SDK.ConvertTextToSpeechTrialApi;
import Aspose.OCR.Cloud.SDK.model.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextToSpeechTrialExample {

    public static void run() {
        System.out.println("Notice: the following action will not reduce the number of API calls available " +
                "to your account in the current period due to trial mode.\n ");
        try {
            ConvertTextToSpeechTrialApi ttsApi = new ConvertTextToSpeechTrialApi();
            TTSBody requestBody = new TTSBody();
            TTSSettings settings = new TTSSettings();
            settings.setLanguage(LanguageTTS.ENGLISH);
            settings.setResultType(ResultTypeTTS.WAV);
            requestBody.setText("Sample text");
            requestBody.settings(settings);

            System.out.println("Sending sample text (" + requestBody.getText() +") to TextToSpeechTrialApi...");
            String taskId = ttsApi.postConvertTextToSpeechTrial(requestBody);

            System.out.println("File successfully sent. Your credentials accepted. " +
                    "Your task ID is " + taskId + "\nGetting task results...");
            TTSResponse apiResponse = ttsApi.getConvertTextToSpeechTrial(taskId);

            String fileExtension = "";
            switch(apiResponse.getResults().get(0).getType()) {
                case "WavFile":
                    fileExtension = "wav";
                    break;
                default:
                    fileExtension = "wav";
            };
            String resultFileName = "results\\" + apiResponse.getId() + "." + fileExtension;
            Files.createDirectories(Paths.get("results"));
            Files.write(Path.of(resultFileName), apiResponse.getResults().get(0).getData());

            System.out.println("Respose received with status " + apiResponse.getTaskStatus().getValue() +"\n\n" +
                    "Your results saved to " + resultFileName + "\n\n" +
                    "Press any key to continue\n");

            System.in.read();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }

    }
}
