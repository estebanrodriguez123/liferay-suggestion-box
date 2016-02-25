<%@include file="/html/init.jsp"%>

<%
	ResultRow row = (ResultRow) request
			.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	Suggestion sugg = (Suggestion) row.getObject();

	long groupId = sugg.getGroupId();
	String name = Suggestion.class.getName();
	long suggestionId = sugg.getSuggestionId();

	String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<liferay-ui:icon-menu>

	<c:if test='<%=sugg.getStatus().equals("Created")%>'>

		<c:if test='<%=SuggestionPermission.contains(permissionChecker, suggestionId, "OWNER_UPDATE")%>'>
		
			<portlet:renderURL var="editSuggestionURL">
				<portlet:param name="mvcPath"
					value="/html/suggestionbox/edit_suggestion.jsp" />
				<portlet:param name="suggestionId"
					value="<%=String.valueOf(suggestionId)%>" />
				<portlet:param name="redirect" value="<%=redirect%>" />
			</portlet:renderURL>

			<liferay-ui:icon image="edit" url="<%=editSuggestionURL.toString()%>" />
			
		</c:if>

		<c:if test='<%=SuggestionPermission.contains(permissionChecker, suggestionId, "OWNER_DELETE")%>'>
		
			<portlet:actionURL name="deleteSuggestion" var="deleteSuggestionURL">
				<portlet:param name="suggestionId"
					value="<%=String.valueOf(suggestionId)%>" />
				<portlet:param name="redirect" value="<%=redirect%>" />
			</portlet:actionURL>

			<liferay-ui:icon-delete url="<%=deleteSuggestionURL.toString()%>" />

		</c:if>
	</c:if>
</liferay-ui:icon-menu>