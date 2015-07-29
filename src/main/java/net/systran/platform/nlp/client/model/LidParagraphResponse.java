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

import net.systran.platform.nlp.client.model.LidParagraph;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response of a Lid Paragraph request
 **/
@ApiModel(description = "Response of a Lid Paragraph request")
public class LidParagraphResponse  {
  
  private List<LidParagraph> paragraphs = new ArrayList<LidParagraph>() ;

  
  /**
   * Array of paragraphs
   **/
  @ApiModelProperty(value = "Array of paragraphs")
  @JsonProperty("paragraphs")
  public List<LidParagraph> getParagraphs() {
    return paragraphs;
  }
  public void setParagraphs(List<LidParagraph> paragraphs) {
    this.paragraphs = paragraphs;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LidParagraphResponse {\n");
    
    sb.append("  paragraphs: ").append(paragraphs).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
