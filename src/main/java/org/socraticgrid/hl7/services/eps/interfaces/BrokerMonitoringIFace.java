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
package org.socraticgrid.hl7.services.eps.interfaces;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.socraticgrid.hl7.services.eps.exceptions.AuthenicationRequiredException;
import org.socraticgrid.hl7.services.eps.exceptions.FeatureNotAvailableException;
import org.socraticgrid.hl7.services.eps.exceptions.NoSuchTopicException;
import org.socraticgrid.hl7.services.eps.exceptions.NotAuthorizedException;
import org.socraticgrid.hl7.services.eps.model.BrokerStatistics;
import org.socraticgrid.hl7.services.eps.model.BrokerStatus;
import org.socraticgrid.hl7.services.eps.model.TopicStatistics;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 04-Jan-2014 6:15:19 PM
 */

@WebService(name = "brokermonitoring", targetNamespace = "org.socraticgrid.hl7.services.eps")
public interface BrokerMonitoringIFace {

	public BrokerStatus getBrokerStatus()	throws NotAuthorizedException, AuthenicationRequiredException,
	NoSuchTopicException, FeatureNotAvailableException;


	public BrokerStatistics getBrokerStatistics() throws NotAuthorizedException, AuthenicationRequiredException,
	NoSuchTopicException, FeatureNotAvailableException;


	public TopicStatistics getTopicStatistics(@WebParam(name = "topic") String topic) throws NotAuthorizedException, AuthenicationRequiredException,
	NoSuchTopicException, FeatureNotAvailableException;


}