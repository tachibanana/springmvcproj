package com.springmvc.proj.service;

import java.util.List;

import com.springmvc.proj.model.User;

public interface UserService {

	public User getUserById(String id);
	public List<User> getAllUser();
	public User addUser(User user);
	public User updateUser(String id, User user);
	public User deleteUserById(String id);

}
