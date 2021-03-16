package com.singgihsuryop.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/")
	String home(Model model) {
		
		model.addAttribute("message", "Hello World");
		
		return "home";
	}
}
