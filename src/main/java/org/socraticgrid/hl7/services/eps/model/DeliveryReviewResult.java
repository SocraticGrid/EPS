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

public class DeliveryReviewResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private DeliveryAction action;
	private Message event;
	public DeliveryReviewResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the action
	 */
	public DeliveryAction getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(DeliveryAction action) {
		this.action = action;
	}
	/**
	 * @return the event
	 */
	public Message getEvent() {
		return event;
	}
	/**
	 * @param event the event to set
	 */
	public void setEvent(Message event) {
		this.event = event;
	}
	
}
