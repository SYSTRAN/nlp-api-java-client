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

package net.systran.platform.nlp.client;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.core.JsonGenerator.Feature;

import com.fasterxml.jackson.datatype.joda.*;

public class JsonUtil {
  public static ObjectMapper mapper;

  static {
  	mapper = new ObjectMapper();
	  mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	  mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	  mapper.registerModule(new JodaModule());
	}

	public static ObjectMapper getJsonMapper() {
		return mapper;
	}
}
