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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

public class Version implements Serializable
{
    private static final long serialVersionUID = 7026807202616960797L;

    public static final String ARTIFACTID = "project.artifactId";
    public static final String VERSION = "project.version";
    public static final String BUILD_NUMBER = "project.buildNumber";
    public static final String SCM_BRANCH = "project.scmBranch";
    public static final String BUILD_TIMESTAMP = "project.buildTimestamp";
    public static final String SITEURL = "http://checkip.amazonaws.com";
    
    private String artifactId;
    private String version;
    private String buildNumber;
    private String scmBranch;
    private String buildTimestamp;
    private String site;
    
    public Version() {
    }

    public static Version loadFromProperties(Properties props) {
        Version version = new Version();
        version.setArtifactId(props.getProperty(ARTIFACTID));
        version.setVersion(props.getProperty(VERSION));
        version.setBuildNumber(props.getProperty(BUILD_NUMBER));
        version.setBuildTimestamp(props.getProperty(BUILD_TIMESTAMP));
        version.setScmBranch(props.getProperty(SCM_BRANCH));
        version.setSite(getLocalInfo());
        return version;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getScmBranch() {
        return scmBranch;
    }

    public void setScmBranch(String scmBranch) {
        this.scmBranch = scmBranch;
    }

    public String getBuildTimestamp() {
        return buildTimestamp;
    }

    public void setBuildTimestamp(String buildTimestamp) {
        this.buildTimestamp = buildTimestamp;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite() {
        return site;
    }
    
    private static String getLocalInfo() {
        BufferedReader in = null;
        String value = "";
        try {
            URL siteInfo = new URL(SITEURL);
            value = new BufferedReader(new InputStreamReader(siteInfo.openStream())).readLine();
            
            String hostName = "";
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            {
                while (interfaces.hasMoreElements()) {
                    NetworkInterface nic = interfaces.nextElement();
                    Enumeration<InetAddress> addresses = nic.getInetAddresses();
                    String piece = "";
                    while (addresses.hasMoreElements()) {
                        InetAddress address = addresses.nextElement();
                        if (!address.isLoopbackAddress()) {
                            piece = piece + address.getHostName() + ",";
                        }
                    }
                    hostName += piece;
                }
            }
            value = value + "-" + hostName;
        } catch (Exception e) {

        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                }
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Properties props = new Properties();
        try {
            InputStream stream = Version.class.getClassLoader().getResourceAsStream("version.properties");
            props.load(stream);
            Version version = Version.loadFromProperties(props);
            System.out.println(version.toJsonString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    @Override
    public String toString() {
        return "OpenEMPI Version Info:\n" + 
                "Artifact ID: " + artifactId + "\n" +
                "Version: " + version + "\n" +
                "Build Number: " + buildNumber + "\n" +
                "Branch: " + scmBranch + "\n" +
                "Build Timestamp: " + buildTimestamp + "\n";
    }

    public String toJsonString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{\n")
            .append("\"artifactId\":\"").append(artifactId).append("\",\n")
            .append("\"version\":\"").append(version).append("\",\n")
            .append("\"buildNumber\":\"").append(buildNumber).append("\",\n")
            .append("\"scmBranch\":\"").append(scmBranch).append("\",\n")
            .append("\"buildTimestamp\":\"").append(buildTimestamp).append("\",\n")
            .append("\"site\":\"").append(site).append("\"\n}\n");
        return sb.toString();
    }
}
