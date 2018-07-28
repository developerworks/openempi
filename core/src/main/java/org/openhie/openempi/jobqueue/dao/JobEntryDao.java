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
package org.openhie.openempi.jobqueue.dao;

import java.util.List;

import org.openhie.openempi.dao.UniversalDao;
import org.openhie.openempi.model.JobEntry;
import org.openhie.openempi.model.JobEntryEventLog;
import org.openhie.openempi.model.JobStatus;
import org.openhie.openempi.model.JobType;

public interface JobEntryDao extends UniversalDao
{
    public JobEntry createJobEntry(JobEntry jobEntry);

    public List<JobEntry> getJobEntries();

    public JobEntry getJobEntry(JobEntry jobEntry);
    
    public List<JobEntry> getQueueJobEntries();
    
    public JobEntry updateJobEntry(JobEntry jobEntry);

    public void deleteJobEntry(JobEntry jobEntry);

    public void logJobEntryEvent(JobEntry jobEntry, JobEntryEventLog eventLog);

    public List<JobEntryEventLog> getJobEntryEventLogs(Integer jobEntryId);

    public List<JobType> getJobTypes();

    public List<JobStatus> getJobStatuses();
}
