package com.shradha.flightreservation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shradha.flightreservation.dto.ReservationUpdateRequest;
import com.shradha.flightreservation.model.Reservation;
import com.shradha.flightreservation.service.ReservationService;

@RestController
@CrossOrigin
public class ReservationRestController {
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		
		Reservation reservation =reservationService.findReservationById(id);
		
		return reservation;	
	}
	
	@PostMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		Long id = request.getId();
		
		Reservation reservation = reservationService.findReservationById(id);
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		Reservation updatedReservation = reservationService.saveUpdateReservation(reservation);
		return updatedReservation;
	}

}
