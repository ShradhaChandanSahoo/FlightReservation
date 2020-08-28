package com.shradha.flightreservation.service;

import java.util.Date;
import java.util.List;

import com.shradha.flightreservation.model.Flight;

public interface FlightService {
	
	public List<Flight> findFlights(String from,String to,Date departureDate);

	public void addFlightInformations(Flight flight);

	public Flight findOneById(Long flightId);

}
