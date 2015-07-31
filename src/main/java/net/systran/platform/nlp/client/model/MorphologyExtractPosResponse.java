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
 * Response of a Part of speech extract request
 **/
@ApiModel(description = "Response of a Part of speech extract request")
public class MorphologyExtractPosResponse  {
  
  private List<PosAnnotation> partsOfSpeech = new ArrayList<PosAnnotation>() ;

  
  /**
   * Part of speech per text elements
   **/
  @ApiModelProperty(required = true, value = "Part of speech per text elements")
  @JsonProperty("partsOfSpeech")
  public List<PosAnnotation> getPartsOfSpeech() {
    return partsOfSpeech;
  }
  public void setPartsOfSpeech(List<PosAnnotation> partsOfSpeech) {
    this.partsOfSpeech = partsOfSpeech;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MorphologyExtractPosResponse {\n");
    
    sb.append("  partsOfSpeech: ").append(partsOfSpeech).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
