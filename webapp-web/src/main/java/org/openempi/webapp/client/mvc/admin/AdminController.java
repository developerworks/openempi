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
package org.openempi.webapp.client.mvc.admin;

import org.openempi.webapp.client.AppEvents;
import org.openempi.webapp.client.domain.AuthenticationException;
import org.openempi.webapp.client.mvc.Controller;

import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.mvc.Dispatcher;
import com.extjs.gxt.ui.client.widget.Info;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class AdminController extends Controller
{
	public AdminController() {
		this.registerEventTypes(AppEvents.AssignGlobalIdentifier);
		this.registerEventTypes(AppEvents.AdminStartPixPdqServer);
		this.registerEventTypes(AppEvents.AdminStopPixPdqServer);
		this.registerEventTypes(AppEvents.ClearLoggedLinks);
		this.registerEventTypes(AppEvents.InitializeRepository);
		this.registerEventTypes(AppEvents.LinkAllRecordPairs);
		this.registerEventTypes(AppEvents.InitializeCustomConfiguration);
		this.registerEventTypes(AppEvents.RebuildBlockingIndex);
	}
	
	@Override
	protected void initialize() {
		super.initialize();
	}


	@Override
	public void handleEvent(AppEvent event) {
		if (event.getType() == AppEvents.AdminStartPixPdqServer) {
			Info.display("Information", "Attempting to start the PIX/PDQ server; please wait...");
			getAdminService().startPixPdqServer(new AsyncCallback<String>() {
				public void onFailure(Throwable caught) {
					
					if (caught instanceof AuthenticationException) {
						Dispatcher.get().dispatch(AppEvents.Logout);
						return;
					}		 
			        Dispatcher.forwardEvent(AppEvents.Error, caught);
				}

				public void onSuccess(String message) {
					if (message == null) {
						Info.display("Information", "The PIX/PDQ server started successfuly.");
					} else {
						Info.display("Warning", "The PIX/PDQ server did not start successfuly: " + message);
					}
				}				
			});
		} else if (event.getType() == AppEvents.AssignGlobalIdentifier) {
				Info.display("Information", "Initiating the process of assigning global identifiers.");
				getAdminService().assignGlobalIdentifiers(new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {
						if (caught instanceof AuthenticationException) {
							Dispatcher.get().dispatch(AppEvents.Logout);
							return;
						}		 
				        Dispatcher.forwardEvent(AppEvents.Error, caught);
					}

					public void onSuccess(String message) {
						Info.display("Information", message);
					}
				});
		} else if (event.getType() == AppEvents.AdminStopPixPdqServer) {
			getAdminService().stopPixPdqServer(new AsyncCallback<String>() {
				public void onFailure(Throwable caught) {
					
					if (caught instanceof AuthenticationException) {
						Dispatcher.get().dispatch(AppEvents.Logout);
						return;
					}		 
			        Dispatcher.forwardEvent(AppEvents.Error, caught);
				}

				public void onSuccess(String message) {
					if (message == null) {
						Info.display("Information", "The PIX/PDQ server stopped successfuly.");
					} else {
						Info.display("Warning", "The PIX/PDQ server did not stop successfuly: " + message);
					}
				}				
			});
		} else if (event.getType() == AppEvents.InitializeRepository) {
            Info.display("Information", "Initiating the process of initializing the matching service.");			
			getAdminService().initializeRepository(new AsyncCallback<String>() {
				public void onFailure(Throwable caught) {
					
					if (caught instanceof AuthenticationException) {
						Dispatcher.get().dispatch(AppEvents.Logout);
						return;
					}		 
			        Dispatcher.forwardEvent(AppEvents.Error, caught);
				}

				public void onSuccess(String message) {
					Info.display("Information", message);
				}				
			});
		} else if (event.getType() == AppEvents.LinkAllRecordPairs) {
			Info.display("Information", "Initiating the process of regenerating all links.");
			getAdminService().linkAllRecordPairs(new AsyncCallback<String>() {
				public void onFailure(Throwable caught) {
					
					if (caught instanceof AuthenticationException) {
						Dispatcher.get().dispatch(AppEvents.Logout);
						return;
					}		 
			        Dispatcher.forwardEvent(AppEvents.Error, caught);
				}

				public void onSuccess(String message) {
                    Info.display("Information", message);
				}				
			});			
		} else if (event.getType() == AppEvents.InitializeCustomConfiguration) {
            Info.display("Information", "Initiating the process of regenerating custom fields.");			
			getAdminService().initializeCustomConfiguration(new AsyncCallback<String>() {
				public void onFailure(Throwable caught) {
					
					if (caught instanceof AuthenticationException) {
						Dispatcher.get().dispatch(AppEvents.Logout);
						return;
					}		 
					Dispatcher.forwardEvent(AppEvents.Error, caught);
				}

				public void onSuccess(String message) {
					Info.display("Information", message);
				}
			});
		} else if (event.getType() == AppEvents.RebuildBlockingIndex) {
            Info.display("Information", "Initiating the process of rebuilding blocking indexes.");
			getAdminService().rebuildBlockingIndex(new AsyncCallback<String>() {
				public void onFailure(Throwable caught) {
					
					if (caught instanceof AuthenticationException) {
						Dispatcher.get().dispatch(AppEvents.Logout);
						return;
					}		 
			        Dispatcher.forwardEvent(AppEvents.Error, caught);
				}

				public void onSuccess(String message) {
                    Info.display("Information", message);
				}				
			});
		} else if (event.getType() == AppEvents.ClearLoggedLinks) {
            Info.display("Information", "Initiating the process of clearing all logged links.");
            getAdminService().clearLoggedLinks(new AsyncCallback<String>() {
                public void onFailure(Throwable caught) {

                    if (caught instanceof AuthenticationException) {
                        Dispatcher.get().dispatch(AppEvents.Logout);
                        return;
                    }
                    Info.display("Warning", "The logged links were not cleared successfuly.");
                    Dispatcher.forwardEvent(AppEvents.Error, caught);
                }

                public void onSuccess(String message) {
                    Info.display("Information", "The logged links were cleared successfuly.");
                }
            });
		}
	}
}
