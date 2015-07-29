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

import net.systran.platform.nlp.client.model.LidDetectedLanguage;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Paragraph
 **/
@ApiModel(description = "Paragraph")
public class LidParagraph  {
  
  private List<LidDetectedLanguage> detectedLanguages = new ArrayList<LidDetectedLanguage>() ;
  private String source = null;

  
  /**
   * Array of detected languages
   **/
  @ApiModelProperty(required = true, value = "Array of detected languages")
  @JsonProperty("detectedLanguages")
  public List<LidDetectedLanguage> getDetectedLanguages() {
    return detectedLanguages;
  }
  public void setDetectedLanguages(List<LidDetectedLanguage> detectedLanguages) {
    this.detectedLanguages = detectedLanguages;
  }

  
  /**
   * Paragraph text
   **/
  @ApiModelProperty(required = true, value = "Paragraph text")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LidParagraph {\n");
    
    sb.append("  detectedLanguages: ").append(detectedLanguages).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
