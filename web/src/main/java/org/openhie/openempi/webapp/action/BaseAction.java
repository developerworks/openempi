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
package org.openhie.openempi.webapp.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openhie.openempi.Constants;
import org.openhie.openempi.model.User;
import org.openhie.openempi.service.MailEngine;
import org.openhie.openempi.service.RoleManager;
import org.openhie.openempi.service.UserManager;
import org.springframework.mail.SimpleMailMessage;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;


/**
 * Implementation of <strong>ActionSupport</strong> that contains 
 * convenience methods for subclasses.  For example, getting the current
 * user and saving messages/errors. This class is intended to
 * be a base class for all Action classes.
 * 
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class BaseAction extends ActionSupport {
    private static final long serialVersionUID = 3525445612504421307L;

    /**
     * Constant for cancel result String
     */
    public static final String CANCEL = "cancel";

    /**
     * Transient log to prevent session synchronization issues - children can use instance for logging.
     */
    protected transient final Log log = LogFactory.getLog(getClass());

    /**
     * The UserManager
     */
    protected UserManager userManager;

    /**
     * The RoleManager
     */
    protected RoleManager roleManager;

    /**
     * Indicator if the user clicked cancel
     */
    protected String cancel;

    /**
     * Indicator for the page the user came from.
     */
    protected String from;

    /**
     * Set to "delete" when a "delete" request parameter is passed in
     */
    protected String delete;

    /**
     * Set to "save" when a "save" request parameter is passed in
     */
    protected String save;

    /**
     * MailEngine for sending e-mail
     */
    protected MailEngine mailEngine;

    /**
     * A message pre-populated with default data
     */
    protected SimpleMailMessage mailMessage;

    /**
     * Velocity template to use for e-mailing
     */
    protected String templateName;

    /**
     * Simple method that returns "cancel" result
     * @return "cancel"
     */
    public String cancel() {
        return CANCEL;
    }

    /**
     * Save the message in the session, appending if messages already exist
     * @param msg the message to put in the session
     */
    @SuppressWarnings("unchecked")
    protected void saveMessage(String msg) {
        List messages = (List) getRequest().getSession().getAttribute("messages");
        if (messages == null) {
            messages = new ArrayList();
        }
        messages.add(msg);
        getRequest().getSession().setAttribute("messages", messages);
    }

    /**
     * Convenience method to get the Configuration HashMap
     * from the servlet context.
     *
     * @return the user's populated form from the session
     */
    protected Map getConfiguration() {
        Map config = (HashMap) getSession().getServletContext().getAttribute(Constants.CONFIG);
        // so unit tests don't puke when nothing's been set
        if (config == null) {
            return new HashMap();
        }
        return config;
    }

    /**
     * Convenience method to get the request
     * @return current request
     */
    protected HttpServletRequest getRequest() {
        return ServletActionContext.getRequest();
    }

    /**
     * Convenience method to get the response
     * @return current response
     */
    protected HttpServletResponse getResponse() {
        return ServletActionContext.getResponse();
    }

    /**
     * Convenience method to get the session. This will create a session if one doesn't exist.
     * @return the session from the request (request.getSession()).
     */
    protected HttpSession getSession() {
        return getRequest().getSession();
    }

    /**
     * Convenience method to send e-mail to users
     * @param user the user to send to
     * @param msg the message to send
     * @param url the URL to the application (or where ever you'd like to send them)
     */
    protected void sendUserMessage(User user, String msg, String url) {
        if (log.isDebugEnabled()) {
            log.debug("sending e-mail to user [" + user.getEmail() + "]...");
        }

        mailMessage.setTo(user.getFullName() + "<" + user.getEmail() + ">");

        Map<String, Object> model = new HashMap<String, Object>();
        model.put("user", user);
        // TODO: figure out how to get bundle specified in struts.xml
        // model.put("bundle", getTexts());
        model.put("message", msg);
        model.put("applicationURL", url);
        mailEngine.sendMessage(mailMessage, templateName, model);
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public void setRoleManager(RoleManager roleManager) {
        this.roleManager = roleManager;
    }

    public void setMailEngine(MailEngine mailEngine) {
        this.mailEngine = mailEngine;
    }

    public void setMailMessage(SimpleMailMessage mailMessage) {
        this.mailMessage = mailMessage;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * Convenience method for setting a "from" parameter to indicate the previous page.
     * @param from indicator for the originating page
     */
    public void setFrom(String from) {
        this.from = from;
    }

    public void setDelete(String delete) {
        this.delete = delete;
    }

    public void setSave(String save) {
        this.save = save;
    }
}
