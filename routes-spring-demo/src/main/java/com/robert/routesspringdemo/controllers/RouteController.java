package com.robert.routesspringdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
// https://www.google.com/search?keyword=huskys
	
	@GetMapping("/search")
	public String searchKeyword(@RequestParam("keyword") String keywordFromClient) {
		return "You are seraching for " + keywordFromClient;
	}
	
	// localhost:8080/search?name=name&age=3
	@GetMapping("/pet")
	public String getPet(@RequestParam("name") String name, @RequestParam("age") Integer age) {
		return "Your pet " + name + " is " + age + " years old";
	}
	
	@GetMapping("/optional/pet")
	public String optionalPet(@RequestParam(value="name", required=false) String name, @RequestParam(value = "age", required=false) Integer age) {
		if(age == null) {
			return "age is not avaliable";
		}
		return "Your pet " + name + " is " + age + " years old";
	}
	
	
	@GetMapping("/m/{name}/{color}")
	public String petWithColor(@PathVariable("name") String name, @PathVariable("color") String color) {
		return "name: " + name + " color " + color;
	}
	

}
