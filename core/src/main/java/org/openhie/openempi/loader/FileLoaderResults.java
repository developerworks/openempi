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
package org.openhie.openempi.loader;

public class FileLoaderResults
{
    private int recordProcessed;
    private int recordsLoaded;
    private int recordsErrored;
    private String errorMessage;
    private boolean loadingFailed = false;
    
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    public boolean isLoadingFailed() {
        return loadingFailed;
    }
    public void setLoadingFailed(boolean loadingFailed) {
        this.loadingFailed = loadingFailed;
    }
    public int getRecordProcessed() {
        return recordProcessed;
    }
    public void setRecordProcessed(int recordProcessed) {
        this.recordProcessed = recordProcessed;
    }
    public int getRecordsLoaded() {
        return recordsLoaded;
    }
    public void setRecordsLoaded(int recordsLoaded) {
        this.recordsLoaded = recordsLoaded;
    }
    public int getRecordsErrored() {
        return recordsErrored;
    }
    public void setRecordsErrored(int recordsErrored) {
        this.recordsErrored = recordsErrored;
    }
}
