package com.shradha.flightreservation.service;

import java.sql.Timestamp;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

	@Override
	public void addFlightInformations(Flight flight) {
		
		Date dateOfDeparture = flight.getDateOfDeparture();
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		String str = formatter.format(dateOfDeparture);
		
		
		try {
			Date parse = formatter.parse(str);
			
			flight.setDateOfDeparture(parse);
			flight.setEstimatedDepartureTime(parse);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		flightRepo.save(flight);

	}

	@Override
	public Flight findOneById(Long flightId) {
		
		Optional<Flight> theFlightId = flightRepo.findById(flightId);
		
		if(theFlightId.isPresent()) {
			Flight theFlight = theFlightId.get();
			return theFlight;
		}else {
			throw new RuntimeException("Flight Id Not Present");
		}
		
		
	}

}
