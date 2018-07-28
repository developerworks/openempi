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

import java.util.Map;

import org.openhie.openempi.context.Context;
import org.openhie.openempi.jobqueue.JobParameterConstants;
import org.openhie.openempi.model.JobEntry;
import org.openhie.openempi.model.JobEntryEventLog;
import org.openhie.openempi.model.JobStatus;

public class DataProfilingJobTypeHandler extends AbstractJobTypeHandler
{

    public DataProfilingJobTypeHandler() {
        super();
    }

    public void run() {
        authenticateUser();
        JobEntry jobEntry = getJobEntry();
        Map<String,Object> params = extractParameters(jobEntry);
        logJobEntryParameters(params);
        String task = (String) params.get(JobParameterConstants.MATCHINGTASK_PARAM);
        if (task == null || task.length() == 0) {
            log.info("Unable to process the matching job with id " + jobEntry.getJobEntryId() + 
                    " since the specific matching task to perform was not specified.");
            return;
        }
        
        if (!task.equals(JobParameterConstants.MATCHINGTASK_INITIALIZATION) &&
                !task.equals(JobParameterConstants.MATCHINGTASK_LINKAGE)) {
            log.info("Unable to process the matching job with id " + jobEntry.getJobEntryId() + 
                    " since the specific matching task to perform is unknown: " + task);
            return;
        }
        
        if (task.equals(JobParameterConstants.MATCHINGTASK_INITIALIZATION)) {
            initializeMatchingAlgorithm(jobEntry);
        } else {
            generateAllLinks(jobEntry);
        }
    }

    private void initializeMatchingAlgorithm(JobEntry jobEntry) {
        
        try {
            Context.getPersonManagerService().initializeRepository();
            updateJobEntry(true, "Successfully completed the initialization of the matching service.");
        } catch (Exception e) {
            log.warn("Failed while initializing the matching service: " + e, e);
            updateJobEntry(false, "Failed to initialize the matching service due to: " + e.getMessage());
        }
    }

    private void generateAllLinks(JobEntry jobEntry) {
        
        try {
            Context.getPersonManagerService().linkAllRecordPairs();
            updateJobEntry(true, "Successfully completed linking all record pairs.");
        } catch (Exception e) {
            log.warn("Failed while linking all record pairs: " + e, e);
            updateJobEntry(false, "Failed to link all record pairs due to: " + e.getMessage());
        }
    }
    
    public void updateJobEntry(boolean success, String message) {
        java.util.Date completed = new java.util.Date();
        JobEntryEventLog event = new JobEntryEventLog();
        event.setDateCreated(completed);
        event.setLogMessage(message);

        JobEntry jobEntry = getJobEntry();
        jobEntry.setDateCompleted(completed);
        jobEntry.setItemsErrored(0);
        jobEntry.setItemsProcessed(0);
        jobEntry.setItemsSuccessful(0);
        jobEntry.setJobStatus(JobStatus.JOB_STATUS_COMPLETED);
        JobEntry updatedJob = getJobEntryDao().updateJobEntry(jobEntry);        
        getJobEntryDao().logJobEntryEvent(updatedJob,  event);
    }
}
