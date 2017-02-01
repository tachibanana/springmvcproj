package com.springmvc.proj.webapi;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.proj.model.User;
import com.springmvc.proj.service.impl.UserServiceImpl;

@Component
@Path("/webapi/user")
public class UserEndPoint {
	
	@Autowired
	private UserServiceImpl userService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUser(){
		return userService.getAllUser();
	}

	@POST
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes(MediaType.APPLICATION_JSON)
	public User addUser(User user){
		return userService.addUser(user);
	}

	@GET
	@Path("/{userId}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public User getUser(@PathParam("userId") String id){
		return userService.getUserById(id);
	}

}
