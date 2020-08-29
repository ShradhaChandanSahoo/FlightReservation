package com.shradha.flightreservation.service;

import java.util.List;

import com.shradha.flightreservation.model.User;

public interface UserService {

	public void saveUserRegistration(User user);
	public List<User> getListOfUsers();
	public User findByEmail(String email);
	public boolean isExistByEmail(String uemail);
	public boolean isUserExistByFirstName(String ufirstname);

}
