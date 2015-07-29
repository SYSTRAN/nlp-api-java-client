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

import java.util.*;
import net.systran.platform.nlp.client.model.SupportedLanguage;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response of a Supported languages request
 **/
@ApiModel(description = "Response of a Supported languages request")
public class SupportedLanguagesResponse  {
  
  private List<SupportedLanguage> languages = new ArrayList<SupportedLanguage>() ;

  
  /**
   * Array of supported languages
   **/
  @ApiModelProperty(required = true, value = "Array of supported languages")
  @JsonProperty("languages")
  public List<SupportedLanguage> getLanguages() {
    return languages;
  }
  public void setLanguages(List<SupportedLanguage> languages) {
    this.languages = languages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedLanguagesResponse {\n");
    
    sb.append("  languages: ").append(languages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
