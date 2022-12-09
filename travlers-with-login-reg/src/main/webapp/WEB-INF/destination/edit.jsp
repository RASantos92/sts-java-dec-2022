<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit a Destination </h1>
	<form:form action="/destinations/edit/${destination.id}" modelAttribute="destination" method="post">
		<input type="hidden" name="_method" value="put"/>
		<form:input type="hidden" path="traveler"/>
		<div>
			<label>Destination Name</label>
			<form:input type="text" path="destinationName"/>
			<form:errors  path="destinationName"/>
		</div>
		<div>
			<label>Would Recommend</label>
			<form:checkbox path="wouldRecommend" value="true"/>  
		</div>
		<input type="submit" value="edit destination"/>
	</form:form>
</body>
</html>