<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flights</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
       integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<h2>Find Flights</h2>
<form action="/findFlights" method="post">
<pre>
<input type="text" name="from" placeholder="FROM" class="form-control" />
<input type="text" name="to" placeholder="TO" class="form-control" />
<input type="text" name="departureDate" placeholder="Departure Date" class="form-control"/>
<input type="submit" value="Search" class="btn btn-primary">
</pre>
</form>
</body>
</html>