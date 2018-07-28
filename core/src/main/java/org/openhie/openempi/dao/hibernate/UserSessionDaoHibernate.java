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
package org.openhie.openempi.dao.hibernate;

import java.util.Date;
import java.util.List;

import org.openhie.openempi.dao.UserSessionDao;
import org.openhie.openempi.model.UserSession;

public class UserSessionDaoHibernate extends UniversalDaoHibernate implements UserSessionDao
{
	public UserSession findById(Integer sessionId) {
	    if (log.isDebugEnabled()) {
	        log.debug("Locating session by id: " + sessionId);
	    }
		UserSession session = (UserSession) getHibernateTemplate().load(UserSession.class, sessionId);
        if (log.isDebugEnabled()) {
            log.debug("Found session: " + session);
        }
		return session;
	}

	@SuppressWarnings("unchecked")
	public UserSession findBySessionKey(String sessionKey) {
        if (log.isDebugEnabled()) {
            log.debug("Locating session by key: " + sessionKey);
        }
		List<UserSession> list = (List<UserSession>) getHibernateTemplate().
		        find("from UserSession where sessionKey = ?", new Object[] { sessionKey });
		if (list.size() == 0) {
			return null;
		}
		UserSession session = list.get(0);
        if (log.isDebugEnabled()) {
            log.debug("Found session: " + session);
        }
		return session;
	}

    @SuppressWarnings("unchecked")
	public List<UserSession> findExpiredSessions(Date cutoff) {
        if (log.isDebugEnabled()) {
            log.debug("Locating session that haven't been modified after: " + cutoff);
        }
        List<UserSession> list = (List<UserSession>) getHibernateTemplate().
                find("from UserSession where dateModified < ?", cutoff);
        if (log.isDebugEnabled()) {
            log.debug("Found " + list.size() + " sessions that have expired.");
        }
        return list;
	}
	
	public void saveUserSession(UserSession session) {
	    if (log.isDebugEnabled()) {
	        log.debug("Saving session record: " + session);
	    }
		getHibernateTemplate().saveOrUpdate(session);
		if (log.isDebugEnabled()) {
		    log.debug("Finished saving the session.");
		}
	}
	
	public void removeUserSession(String sessionKey) {
	    if (log.isDebugEnabled()) {
	        log.debug("Removing session with key: " + sessionKey);
	    }
	    UserSession session = findBySessionKey(sessionKey);
	    if (session == null) {
	        if (log.isDebugEnabled()) {
	            log.debug("Session couldn't be removed because it does not exist: " + sessionKey);
	        }
	        return;
	    }
	    getHibernateTemplate().delete(session);
        if (log.isDebugEnabled()) {
            log.debug("Finished deleting the session.");
        }
	}

	@SuppressWarnings("unchecked")
	public List<UserSession> findAll() {
		List<UserSession> sessions = (List<UserSession>) this.getAll(UserSession.class);
		return sessions;
	}
}
