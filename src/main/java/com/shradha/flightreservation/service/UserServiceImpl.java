package com.shradha.flightreservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shradha.flightreservation.model.User;
import com.shradha.flightreservation.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void saveUserRegistration(User user) {
		
		userRepo.save(user);
	}

	@Override
	public List<User> getListOfUsers() {
		List<User> theUser = userRepo.findAll();
		return theUser;
	}

	@Override
	public User findByEmail(String email) {
		User oneUser = userRepo.findByEmail(email);
		return oneUser;
	}

}
