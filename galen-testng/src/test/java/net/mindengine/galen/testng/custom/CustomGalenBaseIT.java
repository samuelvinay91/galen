/*******************************************************************************
* Copyright 2015 Ivan Shubin http://mindengine.net
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
******************************************************************************/
package net.mindengine.galen.testng.custom;

import net.mindengine.galen.api.GalenExecutor;
import net.mindengine.galen.api.Inject;
import net.mindengine.galen.testng.GalenListener;
import net.mindengine.galen.utils.TestDevice;

import org.testng.annotations.Listeners;

@Listeners(value = GalenListener.class)
public class CustomGalenBaseIT {

	@Inject(implementation = MyGalenExecutor.class)
    private GalenExecutor runner;

    public void checklayout(final String url, final String spec, final TestDevice testDevice) throws Exception {
        runner.checkLayout(testDevice, url, spec);
    }

}
