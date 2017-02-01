package com.springmvc.proj.dao;

import java.util.List;

import com.springmvc.proj.model.User;

public interface UserDao {
	
	public User getUserById(String id);
	public List<User> getAllUser();
	public User addUser(User user);
	public User updateUser(String id, User user);
	public User deleteUserById(String id);

}
