<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Users</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
       integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

	<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Id</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
			</tr>
		</thead>
		<tbody>
		
			<c:forEach var="tempUser" items="${users }">
				<tr>
					<td>${tempUser.id }</td>
					<td>${tempUser.firstName }</td>
					<td>${tempUser.lastName }</td>
					<td>${tempUser.email }</td>
					<td>${tempUser.password }</td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>

<br>
<a href="${pageContext.request.contextPath }/" class="btn btn-primary">Back to Home</a>

</body>
</html>