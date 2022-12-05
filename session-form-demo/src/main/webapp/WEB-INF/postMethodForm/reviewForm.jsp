<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1> Review form </h1>
	<form action="/review/process" method="post">
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