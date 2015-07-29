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

import net.systran.platform.nlp.client.model.LidDocumentResponse;
import java.io.File;
import net.systran.platform.nlp.client.model.LidParagraphResponse;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class LidApi {
  private ApiClient apiClient;

  public LidApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LidApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Document language detection\n
   * Global language detection on document.\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return LidDocumentResponse
   */
  public LidDocumentResponse nlpLidDetectLanguageDocumentGet (File inputFile, String input, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/nlp/lid/detectLanguage/document".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
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
        return (LidDocumentResponse) apiClient.deserialize(response, "", LidDocumentResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Paragraph language detection\n
   * Language detection for each paragraph in a document.\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return LidParagraphResponse
   */
  public LidParagraphResponse nlpLidDetectLanguageParagraphGet (File inputFile, String input, String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/nlp/lid/detectLanguage/paragraph".replaceAll("\\{format\\}","json");

    // query params
    Map<String, Object> queryParams = new HashMap<String, Object>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (input != null)
      queryParams.put("input", apiClient.parameterToString(input));
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
        return (LidParagraphResponse) apiClient.deserialize(response, "", LidParagraphResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
