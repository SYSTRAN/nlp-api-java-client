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
import net.systran.platform.nlp.client.model.SegmentationSegmentResponse;
import net.systran.platform.nlp.client.model.SegmentationSegmentAndTokenizeResponse;
import net.systran.platform.nlp.client.model.SupportedLanguagesResponse;
import net.systran.platform.nlp.client.model.SegmentationTokenizeResponse;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.InputStream;
import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class SegmentationApi {
  private ApiClient apiClient;

  public SegmentationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SegmentationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Segment\n
   * Segment an input text.\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param lang Language code of the input ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return SegmentationSegmentResponse
   */
  public SegmentationSegmentResponse nlpSegmentationSegmentGet (File inputFile, String input, String lang, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling nlpSegmentationSegmentGet");
    }
    

    // create path and map variables
    String path = "/nlp/segmentation/segment".replaceAll("\\{format\\}","json");

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
        return (SegmentationSegmentResponse) apiClient.deserialize(response, "", SegmentationSegmentResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Segment and tokenize\n
   * Segment an input text, then tokenize each segment.\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param lang Language code of the input ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return SegmentationSegmentAndTokenizeResponse
   */
  public SegmentationSegmentAndTokenizeResponse nlpSegmentationSegmentAndTokenizeGet (File inputFile, String input, String lang, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling nlpSegmentationSegmentAndTokenizeGet");
    }
    

    // create path and map variables
    String path = "/nlp/segmentation/segmentAndTokenize".replaceAll("\\{format\\}","json");

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
        return (SegmentationSegmentAndTokenizeResponse) apiClient.deserialize(response, "", SegmentationSegmentAndTokenizeResponse.class); 
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
   * List of languages in which Segmentation is supported.
   * @param callback Javascript callback function name for JSONP Support\n
   * @return SupportedLanguagesResponse
   */
  public SupportedLanguagesResponse nlpSegmentationSupportedLanguagesGet (String callback) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/nlp/segmentation/supportedLanguages".replaceAll("\\{format\\}","json");

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
  
  /**
   * Tokenize\n
   * Tokenize an input text.\n
   * @param inputFile input text\n\n**Either `input` or `inputFile` is required**\n
   * @param input input text\n\n**Either `input` or `inputFile` is required**\n
   * @param lang Language code of the input ([details](#description_langage_code_values))
   * @param profile Profile id\n
   * @param callback Javascript callback function name for JSONP Support\n
   * @return SegmentationTokenizeResponse
   */
  public SegmentationTokenizeResponse nlpSegmentationTokenizeGet (File inputFile, String input, String lang, Integer profile, String callback) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'lang' is set
    if (lang == null) {
       throw new ApiException(400, "Missing the required parameter 'lang' when calling nlpSegmentationTokenizeGet");
    }
    

    // create path and map variables
    String path = "/nlp/segmentation/tokenize".replaceAll("\\{format\\}","json");

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
        return (SegmentationTokenizeResponse) apiClient.deserialize(response, "", SegmentationTokenizeResponse.class); 
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
