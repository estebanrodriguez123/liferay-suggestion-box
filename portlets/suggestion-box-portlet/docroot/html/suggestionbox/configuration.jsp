<%@include file="/html/init.jsp"%>

<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>

<liferay-portlet:actionURL var="configurationURL"
	portletConfiguration="true">
</liferay-portlet:actionURL>


<%
	String categories = portletPreferences.getValue("categories", "");
%>

<aui:form action="<%=configurationURL%>" method="post" name="fm">
	<aui:fieldset>

		<aui:input name="<%=Constants.CMD%>" type="hidden"
			value="<%=Constants.UPDATE%>" />
			
		<p><liferay-ui:message key="suggestion-conf-categories-title" /></p>

		<aui:input name="preferences--categories--" value="<%=categories%>" />

		<aui:button-row>
			<aui:button type="submit" />
		</aui:button-row>
	</aui:fieldset>
</aui:form>