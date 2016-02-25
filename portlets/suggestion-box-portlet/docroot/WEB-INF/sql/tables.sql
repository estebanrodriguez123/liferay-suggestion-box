create table rivetlogic_suggestion_box_Suggestion (
	suggestionId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	category VARCHAR(75) null,
	title VARCHAR(75) null,
	description TEXT null,
	status VARCHAR(75) null,
	receivedDate DATE null,
	receivedComment TEXT null,
	receivedUserId LONG
);