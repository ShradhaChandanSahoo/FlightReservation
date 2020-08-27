<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<h2>Flight Details</h2>

	<form action="addFlightDetails" method="post">
		<div class="form-group">
			<label for="exampleInputPassword1">Flight Number</label> <input
				type="text" class="form-control" id="exampleInputPassword1" name="flightNumber">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Operating Airlines</label> <input
				type="text" class="form-control" id="exampleInputPassword1" name="operatingAirlines">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Departure City</label> <input
				type="text" class="form-control" id="exampleInputPassword1" name="departureCity">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Arrival City</label> <input
				type="text" class="form-control" id="exampleInputPassword1" name="arrivalCity">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Date Of Departure</label> <input
				type="date" class="form-control" id="dateOfDeparture" name="dateOfDeparture">
		</div>
		<input type="submit" value="Search" class="btn btn-primary">
	</form>

</body>
</html>