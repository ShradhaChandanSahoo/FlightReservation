package com.shradha.flightreservation.service;

import com.shradha.flightreservation.dto.ReservationRequest;
import com.shradha.flightreservation.model.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);
}
