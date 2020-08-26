package com.shradha.flightreservation.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shradha.flightreservation.model.Flight;
import com.shradha.flightreservation.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepository flightRepo;

	@Override
	public List<Flight> findFlights(String from, String to, Date departureDate) {
		
		List<Flight> theFlights = flightRepo.findFlights(from, to, departureDate);
		
		return theFlights;
	}

}
