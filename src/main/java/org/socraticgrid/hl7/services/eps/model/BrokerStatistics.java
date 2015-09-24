/* 
 * Copyright 2015 Cognitive Medical Systems, Inc (http://www.cognitivemedciine.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socraticgrid.hl7.services.eps.model;

import java.util.Date;

public class BrokerStatistics  {

	
	private Date started;
	private long totalMessages;
	private long totalTopics;
	private String name;
	
	public BrokerStatistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the started
	 */
	public Date getStarted() {
		return started;
	}

	/**
	 * @param started the started to set
	 */
	public void setStarted(Date started) {
		this.started = started;
	}

	/**
	 * @return the totalMessages
	 */
	public long getTotalMessages() {
		return totalMessages;
	}

	/**
	 * @param totalMessages the totalMessages to set
	 */
	public void setTotalMessages(long totalMessages) {
		this.totalMessages = totalMessages;
	}

	/**
	 * @return the totalTopics
	 */
	public long getTotalTopics() {
		return totalTopics;
	}

	/**
	 * @param totalTopics the totalTopics to set
	 */
	public void setTotalTopics(long totalTopics) {
		this.totalTopics = totalTopics;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
