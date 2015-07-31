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
 * Response of a Noun-Phrase/Chunk extract request
 **/
@ApiModel(description = "Response of a Noun-Phrase/Chunk extract request")
public class MorphologyExtractNPResponse  {
  
  private List<ChunkAnnotation> chunks = new ArrayList<ChunkAnnotation>() ;

  
  /**
   * List of extracted chunks
   **/
  @ApiModelProperty(required = true, value = "List of extracted chunks")
  @JsonProperty("chunks")
  public List<ChunkAnnotation> getChunks() {
    return chunks;
  }
  public void setChunks(List<ChunkAnnotation> chunks) {
    this.chunks = chunks;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MorphologyExtractNPResponse {\n");
    
    sb.append("  chunks: ").append(chunks).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
