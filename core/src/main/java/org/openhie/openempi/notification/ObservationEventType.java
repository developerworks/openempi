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
package org.openhie.openempi.notification;

public enum ObservationEventType
{
	CUSTOM_FIELD_ADD_EVENT,
	CUSTOM_FIELD_UPDATE_EVENT,
	CUSTOM_FIELD_DELETE_EVENT,
	ENTITY_ADD_EVENT,
	ENTITY_ATTRIBUTE_UPDATE_EVENT,
	IDENTIFIER_DOMAIN_UPDATE_EVENT,
	JOB_QUEUED_EVENT,
	MATCHING_CONFIGURATION_UPDATE_EVENT,
    RECORD_ADD_EVENT,
    RECORDS_ADD_EVENT,
    RECORD_DELETE_EVENT,
    RECORD_UPDATE_EVENT;
}
