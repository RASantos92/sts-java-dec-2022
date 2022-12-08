<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form action="/donations/new" method="post" modelAttribute="donation">
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
        <form:select path="donor">
        	<c:forEach var="user" items="${allUsers}">
        		<form:option value="${user.id}" path="donor">
        			<c:out value="${user.userName}"/>
        		</form:option>
        	</c:forEach>
        </form:select>
    </div>
    <input type="submit" value="Add Donation" class="btn btn-primary" />
</form:form>
</body>
</html>