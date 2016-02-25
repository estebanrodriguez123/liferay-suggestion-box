<%@include file="/html/init.jsp"%>

<%@page import="com.liferay.portal.kernel.util.StringUtil" %>

<%

	String redirect = ParamUtil.getString(request, "redirect");

	Suggestion suggestion = null;

	long suggestionId = ParamUtil.getLong(request, "suggestionId");

	if (suggestionId > 0) {
		suggestion = SuggestionLocalServiceUtil
				.getSuggestion(suggestionId);
	}

	String headerTitle = suggestion == null ? "suggestion-add"
			: "suggestion-edit";
	
	
	
	String categories = portletPreferences.getValue("categories", "");
	
	String[] categoriesArray  = StringUtil.split(categories, ",");
	
	boolean permission = false;
	
	if (suggestion == null){
		permission =  SuggestionModelPermission.contains(permissionChecker, scopeGroupId, "ADD");
	} else {
		permission = SuggestionPermission.contains(permissionChecker, suggestionId, "OWNER_VIEW");
	}
	

	DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,themeDisplay.getLocale());
%>

<c:if test='<%=permission%>'>
	
	<portlet:renderURL var="viewSuggestionsURL" />
	
	<liferay-ui:header backURL="<%=viewSuggestionsURL%>"
		escapeXml="<%=false%>" localizeTitle="<%=true%>"
		showBackURL="<%=true%>" title="<%=headerTitle%>" />
	
	<portlet:actionURL
		name='<%=suggestion == null ? "addSuggestion" : "updateSuggestion"%>'
		var="editSuggestionURL" windowState="normal" />
	
	
	<aui:model-context bean="<%=suggestion%>" model="<%=Suggestion.class%>" />
	
	
	<aui:form action="${editSuggestionURL}" method="POST"
		name="<portlet:namespace />fm">
	
		<aui:fieldset>
		
			<aui:input type="hidden" name="redirect" value="<%= redirect %>" />
	
			<aui:input type="hidden" name="suggestionId"
				value='<%=suggestion == null ? "" : suggestion
								.getSuggestionId()%>' />

			<aui:select required="true" name="category" showEmptyOption="true">
				<%
					for (String category : categoriesArray) {
						
						if(Validator.isNotNull(category)) {
				%>
					<aui:option label="<%=category%>" value="<%=category%>" />
				<%
						}
					}
				%>
			</aui:select>
	
			<aui:input required="true" name="title" />
			
			<c:if test="<%=suggestion != null%>">
				<aui:input type="text" disabled="true" name="created"
					value="<%= df.format(suggestion.getCreateDate()) %>" />
			</c:if>
			
			<aui:input required="true" type="textarea" name="description" />
	
		</aui:fieldset>
	
		<aui:button-row>
		
			<aui:button type="submit"></aui:button>
	
			<c:if test="<%=suggestion == null ? false : true%>">
				<c:if test="<%=SuggestionPermission.contains(permissionChecker, suggestionId, \"OWNER_DELETE\") %>">
					<portlet:actionURL name="deleteSuggestion" var="deleteSuggestionURL">
						<portlet:param name="suggestionId"
							value="<%=String.valueOf(suggestion
											.getSuggestionId())%>" />
						<portlet:param name="redirect" value="<%= redirect %>" />
					</portlet:actionURL>
					<script type="text/javascript">
					function confirmDel() {
						var msg = "<liferay-ui:message key="suggestion-delete-message" />";
						if(confirm(msg)) {
							window.location.href = '<%=deleteSuggestionURL.toString()%>';
						} else {
							return false;
						}
					}
					</script>
					<aui:button value="suggestion-delete" useDialog="" cssClass="btn-danger" onClick="javascript:confirmDel()"/>
				</c:if>
			</c:if>
			
			<aui:button type="cancel" onClick="${ viewSuggestionsURL }"></aui:button>
			
		</aui:button-row>
	
	</aui:form>

</c:if>

<c:if test="<%= !permission %>"> 
	<liferay-ui:message key="suggestion-access-denied" />
</c:if>