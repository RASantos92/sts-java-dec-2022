package com.robert.travlers.repostiories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.robert.travlers.models.Destination;

@Repository
public interface DestinationRepository extends CrudRepository<Destination, Long>{
	List<Destination> findAll();
}
