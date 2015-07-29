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


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Detected Language
 **/
@ApiModel(description = "Detected Language")
public class LidDetectedLanguage  {
  
  private String lang = null;
  private Double confidence = null;

  
  /**
   * Language
   **/
  @ApiModelProperty(required = true, value = "Language")
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }
  public void setLang(String lang) {
    this.lang = lang;
  }

  
  /**
   * Confidence
   **/
  @ApiModelProperty(required = true, value = "Confidence")
  @JsonProperty("confidence")
  public Double getConfidence() {
    return confidence;
  }
  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LidDetectedLanguage {\n");
    
    sb.append("  lang: ").append(lang).append("\n");
    sb.append("  confidence: ").append(confidence).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
