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

package com.rivetlogic.suggestionbox.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Suggestion. This utility wraps
 * {@link com.rivetlogic.suggestionbox.service.impl.SuggestionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Manrique Varela
 * @see SuggestionLocalService
 * @see com.rivetlogic.suggestionbox.service.base.SuggestionLocalServiceBaseImpl
 * @see com.rivetlogic.suggestionbox.service.impl.SuggestionLocalServiceImpl
 * @generated
 */
public class SuggestionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rivetlogic.suggestionbox.service.impl.SuggestionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the suggestion to the database. Also notifies the appropriate model listeners.
	*
	* @param suggestion the suggestion
	* @return the suggestion that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion addSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addSuggestion(suggestion);
	}

	/**
	* Creates a new suggestion with the primary key. Does not add the suggestion to the database.
	*
	* @param suggestionId the primary key for the new suggestion
	* @return the new suggestion
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion createSuggestion(
		long suggestionId) {
		return getService().createSuggestion(suggestionId);
	}

	/**
	* Deletes the suggestion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion that was removed
	* @throws PortalException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion deleteSuggestion(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSuggestion(suggestionId);
	}

	/**
	* Deletes the suggestion from the database. Also notifies the appropriate model listeners.
	*
	* @param suggestion the suggestion
	* @return the suggestion that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion deleteSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSuggestion(suggestion);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.rivetlogic.suggestionbox.model.Suggestion fetchSuggestion(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchSuggestion(suggestionId);
	}

	/**
	* Returns the suggestion with the primary key.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion
	* @throws PortalException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion getSuggestion(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getSuggestion(suggestionId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the suggestions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> getSuggestions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSuggestions(start, end);
	}

	/**
	* Returns the number of suggestions.
	*
	* @return the number of suggestions
	* @throws SystemException if a system exception occurred
	*/
	public static int getSuggestionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getSuggestionsCount();
	}

	/**
	* Updates the suggestion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suggestion the suggestion
	* @return the suggestion that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.suggestionbox.model.Suggestion updateSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSuggestion(suggestion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.rivetlogic.suggestionbox.model.Suggestion addSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion newSuggestion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addSuggestion(newSuggestion, serviceContext);
	}

	public static com.rivetlogic.suggestionbox.model.Suggestion updateSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateSuggestion(suggestion, serviceContext);
	}

	public static com.rivetlogic.suggestionbox.model.Suggestion receviedSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().receviedSuggestion(suggestion, serviceContext);
	}

	public static com.rivetlogic.suggestionbox.model.Suggestion updateReceviedSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().updateReceviedSuggestion(suggestion, serviceContext);
	}

	public static com.rivetlogic.suggestionbox.model.Suggestion deleteSuggestion(
		long suggestionId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteSuggestion(suggestionId, serviceContext);
	}

	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> getSuggestionsByUser(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .getSuggestionsByUser(companyId, groupId, userId, start, end);
	}

	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> getSuggestionsByUserIdAndGroupId(
		long companyId, long userId, long groupId, int start, int end,
		java.lang.String orderByType, java.lang.String orderByColumn) {
		return getService()
				   .getSuggestionsByUserIdAndGroupId(companyId, userId,
			groupId, start, end, orderByType, orderByColumn);
	}

	public static java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> getSuggestionsByCompanyIdAndGroupId(
		long companyId, long groupId, int start, int end,
		java.lang.String orderByType, java.lang.String orderByColumn) {
		return getService()
				   .getSuggestionsByCompanyIdAndGroupId(companyId, groupId,
			start, end, orderByType, orderByColumn);
	}

	public static void clearService() {
		_service = null;
	}

	public static SuggestionLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					SuggestionLocalService.class.getName());

			if (invokableLocalService instanceof SuggestionLocalService) {
				_service = (SuggestionLocalService)invokableLocalService;
			}
			else {
				_service = new SuggestionLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(SuggestionLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(SuggestionLocalService service) {
	}

	private static SuggestionLocalService _service;
}