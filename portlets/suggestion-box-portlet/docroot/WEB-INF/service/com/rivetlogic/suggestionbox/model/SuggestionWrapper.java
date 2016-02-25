/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.rivetlogic.suggestionbox.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Suggestion}.
 * </p>
 *
 * @author Manrique Varela
 * @see Suggestion
 * @generated
 */
public class SuggestionWrapper implements Suggestion, ModelWrapper<Suggestion> {
	public SuggestionWrapper(Suggestion suggestion) {
		_suggestion = suggestion;
	}

	@Override
	public Class<?> getModelClass() {
		return Suggestion.class;
	}

	@Override
	public String getModelClassName() {
		return Suggestion.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("suggestionId", getSuggestionId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("category", getCategory());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());
		attributes.put("status", getStatus());
		attributes.put("receivedDate", getReceivedDate());
		attributes.put("receivedComment", getReceivedComment());
		attributes.put("receivedUserId", getReceivedUserId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long suggestionId = (Long)attributes.get("suggestionId");

		if (suggestionId != null) {
			setSuggestionId(suggestionId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Date receivedDate = (Date)attributes.get("receivedDate");

		if (receivedDate != null) {
			setReceivedDate(receivedDate);
		}

		String receivedComment = (String)attributes.get("receivedComment");

		if (receivedComment != null) {
			setReceivedComment(receivedComment);
		}

		Long receivedUserId = (Long)attributes.get("receivedUserId");

		if (receivedUserId != null) {
			setReceivedUserId(receivedUserId);
		}
	}

	/**
	* Returns the primary key of this suggestion.
	*
	* @return the primary key of this suggestion
	*/
	@Override
	public long getPrimaryKey() {
		return _suggestion.getPrimaryKey();
	}

	/**
	* Sets the primary key of this suggestion.
	*
	* @param primaryKey the primary key of this suggestion
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_suggestion.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the suggestion ID of this suggestion.
	*
	* @return the suggestion ID of this suggestion
	*/
	@Override
	public long getSuggestionId() {
		return _suggestion.getSuggestionId();
	}

	/**
	* Sets the suggestion ID of this suggestion.
	*
	* @param suggestionId the suggestion ID of this suggestion
	*/
	@Override
	public void setSuggestionId(long suggestionId) {
		_suggestion.setSuggestionId(suggestionId);
	}

	/**
	* Returns the group ID of this suggestion.
	*
	* @return the group ID of this suggestion
	*/
	@Override
	public long getGroupId() {
		return _suggestion.getGroupId();
	}

	/**
	* Sets the group ID of this suggestion.
	*
	* @param groupId the group ID of this suggestion
	*/
	@Override
	public void setGroupId(long groupId) {
		_suggestion.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this suggestion.
	*
	* @return the company ID of this suggestion
	*/
	@Override
	public long getCompanyId() {
		return _suggestion.getCompanyId();
	}

	/**
	* Sets the company ID of this suggestion.
	*
	* @param companyId the company ID of this suggestion
	*/
	@Override
	public void setCompanyId(long companyId) {
		_suggestion.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this suggestion.
	*
	* @return the user ID of this suggestion
	*/
	@Override
	public long getUserId() {
		return _suggestion.getUserId();
	}

	/**
	* Sets the user ID of this suggestion.
	*
	* @param userId the user ID of this suggestion
	*/
	@Override
	public void setUserId(long userId) {
		_suggestion.setUserId(userId);
	}

	/**
	* Returns the user uuid of this suggestion.
	*
	* @return the user uuid of this suggestion
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestion.getUserUuid();
	}

	/**
	* Sets the user uuid of this suggestion.
	*
	* @param userUuid the user uuid of this suggestion
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_suggestion.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this suggestion.
	*
	* @return the create date of this suggestion
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _suggestion.getCreateDate();
	}

	/**
	* Sets the create date of this suggestion.
	*
	* @param createDate the create date of this suggestion
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_suggestion.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this suggestion.
	*
	* @return the modified date of this suggestion
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _suggestion.getModifiedDate();
	}

	/**
	* Sets the modified date of this suggestion.
	*
	* @param modifiedDate the modified date of this suggestion
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_suggestion.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the category of this suggestion.
	*
	* @return the category of this suggestion
	*/
	@Override
	public java.lang.String getCategory() {
		return _suggestion.getCategory();
	}

	/**
	* Sets the category of this suggestion.
	*
	* @param category the category of this suggestion
	*/
	@Override
	public void setCategory(java.lang.String category) {
		_suggestion.setCategory(category);
	}

	/**
	* Returns the title of this suggestion.
	*
	* @return the title of this suggestion
	*/
	@Override
	public java.lang.String getTitle() {
		return _suggestion.getTitle();
	}

	/**
	* Sets the title of this suggestion.
	*
	* @param title the title of this suggestion
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_suggestion.setTitle(title);
	}

	/**
	* Returns the description of this suggestion.
	*
	* @return the description of this suggestion
	*/
	@Override
	public java.lang.String getDescription() {
		return _suggestion.getDescription();
	}

	/**
	* Sets the description of this suggestion.
	*
	* @param description the description of this suggestion
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_suggestion.setDescription(description);
	}

	/**
	* Returns the status of this suggestion.
	*
	* @return the status of this suggestion
	*/
	@Override
	public java.lang.String getStatus() {
		return _suggestion.getStatus();
	}

	/**
	* Sets the status of this suggestion.
	*
	* @param status the status of this suggestion
	*/
	@Override
	public void setStatus(java.lang.String status) {
		_suggestion.setStatus(status);
	}

	/**
	* Returns the received date of this suggestion.
	*
	* @return the received date of this suggestion
	*/
	@Override
	public java.util.Date getReceivedDate() {
		return _suggestion.getReceivedDate();
	}

	/**
	* Sets the received date of this suggestion.
	*
	* @param receivedDate the received date of this suggestion
	*/
	@Override
	public void setReceivedDate(java.util.Date receivedDate) {
		_suggestion.setReceivedDate(receivedDate);
	}

	/**
	* Returns the received comment of this suggestion.
	*
	* @return the received comment of this suggestion
	*/
	@Override
	public java.lang.String getReceivedComment() {
		return _suggestion.getReceivedComment();
	}

	/**
	* Sets the received comment of this suggestion.
	*
	* @param receivedComment the received comment of this suggestion
	*/
	@Override
	public void setReceivedComment(java.lang.String receivedComment) {
		_suggestion.setReceivedComment(receivedComment);
	}

	/**
	* Returns the received user ID of this suggestion.
	*
	* @return the received user ID of this suggestion
	*/
	@Override
	public long getReceivedUserId() {
		return _suggestion.getReceivedUserId();
	}

	/**
	* Sets the received user ID of this suggestion.
	*
	* @param receivedUserId the received user ID of this suggestion
	*/
	@Override
	public void setReceivedUserId(long receivedUserId) {
		_suggestion.setReceivedUserId(receivedUserId);
	}

	/**
	* Returns the received user uuid of this suggestion.
	*
	* @return the received user uuid of this suggestion
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getReceivedUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestion.getReceivedUserUuid();
	}

	/**
	* Sets the received user uuid of this suggestion.
	*
	* @param receivedUserUuid the received user uuid of this suggestion
	*/
	@Override
	public void setReceivedUserUuid(java.lang.String receivedUserUuid) {
		_suggestion.setReceivedUserUuid(receivedUserUuid);
	}

	@Override
	public boolean isNew() {
		return _suggestion.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_suggestion.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _suggestion.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_suggestion.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _suggestion.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _suggestion.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_suggestion.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _suggestion.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_suggestion.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_suggestion.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_suggestion.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SuggestionWrapper((Suggestion)_suggestion.clone());
	}

	@Override
	public int compareTo(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion) {
		return _suggestion.compareTo(suggestion);
	}

	@Override
	public int hashCode() {
		return _suggestion.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rivetlogic.suggestionbox.model.Suggestion> toCacheModel() {
		return _suggestion.toCacheModel();
	}

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion toEscapedModel() {
		return new SuggestionWrapper(_suggestion.toEscapedModel());
	}

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion toUnescapedModel() {
		return new SuggestionWrapper(_suggestion.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _suggestion.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _suggestion.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_suggestion.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SuggestionWrapper)) {
			return false;
		}

		SuggestionWrapper suggestionWrapper = (SuggestionWrapper)obj;

		if (Validator.equals(_suggestion, suggestionWrapper._suggestion)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Suggestion getWrappedSuggestion() {
		return _suggestion;
	}

	@Override
	public Suggestion getWrappedModel() {
		return _suggestion;
	}

	@Override
	public void resetOriginalValues() {
		_suggestion.resetOriginalValues();
	}

	private Suggestion _suggestion;
}