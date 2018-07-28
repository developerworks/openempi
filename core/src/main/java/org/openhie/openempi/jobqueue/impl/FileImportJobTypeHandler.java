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
import org.openhie.openempi.loader.FileLoaderManager;
import org.openhie.openempi.loader.FileLoaderResults;
import org.openhie.openempi.model.JobEntry;
import org.openhie.openempi.model.JobEntryEventLog;
import org.openhie.openempi.model.JobStatus;

public class FileImportJobTypeHandler extends AbstractJobTypeHandler
{
    public FileImportJobTypeHandler() {
    }

    public void run() {
        authenticateUser();
        Map<String,Object> params = extractParameters(getJobEntry());
        logJobEntryParameters(params);
        String fileName = (String) params.get(JobParameterConstants.FILENAME_PARAM);
        String loaderName = (String) params.get(JobParameterConstants.FILELOADER_PARAM);
        String userFileId = (String) params.get(JobParameterConstants.USERFILEID_PARAM);
        params.remove(JobParameterConstants.FILENAME_PARAM);
        params.remove("loaderName");
        FileLoaderManager fileLoader = new FileLoaderManager();
        try {
            fileLoader.setUp(params);
            FileLoaderResults results = fileLoader.loadFile(fileName, loaderName);
            updateJobEntry(fileName, results);
            updateUserFileEntry(userFileId, results);
        } catch (Exception e) {
            log.warn("Failed while trying to load a file: " + e, e);
            FileLoaderResults results = new FileLoaderResults();
            results.setLoadingFailed(true);
            results.setErrorMessage("Failed to load file due to: " + e.getMessage());
            updateJobEntry(fileName, results);
        }
    }

    private void updateUserFileEntry(String userFileIdStr, FileLoaderResults results) {
        if (userFileIdStr == null || userFileIdStr.length() == 0) {
            log.warn("The user file parameter is not present so, we can't update the status.");
            return;
        }
        Integer userFileId = null;
        try {
            userFileId = Integer.parseInt(userFileIdStr);
        } catch (NumberFormatException e) {
            log.warn("The user file id parameter is invalid: " + userFileIdStr);
            return;
        }
        org.openhie.openempi.model.UserFile userFileFound = Context.getUserManager().getUserFile(userFileId);
        if (userFileFound == null) {
            log.warn("The user file cannot be found in the system so, we can't update the status.");
            return;
        }
        try {
          userFileFound.setImported("Y");
          userFileFound.setRowsImported(results.getRecordsLoaded());
          userFileFound.setRowsProcessed(results.getRecordProcessed());
          Context.getUserManager().saveUserFile(userFileFound);
        } catch (Exception e) {
            log.warn("Failed to update the user file with the results of a successful import: " + e);
        }
    }

    private void updateJobEntry(String fileName, FileLoaderResults results) {
        java.util.Date completed = new java.util.Date();
        JobEntryEventLog event = new JobEntryEventLog();
        event.setDateCreated(completed);
        if (results.isLoadingFailed()) {
            event.setLogMessage("Failed to load the file due to: " + results.getErrorMessage());
        } else {
            event.setLogMessage("Finished loading the file.");
        }
        JobEntry jobEntry = getJobEntry();
        jobEntry.setDateCompleted(completed);
        jobEntry.setItemsErrored(results.getRecordsErrored());
        jobEntry.setItemsProcessed(results.getRecordProcessed());
        jobEntry.setItemsSuccessful(results.getRecordsLoaded());
        jobEntry.setJobStatus(JobStatus.JOB_STATUS_COMPLETED);
        JobEntry updatedJob = getJobEntryDao().updateJobEntry(jobEntry);        
        getJobEntryDao().logJobEntryEvent(updatedJob,  event);
    }

}
