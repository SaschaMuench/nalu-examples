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

package com.github.nalukit.example.nalu.simpleapplication.client.ui.application.shell;

import com.github.nalukit.example.nalu.simpleapplication.client.NaluSimpleApplicationContext;
import com.github.nalukit.nalu.client.component.AbstractShell;
import com.github.nalukit.nalu.client.component.annotation.Shell;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.layout.Layout;
import org.dominokit.domino.ui.mediaquery.MediaQuery;
import org.dominokit.domino.ui.style.ColorScheme;

/**
 * this is the presenter of the shellCreator. The shellCreator divides the browser in
 * severeal areas.
 */
@Shell("application")
public class ApplicationShell
    extends AbstractShell<NaluSimpleApplicationContext> {

  private Layout layout;

  public ApplicationShell() {
  }

  @Override
  public void detachShell() {
    layout.remove();
  }

  /**
   * The ShellPresenter has to implemented this method, because the framework
   * can not do this. (It does not know, what to use).
   * <p>
   * We append the ShellView to the browser body.
   */
  @Override
  public void attachShell() {
    layout = Layout.create("Nalu - Simple Application using Domino-UI")
                          .show(ColorScheme.INDIGO);

    layout.showFooter()
          .fixFooter()
          .getFooter()
          .setId("footer")
          .style()
          .setMinHeight("42px");

    layout.getLeftPanel()
          .setId("navigation");
    layout.getContentPanel()
          .appendChild(Row.create()
                          .appendChild(Column.span8()
                                             .offset2()
                                             .setId("content")));

    MediaQuery.addOnMediumAndDownListener(layout::unfixLeftPanelPosition);
    MediaQuery.addOnLargeAndUpListener(layout::fixLeftPanelPosition);
  }

}
