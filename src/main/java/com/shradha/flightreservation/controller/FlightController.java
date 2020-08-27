package com.shradha.flightreservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shradha.flightreservation.model.Flight;
import com.shradha.flightreservation.service.FlightService;

@Controller
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from")String from,@RequestParam("to")String to,
			                   @RequestParam("departureDate")@DateTimeFormat(pattern = "MM-dd-yyyy")Date departureDate,
			                   Model theModel) {
		
		List<Flight> theFlights = flightService.findFlights(from, to, departureDate);
		System.out.println(theFlights);
		theModel.addAttribute("flights", theFlights);
		
		return "displayFlights";
		
	}
	
	@GetMapping("/showAddFlightDetailsForm")
	public String showAddFlightDetailsForm() {
		return "flightDetails";
	}
	
	@PostMapping("/addFlightDetails")
	public String addFlightDetails(@ModelAttribute("flight") Flight flight) {
		
		flightService.addFlightInformations(flight);
		return "displayFlights";
	}

}
