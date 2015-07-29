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
 * Entity annotation
 **/
@ApiModel(description = "Entity annotation")
public class NerEntityAnnotation  {
  
  private Integer start = null;
  private Integer end = null;
  private String type = null;

  
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

  
  /**
   * Entity type
   **/
  @ApiModelProperty(required = true, value = "Entity type")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NerEntityAnnotation {\n");
    
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
