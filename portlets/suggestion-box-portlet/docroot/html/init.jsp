<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>


<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.util.PortalUtil" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>
<%@ page import="com.liferay.portal.theme.ThemeDisplay" %>
<%@ page import="com.rivetlogic.suggestionbox.model.Suggestion" %>
<%@ page import="com.rivetlogic.suggestionbox.service.SuggestionLocalServiceUtil" %>
<%@ page import="com.liferay.portal.service.RoleServiceUtil" %>

<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.security.permission.ActionKeys" %>
<%@ page import="com.liferay.portal.kernel.util.StringUtil" %>
<%@page import="javax.portlet.PortletURL" %>


<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>


<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.DateFormat" %>


<%@ page import="com.liferay.portlet.PortalPreferences" %>
<%@ page import="com.liferay.portlet.PortletPreferencesFactoryUtil" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="com.rivetlogic.suggestionbox.service.permission.SuggestionPermission" %>
<%@ page import="com.rivetlogic.suggestionbox.service.permission.SuggestionModelPermission" %>
<%@ page import="com.rivetlogic.suggestionbox.service.util.SuggestionStatus" %>

<portlet:defineObjects />
<theme:defineObjects />