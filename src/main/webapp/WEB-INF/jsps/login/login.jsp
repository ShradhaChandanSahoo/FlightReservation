<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
</head>
<body>

	<h2>Login</h2>

	<form action="userLogin" method="post">

		

			<div class="alert alert-danger" role="alert" >${msg }</div>

		

		<pre>
<input type="text" name="email" class="form-control" placeholder="EMAIL" />
<input type="password" name="password" class="form-control"
				placeholder="PASSWORD" />
<input type="submit" value="Login" class="btn btn-primary">
<br>
<a href="${pageContext.request.contextPath }/" class="btn btn-secondary">Back to Home</a>
</pre>

	</form>

</body>
</html>