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

package com.rivetlogic.suggestionbox.service.impl;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.notifications.NotificationEvent;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.User;
import com.liferay.portal.model.UserNotificationEvent;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.service.UserNotificationDeliveryLocalServiceUtil;
import com.liferay.portal.service.UserNotificationEventLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.rivetlogic.suggestionbox.model.Suggestion;
import com.rivetlogic.suggestionbox.notifications.SuggestionNotificationHandler;
import com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil;
import com.rivetlogic.suggestionbox.service.base.SuggestionLocalServiceBaseImpl;
import com.rivetlogic.suggestionbox.service.util.SuggestionStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the suggestion local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.rivetlogic.suggestionbox.service.SuggestionLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Manrique Varela
 * @see com.rivetlogic.suggestionbox.service.base.SuggestionLocalServiceBaseImpl
 * @see com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil
 */
public class SuggestionLocalServiceImpl extends SuggestionLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil} to
	 * access the suggestion local service.
	 */

	@Override
	public Suggestion addSuggestion(Suggestion newSuggestion, ServiceContext serviceContext) throws SystemException, PortalException {

		long suggestionId = counterLocalService.increment(Suggestion.class.getName());
		Date now = new Date();

		Suggestion suggestion = suggestionPersistence.create(suggestionId);

		suggestion.setCompanyId(newSuggestion.getCompanyId());
		suggestion.setGroupId(newSuggestion.getGroupId());
		suggestion.setUserId(newSuggestion.getUserId());
		suggestion.setCreateDate(now);
		suggestion.setModifiedDate(now);
		suggestion.setStatus(SuggestionStatus.CREATED);

		suggestion.setTitle(newSuggestion.getTitle());
		suggestion.setDescription(newSuggestion.getDescription());
		suggestion.setCategory(newSuggestion.getCategory());

		resourceLocalService.addResources(suggestion.getCompanyId(), suggestion.getGroupId(), suggestion.getUserId(), Suggestion.class.getName(),
				suggestion.getSuggestionId(), false, true, true);

		suggestion = suggestionPersistence.update(suggestion);

		JSONObject notificationEventJSONObject = JSONFactoryUtil.createJSONObject();

		notificationEventJSONObject.put("suggestionId", suggestion.getSuggestionId());
		notificationEventJSONObject.put("userId", suggestion.getUserId());
		notificationEventJSONObject.put("notificationType", "CREATED");

		try {

			Role role = RoleLocalServiceUtil.getRole(newSuggestion.getCompanyId(), "SUGGESTIONBOX_MANAGER");
			if (Validator.isNotNull(role)) {

				List<User> users = UserLocalServiceUtil.getRoleUsers(role.getRoleId());

				for (User adminUser : users) {

					UserNotificationEventLocalServiceUtil.addUserNotificationEvent(adminUser.getUserId(), SuggestionNotificationHandler.PORTLET_ID,
							new Date().getTime(), suggestion.getUserId(), notificationEventJSONObject.toString(), false, serviceContext);
				}

			}
		} catch (Exception e) {

			_log.error(e.getMessage());
		}

		return suggestion;
	}

	public Suggestion updateSuggestion(Suggestion suggestion, ServiceContext serviceContext) throws SystemException, PortalException {

		Date now = new Date();
		suggestion.setCreateDate(now);
		suggestion.setModifiedDate(now);
		
		suggestionPersistence.update(suggestion);

		resourceLocalService.updateResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), Suggestion.class.getName(),
				suggestion.getSuggestionId(), serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions());

		return suggestion;

	}

	public Suggestion receviedSuggestion(Suggestion suggestion, ServiceContext serviceContext) throws SystemException, PortalException {

		Date now = new Date();
		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();

		suggestion.setReceivedDate(now);
		suggestion.setStatus(SuggestionStatus.RECEIVED);
		suggestion.setReceivedUserId(themeDisplay.getUserId());

		suggestionPersistence.update(suggestion);

		resourceLocalService.updateResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), Suggestion.class.getName(),
				suggestion.getSuggestionId(), serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions());
		
		JSONObject notificationEventJSONObject = JSONFactoryUtil.createJSONObject();

		notificationEventJSONObject.put("suggestionId", suggestion.getSuggestionId());
		notificationEventJSONObject.put("userId", suggestion.getReceivedUserId());
		notificationEventJSONObject.put("notificationType", "RECEIVED");
		
		UserNotificationEventLocalServiceUtil.addUserNotificationEvent(suggestion.getUserId(), SuggestionNotificationHandler.PORTLET_ID,
				new Date().getTime(), suggestion.getReceivedUserId(), notificationEventJSONObject.toString(), false, serviceContext);

		return suggestion;
	}
	
	
	public Suggestion updateReceviedSuggestion(Suggestion suggestion, ServiceContext serviceContext) throws SystemException, PortalException {

		Date now = new Date();
		ThemeDisplay themeDisplay = serviceContext.getThemeDisplay();

		suggestion.setReceivedDate(now);
		suggestion.setReceivedUserId(themeDisplay.getUserId());

		suggestionPersistence.update(suggestion);

		resourceLocalService.updateResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(), Suggestion.class.getName(),
				suggestion.getSuggestionId(), serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions());
		
		JSONObject notificationEventJSONObject = JSONFactoryUtil.createJSONObject();

		notificationEventJSONObject.put("suggestionId", suggestion.getSuggestionId());
		notificationEventJSONObject.put("userId", suggestion.getReceivedUserId());
		notificationEventJSONObject.put("notificationType", "UPDATED");
		
		UserNotificationEventLocalServiceUtil.addUserNotificationEvent(suggestion.getUserId(), SuggestionNotificationHandler.PORTLET_ID,
				new Date().getTime(), suggestion.getReceivedUserId(), notificationEventJSONObject.toString(), false, serviceContext);

		return suggestion;
	}

	public Suggestion deleteSuggestion(long suggestionId, ServiceContext serviceContext) throws PortalException, SystemException {

		resourceLocalService.deleteResource(serviceContext.getCompanyId(), Suggestion.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL,
				suggestionId);

		return suggestionPersistence.remove(suggestionId);

	}

	public List<Suggestion> getSuggestionsByUser(long companyId, long groupId, long userId, int start, int end) throws SystemException {

		return suggestionPersistence.findByCompanyGroupUser(companyId, groupId, userId, start, end);
	}

	public List<Suggestion> getSuggestionsByUserIdAndGroupId(long companyId, long userId, long groupId, int start, int end, String orderByType, String orderByColumn) {
		
		List<Suggestion> myList = new ArrayList<Suggestion>();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Suggestion.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
		dynamicQuery.add(PropertyFactoryUtil.forName("userId").eq(userId));
		dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));

		dynamicQuery.setLimit(start, end);

		if (orderByType.equalsIgnoreCase("asc")) {
			dynamicQuery.addOrder(OrderFactoryUtil.asc(orderByColumn));
		} else {
			dynamicQuery.addOrder(OrderFactoryUtil.desc(orderByColumn));
		}

		try {
			myList = suggestionPersistence.findWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}
	
	public List<Suggestion> getSuggestionsByUser(long companyId, long userId, int start, int end, String orderByType, String orderByColumn) {

		List<Suggestion> myList = new ArrayList<Suggestion>();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Suggestion.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));
		dynamicQuery.add(PropertyFactoryUtil.forName("userId").eq(userId));

		dynamicQuery.setLimit(start, end);

		if (orderByType.equalsIgnoreCase("asc")) {
			dynamicQuery.addOrder(OrderFactoryUtil.asc(orderByColumn));
		} else {
			dynamicQuery.addOrder(OrderFactoryUtil.desc(orderByColumn));
		}

		try {
			myList = suggestionPersistence.findWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}

	public List<Suggestion> getSuggestionsByCompanyId(long companyId, int start, int end, String orderByType, String orderByColumn) {

		List<Suggestion> myList = new ArrayList<Suggestion>();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Suggestion.class);

		dynamicQuery.add(PropertyFactoryUtil.forName("companyId").eq(companyId));

		dynamicQuery.setLimit(start, end);

		if (orderByType.equalsIgnoreCase("asc")) {
			dynamicQuery.addOrder(OrderFactoryUtil.asc(orderByColumn));
		} else {
			dynamicQuery.addOrder(OrderFactoryUtil.desc(orderByColumn));
		}

		try {
			myList = suggestionPersistence.findWithDynamicQuery(dynamicQuery);
		} catch (SystemException e) {
			_log.error(e.getMessage());
		}
		return myList;
	}

	private static final Log _log = LogFactoryUtil.getLog(SuggestionLocalServiceImpl.class);

}