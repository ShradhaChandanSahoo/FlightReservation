package com.shradha.flightreservation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	private Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String homePage() {
		log.info("Home Page lunched");
		return "home";
	}
}
