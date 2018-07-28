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
package org.openempi.webapp.client.model;

import com.extjs.gxt.ui.client.data.BaseModelData;

public class JobEntryWeb extends BaseModelData
{
	@SuppressWarnings("unused")
    private JobEntryEventLogWeb unusedJobEntryEventLogWeb;

	@SuppressWarnings("unused")
	private JobTypeWeb unusedJobTypeWeb;

	@SuppressWarnings("unused")
	private JobStatusWeb unusedJobStatusWeb;

	public JobEntryWeb() {
	}

	public java.lang.Integer getJobEntryId() {
		return get("jobEntryId");
	}

	public void setJobEntryId(java.lang.Integer jobEntryId) {
		set("jobEntryId", jobEntryId);
	}

	public java.lang.String getJobDescription() {
		return get("jobDescription");
	}

	public void setJobDescription(java.lang.String jobDescription) {
		set("jobDescription", jobDescription);
	}

	public java.util.Date getDateCreated() {
		return get("dateCreated");
	}

	public void setDateCreated(java.util.Date dateCreated) {
		set("dateCreated", dateCreated);
	}

    public java.util.Date getDateStarted() {
        return get("dateStarted");
    }

    public void setDateStarted(java.util.Date dateStarted) {
        set("dateStarted", dateStarted);
    }

    public java.util.Date getDateCompleted() {
        return get("dateCompleted");
    }

    public void setDateCompleted(java.util.Date dateCompleted) {
        set("dateCompleted", dateCompleted);
    }

    public JobTypeWeb getJobType() {
        return get("jobType");
    }

    public void setJobType(JobTypeWeb jobType) {
        set("jobType", jobType);
    }

    public JobStatusWeb getJobStatus() {
        return get("jobStatus");
    }

    public void setJobStatus(JobStatusWeb jobStatus) {
        set("jobStatus", jobStatus);
    }

    public java.lang.Integer getItemsProcessed() {
        return get("itemsProcessed");
    }

    public void setItemsProcessed(java.lang.Integer itemsProcessed) {
        set("itemsProcessed", itemsProcessed);
    }

    public java.lang.Integer getItemsSuccessful() {
        return get("itemsSuccessful");
    }

    public void setItemsSuccessful(java.lang.Integer itemsSuccessful) {
        set("itemsSuccessful", itemsSuccessful);
    }

    public java.lang.Integer getItemsErrored() {
        return get("itemsErrored");
    }

    public void setItemsErrored(java.lang.Integer itemsErrored) {
        set("itemsErrored", itemsErrored);
    }

	public java.util.Set<JobEntryEventLogWeb> getLogEntries() {
		return get("logEntries");
	}

	public void setLogEntries(java.util.Set<JobEntryEventLogWeb> logEntries) {
		set("logEntries", logEntries);
	}

	public JobEntryEventLogWeb findJobEntryEventLogById(Integer id) {
		for (JobEntryEventLogWeb event : getLogEntries()) {
			if (event.getEventEntryEventLogId().intValue() == id.intValue()) {
				return event;
			}
		}
		return null;
	}
}
