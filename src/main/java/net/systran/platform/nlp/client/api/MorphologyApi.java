/*
 * Copyright © 2015 SYSTRAN Software, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.systran.platform.nlp.client.api;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;
import net.systran.platform.nlp.client.ApiClient;
import net.systran.platform.nlp.client.ApiException;
import net.systran.platform.nlp.client.Configuration;
import net.systran.platform.nlp.client.model.MorphologyExtractLemmaResponse;
import net.systran.platform.nlp.client.model.MorphologyExtractNPResponse;
import net.systran.platform.nlp.client.model.MorphologyExtractPosResponse;
import net.systran.platform.nlp.client.model.SupportedLanguagesResponse;

import javax.ws.rs.core.MediaType;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MorphologyApi {
  private ApiClient apiClient;

  public MorphologyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MorphologyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get lemma
   * Get the lemma for elements of an input text.\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param lang Language code of the input ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return MorphologyExtractLemmaResponse
   */
  public MorphologyExtractLemmaResponse nlpMorphologyExtractLemmaGet (String input, File inputFile, String lang, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling nlpMorphologyExtractLemmaGet");
    }
    

    // create path and map variables
    String path = "/nlp/morphology/extract/lemma".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
    if (lang != null)
      queryParams.put("lang", apiClient.parameterToString(lang));
    if (profile != null)
      queryParams.put("profile", apiClient.parameterToString(profile));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "multipart/form-data", "application/x-www-form-urlencoded", "*/*"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if (inputFile != null) {
        hasFields = true;
        mp.field("inputFile", inputFile.getName());
        mp.bodyPart(new FileDataBodyPart("inputFile", inputFile, MediaType.MULTIPART_FORM_DATA_TYPE));
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (MorphologyExtractLemmaResponse) apiClient.deserialize(response, "", MorphologyExtractLemmaResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get NP/chunks
   * Get Noun-phrases and chunks from an input text.\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param lang Language code of the input ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return MorphologyExtractNPResponse
   */
  public MorphologyExtractNPResponse nlpMorphologyExtractNpGet (String input, File inputFile, String lang, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling nlpMorphologyExtractNpGet");
    }
    

    // create path and map variables
    String path = "/nlp/morphology/extract/np".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
    if (lang != null)
      queryParams.put("lang", apiClient.parameterToString(lang));
    if (profile != null)
      queryParams.put("profile", apiClient.parameterToString(profile));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "multipart/form-data", "application/x-www-form-urlencoded", "*/*"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if (inputFile != null) {
        hasFields = true;
        mp.field("inputFile", inputFile.getName());
        mp.bodyPart(new FileDataBodyPart("inputFile", inputFile, MediaType.MULTIPART_FORM_DATA_TYPE));
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (MorphologyExtractNPResponse) apiClient.deserialize(response, "", MorphologyExtractNPResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get part of speech
   * Get the part of speech for elements of an input text.\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param lang Language code of the input ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return MorphologyExtractPosResponse
   */
  public MorphologyExtractPosResponse nlpMorphologyExtractPosGet (String input, File inputFile, String lang, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling nlpMorphologyExtractPosGet");
    }
    

    // create path and map variables
    String path = "/nlp/morphology/extract/pos".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
    if (lang != null)
      queryParams.put("lang", apiClient.parameterToString(lang));
    if (profile != null)
      queryParams.put("profile", apiClient.parameterToString(profile));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "multipart/form-data", "application/x-www-form-urlencoded", "*/*"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if (inputFile != null) {
        hasFields = true;
        mp.field("inputFile", inputFile.getName());
        mp.bodyPart(new FileDataBodyPart("inputFile", inputFile, MediaType.MULTIPART_FORM_DATA_TYPE));
      }
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (MorphologyExtractPosResponse) apiClient.deserialize(response, "", MorphologyExtractPosResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Supported Languages
   * List of languages pairs in which Morphological analysis is supported.
   * @param callback Javascript callback function name for JSONP Support\n
   * @return SupportedLanguagesResponse
   */
  public SupportedLanguagesResponse nlpMorphologySupportedLanguagesGet (String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/nlp/morphology/supportedLanguages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String[] authNames = new String[] { "accessToken", "apiKey" };
      ClientResponse response = apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames);
      if(response != null){ 
        return (SupportedLanguagesResponse) apiClient.deserialize(response, "", SupportedLanguagesResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
