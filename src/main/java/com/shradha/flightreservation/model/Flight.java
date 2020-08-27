package com.shradha.flightreservation.model;



import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import lombok.Data;

@Entity
@Data
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String flightNumber;
	private String operatingAirlines;
	private String departureCity;
	private String arrivalCity;
	@Temporal(TemporalType.DATE)
	private Date dateOfDeparture;
	@Temporal(TemporalType.TIMESTAMP)
	private Date estimatedDepartureTime;
}
