package com.v1.Pv1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.v1.Pv1.Model.Users;
import com.v1.Pv1.controller.service.UserService;


@RestController
@RequestMapping("api")
public class MainController {
	Users users = new Users(0, "Ajay");
	UserService userService;
	@Autowired
	public MainController(UserService theUserService) {
		userService = theUserService;
	}

	@GetMapping("test")
	public String test() {
		throw new ResponseStatusException(HttpStatus.ACCEPTED, "Cause description here");
		}
	@GetMapping("getAllUsers")
	public List<Users> getUser() {
		System.out.println("in getUser");
		return userService.getAllUsers();
	}

	@GetMapping("setUsers")
	public String setUser() {
		users.setId(2021);
		users.setName("Ajay");
		System.out.println(users);
		userService.save(users);
		System.out.println("updating databses");
		return "successfully submitted";
	}
}



