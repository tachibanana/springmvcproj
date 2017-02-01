package com.springmvc.proj.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.proj.dao.UserDao;
import com.springmvc.proj.model.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUserById(String id) {
		try{
			User user = null;
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			user = session.get(User.class, id);
			session.getTransaction().commit();
			return user;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<User> getAllUser() {
		try{
			List<User> listOfUser = new ArrayList<User>();
			Query query = null;
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			query = (Query) session.createQuery("from User");
			session.getTransaction().commit();

			for(Object obj : query.list())
				listOfUser.add((User) obj);
			
			return listOfUser;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User addUser(User user) {
		try{
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			return user;
		}catch(Exception e){
			e.printStackTrace();
			return user;
		}
	}

	@Override
	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
