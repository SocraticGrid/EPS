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

public class FederationMapEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FederationMapEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	private FederationRelationship relationship;
	private String partnerId;
	private String partnerTopic;
	/**
	 * @return the relationship
	 */
	public FederationRelationship getRelationship() {
		return relationship;
	}
	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(FederationRelationship relationship) {
		this.relationship = relationship;
	}
	/**
	 * @return the partnerId
	 */
	public String getPartnerId() {
		return partnerId;
	}
	/**
	 * @param partnerId the partnerId to set
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	/**
	 * @return the partnerTopic
	 */
	public String getPartnerTopic() {
		return partnerTopic;
	}
	/**
	 * @param partnerTopic the partnerTopic to set
	 */
	public void setPartnerTopic(String partnerTopic) {
		this.partnerTopic = partnerTopic;
	}
	
	//In the future add various options relating tyo the mapping here
	
	
}
