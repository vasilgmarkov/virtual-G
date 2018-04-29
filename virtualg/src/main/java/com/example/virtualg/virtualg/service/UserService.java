package com.example.virtualg.virtualg.service;

import com.example.virtualg.virtualg.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
