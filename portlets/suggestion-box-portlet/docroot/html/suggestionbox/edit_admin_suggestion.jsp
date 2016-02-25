<%@include file="/html/init.jsp"%>




<%
	long suggestionId = ParamUtil.getLong(request, "suggestionId");

	Suggestion suggestion = SuggestionLocalServiceUtil.getSuggestion(suggestionId);

	String redirect = ParamUtil.getString(request, "redirect");

	boolean permission = RoleServiceUtil.hasUserRole(themeDisplay.getUserId(), themeDisplay.getCompanyId(), "SUGGESTIONBOX_MANAGER", true);
	
	boolean isReceived = suggestion.getStatus().equals(SuggestionStatus.RECEIVED);
	
	

	DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,themeDisplay.getLocale());
%>

<c:if test='<%=permission%>'>

	<portlet:renderURL var="viewSuggestionsURL">
		<portlet:param name="tabs1" value="all-suggestions" />
	</portlet:renderURL>

	<liferay-ui:header backURL="<%=viewSuggestionsURL%>"
		showBackURL="<%=true%>" title="suggestion-receive" />

	<portlet:actionURL
		name='<%="Received".equals(suggestion.getStatus()) ? "updateReceviedSuggestion" : "receviedSuggestion"%>'
		var="receviedSuggestionURL">
		<portlet:param name="tabs1" value="all-suggestions" />
		<portlet:param name="redirect" value="<%=redirect%>" />
	</portlet:actionURL>



	<b><liferay-ui:message key="suggestion-category" />:</b>
	<%=suggestion.getCategory()%><br />
	
	<b><liferay-ui:message key="suggestion-title" />:</b>
	<%=suggestion.getTitle()%><br />
	
	<b><liferay-ui:message key="suggestion-created-date" />:</b>
	<%=df.format(suggestion.getCreateDate()) %><br />
	
	<b><liferay-ui:message key="suggestion-created-user" />:</b>
	<%=PortalUtil.getUserName(suggestion.getUserId(), "")%><br />
	
	<c:if test="<%= isReceived %>">
		<b><liferay-ui:message key="suggestion-status" />:</b>
		<%=suggestion.getStatus()%><br />
	</c:if>
	
	<b><liferay-ui:message key="suggestion-description" />:</b>
	<p> <%=StringUtil.replace(suggestion.getDescription(), "\n", "<br>")%></p>
	
	<hr />
	
	<c:if test="<%= isReceived %>">
		
		<b><liferay-ui:message key="suggestion-received-date" />:</b>
		<%=df.format(suggestion.getReceivedDate()) %><br />
		
		<b><liferay-ui:message key="suggestion-received-user" />:</b>
		<%=PortalUtil.getUserName(suggestion.getReceivedUserId(), "")%>
		
		<p></p>
	</c:if>


	<aui:model-context bean="<%=suggestion%>" model="<%=Suggestion.class%>" />

	<aui:form action="<%=receviedSuggestionURL%>" method="POST"
		name="<portlet:namespace />fm">
		<aui:fieldset>
			<aui:input type="hidden" name="suggestionId" />

			<aui:input required="true" type="textarea" name="receivedComment"
				label="comment" />

		</aui:fieldset>

		<aui:button-row>
			<aui:button type="submit"
				value='<%= isReceived ? "suggestion-update-received-comment" : "suggestion-receive-btn"%>'></aui:button>
			<aui:button type="cancel" onClick="<%=viewSuggestionsURL%>"></aui:button>
		</aui:button-row>

	</aui:form>


</c:if>

<c:if test="<%=!permission%>">
	<liferay-ui:message key="suggestion-access-denied" />
</c:if>