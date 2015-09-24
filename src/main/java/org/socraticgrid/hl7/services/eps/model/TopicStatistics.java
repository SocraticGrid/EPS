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

import java.io.Serializable;

public class TopicStatistics  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long activeMessages;
	private long activeSubscriptions;
	private long totalMessages;
	private long totalSubscriptions;
	private long deliveryFaults;
	private long pendingDelivery;
	
	public TopicStatistics() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the activeMessages
	 */
	public long getActiveMessages() {
		return activeMessages;
	}
	/**
	 * @param activeMessages the activeMessages to set
	 */
	public void setActiveMessages(long activeMessages) {
		this.activeMessages = activeMessages;
	}
	/**
	 * @return the activeSubscriptions
	 */
	public long getActiveSubscriptions() {
		return activeSubscriptions;
	}
	/**
	 * @param activeSubscriptions the activeSubscriptions to set
	 */
	public void setActiveSubscriptions(long activeSubscriptions) {
		this.activeSubscriptions = activeSubscriptions;
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
	 * @return the totalSubscriptions
	 */
	public long getTotalSubscriptions() {
		return totalSubscriptions;
	}
	/**
	 * @param totalSubscriptions the totalSubscriptions to set
	 */
	public void setTotalSubscriptions(long totalSubscriptions) {
		this.totalSubscriptions = totalSubscriptions;
	}
	/**
	 * @return the deliveryFaults
	 */
	public long getDeliveryFaults() {
		return deliveryFaults;
	}
	/**
	 * @param deliveryFaults the deliveryFaults to set
	 */
	public void setDeliveryFaults(long deliveryFaults) {
		this.deliveryFaults = deliveryFaults;
	}
	/**
	 * @return the pendingDelivery
	 */
	public long getPendingDelivery() {
		return pendingDelivery;
	}
	/**
	 * @param pendingDelivery the pendingDelivery to set
	 */
	public void setPendingDelivery(long pendingDelivery) {
		this.pendingDelivery = pendingDelivery;
	}
	
}
