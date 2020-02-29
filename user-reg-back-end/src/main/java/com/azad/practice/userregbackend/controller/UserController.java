package com.azad.practice.userregbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azad.practice.userregbackend.entity.User;
import com.azad.practice.userregbackend.service.UserService;

@RestController
@RequestMapping(path = "users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getUsers() {
		return userService.getAll();
	}
	
	@PostMapping
	public void addUser(@RequestBody User user) {
		userService.createUser(user);
	}
}
