/**
 *  Copyright (c) 2009-2011 Misys Open Source Solutions (MOSS) and others
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 *  Contributors:
 *    Misys Open Source Solutions - initial API and implementation
 *    -
 */

package org.openhealthtools.openexchange.config;

import org.springframework.context.ApplicationContext;

/**
 * This interface defines the method such as getApplicationContext
 * related to the given spring configuration. 
 * 
 * @author <a href="mailto:wenzhi.li@misys.com">Wenzhi Li</a>
 * @see PropertyConfig
 */
public interface SpringConfig {

    /**
     * Gets the application context.
     * 
     * @return the application context
     */
	public ApplicationContext getApplicationContext();
}
