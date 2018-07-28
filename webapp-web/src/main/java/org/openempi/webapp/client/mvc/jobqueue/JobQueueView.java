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

import java.util.ArrayList;
import java.util.List;

import org.openempi.webapp.client.AppEvents;
import org.openempi.webapp.client.Constants;
import org.openempi.webapp.client.model.JobEntryEventLogWeb;
import org.openempi.webapp.client.model.JobEntryWeb;
import org.openempi.webapp.client.model.JobStatusWeb;
import org.openempi.webapp.client.model.JobTypeWeb;
import org.openempi.webapp.client.mvc.Controller;
import org.openempi.webapp.client.mvc.View;

import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.Style.Scroll;
import com.extjs.gxt.ui.client.Style.SelectionMode;
import com.extjs.gxt.ui.client.Style.VerticalAlignment;
import com.extjs.gxt.ui.client.event.ButtonEvent;
import com.extjs.gxt.ui.client.event.Events;
import com.extjs.gxt.ui.client.event.Listener;
import com.extjs.gxt.ui.client.event.MessageBoxEvent;
import com.extjs.gxt.ui.client.event.SelectionChangedEvent;
import com.extjs.gxt.ui.client.event.SelectionListener;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.util.IconHelper;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.MessageBox;
import com.extjs.gxt.ui.client.widget.Status;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.ComboBox;
import com.extjs.gxt.ui.client.widget.form.ComboBox.TriggerAction;
import com.extjs.gxt.ui.client.widget.form.DateField;
import com.extjs.gxt.ui.client.widget.form.DateTimePropertyEditor;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.NumberField;
import com.extjs.gxt.ui.client.widget.form.TextArea;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.Grid;
import com.extjs.gxt.ui.client.widget.layout.BorderLayout;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.layout.FillLayout;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.extjs.gxt.ui.client.widget.layout.TableLayout;
import com.extjs.gxt.ui.client.widget.toolbar.FillToolItem;
import com.extjs.gxt.ui.client.widget.toolbar.ToolBar;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.DateTimeFormat.PredefinedFormat;


public class  JobQueueView extends View
{
    private ContentPanel container;
    private LayoutContainer gridContainer;
    private LayoutContainer formButtonContainer;
    private LayoutContainer formItemsContainer;

    private ContentPanel jobEntryPanel;
    private FormPanel formComboPanel;
    private FormPanel leftFormPanel;
    private FormPanel middleFormPanel;
    private FormPanel rightFormPanel;
    private FormPanel buttonPanel;
    private Status status;
    private Button updateButton;
    private Button removeButton;

	private JobEntryWeb selectedJobEntry;
	private Grid<JobEntryWeb> grid;
	private ListStore<JobEntryWeb> jobEntryStore = new ListStore<JobEntryWeb>();

    private ListStore<JobTypeWeb> jobTypeStore = new ListStore<JobTypeWeb>();
    private ComboBox<JobTypeWeb> jobTypeCombo = new ComboBox<JobTypeWeb>();
    private ListStore<JobStatusWeb> jobStatusStore = new ListStore<JobStatusWeb>();
    private ComboBox<JobStatusWeb> jobStatusCombo = new ComboBox<JobStatusWeb>();
    private TextArea jobDescriptionEdit = new TextArea();
    private DateField dateCreatedEdit;
    private DateField dateStartedEdit;
    private DateField dateCompletedEdit;

    private NumberField itemsProcessedEdit;
    private NumberField itemsSuccessfulEdit;
    private NumberField itemsErroredEdit;

	private Grid<JobEntryEventLogWeb> gridEventLogs;
	private ListStore<JobEntryEventLogWeb> eventLogsStore = new ListStore<JobEntryEventLogWeb>();

	public JobQueueView(Controller controller) {
		super(controller);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void handleEvent(AppEvent event) {

		if (event.getType() == AppEvents.JobQueueView) {

            controller.handleEvent(new AppEvent(AppEvents.JobEntriesRequest));

		} else if (event.getType() == AppEvents.JobEntriesReceived) {
	    	// Info.display("Information", "JobEntriesReceived");

            if (Registry.get(Constants.JOB_TYPES) != null) {
                List<JobTypeWeb> jobTypes =  (List<JobTypeWeb>) Registry.get(Constants.JOB_TYPES);
                jobTypeStore.removeAll();
                jobTypeStore.add(jobTypes);
            }

            if (Registry.get(Constants.JOB_STATUS) != null) {
                List<JobStatusWeb> jobStatuses =  (List<JobStatusWeb>) Registry.get(Constants.JOB_STATUS);
                jobStatusStore.removeAll();
                jobStatusStore.add(jobStatuses);
            }

		    List<JobEntryWeb> jobEntries = (List<JobEntryWeb>) event.getData();
		    initEntityUI();

		    jobEntryStore.removeAll();
		    eventLogsStore.removeAll();

		    jobEntryStore.add(jobEntries);
        } else if (event.getType() == AppEvents.JobEntryEnentLogsReceived) {
            // Info.display("Information", "JobEntryEnentLogsReceived");
            eventLogsStore.removeAll();

            List<JobEntryEventLogWeb> eventLogs = (List<JobEntryEventLogWeb>) event.getData();
            eventLogsStore.add(eventLogs);

            updateButton.enable();
            removeButton.enable();
        } else if (event.getType() == AppEvents.JobEntryDescriptionUpdate) {

            int index = jobEntryStore.indexOf(selectedJobEntry);
            jobEntryStore.remove(selectedJobEntry);
            JobEntryWeb entry = event.getData();
            jobEntryStore.insert(entry, index);

            // edited entry is selected entry
            grid.getSelectionModel().select(entry, true);

            MessageBox.alert("Information", "The job entry was successfully updated", null);

            removeButton.enable();
            status.hide();
            updateButton.unmask();

        } else if (event.getType() == AppEvents.JobEntryRemove) {

            jobEntryStore.remove(selectedJobEntry);

            MessageBox.alert("Information", "The job entry was successfully deleted", null);

            status.hide();
            removeButton.unmask();

		} else if (event.getType() == AppEvents.Error) {
			String message = event.getData();
	        MessageBox.alert("Information", "Failure: " + message, listenFailureMsg);
		}
	}

    private final Listener<MessageBoxEvent> listenRemove = new Listener<MessageBoxEvent>() {
        public void handleEvent(MessageBoxEvent ce) {
          Button btn = ce.getButtonClicked();
          if (btn.getText().equals("Yes")) {

              updateButton.disable();
              status.show();
              removeButton.mask();

              AppEvent event = new AppEvent(AppEvents.JobEntryRemove);
              event.setData("jobEntry", selectedJobEntry);
              controller.handleEvent(event);

          }
        }
    };

	private final Listener<MessageBoxEvent> listenFailureMsg = new Listener<MessageBoxEvent>() {
        public void handleEvent(MessageBoxEvent ce) {
          Button btn = ce.getButtonClicked();
          if (btn.getText().equals("OK")) {

  			  status.hide();
  			  updateButton.unmask();
          }
        }
    };

    protected void displayJonEntry(JobEntryWeb jobEntryWeb) {
        jobTypeCombo.setValue(jobEntryWeb.getJobType());
        jobStatusCombo.setValue(jobEntryWeb.getJobStatus());

        jobDescriptionEdit.setValue(jobEntryWeb.getJobDescription());
        dateCreatedEdit.setValue(jobEntryWeb.getDateCreated());
        dateStartedEdit.setValue(jobEntryWeb.getDateStarted());
        dateCompletedEdit.setValue(jobEntryWeb.getDateCompleted());
        itemsProcessedEdit.setValue(jobEntryWeb.getItemsProcessed());
        itemsSuccessfulEdit.setValue(jobEntryWeb.getItemsSuccessful());
        itemsErroredEdit.setValue(jobEntryWeb.getItemsErrored());
    }

    protected void clearDisplayJonEntry() {
        jobTypeCombo.clear();
        jobStatusCombo.clear();

        jobDescriptionEdit.clear();
        dateCreatedEdit.clear();
        dateStartedEdit.clear();
        dateCompletedEdit.clear();
        itemsProcessedEdit.clear();
        itemsSuccessfulEdit.clear();
        itemsErroredEdit.clear();
    }

    private JobEntryWeb copyJobEntryFromGUI(JobEntryWeb updateEntry) {
        JobEntryWeb entryWeb = new JobEntryWeb();
        entryWeb.setJobEntryId(updateEntry.getJobEntryId());
        entryWeb.setJobType(updateEntry.getJobType());
        entryWeb.setDateCreated(updateEntry.getDateCreated());
        entryWeb.setDateStarted(updateEntry.getDateStarted());

        // The user can only update these fields only.
        entryWeb.setJobStatus(jobStatusCombo.getValue());
        entryWeb.setJobDescription(jobDescriptionEdit.getValue());
        entryWeb.setDateCompleted(dateCompletedEdit.getValue());
        if (itemsProcessedEdit.getValue() != null) {
            entryWeb.setItemsProcessed(itemsProcessedEdit.getValue().intValue());
        }
        if (itemsSuccessfulEdit.getValue() != null) {
            entryWeb.setItemsSuccessful(itemsSuccessfulEdit.getValue().intValue());
        }
        if (itemsErroredEdit.getValue() != null) {
            entryWeb.setItemsErrored(itemsErroredEdit.getValue().intValue());
        }
        return entryWeb;
    }

	private Grid<JobEntryWeb> setupGrid() {

  		// setup column configuration
		List<ColumnConfig> columnConfig = new ArrayList<ColumnConfig>();

		// Date Created
		ColumnConfig column = new ColumnConfig("dateCreated", "Date Created", 120);
		column.setDateTimeFormat(DateTimeFormat.getFormat(PredefinedFormat.DATE_TIME_SHORT));
		columnConfig.add(column);

	    // Date Started
        column = new ColumnConfig("dateStarted", "Date Started", 120);
        column.setDateTimeFormat(DateTimeFormat.getFormat(PredefinedFormat.DATE_TIME_SHORT));
        columnConfig.add(column);

        // Date Completed
        column = new ColumnConfig("dateCompleted", "Date Completed", 120);
        column.setDateTimeFormat(DateTimeFormat.getFormat(PredefinedFormat.DATE_TIME_SHORT));
        columnConfig.add(column);

		// Job Description
		column = new ColumnConfig("jobDescription", "Job Description", 260);
		columnConfig.add(column);

	    // Job Type
        column = new ColumnConfig("jobType.jobTypeName", "Job Type", 120);
        columnConfig.add(column);

        // Job Status
        column = new ColumnConfig("jobStatus.jobStatusName", "Job Status", 100);
        columnConfig.add(column);

        // Job Description
        column = new ColumnConfig("itemsProcessed", "Items Processed", 100);
        columnConfig.add(column);

        // Job Description
        column = new ColumnConfig("itemsSuccessful", "Items Successful", 100);
        columnConfig.add(column);

        // Job Description
        column = new ColumnConfig("itemsErrored", "Items Errored", 100);
        columnConfig.add(column);

		ColumnModel cm = new ColumnModel(columnConfig);
		Grid<JobEntryWeb>  grid = new Grid<JobEntryWeb>(jobEntryStore, cm);
		grid.setBorders(true);
		grid.setAutoWidth(true);
		grid.setStripeRows(true);
		grid.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		grid.setHeight(200);

		// selection event
		grid.getSelectionModel().addListener(Events.SelectionChange,
				new Listener<SelectionChangedEvent<JobEntryWeb>>() {
					public void handleEvent(SelectionChangedEvent<JobEntryWeb> be) {
					    JobEntryWeb entry = be.getSelectedItem();
						if (entry != null) {
							// Info.display("Information: ", entry.getJobDescription());
							selectedJobEntry = entry;

							displayJonEntry(selectedJobEntry);

	 	    				AppEvent event = new AppEvent(AppEvents.JobEntryEnentLogsRequest);
						    event.setData("jobEntry", selectedJobEntry);
						    controller.handleEvent(event);

						} else {
						    selectedJobEntry = null;
						    clearDisplayJonEntry();

				            eventLogsStore.removeAll();

							updateButton.disable();
							removeButton.disable();
						}
					}
				});

		return grid;
	}

    private Grid<JobEntryEventLogWeb> setupEventLogsGrid() {

        List<ColumnConfig> columnConfig = new ArrayList<ColumnConfig>();

        // Date Created
        ColumnConfig column = new ColumnConfig("dateCreated", "Event Date", 120);
        column.setDateTimeFormat(DateTimeFormat.getFormat(PredefinedFormat.DATE_SHORT));
        columnConfig.add(column);

        // Message
        column = new ColumnConfig("logMessage", "Log Message", 500);
        columnConfig.add(column);

        ColumnModel cm = new ColumnModel(columnConfig);
        Grid<JobEntryEventLogWeb> grid = new Grid<JobEntryEventLogWeb>(eventLogsStore, cm);

        grid.setStyleAttribute("borderTop", "none");
        grid.setBorders(true);
        grid.setBorders(true);
        grid.setStripeRows(true);
        grid.setWidth(900);
        grid.setHeight(215);

        return grid;
    }

    private ContentPanel setupJobEntryPanel() {
        ContentPanel jobEntryPanel = new ContentPanel();
        jobEntryPanel.setHeading("Job Entry");
        jobEntryPanel.setFrame(true);
        jobEntryPanel.setIcon(IconHelper.create("images/database.png"));
            FormLayout formLayout = new FormLayout();
            formLayout.setLabelWidth(120);
            formLayout.setDefaultWidth(260);
        jobEntryPanel.setLayout(formLayout);
        jobEntryPanel.setAutoWidth(true);
        jobEntryPanel.setHeight(460);


        jobTypeCombo.setEmptyText("Job type field...");
        jobTypeCombo.setForceSelection(true);
        jobTypeCombo.setDisplayField("jobTypeName");
        jobTypeCombo.setStore(jobTypeStore);
        jobTypeCombo.setTypeAhead(true);
        jobTypeCombo.setTriggerAction(TriggerAction.ALL);
        jobTypeCombo.setFieldLabel("Job Type");
        jobTypeCombo.setAllowBlank(false);
        jobTypeCombo.setReadOnly(true);
        jobTypeCombo.disable();

        jobStatusCombo.setEmptyText("Job status field...");
        jobStatusCombo.setForceSelection(true);
        jobStatusCombo.setDisplayField("jobStatusName");
        jobStatusCombo.setStore(jobStatusStore);
        jobStatusCombo.setTypeAhead(true);
        jobStatusCombo.setTriggerAction(TriggerAction.ALL);
        jobStatusCombo.setFieldLabel("Job Status");
        jobStatusCombo.setAllowBlank(false);
        jobStatusCombo.setReadOnly(true);
        jobStatusCombo.disable();

        jobDescriptionEdit.setFieldLabel("Description");
        jobDescriptionEdit.setHeight(60);

        formComboPanel = setupForm("", 120, 260, 600);
        formComboPanel.add(jobTypeCombo);
        formComboPanel.add(jobStatusCombo);
        formComboPanel.add(jobDescriptionEdit);

        DateTimePropertyEditor dateFormat = new DateTimePropertyEditor("yyyy-MM-dd HH:mm");
        dateCreatedEdit = new DateField();
        dateCreatedEdit.setFieldLabel("Date Created");
        dateCreatedEdit.setToolTip("yyyy-MM-dd HH:mm");
        dateCreatedEdit.setPropertyEditor(dateFormat);
        dateCreatedEdit.setReadOnly(true);
        dateCreatedEdit.disable();

        dateStartedEdit = new DateField();
        dateStartedEdit.setFieldLabel("Date Started");
        dateStartedEdit.setToolTip("yyyy-MM-dd HH:mm");
        dateStartedEdit.setPropertyEditor(dateFormat);
        dateStartedEdit.setReadOnly(true);
        dateStartedEdit.disable();

        dateCompletedEdit = new DateField();
        dateCompletedEdit.setFieldLabel("Date Completed");
        dateCompletedEdit.setToolTip("yyyy-MM-dd HH:mm");
        dateCompletedEdit.setPropertyEditor(dateFormat);
        dateCompletedEdit.setReadOnly(true);
        dateCompletedEdit.disable();

        itemsProcessedEdit = new NumberField();
        itemsProcessedEdit.setFieldLabel("Items Processed");
        itemsProcessedEdit.setAllowNegative(false);
        itemsProcessedEdit.disable();

        itemsSuccessfulEdit = new NumberField();
        itemsSuccessfulEdit.setFieldLabel("Items Successful");
        itemsSuccessfulEdit.setAllowNegative(false);
        itemsSuccessfulEdit.disable();

        itemsErroredEdit = new NumberField();
        itemsErroredEdit.setFieldLabel("Items Errored");
        itemsErroredEdit.setAllowNegative(false);
        itemsErroredEdit.disable();

        formItemsContainer = setupItemsLayoutContainer();
        gridEventLogs = setupEventLogsGrid();

        jobEntryPanel.add(formComboPanel);
        jobEntryPanel.add(formItemsContainer);
        jobEntryPanel.add(gridEventLogs);

        return jobEntryPanel;
    }

    protected FormPanel setupForm(String title, int labelWidth, int fieldWidth, int width) {

        FormPanel formPanel = new FormPanel();
        formPanel.setHeaderVisible(false);
        formPanel.setBodyBorder(false);

            FormLayout formLayout = new FormLayout();
            formLayout.setLabelWidth(labelWidth);
            formLayout.setDefaultWidth(fieldWidth);

        formPanel.setLayout(formLayout);
        formPanel.setWidth(width);
        formPanel.setTitle(title);

        return formPanel;
    }

    private LayoutContainer setupItemsLayoutContainer() {
        LayoutContainer container = new LayoutContainer();

        TableLayout formlayout = new TableLayout(3);
        formlayout.setWidth("900"); // 100%
        formlayout.setCellVerticalAlign(VerticalAlignment.TOP);
        container.setLayout(formlayout);

        leftFormPanel = setupForm("", 120, 140, 300);
        middleFormPanel = setupForm("", 120, 140, 300);
        rightFormPanel = setupForm("", 120, 140, 300);

        leftFormPanel.add(itemsProcessedEdit);
        middleFormPanel.add(itemsSuccessfulEdit);
        rightFormPanel.add(itemsErroredEdit);

        leftFormPanel.add(dateCreatedEdit);
        middleFormPanel.add(dateStartedEdit);
        rightFormPanel.add(dateCompletedEdit);

        container.add(leftFormPanel);
        container.add(middleFormPanel);
        container.add(rightFormPanel);
        return container;
    }

    private FormPanel setupButtonPanel() {
        FormPanel buttonPanel = new FormPanel();
        buttonPanel.setHeaderVisible(false);
        buttonPanel.setBodyBorder(false);
        buttonPanel.setAutoWidth(true);
        buttonPanel.setButtonAlign(HorizontalAlignment.CENTER);

        // Buttons
        updateButton = new Button("Update Description", new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                if (selectedJobEntry != null) {

                    if (!leftFormPanel.isValid() || !middleFormPanel.isValid() || !rightFormPanel.isValid()) {
                        // Info.display("test:", "Invalid fields");
                        return;
                    }

                    JobEntryWeb updatingEntry = copyJobEntryFromGUI(selectedJobEntry);

                    AppEvent event = new AppEvent(AppEvents.JobEntryDescriptionUpdate);
                    event.setData("jobEntry", updatingEntry);
                    controller.handleEvent(event);

                    removeButton.disable();
                    status.show();
                    updateButton.mask();
                }
            }
        });
        removeButton = new Button("Remove", new SelectionListener<ButtonEvent>() {
            @Override
            public void componentSelected(ButtonEvent ce) {
                if (selectedJobEntry != null) {
                    MessageBox.confirm("Confirm", "Are you sure you want to remove this job entry with all its event logs?", listenRemove);
                }
            }
        });
        status = new Status();
        status.setBusy("please wait...");
        status.hide();
        updateButton.disable();
        removeButton.disable();
        buttonPanel.getButtonBar().setSpacing(5);
        buttonPanel.getButtonBar().add(new FillToolItem());
        buttonPanel.getButtonBar().add(status);
        buttonPanel.getButtonBar().add(updateButton);
        buttonPanel.getButtonBar().add(removeButton);

        return buttonPanel;
    }

	private void initEntityUI() {
		long time = new java.util.Date().getTime();
		GWT.log("Initializing the UI ", null);

		container = new ContentPanel();
		container.setLayout(new BorderLayout());
		container.setHeading("Job Queue Entries");

		// Grid
		gridContainer = new LayoutContainer();
		gridContainer.setBorders(true);
		gridContainer.setLayout(new FitLayout());

	    ToolBar toolBar = new ToolBar();
        toolBar.add(new Button("Refresh", IconHelper.create("images/arrow_refresh.png"), new SelectionListener<ButtonEvent>() {
              @Override
              public void componentSelected(ButtonEvent ce) {                     
                  showWaitCursor();
                  controller.handleEvent(new AppEvent(AppEvents.JobEntriesRequest, null));
              }
        }));

	   ContentPanel cp = new ContentPanel();
	   cp.setHeading("Job Queue Entries");
	   cp.setHeaderVisible(false);
	   cp.setBodyBorder(false);
	   cp.setLayout(new FillLayout());
	   cp.setTopComponent(toolBar);
        
	   grid = setupGrid();
	   cp.add(grid);

	   gridContainer.add(cp);

	   // forms and buttons
	   formButtonContainer = new LayoutContainer();
	   formButtonContainer.setScrollMode(Scroll.AUTO);
	   
	   jobEntryPanel = setupJobEntryPanel();
	   buttonPanel = setupButtonPanel();
        
	   formButtonContainer.add(jobEntryPanel);
	   formButtonContainer.add(buttonPanel);
        
	   BorderLayoutData data = new BorderLayoutData(LayoutRegion.CENTER);
	   data.setMargins(new Margins(4, 2, 4, 2));
	   container.add(formButtonContainer, data);
	   container.add(gridContainer, new BorderLayoutData(LayoutRegion.NORTH, 200));
	   
	   LayoutContainer wrapper = (LayoutContainer) Registry.get(Constants.CENTER_PANEL);
	   wrapper.removeAll();
	   wrapper.add(container);
	   wrapper.layout();
	   GWT.log("Done Initializing the UI in " + (new java.util.Date().getTime() - time), null);
	}
}
