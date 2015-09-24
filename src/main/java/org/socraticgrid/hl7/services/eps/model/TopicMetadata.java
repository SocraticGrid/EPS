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
public class TopicMetadata  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private List<Channel> channels;
	private List<Options> options;
	private User owner;
	private List<User> publishers;
	private String topicId;

	public TopicMetadata(){

	}

	public List<Channel> getChannels(){
		return channels;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setChannels(List<Channel> newVal){
		channels = newVal;
	}

	public List<Options> getOptions(){
		return options;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOptions(List<Options> newVal){
		options = newVal;
	}

	public User getOwner(){
		return owner;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setOwner(User newVal){
		owner = newVal;
	}

	public List<User> getPublishers(){
		return publishers;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPublishers(List<User> newVal){
		publishers = newVal;
	}

	public String getTopicId(){
		return topicId;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTopicId(String newVal){
		topicId = newVal;
	}

}