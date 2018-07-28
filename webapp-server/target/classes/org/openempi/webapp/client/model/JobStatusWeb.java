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

import java.io.Serializable;

import com.extjs.gxt.ui.client.data.BaseModelData;

public class JobStatusWeb extends BaseModelData implements Serializable
{
	public JobStatusWeb() {
	}

	public JobStatusWeb(Integer jobStatusCd, String jobStatusName, String jobStatusDescription) {
		set("jobStatusCd", jobStatusCd);
		set("jobStatusName", jobStatusName);
		set("jobStatusDescription", jobStatusDescription);
	}

	public Integer getJobStatusCd() {
		return get("jobStatusCd");
	}

	public void setJobStatusCd(Integer jobStatusCd) {
		set("jobStatusCd", jobStatusCd);
	}

	public java.lang.String getJobStatusName() {
		return get("jobStatusName");
	}

	public void setJobStatusName(java.lang.String jobStatusName) {
		set("jobStatusName", jobStatusName);
	}

	public java.lang.String getJobStatusDescription() {
		return get("jobStatusDescription");
	}

	public void setJobStatusDescription(java.lang.String jobStatusDescription) {
		set("jobStatusDescription", jobStatusDescription);
	}
}
