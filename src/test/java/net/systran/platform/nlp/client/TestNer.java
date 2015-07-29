package net.systran.platform.nlp.client;

import net.systran.platform.nlp.client.api.NerApi;
import net.systran.platform.nlp.client.model.*;
import org.junit.Test;

import java.io.File;

public class TestNer {
    public static NerApi getNerApi() {
        NerApi api = new NerApi();
        // Replace xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx by your API_KEY
        api.getApiClient().setApiKey("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
        return api;
    }

    @Test
    public void testNerExtractEntity() throws ApiException {
        NerApi api = getNerApi();

        String lang = "en";
        String input = "Bodies from the MH17 crash are being kept on this train, as Natalia Antelava reports\n" +
                "Pro-Russian rebels have allowed Dutch investigators to examine bodies from the crashed Malaysia Airlines plane at a railway station in eastern Ukraine.\n" +
                "The three Dutch experts said the train might leave the town of Torez later.\n" +
                "All 298 people on board flight MH17 died when it crashed over the rebel-held area on 17 July. The US and other nations say there is growing evidence of Russian complicity in the crash.";

        NerExtractEntitiesResponse extractEntitiesResponse = api.nlpNerExtractEntitiesGet(null, input, lang, null, null);
        for (NerEntity entity : extractEntitiesResponse.getEntities()) {
            System.out.println("Entity " + entity.getType() + " - " + entity.getValue());
        }
    }

    @Test
    public void testNerExtractEntityWithInputFile() throws ApiException {
        NerApi api = getNerApi();

        String lang = "en";
        File inputFile = new File(".//src//test//java//net//systran//platform//nlp//client//ner_extraction.txt");

        NerExtractEntitiesResponse extractEntitiesResponse = api.nlpNerExtractEntitiesGet(inputFile, null, lang, null, null);
        for (NerEntity entity : extractEntitiesResponse.getEntities()) {
            System.out.println("Entity " + entity.getType() + " - " + entity.getValue());
        }
    }

    @Test
    public void testNerExtractAnnotation() throws ApiException {
        NerApi api = getNerApi();

        String lang = "en";
        String input = "Bodies from the MH17 crash are being kept on this train, as Natalia Antelava reports\n" +
                "Pro-Russian rebels have allowed Dutch investigators to examine bodies from the crashed Malaysia Airlines plane at a railway station in eastern Ukraine.\n" +
                "The three Dutch experts said the train might leave the town of Torez later.\n" +
                "All 298 people on board flight MH17 died when it crashed over the rebel-held area on 17 July. The US and other nations say there is growing evidence of Russian complicity in the crash.";

        NerExtractAnnotationsResponse extractAnnotationsResponse = api.nlpNerExtractAnnotationsGet(null, input, lang, null, null);
        for (NerSegmentAnnotation segmentAnnotation : extractAnnotationsResponse.getAnnotations()) {
            for (NerEntityAnnotation entityAnnotation : segmentAnnotation.getEntities()) {
                System.out.println("Entity " + entityAnnotation.toString());
            }
        }
    }

    @Test
    public void testNerExtractAnnotationWithInputFile() throws ApiException {
        NerApi api = getNerApi();

        String lang = "en";
        File inputFile = new File(".//src//test//java//net//systran//platform//nlp//client//ner_extraction.txt");

        NerExtractAnnotationsResponse extractAnnotationsResponse = api.nlpNerExtractAnnotationsGet(inputFile, null, lang, null, null);
        for (NerSegmentAnnotation segmentAnnotation : extractAnnotationsResponse.getAnnotations()) {
            for (NerEntityAnnotation entityAnnotation : segmentAnnotation.getEntities()) {
                System.out.println("Entity " + entityAnnotation.toString());
            }
        }
    }
}
