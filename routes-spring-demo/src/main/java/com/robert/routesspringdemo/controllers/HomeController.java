package com.robert.routesspringdemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("someData", "this is some data");
		return "index.jsp";
	}
	
	@GetMapping("/java/demo")
	public String demo() {
		return  "demo.jsp";
	}
	
	@GetMapping("/jstl/demo")
	public String jstlDemo(Model model) {
		ArrayList<String> users = new ArrayList<String>();
		String name = "Anthony Randall";
		Integer age = 82;
		Boolean isHungry = true;
		model.addAttribute("nameFromController", name);
		model.addAttribute("ageFromController", age);
		model.addAttribute("isHungryFromController", isHungry);
		model.addAttribute("test", "<script>alert('h1')</script>");
		
		users.add("Tyler");
		users.add("Thane");
		users.add("Christy");
		model.addAttribute("usersListFromController", users);
		
		return "jstlDemo.jsp";
	}

}
