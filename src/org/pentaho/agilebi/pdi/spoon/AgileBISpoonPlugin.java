/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2009 Pentaho Corporation..  All rights reserved.
 */
package org.pentaho.agilebi.pdi.spoon;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.eclipse.swt.widgets.Composite;
import org.pentaho.agilebi.pdi.modeler.ModelerException;
import org.pentaho.agilebi.pdi.modeler.ModelerHelper;
import org.pentaho.agilebi.pdi.modeler.ModelerWorkspace;
import org.pentaho.agilebi.pdi.modeler.XulUI;
import org.pentaho.agilebi.pdi.perspective.AgileBiPerspective;
import org.pentaho.di.core.gui.SpoonFactory;
import org.pentaho.di.ui.spoon.Spoon;
import org.pentaho.di.ui.spoon.SpoonLifecycleListener;
import org.pentaho.di.ui.spoon.SpoonPerspective;
import org.pentaho.di.ui.spoon.SpoonPlugin;
import org.pentaho.ui.xul.XulOverlay;
import org.pentaho.ui.xul.impl.DefaultXulOverlay;
import org.pentaho.ui.xul.impl.XulEventHandler;

public class AgileBISpoonPlugin implements SpoonPlugin{

  public List<? extends XulEventHandler> getEventHandlers() {
    return Collections.singletonList(ModelerHelper.getInstance());
  }

  public List<XulOverlay> getOverlays() {
    XulOverlay overlay = new DefaultXulOverlay("agilebi", "org/pentaho/agilebi/pdi/spoon/overlays.xul", null, null); //$NON-NLS-1$  //$NON-NLS-2$
    return Collections.singletonList(overlay);
  }

  public SpoonLifecycleListener getLifecycleListener() {
    return null;
  }

  public SpoonPerspective getPerspective() {
    return AgileBiPerspective.getInstance();
  }
  
  
}
