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
package org.openempi.webapp.server;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.openempi.webapp.client.JobQueueDataService;
import org.openempi.webapp.client.model.JobEntryEventLogWeb;
import org.openempi.webapp.client.model.JobEntryWeb;
import org.openempi.webapp.server.util.ModelTransformer;
import org.openhie.openempi.jobqueue.JobQueueService;
import org.openhie.openempi.model.JobEntry;
import org.openhie.openempi.model.JobEntryEventLog;
import org.openhie.openempi.context.Context;

public class JobQueueDataServiceImpl extends AbstractRemoteServiceServlet implements JobQueueDataService
{
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}


    public List<JobEntryWeb> getJobEntries() throws Exception  {
        log.debug("Received request to retrieve the list of Job Entry.");

        authenticateCaller();
        try {
            JobQueueService jobQueueService = Context.getJobQueueService();

            List<JobEntry> jobEntries = jobQueueService.getJobEntries();
            List<JobEntryWeb> jobEntriesWeb = new ArrayList<JobEntryWeb>(jobEntries.size());
            for (JobEntry entry : jobEntries) {

                JobEntryWeb entryWeb = ModelTransformer.mapToJobEntry(entry, JobEntryWeb.class);

                jobEntriesWeb.add(entryWeb);
            }
            return jobEntriesWeb;
        } catch (Throwable t) {
            log.error("Failed to execute: " + t.getMessage(), t);
            throw new RuntimeException(t);
        }
    }

    public List<JobEntryEventLogWeb> getJobEntryEventLogs(JobEntryWeb jobEntry) throws Exception  {
        log.debug("Received request to retrieve the list of Job Entry Event Logs.");

        authenticateCaller();
        try {
            JobQueueService jobQueueService = Context.getJobQueueService();

            List<JobEntryEventLog> jobEntryEventLogs = jobQueueService.getJobEntryEventLogs(jobEntry.getJobEntryId());
            List<JobEntryEventLogWeb> jobEntryEventLogsWeb = new ArrayList<JobEntryEventLogWeb>(jobEntryEventLogs.size());
            for (JobEntryEventLog eventLog : jobEntryEventLogs) {

                JobEntryEventLogWeb eventLogWeb = ModelTransformer.mapToJobEntryEventLog(eventLog, JobEntryEventLogWeb.class);

                jobEntryEventLogsWeb.add(eventLogWeb);
            }
            return jobEntryEventLogsWeb;
        } catch (Throwable t) {
            log.error("Failed to execute: " + t.getMessage(), t);
            throw new RuntimeException(t);
        }
    }

    public JobEntryWeb updateJobEntry(JobEntryWeb jobEntryWeb) throws Exception {
        log.debug("Received request to update a job entry to the repository");

        authenticateCaller();
        try {
            JobQueueService jobQueueService = Context.getJobQueueService();

            org.openhie.openempi.model.JobEntry jobEntry = ModelTransformer.mapToJobEntry(jobEntryWeb, org.openhie.openempi.model.JobEntry.class);
            JobEntry entry = jobQueueService.updateJobEntry(jobEntry);

            JobEntryWeb entryWeb = ModelTransformer.mapToJobEntry(entry, JobEntryWeb.class);

            return entryWeb;
        } catch (Throwable t) {
            log.error("Failed to execute: " + t.getMessage(), t);
            throw new RuntimeException(t);
        }
    }

    public String deleteJobEntry(JobEntryWeb jobEntryWeb) throws Exception {
        log.debug("Received request to update a job entry to the repository");

        authenticateCaller();
        String msg = "";
        try {
            JobQueueService jobQueueService = Context.getJobQueueService();

            org.openhie.openempi.model.JobEntry jobEntry = ModelTransformer.mapToJobEntry(jobEntryWeb, org.openhie.openempi.model.JobEntry.class);
            jobQueueService.deleteJobEntry(jobEntry);

            return msg;
        } catch (Throwable t) {
            log.error("Failed while delete a job entry: " + t, t);
            msg = t.getMessage();
            throw new Exception(t.getMessage());
        }
    }
}
