package com.shradha.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shradha.flightreservation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);

}
