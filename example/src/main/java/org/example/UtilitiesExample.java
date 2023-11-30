package org.example;

import Aspose.OCR.Cloud.SDK.ConvertTextToSpeechTrialApi;
import Aspose.OCR.Cloud.SDK.UtilitiesApi;
import Aspose.OCR.Cloud.SDK.model.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UtilitiesExample {

    private static int MAX_RETRIES = 5;

    public static boolean getTaskStatus(String taskId) {
        try {
            UtilitiesApi utilsApi = new UtilitiesApi();
            System.out.println("Getting task status for Task ID " + taskId + "...");
            int retryCount = 0;

            while (retryCount < MAX_RETRIES) {
                OCRResponse apiResponse = utilsApi.getTaskStatus(taskId);
                OCRTaskStatus taskStatus = apiResponse.getTaskStatus();
                if (taskStatus == OCRTaskStatus.COMPLETED) {
                    System.out.println("Task completed. Results may be retrieved.");
                    return true;
                } else if (taskStatus == OCRTaskStatus.ERROR) {
                    System.out.println("Task failed. Results cannot being retrieved. Reason: " + apiResponse.getError().getMessages().toString());
                    return false;
                } else {
                    retryCount++;
                    System.out.println("Task processing in progress. Retry after " + 5 * retryCount + " seconds...");
                    Thread.sleep(5000 * retryCount);
                };
            };
            System.out.println("Retry attempts out of limit but task status is in progress. Please try again later.");
            return false;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return false;
        }

    }
}
