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
import Aspose.OCR.Cloud.SDK.model.OCRDetectRegionsBody;
import Aspose.OCR.Cloud.SDK.model.OCRResponse;
import Aspose.OCR.Cloud.SDK.model.ProblemDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DetectRegionsApi
 */
@Disabled
public class DetectRegionsApiTest {

    private final DetectRegionsApi api = new DetectRegionsApi();

    /**
     * CancelDetectRegions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelDetectRegionsTest() throws ApiException {
        String id = null;
        api.cancelDetectRegions(id);
        // TODO: test validations
    }

    /**
     * GetDetectRegions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetectRegionsTest() throws ApiException {
        String id = null;
        OCRResponse response = api.getDetectRegions(id);
        // TODO: test validations
    }

    /**
     * PostDetectRegions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDetectRegionsTest() throws ApiException {
        OCRDetectRegionsBody ocRDetectRegionsBody = null;
        String response = api.postDetectRegions(ocRDetectRegionsBody);
        // TODO: test validations
    }

}
