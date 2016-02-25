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

import com.liferay.portal.service.persistence.BasePersistence;

import com.rivetlogic.suggestionbox.model.Suggestion;

/**
 * The persistence interface for the suggestion service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Manrique Varela
 * @see SuggestionPersistenceImpl
 * @see SuggestionUtil
 * @generated
 */
public interface SuggestionPersistence extends BasePersistence<Suggestion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SuggestionUtil} to access the suggestion persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the suggestions where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suggestions where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suggestions where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first suggestion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns the first suggestion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last suggestion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns the last suggestion in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set where groupId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion[] findByGroupId_PrevAndNext(
		long suggestionId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns all the suggestions that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suggestions that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suggestions that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set of suggestions that the user has permission to view where groupId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion[] filterFindByGroupId_PrevAndNext(
		long suggestionId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Removes all the suggestions where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suggestions where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suggestions that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the suggestions where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suggestions where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroup(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suggestions where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroup(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion findByCompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns the first suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion fetchByCompanyGroup_First(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion findByCompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns the last suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion fetchByCompanyGroup_Last(
		long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set where companyId = &#63; and groupId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion[] findByCompanyGroup_PrevAndNext(
		long suggestionId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns all the suggestions that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroup(
		long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suggestions that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroup(
		long companyId, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suggestions that the user has permissions to view where companyId = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroup(
		long companyId, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set of suggestions that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param companyId the company ID
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion[] filterFindByCompanyGroup_PrevAndNext(
		long suggestionId, long companyId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Removes all the suggestions where companyId = &#63; and groupId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suggestions where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suggestions that the user has permission to view where companyId = &#63; and groupId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @return the number of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByCompanyGroup(long companyId, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the suggestions where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroupUser(
		long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suggestions where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suggestions where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion findByCompanyGroupUser_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns the first suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion fetchByCompanyGroupUser_First(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion findByCompanyGroupUser_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns the last suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching suggestion, or <code>null</code> if a matching suggestion could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion fetchByCompanyGroupUser_Last(
		long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion[] findByCompanyGroupUser_PrevAndNext(
		long suggestionId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns all the suggestions that the user has permission to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroupUser(
		long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the suggestions that the user has permission to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @return the range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suggestions that the user has permissions to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> filterFindByCompanyGroupUser(
		long companyId, long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suggestions before and after the current suggestion in the ordered set of suggestions that the user has permission to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param suggestionId the primary key of the current suggestion
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion[] filterFindByCompanyGroupUser_PrevAndNext(
		long suggestionId, long companyId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Removes all the suggestions where companyId = &#63; and groupId = &#63; and userId = &#63; from the database.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCompanyGroupUser(long companyId, long groupId,
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suggestions where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching suggestions
	* @throws SystemException if a system exception occurred
	*/
	public int countByCompanyGroupUser(long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suggestions that the user has permission to view where companyId = &#63; and groupId = &#63; and userId = &#63;.
	*
	* @param companyId the company ID
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching suggestions that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByCompanyGroupUser(long companyId, long groupId,
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the suggestion in the entity cache if it is enabled.
	*
	* @param suggestion the suggestion
	*/
	public void cacheResult(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion);

	/**
	* Caches the suggestions in the entity cache if it is enabled.
	*
	* @param suggestions the suggestions
	*/
	public void cacheResult(
		java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> suggestions);

	/**
	* Creates a new suggestion with the primary key. Does not add the suggestion to the database.
	*
	* @param suggestionId the primary key for the new suggestion
	* @return the new suggestion
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion create(
		long suggestionId);

	/**
	* Removes the suggestion with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion that was removed
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion remove(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	public com.rivetlogic.suggestionbox.model.Suggestion updateImpl(
		com.rivetlogic.suggestionbox.model.Suggestion suggestion)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the suggestion with the primary key or throws a {@link com.rivetlogic.suggestionbox.NoSuchSuggestionException} if it could not be found.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion
	* @throws com.rivetlogic.suggestionbox.NoSuchSuggestionException if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion findByPrimaryKey(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.suggestionbox.NoSuchSuggestionException;

	/**
	* Returns the suggestion with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param suggestionId the primary key of the suggestion
	* @return the suggestion, or <code>null</code> if a suggestion with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.suggestionbox.model.Suggestion fetchByPrimaryKey(
		long suggestionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the suggestions.
	*
	* @return the suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the suggestions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.suggestionbox.model.impl.SuggestionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of suggestions
	* @param end the upper bound of the range of suggestions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of suggestions
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.suggestionbox.model.Suggestion> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the suggestions from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of suggestions.
	*
	* @return the number of suggestions
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}