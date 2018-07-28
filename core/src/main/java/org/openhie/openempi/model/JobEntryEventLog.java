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
package org.openhie.openempi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "job_entry_event_log")
@GenericGenerator(name = "job_entry_event_log_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "job_entry_event_log_seq"),
        @Parameter(name = "increment_size", value = "10"),
        @Parameter(name = "optimizer", value = "hilo")})
public class JobEntryEventLog extends BaseObject implements Serializable
{
    private static final long serialVersionUID = 6170253797278224912L;

    private Integer eventEntryEventLogId;
    private JobEntry jobEntry;
    private String logMessage;
    private Date dateCreated;
    
    @Id
    @GeneratedValue(generator="job_entry_event_log_gen")
    @Column(name = "job_entry_event_log_id", unique = true, nullable = false)
    public Integer getEventEntryEventLogId() {
        return eventEntryEventLogId;
    }

    public void setEventEntryEventLogId(Integer eventEntryEventLogId) {
        this.eventEntryEventLogId = eventEntryEventLogId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_entry_id", nullable = false)
    public JobEntry getJobEntry() {
        return jobEntry;
    }

    public void setJobEntry(JobEntry jobEntry) {
        this.jobEntry = jobEntry;
    }

    @Column(name = "log_message")
    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_created", nullable = false)
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eventEntryEventLogId == null) ? 0 : eventEntryEventLogId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        JobEntryEventLog other = (JobEntryEventLog) obj;
        if (eventEntryEventLogId == null) {
            if (other.eventEntryEventLogId != null)
                return false;
        } else if (!eventEntryEventLogId.equals(other.eventEntryEventLogId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "JobEntryEventLog [eventEntryEventLogId=" + eventEntryEventLogId + ", logMessage=" + logMessage
                + ", dateCreated=" + dateCreated + "]";
    }
}
