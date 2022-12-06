package com.robert.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.services.DonationService;

@Controller
@RequestMapping("/donations")
public class DonationController {

	public final DonationService donationServ;
	public DonationController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/all")
	public String allDonations(Model model) {
		model.addAttribute("allDonations", donationServ.getAll());
		return "showAll.jsp";
	}
	
	@GetMapping("/one/{id}")
	public String oneDonation(@PathVariable("id") Long id, Model model) {
		Donation oneDonation = donationServ.findOne(id);
		model.addAttribute("oneDonation", oneDonation);
		return "oneDonation.jsp";
	}

}
