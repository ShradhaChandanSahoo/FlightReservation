<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<h2>Flights</h2>

<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Id</th>
				<th scope="col">AirLines</th>
				<th scope="col">Departure City</th>
				<th scope="col">Arrival City</th>
				<th scope="col">Departure Time</th>
				<th scope="col">Estimated Departure Time</th>
				<th scope="col">Action</th>
				
			</tr>
		</thead>
			<c:forEach var="tempFlights" items="${flights }">
			
			<tr>
			    <td>${tempFlights.id }</td>
				<td>${tempFlights.operatingAirlines }</td>
				<td>${tempFlights.departureCity }</td>
				<td>${tempFlights.arrivalCity }</td>
				<td>${tempFlights.dateOfDeparture }</td>
				<td>${tempFlights.estimatedDepartureTime }</td>
				<td>
				<a href="showCompleteReservation?flightId=${tempFlights.id }" class="btn btn-warning">Select</a>
				</td>
			</tr>
			
			</c:forEach>
		<tbody>
		</tbody>
</table>

</body>
</html>