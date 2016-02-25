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

package com.rivetlogic.suggestionbox.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.rivetlogic.suggestionbox.model.Suggestion;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Suggestion in entity cache.
 *
 * @author Manrique Varela
 * @see Suggestion
 * @generated
 */
public class SuggestionCacheModel implements CacheModel<Suggestion>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{suggestionId=");
		sb.append(suggestionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", category=");
		sb.append(category);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", status=");
		sb.append(status);
		sb.append(", receivedDate=");
		sb.append(receivedDate);
		sb.append(", receivedComment=");
		sb.append(receivedComment);
		sb.append(", receivedUserId=");
		sb.append(receivedUserId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Suggestion toEntityModel() {
		SuggestionImpl suggestionImpl = new SuggestionImpl();

		suggestionImpl.setSuggestionId(suggestionId);
		suggestionImpl.setGroupId(groupId);
		suggestionImpl.setCompanyId(companyId);
		suggestionImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			suggestionImpl.setCreateDate(null);
		}
		else {
			suggestionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			suggestionImpl.setModifiedDate(null);
		}
		else {
			suggestionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (category == null) {
			suggestionImpl.setCategory(StringPool.BLANK);
		}
		else {
			suggestionImpl.setCategory(category);
		}

		if (title == null) {
			suggestionImpl.setTitle(StringPool.BLANK);
		}
		else {
			suggestionImpl.setTitle(title);
		}

		if (description == null) {
			suggestionImpl.setDescription(StringPool.BLANK);
		}
		else {
			suggestionImpl.setDescription(description);
		}

		if (status == null) {
			suggestionImpl.setStatus(StringPool.BLANK);
		}
		else {
			suggestionImpl.setStatus(status);
		}

		if (receivedDate == Long.MIN_VALUE) {
			suggestionImpl.setReceivedDate(null);
		}
		else {
			suggestionImpl.setReceivedDate(new Date(receivedDate));
		}

		if (receivedComment == null) {
			suggestionImpl.setReceivedComment(StringPool.BLANK);
		}
		else {
			suggestionImpl.setReceivedComment(receivedComment);
		}

		suggestionImpl.setReceivedUserId(receivedUserId);

		suggestionImpl.resetOriginalValues();

		return suggestionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		suggestionId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		category = objectInput.readUTF();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		status = objectInput.readUTF();
		receivedDate = objectInput.readLong();
		receivedComment = objectInput.readUTF();
		receivedUserId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(suggestionId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(receivedDate);

		if (receivedComment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receivedComment);
		}

		objectOutput.writeLong(receivedUserId);
	}

	public long suggestionId;
	public long groupId;
	public long companyId;
	public long userId;
	public long createDate;
	public long modifiedDate;
	public String category;
	public String title;
	public String description;
	public String status;
	public long receivedDate;
	public String receivedComment;
	public long receivedUserId;
}