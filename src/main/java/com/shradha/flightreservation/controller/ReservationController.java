package com.shradha.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.shradha.flightreservation.dto.ReservationRequest;
import com.shradha.flightreservation.model.Reservation;
import com.shradha.flightreservation.service.ReservationService;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationService;
	
	@PostMapping("/completeReservation")
	public String completeReservation(ReservationRequest request,Model theModel) {
		
		Reservation reservation = reservationService.bookFlight(request);
		theModel.addAttribute("msg", "Reservation Created Successfully and the Id is "+reservation.getId());
		
		return "reservationConfirmation";
		
	}

}
