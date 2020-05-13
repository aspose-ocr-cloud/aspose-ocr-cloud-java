
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
//    static {
//        Configuration.setAPI_KEY("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//        Configuration.setAPP_SID("XXXXXXXX-XXXX-XXXX-XXXX-XXXXXXXXXXXX");
//    }

    private static final String url = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Book_of_Abraham_FirstPage.png";

    public static String RecognizeFromUrl(String url) throws IOException {
        OcrApi api = new ApiClient().createService(OcrApi.class);
        Call<ResponseBody> call = api.RecognizeFromUrl(url);
        Response<ResponseBody> res = call.execute();
        OCRResponse ocrResp = OCRResponse.Deserialize(res.body());
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


