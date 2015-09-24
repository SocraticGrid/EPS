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

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.socraticgrid.hl7.services.eps.exceptions.AuthenicationRequiredException;
import org.socraticgrid.hl7.services.eps.exceptions.ConflictException;
import org.socraticgrid.hl7.services.eps.exceptions.FeatureNotAvailableException;
import org.socraticgrid.hl7.services.eps.exceptions.InvalidDataException;
import org.socraticgrid.hl7.services.eps.exceptions.NoSuchItemException;
import org.socraticgrid.hl7.services.eps.exceptions.NoSuchTopicException;
import org.socraticgrid.hl7.services.eps.exceptions.NotAuthorizedException;
import org.socraticgrid.hl7.services.eps.model.AccessRequest;
import org.socraticgrid.hl7.services.eps.model.Affiliation;
import org.socraticgrid.hl7.services.eps.model.AffiliationMapping;
import org.socraticgrid.hl7.services.eps.model.AffiliationRole;

/**
 * @author Jerry Goodnough
 * @version 1.0
 * @created 04-Jan-2014 6:15:21 PM
 */
@WebService(name = "topicmanagement", targetNamespace = "org.socraticgrid.hl7.services.eps")
public interface TopicManagementIFace {

	public boolean createAffiliation(@WebParam(name = "topic") String topic,
			@WebParam(name = "userId") String userId,
			@WebParam(name = "role") AffiliationRole role)
			throws NotAuthorizedException, AuthenicationRequiredException,
			NoSuchTopicException, NoSuchItemException, InvalidDataException;

	public List<Affiliation> getAffiliationsForTopic(
			@WebParam(name = "topic") String topicId)
			throws NotAuthorizedException, AuthenicationRequiredException,
			NoSuchTopicException;

	public List<AffiliationMapping> getAffiliationsForUser(
			@WebParam(name = "userId") String userId)
			throws NotAuthorizedException, AuthenicationRequiredException,
			NoSuchItemException;

	public boolean updateAffiliation(@WebParam(name = "topic") String topic,
			@WebParam(name = "userId") String userId,
			@WebParam(name = "role") AffiliationRole role)
			throws NotAuthorizedException, AuthenicationRequiredException,
			NoSuchTopicException, ConflictException;

	public boolean deleteAffiliation(@WebParam(name = "topic") String topic,
			@WebParam(name = "userId") String userId,
			@WebParam(name = "role") AffiliationRole role)
			throws NotAuthorizedException, AuthenicationRequiredException,
			NoSuchTopicException;

	public List<AccessRequest> getPendingAccessRequests(
			@WebParam(name = "topic") String topic)
			throws NotAuthorizedException, AuthenicationRequiredException,
			NoSuchTopicException, FeatureNotAvailableException;

	/**
	 * Onetime or always
	 */
	public boolean grantAccessRequest(
			@WebParam(name = "request") AccessRequest request)
			throws NotAuthorizedException, AuthenicationRequiredException,
			ConflictException, FeatureNotAvailableException;

	public boolean rejectAccessRequest(
			@WebParam(name = "request") AccessRequest request)
			throws NotAuthorizedException, AuthenicationRequiredException,
			ConflictException, FeatureNotAvailableException;

	public boolean processPendingAccessRequests(
			@WebParam(name = "topic") String topic)
			throws NotAuthorizedException, AuthenicationRequiredException,
			NoSuchTopicException, FeatureNotAvailableException;

}