package com.rivetlogic.suggestionbox.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.rivetlogic.suggestionbox.model.Suggestion;
import com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil;

public class SuggestionPermission {
	
	public static void check(PermissionChecker permissionChecker,
			long suggestionId, String actionId) throws PortalException,
			SystemException {

		if (!contains(permissionChecker, suggestionId, actionId)) {
			throw new PrincipalException();
		}
	}

	public static boolean contains(PermissionChecker permissionChecker,
			long suggestionId, String actionId) throws PortalException,
			SystemException {

		Suggestion suggestion = SuggestionLocalServiceUtil
				.getSuggestion(suggestionId);
		
		if (permissionChecker.hasOwnerPermission(suggestion.getCompanyId(),
				Suggestion.class.getName(), suggestion.getSuggestionId(),
				suggestion.getUserId(), actionId)) {

			return true;
		}

		return permissionChecker.hasPermission(suggestion.getGroupId(),
				Suggestion.class.getName(), suggestion.getSuggestionId(),
				actionId);

	}
}