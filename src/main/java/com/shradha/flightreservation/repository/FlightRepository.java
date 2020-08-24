package com.shradha.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shradha.flightreservation.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
