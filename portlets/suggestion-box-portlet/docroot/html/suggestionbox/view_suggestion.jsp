<%@include file="/html/init.jsp"%>

<portlet:renderURL var="viewSuggestionsURL" />


<%
	long suggestionId = ParamUtil.getLong(request, "suggestionId");

	Suggestion suggestion = SuggestionLocalServiceUtil
			.getSuggestion(suggestionId);

	String redirect = ParamUtil.getString(request, "redirect");
	
	boolean permission = SuggestionPermission.contains(permissionChecker, suggestionId, "OWNER_VIEW");
	
	DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,themeDisplay.getLocale());
%>

<liferay-ui:header backURL="<%=viewSuggestionsURL%>"
		showBackURL="<%=true%>" title="suggestion-view" />
		
<c:if test='<%=permission%>'> 
	<h2 class="suggestion-title"><%=suggestion.getTitle()%></h2>
	
	<b><liferay-ui:message key="suggestion-description" />:</b>
	<p> <%=StringUtil.replace(suggestion.getDescription(), "\n", "<br>")%></p>

	<hr/>
	
	<div class="suggestion-meta-info">
		<b><liferay-ui:message key="suggestion-category" />:</b>
		<%=suggestion.getCategory()%><br />
		
		<b><liferay-ui:message key="suggestion-created-date" />:</b>
		<%= df.format(suggestion.getCreateDate()) %><br />
		
		<b><liferay-ui:message key="suggestion-created-user" />:</b>
		<%=PortalUtil.getUserName(suggestion.getUserId(), "")%><br />
		
		<b><liferay-ui:message key="suggestion-status" />:</b>
		<%=suggestion.getStatus()%><br />
	
	
	
		<hr />
		

		<b><liferay-ui:message key="suggestion-received-date" />:</b>
		<%=  df.format(suggestion.getReceivedDate()) %><br />
		
		<b><liferay-ui:message key="suggestion-received-user" />:</b>
		<%=PortalUtil.getUserName(suggestion.getReceivedUserId(), "")%><br />
		
		<b><liferay-ui:message key="suggestion-received-comment" />:</b>
		<p> <%=StringUtil.replace(suggestion.getReceivedComment(), "\n", "<br>")%></p><br />
		
		<br />
	</div>

</c:if>

<c:if test="<%= !permission %>"> 
	<liferay-ui:message key="suggestion-access-denied" />
</c:if>
