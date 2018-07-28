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
package org.openhie.openempi.blocking;

import java.util.List;

import org.openhie.openempi.model.Record;
import org.openhie.openempi.model.RecordPair;

public interface BlockingService
{
	/**
	 * The getRecordPairSource returns an object that represents a collection of
	 * all the record pairs from the default data source of the system (the entire
	 * repository of records). The record pairs are retrieved from the system
	 * based on the configuration of the blocking algorithm so this data source
	 * should typically return a number of record pairs that is considerably
	 * smaller than the complete set of n(n-1) record pairs.
	 * 
	 * @return
	 */
	public RecordPairSource getRecordPairSource();
	
	/**
	 * The getRecordPairSource returns an object that represents a collection of
	 * all the record pairs from the default data source of the system (the entire
	 * repository of records). The record pairs are retrieved from the system
	 * based on the configuration of the blocking algorithm specified by
	 * the list of BlockingRound objects. Depending on the blocking algorithm
	 * this data source should typically return a number of record pairs that is
	 * considerably smaller than the complete set of n(n-1) record pairs.
	 * 
	 * @return
	 */
	public RecordPairSource getRecordPairSource(Object parameters);
	
	/**
	 * Given a particular record, the findCandidates method returns a list
	 * of records that given the current configuration of the blocking algorithm
	 * are potential matches to the record passed in.
	 * 
	 * @param record A record that should be used along with the blocking algorithm
	 * to determine similar records that are potential matches.
	 * 
	 * @return
	 */
	public List<RecordPair> findCandidates(Record record);
	
	/**
	 * Returns the number of record pairs that will be generated by each of the configured
	 * rounds of blocking. For example, if there are two blocking rounds configured,
	 * the method will return a list of two entries, the first of which reports on the
	 * number of record pairs that the first round will generate and the second reports on
	 * the same for the second round of blocking.
	 */
	public List<Long> getRecordPairCount();
}
