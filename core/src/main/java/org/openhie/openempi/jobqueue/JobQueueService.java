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

import java.util.List;

import org.openhie.openempi.ApplicationException;
import org.openhie.openempi.model.JobEntry;
import org.openhie.openempi.model.JobEntryEventLog;
import org.openhie.openempi.model.JobStatus;
import org.openhie.openempi.model.JobType;

public interface JobQueueService
{
    /**
     * Create a job entry and is the equivalent of adding a new entry to the job queue.
     *
     * @param jobEntry
     * @return Returns the job entry that was created along with the internal key that is
     * used to uniquely identify this entry.
     *
     * @throws ApplicationException
     */
    public JobEntry createJobEntry(JobEntry jobEntry) throws ApplicationException;

    /**
     * Returns the list of all job entries in the system in reverse chronological
     * order based on the date of creation of the job. This is a shallow retrieval
     * so any job entry event log information will not be attached to the individual
     * jobs at this point. To get the event log details, you need to retrieve the
     * individual job entry. It returns an empty list if no entries are found in
     * the system.
     *
     */
    public List<JobEntry> getJobEntries();


    /**
     * Returns the entry identified by the internal key that is supposed to be the
     * single populated field of the job entry object passed in. If any entry by
     * this id is not found in the system, a null value is returned.
     *
     * @param jobEntry
     * @return
     */
    public JobEntry getJobEntry(JobEntry jobEntry);


    /**
     * Adds an event log to the specified job entry identified by the id field that must
     * be populated in the JobEntry parameter. The purpose of this is to add additional
     * information to the job about intermediate events that occur during processing.
     *
     * @param jobEntry
     * @param eventLog
     */
    public void logJobEntryEvent(JobEntry jobEntry, JobEntryEventLog eventLog) throws ApplicationException;

    /**
     * Updates the job entry identified by the internal key that must be present
     * in the entry passed in. The update request can only modify the following
     * fields of the job entry object:
     * <ul>
     * <li>Date job completed
     * <li>Items Processed
     * <li>Items Successful
     * <li>Items Errored
     * <li>Job Description
     * <li>Job Status
     * </ul>
     *
     * Any other modifications passed into the Job Entry object will be ignored.

     * @param jobEntry
     * @return
     * @throws ApplicationException
     */
    public JobEntry updateJobEntry(JobEntry jobEntry) throws ApplicationException;

    /**
     * Deletes the job entry and any associated job entry event logs in the system. The
     * job is identified by the id that must be present in the object passed into this
     * call. If the job entry to be deleted is not found in the system, the method
     * returns normally.

     * @param jobEntry
     */
    public void deleteJobEntry(JobEntry jobEntry) throws ApplicationException;

    /**
     * Returns the list of job entry event logs based on the jobEntryId.
     *
     * @param jobEntryId
     * @return
     */
    public List<JobEntryEventLog> getJobEntryEventLogs(Integer jobEntryId);
 
    /**
     * Returns the list of job type.
     */
    public List<JobType> getJobTypes();

    /**
     * Returns the list of job status.
     */
    public List<JobStatus> getJobStatuses();
}
