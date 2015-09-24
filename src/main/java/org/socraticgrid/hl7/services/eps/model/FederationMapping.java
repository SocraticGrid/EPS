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
import java.util.List;

public class FederationMapping implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String topic;
	private List<FederationMapEntry> partners;
	private List<FederationMapping> childMappings;
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	/**
	 * @return the partners
	 */
	public List<FederationMapEntry> getPartners() {
		return partners;
	}
	/**
	 * @param partners the partners to set
	 */
	public void setPartners(List<FederationMapEntry> partners) {
		this.partners = partners;
	}
	/**
	 * @return the childMappings
	 */
	public List<FederationMapping> getChildMappings() {
		return childMappings;
	}
	/**
	 * @param childMappings the childMappings to set
	 */
	public void setChildMappings(List<FederationMapping> childMappings) {
		this.childMappings = childMappings;
	}
	public FederationMapping() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
