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

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SuggestionLocalService}.
 *
 * @author Manrique Varela
 * @see SuggestionLocalService
 * @generated
 */
public class SuggestionLocalServiceWrapper implements SuggestionLocalService,
	ServiceWrapper<SuggestionLocalService> {
	public SuggestionLocalServiceWrapper(
		SuggestionLocalService suggestionLocalService) {
		_suggestionLocalService = suggestionLocalService;
	}

	/**
	* Adds the suggestion to the database. Also notifies the appropriate model listeners.
	*
	* @param suggestion the suggestion
	* @return the suggestion that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion addSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.addSuggestion(suggestion);
	}

	/**
	* Creates a new suggestion with the primary key. Does not add the suggestion to the database.
	*
	* @param suggestionId the primary key for the new suggestion
	* @return the new suggestion
	*/
	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion createSuggestion(
		long suggestionId) {
		return _suggestionLocalService.createSuggestion(suggestionId);
	}

	/**
	* Deletes the suggestion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion that was removed
	* @throws PortalException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion deleteSuggestion(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.deleteSuggestion(suggestionId);
	}

	/**
	* Deletes the suggestion from the database. Also notifies the appropriate model listeners.
	*
	* @param suggestion the suggestion
	* @return the suggestion that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion deleteSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.deleteSuggestion(suggestion);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _suggestionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion fetchSuggestion(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.fetchSuggestion(suggestionId);
	}

	/**
	* Returns the suggestion with the primary key.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion
	* @throws PortalException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion getSuggestion(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.getSuggestion(suggestionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> getSuggestions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.getSuggestions(start, end);
	}

	/**
	* Returns the number of suggestions.
	*
	* @return the number of suggestions
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSuggestionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.getSuggestionsCount();
	}

	/**
	* Updates the suggestion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param suggestion the suggestion
	* @return the suggestion that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion updateSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.updateSuggestion(suggestion);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _suggestionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_suggestionLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _suggestionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion addSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion newSuggestion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.addSuggestion(newSuggestion,
			serviceContext);
	}

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion updateSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.updateSuggestion(suggestion,
			serviceContext);
	}

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion receviedSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.receviedSuggestion(suggestion,
			serviceContext);
	}

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion updateReceviedSuggestion(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.updateReceviedSuggestion(suggestion,
			serviceContext);
	}

	@Override
	public com.rivetlogic.suggestionbox.model.Suggestion deleteSuggestion(
		long suggestionId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.deleteSuggestion(suggestionId,
			serviceContext);
	}

	@Override
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> getSuggestionsByUser(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _suggestionLocalService.getSuggestionsByUser(companyId, groupId,
			userId, start, end);
	}

	@Override
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> getSuggestionsByUser(
		long companyId, long userId, int start, int end,
		java.lang.String orderByType, java.lang.String orderByColumn) {
		return _suggestionLocalService.getSuggestionsByUser(companyId, userId,
			start, end, orderByType, orderByColumn);
	}

	@Override
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> getSuggestionsByCompanyId(
		long companyId, int start, int end, java.lang.String orderByType,
		java.lang.String orderByColumn) {
		return _suggestionLocalService.getSuggestionsByCompanyId(companyId,
			start, end, orderByType, orderByColumn);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SuggestionLocalService getWrappedSuggestionLocalService() {
		return _suggestionLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSuggestionLocalService(
		SuggestionLocalService suggestionLocalService) {
		_suggestionLocalService = suggestionLocalService;
	}

	@Override
	public SuggestionLocalService getWrappedService() {
		return _suggestionLocalService;
	}

	@Override
	public void setWrappedService(SuggestionLocalService suggestionLocalService) {
		_suggestionLocalService = suggestionLocalService;
	}

	private SuggestionLocalService _suggestionLocalService;
}