/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This file is part of Liferay Social Office. Liferay Social Office is free
 * software: you can redistribute it and/or modify it under the terms of the GNU
 * Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * Liferay Social Office is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Liferay Social Office. If not, see http://www.gnu.org/licenses/agpl-3.0.html.
 */
package com.rivetlogic.suggestionbox.notifications;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.notifications.BaseUserNotificationHandler;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.UserNotificationEvent;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.rivetlogic.suggestionbox.model.Suggestion;
import com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;

/**
 * @author Jonathan Lee
 */
public class SuggestionNotificationHandler extends BaseUserNotificationHandler {

	public static final String PORTLET_ID = "suggestionbox_WAR_suggestionboxportlet";

	public SuggestionNotificationHandler() {
		setPortletId(PORTLET_ID);
	}

	@Override
	protected String getBody(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext) throws Exception {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(userNotificationEvent.getPayload());

		long suggestionId = jsonObject.getLong("suggestionId");

		Suggestion suggestion = SuggestionLocalServiceUtil.fetchSuggestion(suggestionId);

		if (Validator.isNull(suggestion)) {
			UserNotificationEventLocalServiceUtil.deleteUserNotificationEvent(userNotificationEvent.getPrimaryKey());
			return null;
		}

		long userId = jsonObject.getLong("userId");
		String notificationType = jsonObject.getString("notificationType");

		String title = getTitle(serviceContext, userId, notificationType);

		return StringUtil.replace(
				getBodyTemplate(),
				new String[] { "[$TITLE$]", "[$CATEGORY$]", "[$BODY_TEXT$]" },
				new String[] { title, HtmlUtil.escape(StringUtil.shorten(suggestion.getCategory(), 50)),
						HtmlUtil.escape(StringUtil.shorten(suggestion.getTitle(), 50)) });

	}

	@Override
	protected String getLink(UserNotificationEvent userNotificationEvent, ServiceContext serviceContext) throws Exception {

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject(userNotificationEvent.getPayload());

		long suggestionId = jsonObject.getLong("suggestionId");

		String notificationType = jsonObject.getString("notificationType");

		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();

		long portletPlid = PortalUtil.getPlidFromPortletId(themeDisplay.getScopeGroupId(), PORTLET_ID);

		PortletURL portletURL = null;

		if (portletPlid != 0) {
			portletURL = PortletURLFactoryUtil
					.create(serviceContext.getLiferayPortletRequest(), PORTLET_ID, portletPlid, PortletRequest.RENDER_PHASE);

			portletURL.setParameter("mvcPath", getMvcPath(notificationType));
			portletURL.setParameter("redirect", serviceContext.getLayoutFullURL());
			portletURL.setParameter("suggestionId", String.valueOf(suggestionId));

			return portletURL.toString();
		} else {

			LiferayPortletResponse liferayPortletResponse = serviceContext.getLiferayPortletResponse();

			PortletURL viewURL = liferayPortletResponse.createRenderURL(PORTLET_ID);
			viewURL.setParameter("mvcPath", getMvcPath(notificationType));
			viewURL.setParameter("redirect", serviceContext.getLayoutFullURL());
			viewURL.setParameter("suggestionId", String.valueOf(suggestionId));

			viewURL.setParameter("userNotificationEventId", String.valueOf(userNotificationEvent.getUserNotificationEventId()));
			viewURL.setWindowState(WindowState.NORMAL);

			return viewURL.toString();

		}
	}

	private String getTitle(ServiceContext serviceContext, long userId, String notificationType) {
		String message = "user-submitted-a-suggestion";

		switch (notificationType) {
		case "CREATED":
			message = "user-submitted-a-suggestion";
			break;
		case "RECEIVED":
			message = "user-received-your-suggestion";
			break;
		case "UPDATED":
			message = "user-updated-your-received-suggestion";
			break;
		default:
			break;
		}

		return serviceContext.translate(message, HtmlUtil.escape(PortalUtil.getUserName(userId, StringPool.BLANK)));
	}

	private String getMvcPath(String notificationType) {
		String mvcPath = "/html/suggestionbox/edit_admin_suggestion.jsp";

		switch (notificationType) {
		case "CREATED":
			mvcPath = "/html/suggestionbox/edit_admin_suggestion.jsp";
			break;
		case "RECEIVED":
			mvcPath = "/html/suggestionbox/view_suggestion.jsp";
			break;
		case "UPDATED":
			mvcPath = "/html/suggestionbox/view_suggestion.jsp";
			break;
		default:
			break;
		}

		return mvcPath;
	}

	private String getBodyTemplate() {
		StringBundler sb = new StringBundler(5);
		sb.append("<div class=\"title\">[$TITLE$]</div>");
		sb.append("<div class=\"body\"><i>[$CATEGORY$]:</i> [$BODY_TEXT$]</div>");
		return sb.toString();

	}

}