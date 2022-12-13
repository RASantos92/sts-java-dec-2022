<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Here are all the Games</h1>
	<a href="/games/create">Add a Game</a>
	<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Game Title</th>
      <th scope="col">Genres</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${allGames}" var="game">
    <tr>
			<td>${game.title}</td>
			<td>
				<c:forEach items="${game.genres}" var="genre">
					<c:out value="${genre.name }"/>
				</c:forEach>
			</td>
    </tr>
	</c:forEach>
  </tbody>
</table>
</body>
</html>