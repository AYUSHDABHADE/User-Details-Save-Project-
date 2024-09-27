package com.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;

@Repository
public class UserImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveOperation(User user) {
		User use = userRepository.save(user);
		return use;
	}

}
