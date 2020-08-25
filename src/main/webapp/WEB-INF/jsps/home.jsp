<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<h2>Home Page</h2>
<a href="${pageContext.request.contextPath }/user/showRegistrationForm" class="btn btn-secondary">Register</a>
<hr>
<a href="${pageContext.request.contextPath }/user/listOfUsers" class="btn btn-info">List Of Users</a>
</body>
</html>