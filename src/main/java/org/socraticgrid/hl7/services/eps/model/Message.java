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
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version 1.0
 * @created 04-Jan-2014 6:15:20 PM
 */
@XmlRootElement
public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	private MessageHeader header = new MessageHeader();
	private String title;
	private MessageState state = MessageState.Initial;
	private List<String> topics = new LinkedList<String>();
	private List<MessageBody> messageBodies = new LinkedList<MessageBody>();

	public Message(){

	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the state
	 */
	public MessageState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(MessageState state) {
		this.state = state;
	}

	/**
	 * @return the topics
	 */
	public List<String> getTopics() {
		return topics;
	}

	/**
	 * @param topics the topics to set
	 */
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	/**
	 * @return the messageBody
	 */
	public List<MessageBody> getMessageBodies() {
		return messageBodies;
	}

	/**
	 * @param messageBody the messageBody to set
	 */
	public void setMessageBodies(List<MessageBody> messageBodies) {
		this.messageBodies = messageBodies;
	}

	/**
	 * @return the header
	 */
	public MessageHeader getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(MessageHeader header) {
		this.header = header;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Message [header=" + header + ", title=" + title + ", state="
				+ state + ", topics=" + topics + ", messageBodies="
				+ messageBodies + "]";
	}


}