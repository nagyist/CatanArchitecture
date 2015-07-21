/*
 * Copyright (C) 2015 Pablo Guardiola Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pguardiola.catanarchitecture.data;

import com.pguardiola.catanarchitecture.hexagon.DataPort;
import com.pguardiola.catanarchitecture.hexagon.FooItem;
import java.util.ArrayList;
import java.util.List;

public class InMemoryDataAdapter implements DataPort {
  List<FooItem> items = new ArrayList<FooItem>();

  @Override public List<FooItem> obtainItems() {
    return items;
  }

  @Override public void addItem(FooItem item) {
    items.add(item);
  }
}
