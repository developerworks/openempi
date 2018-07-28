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
package org.openhie.openempi.webservices.restful;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.openhie.openempi.model.IdentifierUpdateEvent;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;

public class RemoveAllUpdateNotifications extends BaseRestfulServiceTestCase
{
    public void testRetrieveNotifications() {
        List<IdentifierUpdateEvent> identifierUpdateEvents = 
                getWebResource().path("person-query-resource")
                    .path("retrieveNotifications")
                    .queryParam("firstRecord", "0")
                    .queryParam("maxRecords", "0")
                    .queryParam("removeRecords", "false")
                    .header(OPENEMPI_SESSION_KEY_HEADER, getSessionKey())
                    .accept(MediaType.APPLICATION_XML)
                    .get(new GenericType<List<IdentifierUpdateEvent>>(){});
        assertTrue("Failed to retrieve identifierUpdateEvents list paged.", identifierUpdateEvents != null && identifierUpdateEvents.size() > 0);
        System.out.println("testRetrieveNotifications:");
        for (IdentifierUpdateEvent identifierUpdateEvent : identifierUpdateEvents) {
            System.out.println(identifierUpdateEvent.toString());
            ClientResponse response = getWebResource().path("person-manager-resource")
                    .path("removeNotificationById")
                    .queryParam("notificationId", identifierUpdateEvent.getIdentifierUpdateEventId().toString())
                    .header(OPENEMPI_SESSION_KEY_HEADER, getSessionKey())
                    .accept(MediaType.APPLICATION_JSON)
                    .post(ClientResponse.class);

            assertTrue("Failed to remove notification.", response.getStatus() != Status.OK.getStatusCode());            
        }
    }
}
