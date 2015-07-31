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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Response of a Lemma extract request
 **/
@ApiModel(description = "Response of a Lemma extract request")
public class MorphologyExtractLemmaResponse  {
  
  private List<LemmaAnnotation> lemmas = new ArrayList<LemmaAnnotation>() ;

  
  /**
   * Lemma text elements
   **/
  @ApiModelProperty(required = true, value = "Lemma text elements")
  @JsonProperty("lemmas")
  public List<LemmaAnnotation> getLemmas() {
    return lemmas;
  }
  public void setLemmas(List<LemmaAnnotation> lemmas) {
    this.lemmas = lemmas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MorphologyExtractLemmaResponse {\n");
    
    sb.append("  lemmas: ").append(lemmas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
