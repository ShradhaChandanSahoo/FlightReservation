package com.shradha.flightreservation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shradha.flightreservation.dto.ReservationRequest;
import com.shradha.flightreservation.model.Flight;
import com.shradha.flightreservation.model.Passenger;
import com.shradha.flightreservation.model.Reservation;
import com.shradha.flightreservation.repository.FlightRepository;
import com.shradha.flightreservation.repository.PassengerRepository;
import com.shradha.flightreservation.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	private FlightRepository flightRepository;
	
	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		// make payment
		
		Long theFlightId = request.getFlightId();
		Optional<Flight> theId = flightRepository.findById(theFlightId);
		Flight flight;
		if(theId.isPresent()) {
			 flight = theId.get();
		}else {
			throw new RuntimeException("Flight Id Not Pesent");
		}
		
		Passenger thePassenger = new Passenger();
		thePassenger.setFirstName(request.getPassengerFirstName());
		thePassenger.setLastName(request.getPassengerLastName());
		thePassenger.setEmail(request.getPassengerEmail());
		thePassenger.setPhone(request.getPassengerPhone());
		
		Passenger savedPassenger = passengerRepository.save(thePassenger);
		
		Reservation theReservation = new Reservation();
		theReservation.setFlight(flight);
		theReservation.setPassenger(savedPassenger);
		theReservation.setCheckedIn(false);
		
		Reservation savedReservation = reservationRepo.save(theReservation);
		
		return savedReservation;
	}

}
