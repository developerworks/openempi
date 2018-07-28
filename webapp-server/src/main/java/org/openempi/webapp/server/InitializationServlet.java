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
package org.openempi.webapp.server;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openhie.openempi.context.Context;
import org.openhie.openempi.model.Version;

@SuppressWarnings("serial")
public class InitializationServlet extends HttpServlet
{
    private static final String OPENEMPI_UPDATES_SITE = "OPENEMPI_UPDATES_SITE";
    private Logger log = Logger.getLogger(getClass());

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		try {
			Context.startup();
			if (!Context.isInitialized()) {
				log.error("The context did not initialize properly.");
				return;
			}
			initializeAndMonitorLogging();
            String updateSiteUrl = config.getInitParameter(OPENEMPI_UPDATES_SITE);
            checkForUpdates(updateSiteUrl);
            config.getServletContext().setAttribute(WebappConstants.APPLICATION_CONTEXT,
                    Context.getApplicationContext());
		} catch (Throwable t) {
			log.error("Failed to start: " + t.getMessage(), t);
		}
	}

	private void initializeAndMonitorLogging() {
		String home = Context.getOpenEmpiHome();
		File logConfFile = new File(home + "/conf/log4j.properties");
		try {
			if (logConfFile.exists() && logConfFile.canRead()) {
				PropertyConfigurator.configureAndWatch(logConfFile.getAbsolutePath());
				log.info("Installed log configuration file listener.");
			} else {
				log.info("Failed to install a log configuration listener because the configuration file is not accessible.");
			}
		} catch (Exception e) {
			log.info("Failed to install a log configuration listener: " + e, e);
		}
	}
	
    private void checkForUpdates(String updateSiteUrl) {
        try {
            Version version = Context.getConfiguration().getVersion();
            log.info("Looking for updates for version: " + version);
            sendUpdatesRequest(updateSiteUrl, version);
        } catch (Throwable e) {

        }
    }

    private void sendUpdatesRequest(String updateSiteUrl, Version version) throws HttpException, IOException {
        PostMethod post = new PostMethod(updateSiteUrl);
        HttpClient httpclient = new HttpClient();
        try {
            RequestEntity entity = new StringRequestEntity(version.toJsonString(), "application/json", "UTF8");
            post.setRequestEntity(entity);
            int result = httpclient.executeMethod(post);
            //TODO: Need to figure out how to apply the update if there is one
            if (log.isDebugEnabled()) {
                log.debug("Response status code: " + result);
                log.debug("Response body: ");
                log.debug(post.getResponseBodyAsString());
            }
        } finally {
            post.releaseConnection();
        }
    }

	@Override
	public void destroy() {
		super.destroy();
		try {
			Context.shutdown();
		} catch (Throwable t) {
			log.error("Failed to shutdown OpenEMPI properly: " + t.getMessage(), t);
		}
	}
}
