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

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 04-Jan-2014 6:15:19 PM
 */
public class AccessRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User userId;
	private String topic;
	List<AffiliationRole> roles;

	public AccessRequest(){

	}


	public User getUserId(){
		return userId;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setUserId(User newVal){
		userId = newVal;
	}


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
	 * @return the roles
	 */
	public List<AffiliationRole> getRoles() {
		return roles;
	}


	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<AffiliationRole> roles) {
		this.roles = roles;
	}

}