package com.shradha.flightreservation.dto;

import lombok.Data;

@Data
public class ReservationUpdateRequest {
	
	private Long id;
	private Boolean checkedIn;
	private Integer numberOfBags;

}
