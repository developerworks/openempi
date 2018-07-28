/**
 *
 * Copyright (C) 2002-2012 "SYSNET International, Inc."
 * support@sysnetint.com [http://www.sysnetint.com]
 *
 * This file is part of OpenEMPI.
 *
 * OpenEMPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openhie.openempi.openpixpdqadapter;

import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v25.group.RSP_K21_QUERY_RESPONSE;
import ca.uhn.hl7v2.model.v25.message.RSP_K21;
import ca.uhn.hl7v2.model.v25.segment.MSA;
import ca.uhn.hl7v2.model.v25.segment.PID;
import ca.uhn.hl7v2.model.v25.segment.QAK;

public class PdqMesa11315TestCase extends AbstractPdqTest
{
	/**
		Description
		Test case 11315 covers a partial name search by the Patient Demographics Consumer.
		Several add new patient messages are sent to the Patient Demographics Supplier. Then, 
		the PD Consumer sends a PDQ Query that includes a partial patient name.

		Instructions
		Several Patient Feed messages and a PDQ Query message will be sent to your PD Supplier.
		The PDQ Query will reflect a partial name search on MOO*.

		Validation Criteria
		The Supplier is expected to provide a valid HL7v2 PDQ Query Response message, 
		correctly populated with the given values. 3 different PID segments shall be returned,
		containing the patient demographics of 3 different patients :
			- MOORE CHIP
			- MOORE RALPH
			- MOODY WARREN
			- MOONEY STAN
	 */
	public void testPdqMesa11315() {
		try {
			// PDQ Request Message:
			String message = "MSH|^~\\&|MESA_PD_CONSUMER|MESA_DEPARTMENT|MESA_PD_SUPPLIER|XYZ_HOSPITAL|||QBP^Q22|11311110|P|2.5||||||||\r" + 
		      "QPD|IHE PDQ Query|QRY11315110|@PID.5.1.1^MOO*|||||^^^IHENA&1.3.6.1.4.1.21367.2010.1.2.300&ISO\r" +
		      "RCP|I|10^RD|||||";

			Message response = sendMessage(message);
			System.out.println("Received response:\n" + getResponseString(response));
			MSA msa = (MSA)response.get("MSA");
			assertEquals("AA", msa.getAcknowledgmentCode().getValue());
			QAK qak = (QAK)response.get("QAK");
			assertEquals("OK", qak.getQueryResponseStatus().getValue());
			RSP_K21 queryResponse = (RSP_K21) response;
			int index=-1;
			for (int i=0; i < queryResponse.getQUERY_RESPONSEReps(); i++) {
					RSP_K21_QUERY_RESPONSE qrs = queryResponse.getQUERY_RESPONSE(i);
					PID pid = qrs.getPID();
					System.out.println("Name is : " + pid.getPatientName(0).getFamilyName().getSurname().getValue() + " " + pid.getPatientName(0).getGivenName().getValue());
					if (pid.getPatientName(0).getFamilyName().getSurname().getValue().equalsIgnoreCase("MOORE") &&
							pid.getPatientName(0).getGivenName().getValue().equalsIgnoreCase("CHIP")) {
						index = i;
					}
			}
			assertTrue(index >= 0);

		} catch(Exception e) {
			e.printStackTrace();
			fail("Fail to test PDQ exact name search");
		}		
	}	
}
