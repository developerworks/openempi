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

public class JobTypeWeb extends BaseModelData implements Serializable
{
	public JobTypeWeb() {
	}

	public JobTypeWeb(Integer jobTypeCd, String jobTypeName, String jobTypeDescription, String jobTypeHandler) {
		set("jobTypeCd", jobTypeCd);
		set("jobTypeName", jobTypeName);
		set("jobTypeDescription", jobTypeDescription);
		set("jobTypeHandler", jobTypeHandler);
	}

	public Integer getJobTypeCd() {
		return get("jobTypeCd");
	}

	public void setJobTypeCd(Integer jobTypeCd) {
		set("jobTypeCd", jobTypeCd);
	}

	public java.lang.String getJobTypeName() {
		return get("jobTypeName");
	}

	public void setJobTypeName(java.lang.String jobTypeName) {
		set("jobTypeName", jobTypeName);
	}

	public java.lang.String getJobTypeDescription() {
		return get("jobTypeDescription");
	}

	public void setJobTypeDescription(java.lang.String jobTypeDescription) {
		set("jobTypeDescription", jobTypeDescription);
	}

	public java.lang.String getJobTypeHandler() {
		return get("jobTypeHandler");
	}

	public void setJobTypeHandler(java.lang.String jobTypeHandler) {
		set("jobTypeHandler", jobTypeHandler);
	}
}
