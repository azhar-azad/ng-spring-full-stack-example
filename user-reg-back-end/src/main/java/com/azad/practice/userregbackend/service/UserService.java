package com.azad.practice.userregbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azad.practice.userregbackend.entity.User;
import com.azad.practice.userregbackend.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAll() {
		return (List<User>) userRepository.findAll();
	}

	public void createUser(User user) {
		userRepository.save(user);
	}
}
