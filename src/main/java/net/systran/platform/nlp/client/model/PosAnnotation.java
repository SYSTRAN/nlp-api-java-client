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

/**
 * Part of speech annotation
 **/
@ApiModel(description = "Part of speech annotation")
public class PosAnnotation  {
  
  private String text = null;
  private String pos = null;
  private Integer start = null;
  private Integer end = null;

  
  /**
   * Text
   **/
  @ApiModelProperty(required = true, value = "Text")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * Part of speech
   **/
  @ApiModelProperty(required = true, value = "Part of speech")
  @JsonProperty("pos")
  public String getPos() {
    return pos;
  }
  public void setPos(String pos) {
    this.pos = pos;
  }

  
  /**
   * Start offset
   **/
  @ApiModelProperty(required = true, value = "Start offset")
  @JsonProperty("start")
  public Integer getStart() {
    return start;
  }
  public void setStart(Integer start) {
    this.start = start;
  }

  
  /**
   * End offset
   **/
  @ApiModelProperty(required = true, value = "End offset")
  @JsonProperty("end")
  public Integer getEnd() {
    return end;
  }
  public void setEnd(Integer end) {
    this.end = end;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PosAnnotation {\n");
    
    sb.append("  text: ").append(text).append("\n");
    sb.append("  pos: ").append(pos).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
