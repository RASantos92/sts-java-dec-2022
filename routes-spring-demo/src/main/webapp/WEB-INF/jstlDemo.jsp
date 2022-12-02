<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
</head>
<body>

	<h1 class="text-success">Styling Test</h1>
	<h3 class="styleTest">testing styling</h3>
	<h1>JSTL Demo</h1>
	<h1> Displaying variables </h1>
	<p><c:out value="${nameFromController}"/></p>
	<p>${ageFromController}</p>
	<p>${isHungryFromController}</p>
	<p><c:out value="${test }"/></p>
	
   	<h1>if-statement</h1>
   	
   	<c:if test="${isHungryFromController}">
   		<p><c:out value="${nameFromController }"/> is hungry</p>
   	</c:if>

  	<h1>if-else statement</h1>
  	<c:choose>
  		<c:when test="${ageFromController < 21 }">
  			<p><c:out value="${nameFromController}"/> is under 21</p>
  		</c:when>
		<c:otherwise>
			<p><c:out value="${nameFromController}"/> is over 21</p>
		</c:otherwise>
  	</c:choose>

  	<h1>for each</h1>
  	
  	<c:forEach var = "user" items="${usersListFromController}">
    	<c:out value = "${user}"/><p>
	</c:forEach>
	
</body>
</html>