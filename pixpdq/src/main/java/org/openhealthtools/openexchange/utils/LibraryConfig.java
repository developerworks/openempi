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

package org.openhealthtools.openexchange.utils;


/**
 * Configure the connection library with necessary elements
 *
 * @author Josh Flachsbart
 * @version 2.0, Mar 13, 2007
 *
 */
public class LibraryConfig {
	static LibraryConfig lc;
	
	private ILogContext logContext;

	
	public static synchronized LibraryConfig getInstance() {
		if (lc == null) {
			lc = new LibraryConfig();
		}
		return lc;
	}

	/**
	 * Get the LogContext to be used for auditing
	 * @return logContext the LogContext
	 */
	public ILogContext getLogContext() {
		return logContext;
	}
	
	/**
	 * Set the LogContext to be used for auditing
	 * @param logContext the LogContext
	 */
	public void setLogContext(ILogContext logContext) {
		this.logContext = logContext;
	}

	
	public interface ILogContext {
		String getUserId();
		String getClientAddress();
		String getUserSystem();
		String getUserName();
	}

}
