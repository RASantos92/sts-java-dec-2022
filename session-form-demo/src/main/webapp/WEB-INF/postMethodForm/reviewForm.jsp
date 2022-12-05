<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Review form </h1>
	<p><c:out value="${ratingError}"/></p>
	<p><c:out value="${movieError}"/></p>
	<form action="/review/process" method="post">
	<input type="hidden" name="userId" value="12">
	<div>
		<label> Movie </label>
		<input type="text" name="movie"/>
	</div>
	<div>
		<label> Comment </label>
		<input type="text" name="comment"/>
	</div>
	<div>
		<label> Rating </label>
		<input type="number" name="rating"/>
	</div>
		<button type="submit">submit review</button>
	</form>
</body>
</html>