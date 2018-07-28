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
package org.openhie.openempi.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.openhie.openempi.context.Context;
import org.openhie.openempi.profiling.DataProfilerLoader;
import org.openhie.openempi.util.BaseSpringApp;

public class FileLoaderManager extends BaseSpringApp
{
	protected static Logger log = Logger.getLogger(FileLoaderManager.class);
	private PersonLoaderManager personLoaderMgr;
	private FileLoader loader;
	
	public FileLoaderManager() {
		
	}
	
	public void setUp() {
		setUp(null);
	}
	
	public void setUp(java.util.Map<String,Object> map) {
		startup();
		personLoaderMgr = (PersonLoaderManager) Context.getApplicationContext().getBean("personLoaderManager");
		personLoaderMgr.setupConnection(map);
	}
	
	public FileLoaderResults loadFile(String filename, String loaderAlias) {
		 File file = new File(filename);
		 log.debug("Loading file " + file.getAbsolutePath());
		 if (!file.isFile() || !file.canRead()) {
			 log.error("Input file is not available.");
			 throw new RuntimeException("Input file " + filename + " is not readable.");
		 }
		 loader = FileLoaderFactory.getFileLoader(Context.getApplicationContext(), loaderAlias);
		 loader.setLoaderAlias(loaderAlias);
		 loader.setPersonLoaderManager(personLoaderMgr);
		 loader.init();
		 return loader.parseFile(file);
	}
	
	public String dataProfile(String filename, Integer userFileId) {
		 File file = new File(filename);
		 log.debug("Loading file " + file.getAbsolutePath());
		 if (!file.isFile() || !file.canRead()) {
			 log.error("Input file is not available.");
			 throw new RuntimeException("Input file " + filename + " is not readable.");
		 }
		
		 DataProfilerLoader dataProfilerLoader = new DataProfilerLoader();			
		 return dataProfilerLoader.parseFile(file, userFileId);
	}
	
	public static void main(String[] args) {
		if (args.length < 3) {
			usage();
			System.exit(-1);
		}
		String filename = args[0];
		String loaderAlias = args[1];
		String entityName = args[2];
		
        java.util.HashMap<String,Object> map = new java.util.HashMap<String,Object>();

		Boolean isImport = Boolean.FALSE;
		if (args.length >= 3 && args[3] != null && args[3].equalsIgnoreCase("true")) {
			isImport = Boolean.TRUE;
		}
		String mappingFile = "";
		if (args.length >= 4 && args[4] != null) {
			mappingFile = args[4];
		}
		Boolean previewOnly = Boolean.FALSE;
		if (args.length > 5 && args[5] != null && args[5].equalsIgnoreCase("true")) {
			previewOnly = Boolean.TRUE;
		}
		log.info("Loading the data file " + filename + " using loader " + loaderAlias);
		Boolean isMassiveInsert = Boolean.FALSE;
		if (args.length >= 6 && args[6] != null && args[6].equalsIgnoreCase("true")) {
		    isMassiveInsert = Boolean.TRUE;
		}

        Context.startup();
        Context.authenticate("admin", "admin");
        map.put("context", Context.getApplicationContext());
        map.put(FileLoaderParameters.IS_IMPORT, isImport);
        map.put(FileLoaderParameters.MAPPING_FILE, mappingFile);
        map.put(FileLoaderParameters.ENTITY_NAME, entityName);
        map.put(FileLoaderParameters.PREVIEW_ONLY, previewOnly);
        map.put(FileLoaderParameters.IS_MASSIVE_INSERT, isMassiveInsert);

		BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in)) ;
		try {
		    System.out.println("Press a character to get started.");
		    bufRead.readLine();
		}
		catch (IOException err) {
		     System.out.println("Error reading line");
		}
		
		FileLoaderManager fileLoaderManager=null;
		try {
			fileLoaderManager = new FileLoaderManager();
			fileLoaderManager.setUp(map);
			fileLoaderManager.loadFile(filename, loaderAlias);
	        try {
	            System.out.println("Press a character to shutdown.");
	            bufRead.readLine();
	        }
	        catch (IOException err) {
	             System.out.println("Error reading line");
	        }
		} catch (Throwable t) {
			log.error("Got an exception: " + t);
		} finally {
		    if (fileLoaderManager != null) {
		        fileLoaderManager.shutdown();
		    }
		}
	}
	
	public void shutdown() {
	    if (loader != null) {
	        loader.shutdown();
	    }
	    if (personLoaderMgr != null) {
	        personLoaderMgr.shutdownConnection();
	    }
		Context.shutdown();
	}

	public static void usage() {
		System.out.println("Usage: " + FileLoaderManager.class.getName() + " <file-to-load> <loader-alias> <entity-name> [<import-data-boolean-flag>] [<mapping-file-name>] [<is-preview-only>] [<is-massive-insert>]");
	}
}
