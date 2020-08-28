<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" 
      integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<h2 align="center">Complete Reservation</h2>
<p align="center"><b>Airline: ${flight.operatingAirlines }</b></p>
<p align="center"><b>Departure City : ${flight.departureCity }</b></p>
<p align="center"><b>Arrival City   : ${flight.arrivalCity }</b></p>


<form action="completeReservation" method="post">
<pre>
<h2>Passenger Details:</h2>
<input class="form-control" type="text" placeholder="First Name" name="passengerFirstName"/>
<input class="form-control" type="text" placeholder="Last Name" name="passengerLastName"/>
<input class="form-control" type="text" placeholder="Email" name="passengerEmail"/>
<input class="form-control" type="text" placeholder="Phone Number" name="passengerPhone"/>

<h2>Card Details</h2>
<input class="form-control" type="text" placeholder="Name On The Card" name="nameOnTheCard"/>
<input class="form-control" type="text" placeholder="Card Number" name="cardNumber"/>
<input class="form-control" type="text" placeholder="Expiration Date" name="expirationDate"/>
<input class="form-control" type="text" placeholder="Three Digit Security Code" name="securityCode"/>

<input type="hidden" name="flightId" value="${flight.id }"/>

<input type="submit" value="Confirm"  class="btn btn-primary btn-lg btn-block">
</pre>
</form>

</body>
</html>