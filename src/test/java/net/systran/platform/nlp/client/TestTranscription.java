package net.systran.platform.nlp.client;


import net.systran.platform.nlp.client.api.TranscriptionApi;
import net.systran.platform.nlp.client.model.TranscriptionSupportedLanguagesResponse;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class TestTranscription {
    public static TranscriptionApi getTranscriptionApi() {
        TranscriptionApi api = new TranscriptionApi();
        // Replace xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx by your API_KEY
        api.getApiClient().setApiKey("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
        return api;
    }

    @Test
    public void testTranscriptionSupportedLanguages() throws ApiException {
        TranscriptionApi api = getTranscriptionApi();
        TranscriptionSupportedLanguagesResponse transcriptionSupportedLanguages = api.nlpTranscriptionSupportedLanguagesGet(null, null, null);
        System.out.println(transcriptionSupportedLanguages.toString());
    }

    @Test
    public void testTranscriptionTranscribe() throws ApiException, IOException {
        TranscriptionApi api = getTranscriptionApi();
        String input = "Storks are large, long-legged, long-necked wading birds with long, stout bills.";
        String source = "en";
        String target = "ru";
        InputStream in = api.nlpTranscriptionTranscribeGet(null, input, source, target, null, null);
        File out = new File (".//src//test//java//net//systran//platform//nlp//client//transcribe_output.txt");
        FileUtils.copyInputStreamToFile(in, out);
    }

    @Test
    public void testTranscriptionTranscribeWithInputFile() throws ApiException, IOException {
        TranscriptionApi api = getTranscriptionApi();
        String source = "en";
        String target = "ru";
        File inputFile = new File (".//src//test//java//net//systran//platform//nlp//client//transcribe_input.txt");
        InputStream in = api.nlpTranscriptionTranscribeGet(inputFile, null, source, target, null, null);
        File out = new File (".//src//test//java//net//systran//platform//nlp//client//transcribe_output.txt");
        FileUtils.copyInputStreamToFile(in, out);
    }
}
