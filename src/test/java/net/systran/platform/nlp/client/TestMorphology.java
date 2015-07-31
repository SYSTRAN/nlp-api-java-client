package net.systran.platform.nlp.client;

import net.systran.platform.nlp.client.api.MorphologyApi;
import net.systran.platform.nlp.client.auth.ApiKeyAuth;
import net.systran.platform.nlp.client.model.MorphologyExtractLemmaResponse;
import net.systran.platform.nlp.client.model.MorphologyExtractNPResponse;
import net.systran.platform.nlp.client.model.MorphologyExtractPosResponse;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestMorphology {
    public static MorphologyApi MorphologyApi() throws IOException {
        ApiClient apc = new ApiClient();
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) apc.getAuthentication("apiKey");
        String apiKey = ApiClient.LoadAPIKey(".//apiKey.txt");
        apiKeyAuth.setApiKey(apiKey);
        return new MorphologyApi(apc);
    }

    @Test
    public void testMorphologyExtractLemmaGet() throws ApiException, IOException {
        MorphologyApi api = MorphologyApi();

        String input = "This is a test";
        String lang = "en";
        MorphologyExtractLemmaResponse morphologyExtractLemmaResponse = api.nlpMorphologyExtractLemmaGet(input, null, lang, null, null);
        System.out.println(morphologyExtractLemmaResponse.toString());
    }

    @Test
    public void testMorphologyExtractLemmaGetWithInputFile() throws ApiException, IOException {
        MorphologyApi api = MorphologyApi();

        File inputFile = new File(".//src//test//java//net//systran//platform//nlp//client//morphology_input.txt");
        String lang = "en";
        MorphologyExtractLemmaResponse morphologyExtractLemmaResponse = api.nlpMorphologyExtractLemmaGet(null, inputFile, lang, null, null);
        System.out.println(morphologyExtractLemmaResponse.toString());
    }

    @Test
    public void testMorphologyExtractNpGet() throws ApiException, IOException {
        MorphologyApi api = MorphologyApi();

        String input = "This is a test";
        String lang = "en";
        MorphologyExtractNPResponse morphologyExtractNPResponse = api.nlpMorphologyExtractNpGet(input, null, lang, null, null);
        System.out.println(morphologyExtractNPResponse.toString());
    }

    @Test
    public void testMorphologyExtractNpGetWithInputFile() throws ApiException, IOException {
        MorphologyApi api = MorphologyApi();

        File inputFile = new File(".//src//test//java//net//systran//platform//nlp//client//morphology_input.txt");
        String lang = "en";
        MorphologyExtractNPResponse morphologyExtractNPResponse = api.nlpMorphologyExtractNpGet(null, inputFile, lang, null, null);
        System.out.println(morphologyExtractNPResponse.toString());
    }

    @Test
    public void testMorphologyExtractPosGet() throws ApiException, IOException {
        MorphologyApi api = MorphologyApi();

        String input = "This is a test";
        String lang = "en";
        MorphologyExtractPosResponse morphologyExtractPosResponse = api.nlpMorphologyExtractPosGet(input, null, lang, null, null);
        System.out.println(morphologyExtractPosResponse.toString());
    }

    @Test
    public void testMorphologyExtractPosGetWithInputFile() throws ApiException, IOException {
        MorphologyApi api = MorphologyApi();

        File inputFile = new File(".//src//test//java//net//systran//platform//nlp//client//morphology_input.txt");
        String lang = "en";
        MorphologyExtractPosResponse morphologyExtractPosResponse = api.nlpMorphologyExtractPosGet(null, inputFile, lang, null, null);
        System.out.println(morphologyExtractPosResponse.toString());
    }
}
