<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add a Destination </h1>
	<form:form action="/destinations/create" modelAttribute="destination" method="post">
		<form:input type="hidden" value="${user_id}" path="traveler"/>
		<div>
			<label>Destination Name</label>
			<form:input type="text" path="destinationName"/>
			<form:errors  path="destinationName"/>
		</div>
		<div>
			<label>Would Recommend</label>
			<form:checkbox path="wouldRecommend" value="true"/>  
		</div>
		<input type="submit" value="create destination"/>
	</form:form>
</body>
</html>