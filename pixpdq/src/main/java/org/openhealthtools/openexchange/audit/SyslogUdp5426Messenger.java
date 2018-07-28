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

package org.openhealthtools.openexchange.audit;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * Sends the message to Syslog UDP logger (RFC 5426).
 * 
 * You will need to do something to keep this thread safe.  The
 * simple solution (and the one currently implemented) is to 
 * generate a new instance of this class every time you make
 * a new message.  That is how it currently works.  Otherwise
 * the IheAuditTrail will have to do a bunch more work
 * to keep the single instance synchronized.  (Not to mention
 * that there might be different audit servers used by different
 * actors.)
 *
 * @author Wenzhi Li
 */
class SyslogUdp5426Messenger implements IMessageTransmitter {
	private static final int FACILITY = 10; // CP ATNA_157, using value of 10(security/authorization messages) 
	private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"); //Syslog date format.

	private Severity defaultSeverity = Severity.Notice;

	private InetAddress address = null;
	private int port = 514;
	private String localHostName;
	private String messageHostName;
	private String applicationName;
	
	private AuditTrailDescription desc;

	/** 
	 * Use to create a "connection" to a UDP Syslog audit repository.
	 * 
	 * Note that UDP syslog RFC 5426 uses UDP not TCP, so it isn't really
	 * a "connection" and as such this is thread safe if all 
	 * the threads use the same connection info and default 
	 * severity.
	 * 
	 * @param description All the info needed to connect to the audit repository.
	 */
	public SyslogUdp5426Messenger(AuditTrailDescription description) {
		try {
			messageHostName = description.getHost();
			localHostName = description.getName();
			applicationName = description.getApplicationName();
			address = InetAddress.getByName(messageHostName);
			port = description.getPort();
			desc = description;
		} catch (UnknownHostException e) {
			IheAuditTrail.log.error("Problem resolving host name for UDP logging ATNA messeger.", e);
		}
	}
	
	/** 
	 * Sends UDP syslog message using the default facility and level. 
	 */
	public void sendMessage(String message) {
		sendMessage(message, defaultSeverity);
	}

	/** 
	 * Sends UDP message using a given facility and level. 
	 */
	public void sendMessage(String message, Severity severity) {
		Date now = new Date();
		int PRI = (FACILITY * 8) + severity.value();
		//byte[] utf8_bom = "\uFEFF".getBytes("UTF-8");
		
		//strip away xml header
		String xmlheader = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n";
		message = message.substring(xmlheader.length());

		String SyslogVersion = "1";
		String bom = "\uFEFF";
		
        String date = formatter.format(now);
        // Append colon to timezone info (required for RFC 5424)
        date = date.substring(0, date.length() - 2) + ":" + date.substring(date.length() - 2);
        
        StringBuffer sb = new StringBuffer();
        sb.append("<");
        sb.append(PRI);
        sb.append(">");
        sb.append(SyslogVersion);
        sb.append(" ");
        sb.append(date);
        sb.append(" ");
        sb.append(localHostName);
        sb.append(" ");
        sb.append(applicationName);
        sb.append(" - IHE+RFC-3881 - "); // PROCID, MSGID, Structured-Data
        //ITI-CP477 discourages to use bom for UTF-8 encoding
        //sb.append(bom);
        sb.append(message);
        String completeMessage = sb.toString(); 
        
        try {
			byte[] messageBytes = completeMessage.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(messageBytes, messageBytes.length, address, port);
			DatagramSocket socket = new DatagramSocket();
			socket.send(packet);
			socket.close();
		} catch (Exception e) {
			IheAuditTrail.log.error("Problem sending UDP syslog message.", e);
		}
	}


	/** 
	 * Sets the severity to be used for non specific messages. 
	 */
	public void setDefaultSeverity(Severity severity) {
		defaultSeverity = severity;
	}

	/**
	 * Gets the audit trail description
	 */
	public AuditTrailDescription getAuditTrailDescription() {
		return desc;
	}

	/**
	 * Transmits the messages over the wires to the audit record repository specified 
	 * by the audit trail description.
	 * 
	 * @param messages the messages to transmit
	 */
	public void transmitMessages(String[] messages) {
		throw new UnsupportedOperationException("transmitMessages is not supported for syslog UDP currently");
	}

}