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
	<h1> user Details </h1>
	<h3> User Name: <c:out value="${user.userName}"/></h3>
	<h3> Email: <c:out value="${user.email}"/></h3>
	<h3>All this users donations</h3>
	<table class="table table-dark">
	<thead>
	    <tr>
	      <th scope="col">Donation Name</th>
	      <th scope="col">Quantity</th>
	    </tr>
	  </thead>
	  <tbody>
	    <c:forEach items="${user.donations}" var="donation">
	    <tr>
				<td><c:out value="${donation.donationName}"/></td>
				<td>${donation.quantity}</td>
	    </tr>
		</c:forEach>
	  </tbody>
	</table>

</body>
</html>