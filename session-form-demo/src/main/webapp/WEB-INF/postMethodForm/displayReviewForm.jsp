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
	<h1>review info:</h1>
	<h3>User ID: <c:out value="${userId}"/></h3>
	<h3>Movie: <c:out value="${movie}"/></h3>
	<h3>Rating: <c:out value="${rating}"/></h3>
	<h3>Comment: <c:out value="${comment}"/></h3>
</body>
</html>