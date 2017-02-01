package com.springmvc.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.proj.model.User;
import com.springmvc.proj.service.impl.UserServiceImpl;

@Controller
public class TestController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping("/")
	public String test(@RequestParam(value="id",defaultValue="raf") String id, Model model){
		model.addAttribute("user", userService.getUserById(id));
		return "index";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(){
		
		//userService.addUser(new User("raf","usernameko","123","emailko","",true));
		return "add 1";
	}

}
