
import com.aspose.ocr.ApiClient;
import com.aspose.ocr.api.Language;
import com.aspose.storage.Configuration;
import com.aspose.ocr.api.OCRResponse;
import com.aspose.ocr.api.OCRAPI;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

import static com.aspose.ocr.api.OCRAPI.RecognizeFromUrl;
import static java.lang.System.out;


public class Main {
    private static final String url = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";

    public static String RecognizeFromUrlTest() throws IOException {
        String urlToFile = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";

        OCRResponse ocrResponse = RecognizeFromUrl(urlToFile, Language.English);
        return ocrResponse.text;
    }

    public static void main(String[] args) {
        try {
            setUpConfig();
             String result = RecognizeFromUrlTest();
             out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setUpConfig() throws Exception {
        Configuration.setAPP_SID("");
        Configuration.setAPI_KEY("");
    }
}


