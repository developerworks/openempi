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
package org.openhie.openempi.jobqueue.dao.hibernate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.openhie.openempi.dao.hibernate.UniversalDaoHibernate;
import org.openhie.openempi.jobqueue.dao.JobEntryDao;
import org.openhie.openempi.model.JobEntry;
import org.openhie.openempi.model.JobEntryEventLog;
import org.openhie.openempi.model.JobStatus;
import org.openhie.openempi.model.JobType;
import org.springframework.orm.hibernate3.HibernateCallback;

public class JobEntryDaoHibernate extends UniversalDaoHibernate implements JobEntryDao
{
    public JobEntry createJobEntry(JobEntry jobEntry) {
        getHibernateTemplate().saveOrUpdate(jobEntry);
        getHibernateTemplate().flush();
        log.debug("Finished saving the job: " + jobEntry);
        return jobEntry;
    }

    @SuppressWarnings("unchecked")
    public List<JobEntry> getJobEntries() {
        List<JobEntry> entries = (List<JobEntry>) getHibernateTemplate()
                .find("from JobEntry order by dateCreated desc");
        log.debug("Obtained a list of JobEntry with " + entries.size() + " entries.");
        return entries;
    }

    @SuppressWarnings("unchecked")
    public List<JobEntry> getQueueJobEntries() {
        return getHibernateTemplate().execute(new HibernateCallback<List<JobEntry>>() {
            public List<JobEntry> doInHibernate(Session session) throws HibernateException, SQLException {
                List<JobEntry> entries = (List<JobEntry>) session
                        .createQuery("from JobEntry where jobStatus.jobStatusCd = " + JobStatus.JOB_STATUS_QUEUED_CODE +
                                " order by dateCreated desc")
                        .list();
                log.debug("Obtained a list of " + entries.size() + " queued job entries");
                return entries;
            }
        });
    }

    @SuppressWarnings("unchecked")
    public JobEntry getJobEntry(final JobEntry jobEntry) {
        return getHibernateTemplate().execute(new HibernateCallback<JobEntry>() {
            public JobEntry doInHibernate(Session session) throws HibernateException, SQLException {
                List<JobEntry> entries = (List<JobEntry>) session
                    .createQuery("from JobEntry e where e.jobEntryId = " + jobEntry.getJobEntryId())
                    .list();
                if (entries.size() == 0) {  
                    return null;
                }
                JobEntry entry = entries.get(0);
                getHibernateTemplate().evict(entry);
                Hibernate.initialize(entry);
                Hibernate.initialize(entry.getLogEntries());
                if (log.isDebugEnabled()) {
                    log.debug("Loaded the jobEntry: " + entry);
                }
                return entry;
            }
        });
    }

    public JobEntry updateJobEntry(JobEntry jobEntry) {
        if (log.isDebugEnabled()) {
            log.debug("Updating jobEntry: " + jobEntry);
        }
        if (jobEntry == null || jobEntry.getJobEntryId() == null) {
            log.warn("User attempted to update a job but provided insufficient information to identify it.");
            return jobEntry;
        }
        JobEntry foundJobEntry = getJobEntry(jobEntry);
        if (foundJobEntry == null) {
            log.warn("User attempted to update a job that was not found in the system.");
            return jobEntry;
        }

        // The user can only update these fields only.
        foundJobEntry.setDateStarted(jobEntry.getDateStarted());
        foundJobEntry.setDateCompleted(jobEntry.getDateCompleted());
        foundJobEntry.setItemsErrored(jobEntry.getItemsErrored());
        foundJobEntry.setItemsProcessed(jobEntry.getItemsProcessed());
        foundJobEntry.setItemsSuccessful(jobEntry.getItemsSuccessful());
        foundJobEntry.setJobDescription(jobEntry.getJobDescription());
        foundJobEntry.setJobStatus(jobEntry.getJobStatus());

        getHibernateTemplate().saveOrUpdate(foundJobEntry);
        getHibernateTemplate().flush();
        if (log.isDebugEnabled()) {
            log.debug("Finished updating the job: " + foundJobEntry);
        }
        return foundJobEntry;
    }

    public void deleteJobEntry(JobEntry jobEntry)  {
        if (jobEntry == null || jobEntry.getJobEntryId() == null) {
            log.warn("User attempted to delete a job but provided insufficient information to identify it: "
                    + jobEntry);
            return;
        }
        jobEntry = getJobEntry(jobEntry);
        if (jobEntry == null) {
            log.warn("User attempted to delete a job that was not found in the system.");
            return;
        }
/*        
        if (jobEntry.getLogEntries() != null) {
            for (JobEntryEventLog eventLog : jobEntry.getLogEntries()) {
                getHibernateTemplate().delete(eventLog);
            }
            getHibernateTemplate().delete(jobEntry);
            getHibernateTemplate().flush();
        }
*/       
        List<JobEntryEventLog> jobEntryEventLogs = getJobEntryEventLogs(jobEntry.getJobEntryId());
        for (JobEntryEventLog eventLog : jobEntryEventLogs) {
                getHibernateTemplate().delete(eventLog);
        }
        getHibernateTemplate().delete(jobEntry);
        getHibernateTemplate().flush();
    }


    public void logJobEntryEvent(JobEntry jobEntry, JobEntryEventLog eventLog) {
        if (jobEntry == null || jobEntry.getJobEntryId() == null) {
            log.warn("User attempted to attempted to log an event against a job but provided insufficient "
                    + "information to identify it: "
                    + jobEntry);
            return;
        }

        JobEntry foundJobEntry = getJobEntry(jobEntry);
        if (foundJobEntry == null) {
            log.warn("User attempted to log a job event but the job was not found in the system.");
            return;
        }
        eventLog.setEventEntryEventLogId(null);
        eventLog.setJobEntry(foundJobEntry);
        List<JobEntryEventLog> entries = foundJobEntry.getLogEntries();
        if (entries == null || entries.size() == 0) {
            entries = new ArrayList<JobEntryEventLog>();
            entries.add(eventLog);
            jobEntry.setLogEntries(entries);
        } else {
            jobEntry.getLogEntries().add(eventLog);
        }

        getHibernateTemplate().saveOrUpdate(jobEntry);
        getHibernateTemplate().flush();
        if (log.isDebugEnabled()) {
            log.debug("Finished loggging an event against a job: " + foundJobEntry);
        }
    }

    @SuppressWarnings("unchecked")
    public List<JobEntryEventLog> getJobEntryEventLogs(Integer jobEntryId) {
        List<JobEntryEventLog> eventLogs = (List<JobEntryEventLog>) getHibernateTemplate()
                .find("from JobEntryEventLog e where e.jobEntry.jobEntryId = " + jobEntryId);

        if (eventLogs.size() == 0) {
            return new java.util.ArrayList<JobEntryEventLog>();
        }
        return eventLogs;
    }

    @SuppressWarnings("unchecked")
    public List<JobType> getJobTypes() {
        List<JobType> jobTypes = (List<JobType>) getHibernateTemplate()
                .find("from JobType");
        log.trace("Obtained the list of Job Types " + jobTypes.size());
        return jobTypes;
    }

    @SuppressWarnings("unchecked")
    public List<JobStatus> getJobStatuses() {
        List<JobStatus> datatypes = (List<JobStatus>) getHibernateTemplate()
                .find("from JobStatus");
        log.trace("Obtained the list of Job Status " + datatypes.size());
        return datatypes;
    }
}
