package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
@PostMapping("/saveOperation")
	public User saveOperation(@RequestBody User user) {
		User use = userService.saveOperation(user);
		return use;
	}
}
