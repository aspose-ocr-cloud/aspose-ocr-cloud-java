/*
 * Aspose OCR Cloud 5.0 API
 * Aspose OCR Cloud 5.0 API
 *
 * The version of the OpenAPI document: 5.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package Aspose.OCR.Cloud.SDK;

import Aspose.OCR.Cloud.SDK.ApiException;
import Aspose.OCR.Cloud.SDK.model.OCRRecognizeRegionsBody;
import Aspose.OCR.Cloud.SDK.model.OCRResponse;
import Aspose.OCR.Cloud.SDK.model.ProblemDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecognizeRegionsApi
 */
@Disabled
public class RecognizeRegionsApiTest {

    private final RecognizeRegionsApi api = new RecognizeRegionsApi();

    /**
     * CancelRecognizeRegions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelRecognizeRegionsTest() throws ApiException {
        String id = null;
        api.cancelRecognizeRegions(id);
        // TODO: test validations
    }

    /**
     * GetRecognizeRegions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecognizeRegionsTest() throws ApiException {
        String id = null;
        OCRResponse response = api.getRecognizeRegions(id);
        // TODO: test validations
    }

    /**
     * PostRecognizeRegions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postRecognizeRegionsTest() throws ApiException {
        OCRRecognizeRegionsBody ocRRecognizeRegionsBody = null;
        String response = api.postRecognizeRegions(ocRRecognizeRegionsBody);
        // TODO: test validations
    }

}