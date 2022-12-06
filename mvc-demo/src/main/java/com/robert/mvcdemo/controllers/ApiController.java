package com.robert.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class ApiController {

	public final DonationService donationServ;
	
	public ApiController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	//-------------find all (/donations)----------------
	@GetMapping("/donations")
	public List<Donation> findAllDonations(){
		return donationServ.getAll();
	}
	
	//-------------create one (/donations)----------------
	
	@PostMapping("/donations")
	public Donation createDonation(@RequestParam("donationName") String donationName, @RequestParam("donor") String donor,@RequestParam("quantity") Integer quantity) {
		Donation newDonation = new Donation(donor, donationName , quantity);
		return donationServ.create(newDonation);
	}
	
	
	//-------------FIND ONE (/donations/{id})----------------
	@GetMapping("/donations/{id}")
	public Donation findOneDonation(@PathVariable("id") Long id) {
		return donationServ.findOne(id);
	}
	
	
	//-------------Edit (/donations/{id})----------------
	@PutMapping("/donations/{id}")
	public Donation findOneAndUpdate(@PathVariable("id") Long id,@RequestParam("donationName") String donationName, @RequestParam("donor") String donor,@RequestParam("quantity") Integer quantity ) {
		return donationServ.update(id, donor, donationName, quantity);
	}
	
	
	//-------------Delete (/donations/{id})----------------
	
	@DeleteMapping("/donations/{id}")
	public String delete(@PathVariable("id") Long id) {
		return donationServ.deleteById(id);
	}
	
	

}
