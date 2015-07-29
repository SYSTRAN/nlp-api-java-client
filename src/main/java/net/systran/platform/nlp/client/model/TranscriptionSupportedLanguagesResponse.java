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

package net.systran.platform.nlp.client.model;

import net.systran.platform.nlp.client.model.SupportedLanguagePair;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response of a Transcription Supported languages request
 **/
@ApiModel(description = "Response of a Transcription Supported languages request")
public class TranscriptionSupportedLanguagesResponse  {
  
  private List<SupportedLanguagePair> languagePairs = new ArrayList<SupportedLanguagePair>() ;

  
  /**
   * Array of supported languages pairs
   **/
  @ApiModelProperty(value = "Array of supported languages pairs")
  @JsonProperty("languagePairs")
  public List<SupportedLanguagePair> getLanguagePairs() {
    return languagePairs;
  }
  public void setLanguagePairs(List<SupportedLanguagePair> languagePairs) {
    this.languagePairs = languagePairs;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionSupportedLanguagesResponse {\n");
    
    sb.append("  languagePairs: ").append(languagePairs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
