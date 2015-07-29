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

import net.systran.platform.nlp.client.model.Profile;
import java.util.*;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Supported language pair
 **/
@ApiModel(description = "Supported language pair")
public class SupportedLanguagePair  {
  
  private String source = null;
  private String target = null;
  private List<Profile> profiles = new ArrayList<Profile>() ;

  
  /**
   * Source language code
   **/
  @ApiModelProperty(required = true, value = "Source language code")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * Target language code
   **/
  @ApiModelProperty(required = true, value = "Target language code")
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   * Array of profiles
   **/
  @ApiModelProperty(required = true, value = "Array of profiles")
  @JsonProperty("profiles")
  public List<Profile> getProfiles() {
    return profiles;
  }
  public void setProfiles(List<Profile> profiles) {
    this.profiles = profiles;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportedLanguagePair {\n");
    
    sb.append("  source: ").append(source).append("\n");
    sb.append("  target: ").append(target).append("\n");
    sb.append("  profiles: ").append(profiles).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
