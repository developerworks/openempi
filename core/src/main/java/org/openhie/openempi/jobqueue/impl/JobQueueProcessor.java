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

import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openhie.openempi.context.Context;
import org.openhie.openempi.jobqueue.dao.JobEntryDao;
import org.openhie.openempi.model.JobEntry;
import org.openhie.openempi.model.JobEntryEventLog;
import org.openhie.openempi.model.JobStatus;
import org.openhie.openempi.notification.ObservationEventType;
import org.openhie.openempi.service.Parameterizable;
import org.openhie.openempi.service.impl.UniversalManagerImpl;

public class JobQueueProcessor extends UniversalManagerImpl implements Observer, Runnable, Parameterizable
{
    protected final Log log = LogFactory.getLog(getClass());
    private java.util.Map<String, Object> parameters;
    private JobEntryDao jobEntryDao;
    private String username;
    private String password;
    private boolean initialized = false;
    
    public void run() {
        processJobQueueEntries();
    }

    public void update(Observable o, Object arg) {
        log.debug("Received a notification " + o + " with event data: " + arg);
        processJobQueueEntries();
    }

    private void processJobQueueEntries() {
        if (!initialized) {
            initialize();
        }
        List<JobEntry> jobEntries = jobEntryDao.getQueueJobEntries();
        log.debug("Found " + jobEntries.size() + " queued job entries.");
        for (JobEntry jobEntry : jobEntries) {
            jobEntry = jobEntryDao.getJobEntry(jobEntry);
            log.debug("Processing job entry: " + jobEntry);
            try {
                JobTypeHandler handler = (JobTypeHandler) Context.getApplicationContext()
                        .getBean(jobEntry.getJobType().getJobTypeHandler());
                if (handler == null) {
                    log.warn("Unknown job type handler " + jobEntry.getJobType().getJobTypeHandler() + 
                            " was requested for job entry " + jobEntry.getJobEntryId());
                    continue;
                }
                handler.setJobEntry(jobEntry);
                handler.setJobEntryDao(getJobEntryDao());
                log.debug("Executing job entry with handler " + handler);
                java.util.Date now = new java.util.Date();
                jobEntry.setDateStarted(now);
                jobEntry.setJobStatus(JobStatus.JOB_STATUS_INPROCESSING);
                jobEntryDao.updateJobEntry(jobEntry);
                JobEntryEventLog event = new JobEntryEventLog();
                event.setDateCreated(now);
                event.setJobEntry(jobEntry);
                event.setLogMessage("Started processing job with ID " + jobEntry.getJobEntryId());
                jobEntryDao.logJobEntryEvent(jobEntry, event);

                Context.executeTask(handler);
            } catch (Exception e) {
                log.error("Failed while trying to process job " + jobEntry.getJobEntryId() + " due to " + e, e);
            }
        }
    }

    private synchronized void initialize() {
        try {
//            entity = Context.getEntityDefinitionManagerService().getEntityByName(entityName);
            Context.authenticate(getUsername(), getPassword());
            Context.registerObserver(this, ObservationEventType.JOB_QUEUED_EVENT);
        } catch (Exception e) {
            log.error("Failed while initializing the service: " + e, e);
            throw new RuntimeException("Entity name configuration parameter is invalid.");
        }
        initialized = true;        
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
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
    
    public JobEntryDao getJobEntryDao() {
        return jobEntryDao;
    }

    public void setJobEntryDao(JobEntryDao jobEntryDao) {
        this.jobEntryDao = jobEntryDao;
    }    
}
