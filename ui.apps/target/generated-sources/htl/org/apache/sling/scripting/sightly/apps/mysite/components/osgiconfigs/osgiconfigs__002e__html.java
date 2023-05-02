/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.mysite.components.osgiconfigs;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class osgiconfigs__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_osgiconfigs = null;
out.write("<h3> OSGI Configs component </h3>\n\n");
_global_osgiconfigs = renderContext.call("use", com.mysite.core.models.OSGIconfig.class.getName(), obj());
out.write("\n\n<div>");
{
    String var_0 = (" Service Name: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_osgiconfigs, "serviceName"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\n\n<div>");
{
    String var_1 = (" Service Count: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_osgiconfigs, "serviceCount"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</div>\n\n<div>");
{
    String var_2 = (" Is Live data: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_osgiconfigs, "isLiveData"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</div>\n\n<div>");
{
    String var_3 = (" Run Modes: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_osgiconfigs, "runModes"), "text")));
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

