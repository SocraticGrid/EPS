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

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 04-Jan-2014 6:15:20 PM
 */
public class NotificationAddress implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private AddressType Type;
	private String Endpoint;

	public NotificationAddress(){

	}

	public AddressType getType(){
		return Type;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setType(AddressType newVal){
		Type = newVal;
	}

	public String getEndpoint(){
		return Endpoint;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setEndpoint(String newVal){
		Endpoint = newVal;
	}

}