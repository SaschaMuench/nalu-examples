/*
 * Copyright (c) 2018 - 2019 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 *
 */

package com.github.nalukit.example.nalu.simpleapplication.client.ui.blocks.controlled;

import com.github.nalukit.example.nalu.simpleapplication.client.NaluSimpleApplicationContext;
import com.github.nalukit.nalu.client.component.AbstractBlockComponentController;
import com.github.nalukit.nalu.client.component.annotation.BlockController;

@BlockController(name = "controlledBlock",
                 componentInterface = IControlledBlockComponent.class,
                 component = ControlledBlockComponent.class)
public class ControlledBlockController
    extends AbstractBlockComponentController<NaluSimpleApplicationContext, IControlledBlockComponent>
    implements IControlledBlockComponent.Controller {

  public ControlledBlockController() {
  }

}
