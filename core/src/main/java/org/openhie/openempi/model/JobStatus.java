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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * JobType entity.
 * 
 * @author <a href="mailto:yimin.xie@sysnetint.com">Yimin Xie</a>
 */
@Entity
@Table(name = "job_status")
public class JobStatus extends BaseObject implements Serializable
{
    private static final long serialVersionUID = 6170253797278224912L;

    public static final int JOB_STATUS_QUEUED_CODE = 1;
    public static final int JOB_STATUS_INPROCESSING_CODE = 2;
    public static final int JOB_STATUS_COMPLETED_CODE = 3;
    
    public static final JobStatus JOB_STATUS_QUEUED = new JobStatus(JOB_STATUS_QUEUED_CODE);
    public static final JobStatus JOB_STATUS_INPROCESSING = new JobStatus(JOB_STATUS_INPROCESSING_CODE);
    public static final JobStatus JOB_STATUS_COMPLETED = new JobStatus(JOB_STATUS_COMPLETED_CODE);
    

    private Integer jobStatusCd;
    private String jobStatusName;
    private String jobStatusDescription;
    
    public JobStatus() {
    }

    public JobStatus(int jobStatusCode) {
        this.jobStatusCd = jobStatusCode;
    }
    
    @Id
    @Column(name = "job_status_cd", unique = true, nullable = false)
    public Integer getJobStatusCd() {
        return jobStatusCd;
    }

    public void setJobStatusCd(Integer jobTypeCd) {
        this.jobStatusCd = jobTypeCd;
    }

    @Column(name = "job_status_name", nullable = false)
    public String getJobStatusName() {
        return jobStatusName;
    }

    public void setJobStatusName(String jobTypeName) {
        this.jobStatusName = jobTypeName;
    }

    @Column(name = "job_status_description", nullable = true)
    public String getJobStatusDescription() {
        return jobStatusDescription;
    }

    public void setJobStatusDescription(String jobTypeDescription) {
        this.jobStatusDescription = jobTypeDescription;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + jobStatusCd;
        result = prime * result + ((jobStatusName == null) ? 0 : jobStatusName.hashCode());
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
        JobStatus other = (JobStatus) obj;
        if (jobStatusCd != other.jobStatusCd)
            return false;
        if (jobStatusName == null) {
            if (other.jobStatusName != null)
                return false;
        } else if (!jobStatusName.equals(other.jobStatusName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "JobType [jobStatusCd=" + jobStatusCd + ", jobStatusName=" + jobStatusName + ", jobStatusDescription="
                + jobStatusDescription + "]";
    }
}
