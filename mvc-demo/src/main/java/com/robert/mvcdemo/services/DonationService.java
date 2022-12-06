package com.robert.mvcdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.repositories.DonationRepository;

@Service
public class DonationService {

	private final DonationRepository donationRepo;
	
	public DonationService(DonationRepository donationRepo) {
		this.donationRepo = donationRepo;
	}
	
	public Donation create(Donation donation) {
		return donationRepo.save(donation);
	}
	
	public List<Donation> getAll(){
		return donationRepo.findAll();
	}
	
	public Donation findOne(Long id) {
		Optional<Donation> optionalDonation = donationRepo.findById(id);
		if(optionalDonation.isPresent()) {
			return optionalDonation.get();
		}else {
			return null;
		}
	}
	
	
	public Donation update(Long id, String donor, String donationName, Integer quantity) {
		Donation donationToBeUpdated = new Donation(id, donor, donationName, quantity);
		return donationRepo.save(donationToBeUpdated);
	}
	
	public String deleteById(Long id) {
		donationRepo.deleteById(id);
		return "you deleted the record with the id of: " + id;
	}

}
