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

import java.io.File;
import net.systran.platform.nlp.client.model.NerExtractAnnotationsResponse;
import net.systran.platform.nlp.client.model.NerExtractEntitiesResponse;
import net.systran.platform.nlp.client.model.SupportedLanguagesResponse;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class NerApi {
  private ApiClient apiClient;

  public NerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public NerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get entity annotations\n
   * Get the list of entity annotations given an input text.\nAn entity annotation is an entity associated with its position in the text.\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param lang Language code of the input ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return NerExtractAnnotationsResponse
   */
  public NerExtractAnnotationsResponse nlpNerExtractAnnotationsGet (File inputFile, String input, String lang, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling nlpNerExtractAnnotationsGet");
    }
    

    // create path and map variables
    String path = "/nlp/ner/extract/annotations".replaceAll("\\{format\\}","json");

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
      "application/json"
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
        return (NerExtractAnnotationsResponse) apiClient.deserialize(response, "", NerExtractAnnotationsResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get list of entities\n
   * Get the list of different entities given an input text.\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param lang Language code of the input ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return NerExtractEntitiesResponse
   */
  public NerExtractEntitiesResponse nlpNerExtractEntitiesGet (File inputFile, String input, String lang, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling nlpNerExtractEntitiesGet");
    }
    

    // create path and map variables
    String path = "/nlp/ner/extract/entities".replaceAll("\\{format\\}","json");

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
      "application/json"
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
        return (NerExtractEntitiesResponse) apiClient.deserialize(response, "", NerExtractEntitiesResponse.class); 
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
   * List of languages in which NER is supported.
   * @param callback Javascript callback function name for JSONP Support\n
   * @return SupportedLanguagesResponse
   */
  public SupportedLanguagesResponse nlpNerSupportedLanguagesGet (String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/nlp/ner/supportedLanguages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (callback != null)
      queryParams.put("callback", apiClient.parameterToString(callback));
    

    

    final String[] accepts = {
      "application/json"
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
