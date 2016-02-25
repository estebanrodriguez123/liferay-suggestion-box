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

package com.rivetlogic.suggestionbox.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.rivetlogic.suggestionbox.model.Suggestion;
import com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil;

/**
 * @author Manrique Varela
 * @generated
 */
public abstract class SuggestionActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public SuggestionActionableDynamicQuery() throws SystemException {
		setBaseLocalService(SuggestionLocalServiceUtil.getService());
		setClass(Suggestion.class);

		setClassLoader(com.rivetlogic.suggestionbox.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("suggestionId");
	}
}