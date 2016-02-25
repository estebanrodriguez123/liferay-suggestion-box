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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Manrique Varela
 * @generated
 */
public class SuggestionSoap implements Serializable {
	public static SuggestionSoap toSoapModel(Suggestion model) {
		SuggestionSoap soapModel = new SuggestionSoap();

		soapModel.setSuggestionId(model.getSuggestionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCategory(model.getCategory());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setStatus(model.getStatus());
		soapModel.setReceivedDate(model.getReceivedDate());
		soapModel.setReceivedComment(model.getReceivedComment());
		soapModel.setReceivedUserId(model.getReceivedUserId());

		return soapModel;
	}

	public static SuggestionSoap[] toSoapModels(Suggestion[] models) {
		SuggestionSoap[] soapModels = new SuggestionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SuggestionSoap[][] toSoapModels(Suggestion[][] models) {
		SuggestionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SuggestionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SuggestionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SuggestionSoap[] toSoapModels(List<Suggestion> models) {
		List<SuggestionSoap> soapModels = new ArrayList<SuggestionSoap>(models.size());

		for (Suggestion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SuggestionSoap[soapModels.size()]);
	}

	public SuggestionSoap() {
	}

	public long getPrimaryKey() {
		return _suggestionId;
	}

	public void setPrimaryKey(long pk) {
		setSuggestionId(pk);
	}

	public long getSuggestionId() {
		return _suggestionId;
	}

	public void setSuggestionId(long suggestionId) {
		_suggestionId = suggestionId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getCategory() {
		return _category;
	}

	public void setCategory(String category) {
		_category = category;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public Date getReceivedDate() {
		return _receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		_receivedDate = receivedDate;
	}

	public String getReceivedComment() {
		return _receivedComment;
	}

	public void setReceivedComment(String receivedComment) {
		_receivedComment = receivedComment;
	}

	public long getReceivedUserId() {
		return _receivedUserId;
	}

	public void setReceivedUserId(long receivedUserId) {
		_receivedUserId = receivedUserId;
	}

	private long _suggestionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _category;
	private String _title;
	private String _description;
	private String _status;
	private Date _receivedDate;
	private String _receivedComment;
	private long _receivedUserId;
}