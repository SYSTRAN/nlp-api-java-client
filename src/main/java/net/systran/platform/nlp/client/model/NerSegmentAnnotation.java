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

import net.systran.platform.nlp.client.model.NerEntityAnnotation;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entity annotations for one segment
 **/
@ApiModel(description = "Entity annotations for one segment")
public class NerSegmentAnnotation  {
  
  private String source = null;
  private List<NerEntityAnnotation> entities = new ArrayList<NerEntityAnnotation>() ;

  
  /**
   * Text segment
   **/
  @ApiModelProperty(required = true, value = "Text segment")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Array of found entities
   **/
  @ApiModelProperty(required = true, value = "Array of found entities")
  @JsonProperty("entities")
  public List<NerEntityAnnotation> getEntities() {
    return entities;
  }
  public void setEntities(List<NerEntityAnnotation> entities) {
    this.entities = entities;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NerSegmentAnnotation {\n");
    
    sb.append("  source: ").append(source).append("\n");
    sb.append("  entities: ").append(entities).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
