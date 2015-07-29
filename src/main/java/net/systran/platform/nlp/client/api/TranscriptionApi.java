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

import net.systran.platform.nlp.client.ApiException;
import net.systran.platform.nlp.client.ApiClient;
import net.systran.platform.nlp.client.Configuration;

import net.systran.platform.nlp.client.model.*;

import java.util.*;

import net.systran.platform.nlp.client.model.TranscriptionSupportedLanguagesResponse;
import java.io.File;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class TranscriptionApi {
  private ApiClient apiClient;

  public TranscriptionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TranscriptionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Supported Languages
   * List of languages pairs in which Transcription is supported. This list can be limited to a specific source language or target language.
   * @param source Source Language code ([details](#description_langage_code_values))
   * @param target Target Language code ([details](#description_langage_code_values))
   * @param callback Javascript callback function name for JSONP Support\n
   * @return TranscriptionSupportedLanguagesResponse
   */
  public TranscriptionSupportedLanguagesResponse nlpTranscriptionSupportedLanguagesGet (String source, String target, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/nlp/transcription/supportedLanguages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
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
        return (TranscriptionSupportedLanguagesResponse) apiClient.deserialize(response, "", TranscriptionSupportedLanguagesResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Transcribe
   * Transcribe text from a source language to a target language.\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param source Source Language code ([details](#description_langage_code_values))
   * @param target Target Language code ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return InputStream
   */
  public InputStream nlpTranscriptionTranscribeGet (File inputFile, String input, String source, String target, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'source' is set
    if (source == null) {
       throw new ApiException(400, "Missing the required parameter 'source' when calling nlpTranscriptionTranscribeGet");
    }
    
    // verify the required parameter 'target' is set
    if (target == null) {
       throw new ApiException(400, "Missing the required parameter 'target' when calling nlpTranscriptionTranscribeGet");
    }
    

    // create path and map variables
    String path = "/nlp/transcription/transcribe".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
    if (source != null)
      queryParams.put("source", apiClient.parameterToString(source));
    if (target != null)
      queryParams.put("target", apiClient.parameterToString(target));
    if (profile != null)
      queryParams.put("profile", apiClient.parameterToString(profile));
    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "text/plain"
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
        return (InputStream) apiClient.deserialize(response, "", InputStream.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
