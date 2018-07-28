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
package org.openhie.openempi.jobqueue.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openhie.openempi.Constants;
import org.openhie.openempi.context.Context;
import org.openhie.openempi.jobqueue.dao.JobEntryDao;
import org.openhie.openempi.model.JobEntry;

public abstract class AbstractJobTypeHandler implements JobTypeHandler
{
    protected final Log log = LogFactory.getLog(getClass());
    
    private JobEntryDao jobEntryDao;
    private JobEntry jobEntry;
    private String username;
    private String password;
    
    public AbstractJobTypeHandler() {
    }

    protected Map<String,Object> extractParameters(JobEntry jobEntry) {
        Map<String,Object> params = new HashMap<String,Object>();
        String jobParams = jobEntry.getJobParameters(); 
        if (jobParams == null || jobParams.length() == 0) {
            return params;
        }
        String[] pairs = jobParams.split(JobEntry.PARAMETER_SEPARATOR);
        for (String pair : pairs) {
            String[] keyValuePair = pair.split(JobEntry.KEY_VALUE_SEPARATOR);
            Object value = convertBooleanValues(keyValuePair[1]);
            params.put(keyValuePair[0], value);
        }
        return params;
    }

    protected void logJobEntryParameters(Map<String, Object> params) {
        for (String key : params.keySet()) {
            Object value = params.get(key);
            log.debug("Running " + getClass() + " with <" + key + "," + value + " of type (" + value.getClass() +
                    ")>");
        }
    }

    protected void authenticateUser() {
        Context.authenticate(getUsername(), getPassword());
    }
    
    private Object convertBooleanValues(String value) {
        if (value.equals(Constants.TRUE_VALUE)) {
            return Boolean.TRUE;
        } else if (value.equals(Constants.FALSE_VALUE)) {
            return Boolean.FALSE;
        }
        return value;
    }

    public JobEntry getJobEntry() {
        return jobEntry;
    }

    public void setJobEntry(JobEntry jobEntry) {
        this.jobEntry = jobEntry;
    }

    public JobEntryDao getJobEntryDao() {
        return jobEntryDao;
    }

    public void setJobEntryDao(JobEntryDao jobEntryDao) {
        this.jobEntryDao = jobEntryDao;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
