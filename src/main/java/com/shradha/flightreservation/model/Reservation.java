package com.shradha.flightreservation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Boolean checkedIn;
	private Integer numberOfBags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
}
