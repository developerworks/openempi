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
package org.openempi.webapp.client.mvc.jobqueue;

import java.util.List;

import org.openempi.webapp.client.AppEvents;
import org.openempi.webapp.client.JobQueueDataServiceAsync;
import org.openempi.webapp.client.domain.AuthenticationException;
import org.openempi.webapp.client.model.JobEntryEventLogWeb;
import org.openempi.webapp.client.model.JobEntryWeb;
import org.openempi.webapp.client.mvc.Controller;

import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.mvc.Dispatcher;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class JobQueueController extends Controller
{
    private JobQueueView jobQueueView;

    public JobQueueController() {
        this.registerEventTypes(AppEvents.JobQueueView);
    }

    @Override
    protected void initialize() {
        jobQueueView = new JobQueueView(this);
    }

    @Override
    public void handleEvent(AppEvent event) {
        EventType type = event.getType();
        if (type == AppEvents.JobQueueView) {

            forwardToView(jobQueueView, event);

        } else if (type == AppEvents.JobEntriesRequest) {

            loadJobEntries();

        } else if (type == AppEvents.JobEntryEnentLogsRequest) {

            JobEntryWeb jobEntry = event.getData("jobEntry");
            loadJobEntryEventLogs(jobEntry);

        } else if (type == AppEvents.JobEntryDescriptionUpdate) {

            JobEntryWeb jobEntry = event.getData("jobEntry");
            updateJobEntry(jobEntry);

        } else if (type == AppEvents.JobEntryRemove) {

            JobEntryWeb jobEntry = event.getData("jobEntry");
            removeJobEntry(jobEntry);
        }
    }

    private void loadJobEntries() {
        // Info.display("Information", "Submitting request to load job entries");

        JobQueueDataServiceAsync jobQueueDataService = getJobQueueDataService();

        jobQueueDataService.getJobEntries(new AsyncCallback<List<JobEntryWeb>>()
        {
            public void onFailure(Throwable caught) {

                if (caught instanceof AuthenticationException) {

                    Dispatcher.get().dispatch(AppEvents.Logout);
                    return;
                }
                forwardToView(jobQueueView, AppEvents.Error, caught.getMessage());
            }

            public void onSuccess(List<JobEntryWeb> result) {

                forwardToView(jobQueueView, AppEvents.JobEntriesReceived, result);
            }
        });
    }

    private void loadJobEntryEventLogs(JobEntryWeb jobEntry) {
        // Info.display("Information", "Submitting request to load job entry event logs");

        JobQueueDataServiceAsync jobQueueDataService = getJobQueueDataService();

        jobQueueDataService.getJobEntryEventLogs(jobEntry, new AsyncCallback<List<JobEntryEventLogWeb>>()
        {
            public void onFailure(Throwable caught) {

                if (caught instanceof AuthenticationException) {

                    Dispatcher.get().dispatch(AppEvents.Logout);
                    return;
                }
                forwardToView(jobQueueView, AppEvents.Error, caught.getMessage());
            }

            public void onSuccess(List<JobEntryEventLogWeb> result) {

                forwardToView(jobQueueView, AppEvents.JobEntryEnentLogsReceived, result);
            }
        });
    }

    private void updateJobEntry(JobEntryWeb jobEntry) {
        // Info.display("Information", "Submitting request to update job entry");

        JobQueueDataServiceAsync jobQueueDataService = getJobQueueDataService();

        jobQueueDataService.updateJobEntry(jobEntry, new AsyncCallback<JobEntryWeb>()
        {
            public void onFailure(Throwable caught) {

                if (caught instanceof AuthenticationException) {

                    Dispatcher.get().dispatch(AppEvents.Logout);
                    return;
                }
                forwardToView(jobQueueView, AppEvents.Error, caught.getMessage());
            }

            public void onSuccess(JobEntryWeb result) {

                forwardToView(jobQueueView, AppEvents.JobEntryDescriptionUpdate, result);
            }
        });
    }

    private void removeJobEntry(JobEntryWeb jobEntry) {
        // Info.display("Information", "Submitting request to remove job entry");

        JobQueueDataServiceAsync jobQueueDataService = getJobQueueDataService();

        jobQueueDataService.deleteJobEntry(jobEntry, new AsyncCallback<String>()
        {
            public void onFailure(Throwable caught) {

                if (caught instanceof AuthenticationException) {

                    Dispatcher.get().dispatch(AppEvents.Logout);
                    return;
                }
                forwardToView(jobQueueView, AppEvents.Error, caught.getMessage());
            }

            public void onSuccess(String result) {

                forwardToView(jobQueueView, AppEvents.JobEntryRemove, result);
            }
        });
    }
}
