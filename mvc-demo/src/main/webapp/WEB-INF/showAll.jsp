<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/donations/search">
		<input type="text" name="search"/>
		<input type="submit" value="Search"/>
	</form>
	<table>
		<thead>
			<tr>
				<th> Donation </th>
				<th> Donor </th>
				<th> Quantity </th>
				<th> Action </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="donation" items="${allDonations}">
				<tr>
					<td><c:out value="${donation.donationName}"/></td>
					<td><c:out value="${donation.donor}"/></td>
					<td>${donation.quantity}</td>
					<td>
					<form action="/donations/${donation.id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input type="submit" value="Delete">
					</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="/donations/all" method="post" modelAttribute="donation">
    <div class="form-group">
        <form:label path="donationName" >Donation Name</form:label>
        <form:input type="text" path="donationName" class="form-control" />
        <form:errors path="donationName"/>
    </div>
    <div class="form-group">
		<form:label path="quantity" >Quantity</form:label>
        <form:input type="number" path="quantity" class="form-control" />
        <form:errors class="text-danger" path="quantity"/>
    </div>
    <div class="form-group">
        <form:label path="donor" >Donor</form:label>
        <form:input type="text" path="donor" class="form-control" />
        <form:errors path="donor"/>
    </div>
    <input type="submit" value="Add Donation" class="btn btn-primary" />
</form:form>
	

</body>
</html>