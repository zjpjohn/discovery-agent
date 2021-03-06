/**
 *
 * Copyright (C) 2015 Totango , Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.totango.discoveryagent;

import java.net.URL;

import com.google.common.base.Charsets;
import com.google.common.io.CharSource;
import com.google.common.io.Resources;

public class ResourceLoader {

  public static String load(String resourceName) {
    try {
      URL healthJsonURI = Resources.getResource(resourceName);
      CharSource healthJsonSource = Resources.asCharSource(healthJsonURI, Charsets.UTF_8);
      return healthJsonSource.read();
    } catch (Throwable t) {
      throw new RuntimeException(t);
    }
  }
}
