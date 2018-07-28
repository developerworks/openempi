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
package org.openhie.openempi.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openhie.openempi.context.Context;
import org.openhie.openempi.dao.UserSessionDao;
import org.openhie.openempi.model.UserSession;

public class UserSessionRemover implements Runnable
{
    protected final Log log = LogFactory.getLog(getClass());
    private UserSessionDao userSessionDao;
    private String username;
    private String password;
    private int sessionDuration;
    private boolean initialized = false;
    
    public void run() {
        if (!initialized) {
            initialize();
        }
        Date cutoffDate = getCutoffDate();
        List<UserSession> expiredSessions = userSessionDao.findExpiredSessions(cutoffDate);
        for (UserSession session : expiredSessions) {
            if (log.isDebugEnabled()) {
                log.debug("Session expired: " + session);
            }
            userSessionDao.removeUserSession(session.getSessionKey());
        }
    }

    private Date getCutoffDate() {
        Date now = new Date();
        Date cutoffDate = new Date(now.getTime() - sessionDuration * 1000);
        if (log.isDebugEnabled()) {
            log.debug("Now is " + now + " and the cutoff date for session expiration is " + cutoffDate);
        }
        return cutoffDate;
    }

    private synchronized void initialize() {
        try {
            Context.authenticate(getUsername(), getPassword());
            sessionDuration = Context.getConfiguration().getAdminConfiguration().getSessionDuration();
            log.info("The session duration has been set to " + sessionDuration + " seconds.");
        } catch (Exception e) {
            log.error("Failed while initializing the service: " + e, e);
            throw new RuntimeException("Entity name configuration parameter is invalid.");
        }
        initialized = true;        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public UserSessionDao getUserSessionDao() {
        return userSessionDao;
    }

    public void setUserSessionDao(UserSessionDao userSessionDao) {
        this.userSessionDao = userSessionDao;
    }    
}
