package com.shradha.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shradha.flightreservation.model.User;
import com.shradha.flightreservation.service.UserService;


@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/showRegistrationForm")
	public String showRegistrationForm() {
		return "login/registerUser";
	}
	@GetMapping("showLoginForm")
	public String showLoginForm() {
		return "login/login";
	}
	
	@PostMapping("/registerUser")
	public String userRegistration(@ModelAttribute("user") User user) {
		userService.saveUserRegistration(user);
		return "login/login";
	}
	
	@GetMapping("/valiadteEmail")
	public @ResponseBody String validateEmail(@RequestParam String uemail) {
		
		String message = "";
		if(userService.isExistByEmail(uemail)) {
			message = uemail+" is Exist";
		}
		return message;
	}
	
	@GetMapping("/validateFirstName")
	public @ResponseBody String validateFirstName(@RequestParam("ufirstname") String ufirstname ) {
		String message = "";
		
		if(userService.isUserExistByFirstName(ufirstname)) {
			message = "This "+ufirstname+" is already exist";		
		}
		
		return message;
		
	}
	
	@GetMapping("/listOfUsers")
	public String listOfUsers(Model theModel) {
		List<User> theUsers = userService.getListOfUsers();
		theModel.addAttribute("users", theUsers);
		return "listOfUsers";
	}
	
	@PostMapping("/userLogin")
	public String userLogin(@RequestParam("email") String email, @RequestParam("password") String password,Model theModel) {
		User oneUser = userService.findByEmail(email);
		if(oneUser.getPassword().equals(password)) {
			return "findFlights";
		}
		else {
			theModel.addAttribute("msg", "Invalid User name or Password . please try again.");
		}
		return "login/login";
	}
}
