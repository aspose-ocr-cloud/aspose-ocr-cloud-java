
import com.aspose.ocr.ApiClient;
import com.aspose.storage.Configuration;
import com.aspose.ocr.api.OCRResponse;
import com.aspose.ocr.api.OcrApi;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

import static java.lang.System.out;


public class Main {
    private static final String url = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";

    public static String RecognizeFromUrl(String url) throws IOException {
        OCRResponse ocrResponse = RecognizeFromUrl(urlToFile, Language.English);
        return ocrResp.text;
    }

    public static void main(String[] args) {
        try {
            setUpConfig();
            String result = RecognizeFromUrl(url);
            out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setUpConfig() throws Exception {
        Configuration.setAPP_SID("148f05be-abe6-46e3-9182-f93375ec866f");
        Configuration.setAPI_KEY("b1dfcdbf9b602463cc9a03c50b5ae7b4");
    }
}


