package net.systran.platform.nlp.client;

import net.systran.platform.nlp.client.api.LidApi;
import net.systran.platform.nlp.client.auth.ApiKeyAuth;
import net.systran.platform.nlp.client.model.LidDetectedLanguage;
import net.systran.platform.nlp.client.model.LidDocumentResponse;
import net.systran.platform.nlp.client.model.LidParagraph;
import net.systran.platform.nlp.client.model.LidParagraphResponse;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestLid {
    public static LidApi getLidApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new LidApi(apc);
    }

    @Test
    public void testDocumentLid() throws ApiException, IOException {
        LidApi api = getLidApi();

        String input = "Bodies from the MH17 crash are being kept on this train, as Natalia Antelava reports Pro-Russian rebels have allowed Dutch investigators to examine bodies from the crashed Malaysia Airlines plane at a railway station in eastern Ukraine.";
        LidDocumentResponse documentResponse = api.nlpLidDetectLanguageDocumentGet(null, input, null);
        for (LidDetectedLanguage detectedLanguage : documentResponse.getDetectedLanguages()) {
            System.out.println("Lang " + detectedLanguage.getLang());
            System.out.println("Confidence " + detectedLanguage.getConfidence());
        }
    }

    @Test
    public void testDocumentLidWithInputFile() throws ApiException, IOException {
        LidApi api = getLidApi();

        File inputFile = new File(".//src//test//java//net//systran//platform//nlp//client//lid_document.txt");
        LidDocumentResponse documentResponse = api.nlpLidDetectLanguageDocumentGet(inputFile, null, null);
        for (LidDetectedLanguage detectedLanguage : documentResponse.getDetectedLanguages()) {
            System.out.println("Lang " + detectedLanguage.getLang());
            System.out.println("Confidence " + detectedLanguage.getConfidence());
        }
    }

    @Test
    public void testParagraphLid() throws ApiException, IOException {
        LidApi api = getLidApi();

        String input = "Bodies from the MH17 crash are being kept on this train, as Natalia Antelava reports\n" +
                "ベリリウムは原子番号4の元素。元素記号は Be。第2族元素に属し、原子量は約9.012である。\n" +
                "Le palais des beaux-arts de Lille est un musée municipal d'art et d'antiquités situé place de la République à Lille.\n" +
                "Это белая птица с чёрными концами крыльев, длинной шеей, длинным тонким красным клювом и длинными красноватыми ногами";

        LidParagraphResponse paragraphResponse = api.nlpLidDetectLanguageParagraphGet(null, input, null);
        for (LidParagraph paragraph : paragraphResponse.getParagraphs()) {
            System.out.println("{");
            System.out.println("\tSource: " + paragraph.getSource());
            for (LidDetectedLanguage detectedLanguage : paragraph.getDetectedLanguages()) {
                System.out.println("\tLang " + detectedLanguage.getLang());
                System.out.println("\tConfidence " + detectedLanguage.getConfidence());
            }
            System.out.println("}");
        }
    }

    @Test
    public void testParagraphLidWithInputFile() throws ApiException, IOException {
        LidApi api = getLidApi();

        File inputFile = new File(".//src//test//java//net//systran//platform//nlp//client//lid_paragraph.txt");

        LidParagraphResponse paragraphResponse = api.nlpLidDetectLanguageParagraphGet(inputFile, null, null);
        for (LidParagraph paragraph : paragraphResponse.getParagraphs()) {
            System.out.println("{");
            System.out.println("\tSource: " + paragraph.getSource());
            for (LidDetectedLanguage detectedLanguage : paragraph.getDetectedLanguages()) {
                System.out.println("\tLang " + detectedLanguage.getLang());
                System.out.println("\tConfidence " + detectedLanguage.getConfidence());
            }
            System.out.println("}");
        }
    }
}
