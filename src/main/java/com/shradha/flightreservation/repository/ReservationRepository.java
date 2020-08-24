package com.shradha.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shradha.flightreservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
