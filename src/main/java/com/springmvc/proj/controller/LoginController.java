package com.springmvc.proj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value="name",defaultValue="ronald") String name){
		ModelAndView model = new ModelAndView("login");
		model.addObject("name", name);
		return model;
	}
}
