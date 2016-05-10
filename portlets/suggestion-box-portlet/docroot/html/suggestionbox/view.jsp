<%@include file="/html/init.jsp"%>


<%

	String tabsNames = "my-suggestions";
	if (RoleServiceUtil.hasUserRole(themeDisplay.getUserId(), themeDisplay.getCompanyId(), "SUGGESTIONBOX_MANAGER", true) ) {
		tabsNames += ",all-suggestions";
	}

	String tabs1 = ParamUtil.getString(request, "tabs1",
			"my-suggestions");

	PortletURL portletURL = renderResponse.createRenderURL();
	portletURL.setParameter("tabs1", tabs1);

	String redirect = PortalUtil.getCurrentURL(renderRequest);

	String orderByCol = ParamUtil.getString(renderRequest, "orderByCol");
	String orderByType = ParamUtil.getString(renderRequest, "orderByType");
	
	if (Validator.isNull(orderByCol )) {
		 orderByCol = "createDate";
	}
	if(Validator.isNull(orderByType )){
		 orderByType = "desc";
	}
	
	
	DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.SHORT,themeDisplay.getLocale());

%>

<liferay-ui:error key="permission-error" message="permission-error-message" />

<portlet:renderURL var="addSuggestionURL">
	<portlet:param name="mvcPath"
		value="/html/suggestionbox/edit_suggestion.jsp" />
	<portlet:param name="redirect" value="<%=redirect%>" />

</portlet:renderURL>

<liferay-ui:tabs names="<%=tabsNames%>" param="tabs1" url="<%= portletURL.toString() %>">

	<liferay-ui:section>
		<c:if test='<%="my-suggestions".equals(tabs1)%>'>

			<c:if
				test='<%=SuggestionModelPermission.contains(
									permissionChecker, scopeGroupId, "ADD")%>'>

				<aui:button-row cssClass="guestbook-buttons">

					<aui:button name="addSuggestionButton" value="add-suggestion"
						onClick="${addSuggestionURL}" />

				</aui:button-row>

			</c:if>

			<liferay-ui:search-container iteratorURL="<%=portletURL%>" emptyResultsMessage="no-suggestions" orderByCol="<%=orderByCol%>" orderByType="<%=orderByType%>" >
				<liferay-ui:search-container-results
					results="<%=SuggestionLocalServiceUtil
									.getSuggestionsByUserIdAndGroupId(
										themeDisplay.getCompanyId(),
										themeDisplay.getUserId(),
										themeDisplay.getScopeGroupId(),
										searchContainer.getStart(), 
										searchContainer.getEnd(),
										orderByType,
										orderByCol)%>"
					total="<%=SuggestionLocalServiceUtil
									.getSuggestionsCount()%>" />
	
				<liferay-ui:search-container-row
					className="com.rivetlogic.suggestionbox.model.Suggestion"
					keyProperty="suggestionId" modelVar="suggestion">

					<portlet:renderURL var="editSuggestionURL">

						<c:if test='<%=suggestion.getStatus()
												.equals("Created")%>'>
							<portlet:param name="mvcPath"
								value="/html/suggestionbox/edit_suggestion.jsp" />
						</c:if>

						<c:if test='<%=suggestion.getStatus()
												.equals("Received")%>'>
							<portlet:param name="mvcPath"
								value="/html/suggestionbox/view_suggestion.jsp" />
						</c:if>
						<portlet:param name="suggestionId"
							value="${suggestion.suggestionId }" />
						<portlet:param name="redirect" value="<%=redirect%>" />
					</portlet:renderURL>

					<liferay-ui:search-container-column-text name="createDate"  orderable="true"  
						value="<%=  df.format(suggestion.getCreateDate()) %>"
						href="${editSuggestionURL}" />
	
					<liferay-ui:search-container-column-text property="category" orderable="true"
						href="${editSuggestionURL}" />
	
					<liferay-ui:search-container-column-text href="${editSuggestionURL}" orderable="true"
						property="title" />
	
					<liferay-ui:search-container-column-text property="status" orderable="true"
						href="${editSuggestionURL}" />
	
					<liferay-ui:search-container-column-jsp align="right"
						path="/html/suggestionbox/edit_actions.jsp" />
	
				</liferay-ui:search-container-row>
	
				<liferay-ui:search-iterator/>
			</liferay-ui:search-container>

		</c:if>
	</liferay-ui:section>

	<liferay-ui:section>
		<c:if test='<%="all-suggestions".equals(tabs1)%>'>
			<liferay-ui:search-container iteratorURL="<%=portletURL%>" emptyResultsMessage="no-suggestions" orderByCol="<%=orderByCol%>" orderByType="<%=orderByType%>" >
				<liferay-ui:search-container-results
					results="<%=SuggestionLocalServiceUtil
							.getSuggestionsByCompanyId(
									themeDisplay.getCompanyId(),
									searchContainer.getStart(),
									searchContainer.getEnd(),
									orderByType,
									orderByCol)%>"
					total="<%=SuggestionLocalServiceUtil
									.getSuggestionsCount()%>" />
	
				<liferay-ui:search-container-row
					className="com.rivetlogic.suggestionbox.model.Suggestion"
					keyProperty="suggestionId" modelVar="suggestion"
					escapedModel="<%=true%>">

					<portlet:renderURL var="editSuggestionURL">
						<c:if test='<%=RoleServiceUtil.hasUserRole(themeDisplay.getUserId(), themeDisplay.getCompanyId(), "SUGGESTIONBOX_MANAGER", true)%>'>
							<portlet:param name="mvcPath"
								value="/html/suggestionbox/edit_admin_suggestion.jsp" />
							<portlet:param name="suggestionId"
								value="<%=String.valueOf(suggestion.getSuggestionId())%>" />	
							<portlet:param name="redirect" value="<%=redirect%>" />
						</c:if>
						<portlet:param name="tabs1" value="all-suggestions" />
						
					</portlet:renderURL>
	
					<liferay-ui:search-container-column-text name="createDate"  orderable="true"
						href="${editSuggestionURL}"
						value="<%= df.format(suggestion.getCreateDate()) %>" />
	
					<liferay-ui:search-container-column-text property="category" orderable="true"
						href="${editSuggestionURL}" />
	
					<liferay-ui:search-container-column-text href="${editSuggestionURL}" orderable="true"
						property="title" />
	
					<liferay-ui:search-container-column-text property="status" orderable="true"
						href="${editSuggestionURL}" />
	
				</liferay-ui:search-container-row>
	
				<liferay-ui:search-iterator />
			</liferay-ui:search-container>
	
		</c:if>
	</liferay-ui:section>
	
</liferay-ui:tabs>