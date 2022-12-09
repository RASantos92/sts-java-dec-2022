<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 

</head>
<body>
	<h1>Dashboard <c:out value="${loggedInUser.userName}"/></h1>
	<a href="/users/logout">Logout</a>
	<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Destination Name</th>
      <th scope="col">Traveler</th>
      <th scope="col">Would Recommend</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${allDestinations}" var="destination">
    <tr>
			<td><a href="/destinations/view/${destination.id }"/><c:out value="${destination.destinationName}"/></a></td>
			<td><c:out value="${destination.traveler.userName}"/></td>
			<td>${destination.wouldRecommend}</td>
			<td>
				<a class="btn btn-outline-dark btn-danger" href="/destinations/edit/${destination.id}">Edit</a>
				<form action="/destinations/delete/${destination.id}" method="post">
					<input type="hidden" value="delete" name="_method"/>
					<input class="text-primary" type="submit" value="delete destination">
				</form>
			</td>
    </tr>
	</c:forEach>
  </tbody>
</table>
</body>
</html>