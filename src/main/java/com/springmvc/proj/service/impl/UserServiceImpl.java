package com.springmvc.proj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.proj.dao.impl.UserDaoImpl;
import com.springmvc.proj.model.User;
import com.springmvc.proj.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoImpl userDao;
	
	@Override
	public User getUserById(String id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public User addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public User updateUser(String id, User user) {
		return userDao.updateUser(id, user);
	}

	@Override
	public User deleteUserById(String id) {
		return userDao.deleteUserById(id);
	}

}
