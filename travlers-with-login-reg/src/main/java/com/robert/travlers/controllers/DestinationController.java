package com.robert.travlers.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.travlers.models.Destination;
import com.robert.travlers.services.DestinationService;

@Controller
@RequestMapping("/destinations")
public class DestinationController {

	private final DestinationService destinationServ;
	public DestinationController(DestinationService destinationServ) {
		this.destinationServ = destinationServ;
	}
	
	@GetMapping("/create")
	public String createDestination(@ModelAttribute("destination") Destination destination, HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/register";
		}
		return "destination/create.jsp";
	}
	
	@PostMapping("/create")
	public String processCreateDestination(@Valid @ModelAttribute("destination") Destination destination, BindingResult result ) {
		if(result.hasErrors()) {
			return "destination/create.jsp";
		}
		destinationServ.create(destination);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editDestination(@PathVariable("id") Long id, Model model,HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/register";
		}
		Destination destination = destinationServ.getOne(id);
		model.addAttribute("destination", destination);
		return "destination/edit.jsp";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDestination(@PathVariable("id") Long id) {
		destinationServ.delete(id);
		return "redirect:/";
	}
	
	@PutMapping("/edit/{id}")
	public String processEditDestination(@PathVariable("id") Long id, @Valid @ModelAttribute("destination") Destination destination, BindingResult result) {
		if(result.hasErrors()) {
			return "destination/edit.jsp";
		}
		destinationServ.update(destination);
		return "redirect:/";
				
	}
	
	@GetMapping("/view/{id}")
	public String viewDestination(@PathVariable("id") Long id, Model model) {
		Destination destination = destinationServ.getOne(id);
		model.addAttribute("destination", destination);
		return "destination/view.jsp";
	}

}
