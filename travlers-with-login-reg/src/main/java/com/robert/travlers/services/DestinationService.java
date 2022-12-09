package com.robert.travlers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.travlers.models.Destination;
import com.robert.travlers.repostiories.DestinationRepository;

@Service
public class DestinationService {

	private final DestinationRepository destinationRepo;
	public DestinationService(DestinationRepository destinationRepo) {
		this.destinationRepo = destinationRepo;
	}
	
	
	public Destination getOne(Long id) {
		Optional<Destination> destination = destinationRepo.findById(id);
		return destination.isPresent() ? destination.get() : null;
	}

	public List<Destination> getAll() {
		return (List<Destination>) destinationRepo.findAll();
	}

	public Destination create(Destination destination) {
		return destinationRepo.save(destination);
	}

	public Destination update(Destination destination) {
		return destinationRepo.save(destination);
	}

	public void delete(Long id) {
		destinationRepo.deleteById(id);
	}

}
