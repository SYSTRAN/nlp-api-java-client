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
 * Profile
 **/
@ApiModel(description = "Profile")
public class Profile  {
  
  private String id = null;
  private Boolean _private = null;

  
  /**
   * Profile identifier
   **/
  @ApiModelProperty(required = true, value = "Profile identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Public or private profile
   **/
  @ApiModelProperty(required = true, value = "Public or private profile")
  @JsonProperty("private")
  public Boolean getPrivate() {
    return _private;
  }
  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _private: ").append(_private).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
