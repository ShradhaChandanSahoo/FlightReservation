<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>


	<form action="registerUser" method="post">
		<pre>
	     <h2>User Registration</h2>
	
		 <input type="text" name="firstName"  class="form-control" placeholder="FIRST NAME"/>
		 <input type="text" name="lastName"  class="form-control" placeholder="LAST NAME"/>
		 <input type="text" name="email"  class="form-control" placeholder="EMAIL"/>
		 <input type="password" name="password"  class="form-control" placeholder="PASSWORD"/>
		 <input type="password" name="confirmPassword"  class="form-control" placeholder="CONFIRM PASSWORD"/>
	    <input type="submit" value="Register" class="btn btn-primary" />
	</pre>
	</form>

</body>
</html>