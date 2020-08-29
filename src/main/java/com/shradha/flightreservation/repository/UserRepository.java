package com.shradha.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shradha.flightreservation.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByEmail(String email);

	@Query("SELECT count(email) FROM User where email=:uemail")
	public Integer getUserEmailCount(String uemail);

	@Query("SELECT count(firstName) FROM User where firstName=:ufirstname")
	public Integer getUserFirstNameCount(String ufirstname);

}
