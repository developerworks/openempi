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
@Table(name = "job_type")
public class JobType extends BaseObject implements Serializable
{
    private static final long serialVersionUID = 6170253797278224912L;

    private Integer jobTypeCd;
    private String jobTypeName;
    private String jobTypeDescription;
    private String jobTypeHandler;

    public JobType() {
    }

    public JobType(Integer jobTypeCode) {
        this.jobTypeCd = jobTypeCode;
    }
    
    @Id
    @Column(name = "job_type_cd", unique = true, nullable = false)
    public Integer getJobTypeCd() {
        return jobTypeCd;
    }

    public void setJobTypeCd(Integer jobTypeCd) {
        this.jobTypeCd = jobTypeCd;
    }

    @Column(name = "job_type_name", nullable = false)
    public String getJobTypeName() {
        return jobTypeName;
    }

    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }

    @Column(name = "job_type_description", nullable = true)
    public String getJobTypeDescription() {
        return jobTypeDescription;
    }

    public void setJobTypeDescription(String jobTypeDescription) {
        this.jobTypeDescription = jobTypeDescription;
    }

    @Column(name = "job_type_handler", nullable = false)
    public String getJobTypeHandler() {
        return jobTypeHandler;
    }

    public void setJobTypeHandler(String jobTypeHandler) {
        this.jobTypeHandler = jobTypeHandler;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + jobTypeCd;
        result = prime * result + ((jobTypeName == null) ? 0 : jobTypeName.hashCode());
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
        JobType other = (JobType) obj;
        if (jobTypeCd != other.jobTypeCd)
            return false;
        if (jobTypeName == null) {
            if (other.jobTypeName != null)
                return false;
        } else if (!jobTypeName.equals(other.jobTypeName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "JobType [jobTypeCd=" + jobTypeCd + ", jobTypeName=" + jobTypeName + ", jobTypeDescription="
                + jobTypeDescription + ", jobTypeHandler=" + jobTypeHandler + "]";
    }
}
