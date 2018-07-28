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
package org.openhie.openempi.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class BlockingMetricCalculator
{
	private Logger log = Logger.getLogger(getClass());
	
	private Long recordCount;
	private String trueLinkFilename;
	private String blockedLinksFilename;
	private List<Link> trueLinks = new ArrayList<Link>();
	private List<Link> blockedLinks = new ArrayList<Link>();
	
	
	public BlockingMetricCalculator(String recordCountStr, String trueLinkFilename, String blockedLinksFilename) {
		recordCount = Long.parseLong(recordCountStr);
		this.trueLinkFilename = trueLinkFilename;
		this.blockedLinksFilename = blockedLinksFilename;
	}

	public static void main(String[] args) {
		if (args.length < 3) {
			System.err.println("Usage: BlockingMetricCalculator record-count true-links-file blocking-generated-links-file");
			System.exit(-1);
		}
		BlockingMetricCalculator calc = new BlockingMetricCalculator(args[0], args[1], args[2]);
		calc.generateMetrics();
	}

	private void generateMetrics() {
		loadLinks(trueLinkFilename, trueLinks);
		loadLinks(blockedLinksFilename, blockedLinks);
		
		Map<Link,Link> trueLinkMap = buildMapFromList(trueLinks);
		double trueLinkCount = trueLinks.size();
		double matchRecordPairCount = 0;
		double nonmatchRecordPairCount = 0;
		double maxRecordPairs = ((double) recordCount * (recordCount-1)) / 2.0;
		for (Link link : blockedLinks) {
			Link found = trueLinkMap.get(link);
			if (found != null) {
				log.warn("Found link " + found + " with search " + link);
				matchRecordPairCount++;
			} else {
				nonmatchRecordPairCount++;
			}
		}
		double pairCompleteness = matchRecordPairCount / trueLinkCount;
		double totalRecordPairCount = (matchRecordPairCount + nonmatchRecordPairCount);
		double pairQuality = matchRecordPairCount / totalRecordPairCount;
		double reductionRatio = 1.0 - totalRecordPairCount/maxRecordPairs;
		System.out.println("True matches: " + trueLinkCount);
		System.out.println("Max Record Pairs: " + maxRecordPairs);
		System.out.println("Generated Record Pairs: " + totalRecordPairCount);
		System.out.println("Matching Record Pairs Generated: " + matchRecordPairCount);
		System.out.println("Non-Matching Record Pairs Generated: " + nonmatchRecordPairCount);
		System.out.println("Pair Completeness: " + pairCompleteness);
		System.out.println("Pair Quality: " + pairQuality);
		System.out.println("Reduction Ratio: " + reductionRatio);
		
		Map<Link,Link> blockedLinkMap = buildMapFromList(blockedLinks);
		int count=0;
		for (Link link : trueLinks) {
			Link found = blockedLinkMap.get(link);
			if (found == null) {
				log.warn("Didn't find link " + link);
				count++;
			}
			if (count > 10) {
				break;
			}
		}
	}

	private Map<Link, Link> buildMapFromList(List<Link> links) {
		Map<Link,Link> linkMap = new HashMap<Link,Link>();
		for (Link link : links) {
			linkMap.put(link, link);
		}
		return linkMap;
	}

	private void loadLinks(String filename, List<Link> list) {
		try {
			Scanner scanner = new Scanner(new File(filename));
			int count=0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] ids = line.split(",");
				Link link = new Link(Long.parseLong(ids[0]),Long.parseLong(ids[1]));
				if (!link.isValid()) {
					log.debug("Found invalid link: " + link);
					continue;
				}
				list.add(link);
				count++;
			}
			System.out.println("Processed " + count + " records.");
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}
	
	public class Link
	{
		private long leftId;
		private long rightId;
		
		public Link(long leftId, long rightId) {
			this.leftId = leftId;
			this.rightId = rightId;
		}

		public boolean isValid() {
			if (leftId == 0 || rightId == 0 || leftId == rightId) {
				return false;
			}
			return true;
		}
		
		public long getLeftId() {
			return leftId;
		}

		public void setLeftId(long leftId) {
			this.leftId = leftId;
		}

		public long getRightId() {
			return rightId;
		}

		public void setRightId(long rightId) {
			this.rightId = rightId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + (int) (leftId ^ (leftId >>> 32));
			result = prime * result + (int) (rightId ^ (rightId >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Link other = (Link) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (leftId != other.leftId && leftId != other.rightId)
				return false;
			if (rightId != other.rightId && rightId != other.leftId)
				return false;
			return true;
		}

		private BlockingMetricCalculator getOuterType() {
			return BlockingMetricCalculator.this;
		}

		@Override
		public String toString() {
			return "Link [leftId=" + leftId + ", rightId=" + rightId + "]";
		}
	}
}
