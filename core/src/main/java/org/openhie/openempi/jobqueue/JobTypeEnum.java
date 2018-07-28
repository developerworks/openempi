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
package org.openhie.openempi.jobqueue;

public enum JobTypeEnum
{
    FILE_IMPORT(1, "File Import"),
    BLOCKING_INITIALIZATION(2, "Blocking Initialization"),
    MATCHING_INITIALIZATION(3, "Matching Initialization"),
    MATCH_REPOSITORY_DATA(4, "Match Repository Data"),
    ENTITY_IMPORT(5, "Entity Import"),
    DATA_PROFILING(6, "Data Profiling"),
    GENERATE_CUSTOM_FIELDS(7, "Generate Custom Fields"),
    ASSIGN_GLOBAL_IDENTIFIERS(8, "Assign Global Identifiers");
    
    private int code;
    private String name;
    
    private JobTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public int getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
}
