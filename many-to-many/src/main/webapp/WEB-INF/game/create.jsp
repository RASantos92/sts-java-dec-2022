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
	<h1>Create A Game</h1>
	<form:form action="/games/create" method="post" modelAttribute="game">
    <div class="form-group">
        <label>Title</label>
        <form:input path="title" cla-ss="form-control" />
        <form:errors path="title" class="text-danger" />
    </div>
    <div class="form-group">
        <label>Genre</label> 
        <form:input path="formGenres" class="form-control" />
        <form:errors path="formGenres" class="text-danger" />
    </div>
    <input type="submit" value="Add Game" class="btn btn-primary" />
</form:form>
	
</body>
</html>