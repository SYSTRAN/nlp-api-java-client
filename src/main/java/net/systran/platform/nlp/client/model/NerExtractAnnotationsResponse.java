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

import net.systran.platform.nlp.client.model.NerSegmentAnnotation;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response of a Ner ExtractAnnotations request
 **/
@ApiModel(description = "Response of a Ner ExtractAnnotations request")
public class NerExtractAnnotationsResponse  {
  
  private List<NerSegmentAnnotation> annotations = new ArrayList<NerSegmentAnnotation>() ;

  
  /**
   * Entities per text segment
   **/
  @ApiModelProperty(required = true, value = "Entities per text segment")
  @JsonProperty("annotations")
  public List<NerSegmentAnnotation> getAnnotations() {
    return annotations;
  }
  public void setAnnotations(List<NerSegmentAnnotation> annotations) {
    this.annotations = annotations;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NerExtractAnnotationsResponse {\n");
    
    sb.append("  annotations: ").append(annotations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
