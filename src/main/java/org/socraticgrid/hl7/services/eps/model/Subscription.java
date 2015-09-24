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
public class Subscription  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private String id;
	private SubscriptionType type;
	/**
	 * When Empty the Users Default Address should be used
	 */
	private NotificationAddress subscriberNotificationAddress;
	private User subscriber;
	private ContractType contractType;
	private Channel channel;
	private Durability durability;
	private String lastMessage;
	private boolean requireId;

	public Subscription(){

	}

	public String getId(){
		return id;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setId(String newVal){
		id = newVal;
	}

	public SubscriptionType getType(){
		return type;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setType(SubscriptionType newVal){
		type = newVal;
	}

	/**
	 * When Empty the Users Default Address should be used
	 */
	public NotificationAddress getSubscriberNotificationAddress(){
		return subscriberNotificationAddress;
	}

	/**
	 * When Empty the Users Default Address should be used
	 * 
	 * @param newVal
	 */
	public void setSubscriberNotificationAddress(NotificationAddress newVal){
		subscriberNotificationAddress = newVal;
	}

	public User getSubscriber(){
		return subscriber;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSubscriber(User newVal){
		subscriber = newVal;
	}

	public ContractType getContractType(){
		return contractType;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setContractType(ContractType newVal){
		contractType = newVal;
	}

	public Channel getChannel(){
		return channel;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setChannel(Channel newVal){
		channel = newVal;
	}

	public Durability getDurability(){
		return durability;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDurability(Durability newVal){
		durability = newVal;
	}

	public String getLastMessage(){
		return lastMessage;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLastMessage(String newVal){
		lastMessage = newVal;
	}

	public boolean isRequireId(){
		return requireId;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setRequireId(boolean newVal){
		requireId = newVal;
	}

}