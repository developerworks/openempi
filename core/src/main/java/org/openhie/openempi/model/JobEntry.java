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
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.jfree.util.Log;

/**
 * JobType entity.
 * 
 * @author <a href="mailto:yimin.xie@sysnetint.com">Yimin Xie</a>
 */
@Entity
@Table(name = "job_entry")
@GenericGenerator(name = "job_entry_gen", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
        @Parameter(name = "sequence_name", value = "job_entry_seq"),
        @Parameter(name = "increment_size", value = "10"),
        @Parameter(name = "optimizer", value = "hilo")})
public class JobEntry extends BaseObject implements Serializable
{
    private static final long serialVersionUID = 6170253797278224912L;
    public static final String KEY_VALUE_SEPARATOR = "::";
    public static final String PARAMETER_SEPARATOR = ",";
    
    private Integer jobEntryId;
    private JobStatus jobStatus;
    private JobType jobType;
    private String jobDescription;
    private String jobParameters;
    private Date dateCreated;
    private Date dateStarted;
    private Date dateCompleted;
    private Integer itemsProcessed;
    private Integer itemsSuccessful;
    private Integer itemsErrored;
    private List<JobEntryEventLog> logEntries;
    
    public JobEntry() {
    }

    @Id
    @GeneratedValue(generator="job_entry_gen")
    @Column(name = "job_entry_id", unique = true, nullable = false)
    public Integer getJobEntryId() {
        return jobEntryId;
    }

    public void setJobEntryId(Integer jobEntryId) {
        this.jobEntryId = jobEntryId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_type_cd")
    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "job_status_cd")
    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    @Column(name = "job_description")
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    @Column(name = "job_parameters")
    public String getJobParameters() {
        return jobParameters;
    }

    public void setJobParameters(String jobParameters) {
        this.jobParameters = jobParameters;
    }
    
    public String addJobParameter(String key, String value) {
        if (key == null || value == null || key.indexOf(KEY_VALUE_SEPARATOR) >= 0 ||
                value.indexOf(KEY_VALUE_SEPARATOR) >= 0) {
            Log.warn("User attempted to add invalid parameter to job entry: <" + key + "," + value + ">");
            return null;
        }
        String parameter = key + KEY_VALUE_SEPARATOR + value;
        if (jobParameters == null) {
            jobParameters = parameter;
        } else {
            jobParameters += PARAMETER_SEPARATOR + parameter;
        }
        return parameter;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_created", nullable = false)
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_started", nullable = true)
    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_completed", nullable = true)
    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    @Column(name = "items_processed", nullable = true)
    public Integer getItemsProcessed() {
        return itemsProcessed;
    }

    public void setItemsProcessed(Integer itemsProcessed) {
        this.itemsProcessed = itemsProcessed;
    }

    @Column(name = "items_successful", nullable = true)
    public Integer getItemsSuccessful() {
        return itemsSuccessful;
    }

    public void setItemsSuccessful(Integer itemsSuccessful) {
        this.itemsSuccessful = itemsSuccessful;
    }

    @Column(name = "items_errored", nullable = true)
    public Integer getItemsErrored() {
        return itemsErrored;
    }

    public void setItemsErrored(Integer itemsErrored) {
        this.itemsErrored = itemsErrored;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "jobEntry")
    @OrderBy("dateCreated")
    public List<JobEntryEventLog> getLogEntries() {
        return logEntries;
    }

    public void setLogEntries(List<JobEntryEventLog> logEntries) {
        this.logEntries = logEntries;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((jobEntryId == null) ? 0 : jobEntryId.hashCode());
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
        JobEntry other = (JobEntry) obj;
        if (jobEntryId == null) {
            if (other.jobEntryId != null)
                return false;
        } else if (!jobEntryId.equals(other.jobEntryId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "JobEntry [jobEntryId=" + jobEntryId + ", jobStatus=" + jobStatus+ ", jobType=" + jobType
                + ", jobDescription=" + jobDescription + ", jobParameters=" + jobParameters
                + ", dateCreated=" + dateCreated+ ", dateStarted=" + dateStarted
                + ", dateCompleted=" + dateCompleted + ", itemsProcessed=" + itemsProcessed
                + ", itemsSuccessful=" + itemsSuccessful + ", itemsErrored=" + itemsErrored + "]";
    }
}
