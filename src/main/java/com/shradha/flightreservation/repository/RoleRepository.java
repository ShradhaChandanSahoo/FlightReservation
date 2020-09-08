package com.shradha.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shradha.flightreservation.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
