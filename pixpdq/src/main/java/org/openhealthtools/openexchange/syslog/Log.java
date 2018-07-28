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

package org.openhealthtools.openexchange.syslog;


/**
*
* @author <a href="mailto:venkata.pragallapati@misys.com">Venkat</a>
* 
*/

public interface Log {

	public LogMessage createMessage(String ipAddress) throws LoggerException;

	public LogMessage createMessage() throws LoggerException;

	public void logMessage(LogMessage m) throws LoggerException;

	public void writeMessage(LogMessage m) throws LoggerException;

	public void deleteMessage(LogMessage m) throws LoggerException;

	public void deleteMessage(String messageID) throws LoggerException;

	public Message readMessage(String messageID) throws LoggerException;
	
	public void writeIp(CompanyDetails cd) throws LoggerException;
		
}
