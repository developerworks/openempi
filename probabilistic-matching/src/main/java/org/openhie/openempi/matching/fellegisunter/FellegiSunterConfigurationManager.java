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
package org.openhie.openempi.matching.fellegisunter;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openhie.openempi.context.Context;

public class FellegiSunterConfigurationManager
{
    protected static final Log log = LogFactory.getLog(FellegiSunterConfigurationManager.class);

	private static final String FELLEGI_SUNTER_CONFIG_FILE_NAME = "FellegiSunterConfiguration.ser";
    private static final Double MIN_MARGINAL_VALUE = 0.0000001;
    private static final Double MAX_MARGINAL_VALUE = 0.9999999;

	public static void saveParameters(String configDirectory, FellegiSunterParameters params) {
		File filename = getConfigurationFile(configDirectory);
		log.debug("Attempting to save the Fellegi-Sunter configuration file into: " + filename);
		try {
			ObjectOutputStream ois = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(filename)));
			ois.writeObject(params);
			ois.flush();
			ois.close();
		} catch (Exception e) {
			log.error("Failed while saving the Fellegi-Sunter configuration file: " + e.getMessage(), e);
			throw new RuntimeException("Failed while saving the Fellegi-Sunter configuration: " + e.getMessage());
		}		
	}

	public static FellegiSunterParameters loadParameters(String configDirectory) {
		File filename = getConfigurationFile(configDirectory);
		log.debug("Attempting to load the configuration file for the migration log from: " + filename);
		try {
			ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)));
			FellegiSunterParameters params = (FellegiSunterParameters) ois.readObject();
			ois.close();
			return params;
		} catch (Exception e) {
			log.error("Failed while loading the Fellegi-Sunter configuration file: " + e.getMessage());
			throw new RuntimeException("Failed while loading the Fellegi-Sunter configuration: " + e.getMessage());
		}
	}
	
	public static void removeParametersFile(String configDirectory) {
		File filename = getConfigurationFile(configDirectory);
		if (filename != null && filename.exists()) {
			log.info("Removing the Fellegi-Sunter configuration file: " + filename.getAbsolutePath());
			boolean deleteOutcome = filename.delete();
			log.info("The Fellegi-Sunter configuration file delete operation resulted in status of " + deleteOutcome);
		}
	}

	private static File getConfigurationFile(String configDirectory) {
		File directory = getConfigFileDirectory(configDirectory);
		File filename = new File(directory, FELLEGI_SUNTER_CONFIG_FILE_NAME);
		return filename;
	}

	private static File getConfigFileDirectory(String configDirectory) {
		File directory = null;
		if (configDirectory != null && configDirectory.startsWith("/")) {
			directory = new File(configDirectory);	
		} else {
			directory = new File(Context.getOpenEmpiHome() + "/" + configDirectory);
		}
		log.info("Loading the configuration of the probabilistic algorithm from: " + directory.getAbsolutePath());
		if (!directory.exists()) {
			log.warn("Configured directory doesn't exist; will check the standard configuration directory.");
			directory = new File(Context.getOpenEmpiHome() + "/conf");
		}
		return directory;
	}
	
	public static void printConfigurationParameters(FellegiSunterParameters params) {
		log.info("--------- Probabilistic Matching Configuration ---------");
		log.info("");
		log.info(" Number of matching fields: " + params.getFieldCount());
		log.info(" Matching Field Names:");
		for (int i=0; i < params.getMatchingFieldNames().length; i++) {
			log.info("Field[" + i + "] = " + params.getMatchingFieldNames()[i]);
		}
		log.debug("m-Values:");
		for (int i=0; i < params.getFieldCount(); i++) {
			log.info("m[" + i + "] = " + params.getMValue(i));
		}
		log.info("");
		log.info("u-Values:");
		for (int i=0; i < params.getFieldCount(); i++) {
			log.info("u[" + i + "] = " + params.getUValue(i));
		}
		log.info("");
		log.info("lambda = " + params.getLambda());
		log.info("mu = " + params.getMu());
		log.info("");
		log.info("Lower Bound: " + params.getLowerBound());
		log.info("Upper Bound: " + params.getUpperBound());
		log.info("p-Value: " + params.getPValue());
		log.info("");
		log.info("Vector Frequencies: ");
		for (int i=0; i < params.getVectorCount(); i++) {
			log.info(i + "," + params.getVectorFrequency(i));
		}
		log.info("");
		log.info("Vector Weights: ");
		if (params.getVectorWeights() != null) {
    		for (int i=0; i < params.getVectorCount(); i++) {
    			log.info(i + "," + params.getVectorWeight(i));
    		}
		} else {
		    double[] vectorWeights = new double[params.getVectorCount()];
		    params.setVectorWeights(vectorWeights);
            for (int i=0; i < params.getVectorCount(); i++) {
                calculateVectorWeight(i, params);
                log.info(i + "," + params.getVectorWeight(i));
            }
		}
		log.info("");
		log.info("Initial m-value: " + params.getMInitialValue());
		log.info("Initial p-value: " + params.getPInitialValue());
		log.info("Initial u-value: " + params.getUInitialValue());
		log.info("Max EM-Iterations: " + params.getMaxIterations());
	}
	
	public static void main(String[] args) {
		FellegiSunterParameters params = FellegiSunterConfigurationManager.loadParameters("/home/odysseas/Documents");
		FellegiSunterConfigurationManager.printConfigurationParameters(params);
		FellegiSunterConfigurationManager.saveParameters("/home/odysseas/Documents", params);
	}

    private static void calculateVectorWeight(int vectorValue, FellegiSunterParameters fellegiSunterParams) {
        int bitPositions = fellegiSunterParams.getFieldCount();
        double weight = 0;
        for (int i = 0; i < bitPositions; i++) {
            int bitPosValue = getBitValueAtPosition(vectorValue, i);
            if (bitPosValue == 1) {
                Double numerator = fellegiSunterParams.getMValue(i);
                Double denominator = fellegiSunterParams.getUValue(i);
                numerator = adjustMinimumValue(numerator);
                denominator = adjustMinimumValue(denominator);
                weight += Math.log(numerator / denominator) / Math.log(2.0);
            } else {
                Double numerator = (1.0 - fellegiSunterParams.getMValue(i));
                Double denominator = (1.0 - fellegiSunterParams.getUValue(i));
                numerator = adjustMinimumValue(numerator);
                denominator = adjustMinimumValue(denominator);
                weight += Math.log(numerator / denominator) / Math.log(2.0);
            }
        }
        fellegiSunterParams.setVectorWeight(vectorValue, weight);
        if (log.isTraceEnabled()) {
            log.trace("Set the weight of vector " + vectorValue + " to " + weight);
        }
    }

    private static Double adjustMinimumValue(Double numerator) {
        if (numerator.doubleValue() < MIN_MARGINAL_VALUE.doubleValue()) {
            numerator = MIN_MARGINAL_VALUE;
        }
        return numerator;
    }

    private static int getBitValueAtPosition(int value, int pos) {
        int mask = 1;
        for (int i = 1; i <= pos; i++) {
            mask = mask << 1;
        }
        int valueAtPosition = mask & value;
        if (valueAtPosition > 0) {
            valueAtPosition = 1;
        }
        return valueAtPosition;
    }

	private static String getOpenempiHome() {
		String home = System.getenv("OPENEMPI_HOME");
		if (home != null && home.length() > 0) {
			return home;
		}
		home = System.getProperty("openempi.home");
		return home;
	}
}
