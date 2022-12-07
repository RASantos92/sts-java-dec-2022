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

</body>
</html>