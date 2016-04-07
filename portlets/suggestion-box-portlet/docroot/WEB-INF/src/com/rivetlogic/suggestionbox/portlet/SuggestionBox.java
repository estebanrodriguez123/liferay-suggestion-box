package com.rivetlogic.suggestionbox.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.RoleServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rivetlogic.suggestionbox.model.Suggestion;
import com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil;
import com.rivetlogic.suggestionbox.service.permission.SuggestionPermission;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class SuggestionBox
 */
public class SuggestionBox extends MVCPortlet {

	@Override
	protected void doDispatch(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		long suggestionId = ParamUtil.getLong(renderRequest, "suggestionId");

		if (suggestionId > 0) {

			Suggestion suggestion = null;
			try {
				suggestion = SuggestionLocalServiceUtil.getSuggestion(suggestionId);
			} catch (PortalException | SystemException e) {
				_log.info("No Suggestion exists with the primary key " + suggestionId);
			}

			if (suggestion == null) {
				_log.info("Rendering View Template ");
				include(viewTemplate, renderRequest, renderResponse);

				return;
			}
		}

		super.doDispatch(renderRequest, renderResponse);

	}

	public void addSuggestion(ActionRequest request, ActionResponse response) throws SystemException, Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		if (themeDisplay.getPermissionChecker().hasPermission(themeDisplay.getScopeGroupId(), "com.rivetlogic.suggestionbox.model",
				themeDisplay.getScopeGroupId(), "ADD")) {

			Suggestion suggestion = SuggestionLocalServiceUtil.createSuggestion(0);

			suggestion.setTitle(ParamUtil.getString(request, "title"));
			suggestion.setDescription(ParamUtil.getString(request, "description"));
			suggestion.setCategory(ParamUtil.getString(request, "category"));

			suggestion.setCompanyId(themeDisplay.getCompanyId());
			suggestion.setGroupId(themeDisplay.getScopeGroupId());
			suggestion.setUserId(themeDisplay.getUserId());

			SuggestionLocalServiceUtil.addSuggestion(suggestion, serviceContext);

			sendRedirect(request, response);

		} else {
			SessionErrors.add(request, "permission-error");
			sendRedirect(request, response);

		}

	}

	public void deleteSuggestion(ActionRequest request, ActionResponse response) throws SystemException, PortalException, Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		long suggestionId = ParamUtil.getLong(request, "suggestionId");

		if (SuggestionPermission.contains(themeDisplay.getPermissionChecker(), suggestionId, "OWNER_DELETE")) {

			SuggestionLocalServiceUtil.deleteSuggestion(suggestionId, serviceContext);

			sendRedirect(request, response);

		} else {
			SessionErrors.add(request, "permission-error");
			sendRedirect(request, response);
		}
	}

	public void updateSuggestion(ActionRequest request, ActionResponse response) throws SystemException, PortalException, Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		long suggestionId = ParamUtil.getLong(request, "suggestionId");

		if (SuggestionPermission.contains(themeDisplay.getPermissionChecker(), suggestionId, "OWNER_UPDATE")) {

			Suggestion suggestion = SuggestionLocalServiceUtil.getSuggestion(suggestionId);

			suggestion.setTitle(ParamUtil.getString(request, "title"));
			suggestion.setDescription(ParamUtil.getString(request, "description"));
			suggestion.setCategory(ParamUtil.getString(request, "category"));

			SuggestionLocalServiceUtil.updateSuggestion(suggestion, serviceContext);

			sendRedirect(request, response);
		} else {
			SessionErrors.add(request, "permission-error");
			sendRedirect(request, response);
		}
	}

	public void receviedSuggestion(ActionRequest request, ActionResponse response) throws SystemException, PortalException, Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		if (RoleServiceUtil.hasUserRole(themeDisplay.getUserId(), themeDisplay.getCompanyId(), "SUGGESTIONBOX_MANAGER", true)) {

			Suggestion suggestion = SuggestionLocalServiceUtil.getSuggestion(ParamUtil.getLong(request, "suggestionId"));

			suggestion.setReceivedComment(ParamUtil.getString(request, "receivedComment"));

			SuggestionLocalServiceUtil.receviedSuggestion(suggestion, serviceContext);

			sendRedirect(request, response);

		} else {
			SessionErrors.add(request, "permission-error");
			sendRedirect(request, response);
		}
	}

	public void updateReceviedSuggestion(ActionRequest request, ActionResponse response) throws SystemException, PortalException, Exception {

		ServiceContext serviceContext = ServiceContextFactory.getInstance(request);

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		if (RoleServiceUtil.hasUserRole(themeDisplay.getUserId(), themeDisplay.getCompanyId(), "SUGGESTIONBOX_MANAGER", true)) {

			Suggestion suggestion = SuggestionLocalServiceUtil.getSuggestion(ParamUtil.getLong(request, "suggestionId"));

			suggestion.setReceivedComment(ParamUtil.getString(request, "receivedComment"));

			SuggestionLocalServiceUtil.updateReceviedSuggestion(suggestion, serviceContext);

			sendRedirect(request, response);

		} else {
			SessionErrors.add(request, "permission-error");
			sendRedirect(request, response);
		}

	}

	private static final Log _log = LogFactoryUtil.getLog(SuggestionBox.class);
}
