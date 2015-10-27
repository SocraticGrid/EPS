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
 * @created 04-Jan-2014 6:15:21 PM
 */
public class User  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private NotificationAddress defaultNotificationAddress;
	private NotificationAddress defaultOnDemandEndpoint;
	private String name;
	private List<Role> privileges;
	private boolean supportsPublishOnDemand;
	private String userId;

	public User(){

	}

	public NotificationAddress getDefaultNotificationAddress(){
		return defaultNotificationAddress;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDefaultNotificationAddress(NotificationAddress newVal){
		defaultNotificationAddress = newVal;
	}

	public NotificationAddress getDefaultOnDemandEndpoint(){
		return defaultOnDemandEndpoint;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDefaultOnDemandEndpoint(NotificationAddress newVal){
		defaultOnDemandEndpoint = newVal;
	}

	public String getName(){
		return name;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setName(String newVal){
		name = newVal;
	}

        public List<Role> getPrivileges() {
               return privileges;
        }

        public void setPrivileges(List<Role> privileges) {
                this.privileges = privileges;
        }
        
	public boolean isSupportsPublishOnDemand(){
		return supportsPublishOnDemand;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSupportsPublishOnDemand(boolean newVal){
		supportsPublishOnDemand = newVal;
	}

	public String getUserId(){
		return userId;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setUserId(String newVal){
		userId = newVal;
	}

}