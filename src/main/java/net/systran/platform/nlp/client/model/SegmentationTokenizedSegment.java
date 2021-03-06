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

import net.systran.platform.nlp.client.model.SegmentationToken;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Segment with tokenized content
 **/
@ApiModel(description = "Segment with tokenized content")
public class SegmentationTokenizedSegment  {
  
  private String source = null;
  private List<SegmentationToken> tokens = new ArrayList<SegmentationToken>() ;

  
  /**
   * Segment
   **/
  @ApiModelProperty(required = true, value = "Segment")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Array of tokens
   **/
  @ApiModelProperty(required = true, value = "Array of tokens")
  @JsonProperty("tokens")
  public List<SegmentationToken> getTokens() {
    return tokens;
  }
  public void setTokens(List<SegmentationToken> tokens) {
    this.tokens = tokens;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentationTokenizedSegment {\n");
    
    sb.append("  source: ").append(source).append("\n");
    sb.append("  tokens: ").append(tokens).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
