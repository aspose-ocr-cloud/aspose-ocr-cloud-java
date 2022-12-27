package org.example;

import Aspose.OCR.Cloud.SDK.TextToSpeechApi;
import Aspose.OCR.Cloud.SDK.model.LanguageTTS;
import Aspose.OCR.Cloud.SDK.model.ResultTypeTTS;
import Aspose.OCR.Cloud.SDK.model.TTSBody;
import Aspose.OCR.Cloud.SDK.model.TTSResponse;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextToSpeechExample {

    public static void run(String clientId, String clientSecret) {
        System.out.println("Warning: the following action will reduce the number of API calls available " +
                "to your account in the current period. Continue? (y/n)\n ");
        Scanner scanner = new Scanner(System.in);
        char confirmation = scanner.next().charAt(0);
        if ( confirmation == 'y'){
            try {
                TextToSpeechApi ttsApi = new TextToSpeechApi(clientId, clientSecret);
                TTSBody requestBody = new TTSBody();
                requestBody.setLanguage(LanguageTTS.ENGLISH);
                requestBody.setResultType(ResultTypeTTS.WAV);
                requestBody.setText("Sample text");

                System.out.println("Sending sample text (" + requestBody.getText() +") to TextToSpeechApi...");
                String taskId = ttsApi.postTextToSpeech(requestBody);

                System.out.println("File successfully sent. Your credentials accepted. " +
                        "Your task ID is " + taskId + "\nGetting task results...");
                TTSResponse apiResponse = ttsApi.getTextToSpeechResult(taskId);

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
}
