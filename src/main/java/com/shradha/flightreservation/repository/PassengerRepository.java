package com.shradha.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shradha.flightreservation.model.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
