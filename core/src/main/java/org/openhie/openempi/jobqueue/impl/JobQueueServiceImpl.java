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

import java.util.Date;
import java.util.List;

import org.openhie.openempi.ApplicationException;
import org.openhie.openempi.jobqueue.JobQueueService;
import org.openhie.openempi.jobqueue.dao.JobEntryDao;
import org.openhie.openempi.model.JobEntry;
import org.openhie.openempi.model.JobEntryEventLog;
import org.openhie.openempi.model.JobStatus;
import org.openhie.openempi.model.JobType;
import org.openhie.openempi.service.impl.UniversalManagerImpl;


public class JobQueueServiceImpl extends UniversalManagerImpl implements JobQueueService
{
    private JobEntryDao jobEntryDao;
    private static List<JobType> jobTypes;
    private static List<JobStatus> jobStatuses;

    public JobEntry createJobEntry(JobEntry jobEntry) throws ApplicationException {
        if (jobEntry == null) {
            return null;
        }

        if (jobEntry.getJobEntryId() != null) {
            log.warn("User attempted to create a job that has an internal id: " + jobEntry);
            throw new ApplicationException("The job with this id already exists in the system.");
        }

        Date dateCreated = new Date();
        jobEntry.setDateCreated(dateCreated);
        if (jobEntry.getLogEntries() != null) {
            for (JobEntryEventLog eventLog : jobEntry.getLogEntries()) {
                eventLog.setDateCreated(dateCreated);
            }
        }
        jobEntryDao.createJobEntry(jobEntry);
        return jobEntry;
    }

    public List<JobEntry> getJobEntries() {
        List<JobEntry> entries =  jobEntryDao.getJobEntries();
        return entries;
    }

    public JobEntry getJobEntry(JobEntry jobEntry) {

        if (jobEntry == null || jobEntry.getJobEntryId() == null) {
            return null;
        }
        return jobEntryDao.getJobEntry(jobEntry);
    }

    public JobEntry updateJobEntry(JobEntry jobEntry) throws ApplicationException {
        if (jobEntry == null) {
            return jobEntry;
        }

        if (jobEntry.getJobEntryId() == null) {
            log.warn("User attempted to update a job that hasn't been created yet: " + jobEntry);
            throw new ApplicationException("A job must first be created before it is updated.");
        }
        JobEntry updatedJobEntry = jobEntryDao.updateJobEntry(jobEntry);
        return updatedJobEntry;
    }

    public void deleteJobEntry(JobEntry jobEntry) throws ApplicationException {
        if (jobEntry == null || jobEntry.getJobEntryId() == null) {
            log.warn("User attempted to delete a job that hasn't been created yet: " + jobEntry);
            throw new ApplicationException("A job must first be created before it is deleted.");
        }
        jobEntryDao.deleteJobEntry(jobEntry);
    }

    public void logJobEntryEvent(JobEntry jobEntry, JobEntryEventLog eventLog) throws ApplicationException {
        if (jobEntry == null || jobEntry.getJobEntryId() == null) {
            log.warn("User attempted to log an event for a job that hasn't been created yet: " + jobEntry);
            throw new ApplicationException("A job must first be created before events are logged to it.");
        }
        jobEntryDao.logJobEntryEvent(jobEntry, eventLog);
    }

    public List<JobEntryEventLog> getJobEntryEventLogs(Integer jobEntryId) {
        if (jobEntryId == null) {
            return null;
        }
        return jobEntryDao.getJobEntryEventLogs(jobEntryId);
    }

    public List<JobType> getJobTypes() {
        if (jobTypes == null) {
            jobTypes = jobEntryDao.getJobTypes();
        }
        return jobTypes;
    }

    public List<JobStatus> getJobStatuses() {
        if (jobStatuses == null) {
            jobStatuses = jobEntryDao.getJobStatuses();
        }
        return jobStatuses;
    }
    
    public JobEntryDao getJobEntryDao() {
        return jobEntryDao;
    }

    public void setJobEntryDao(JobEntryDao jobEntryDao) {
        this.jobEntryDao = jobEntryDao;
    }
}
