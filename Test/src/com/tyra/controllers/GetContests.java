package com.tyra.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tyra.objects.Contests;
import com.tyra.repository.ContestsRepository;

@RestController
public class GetContests {

	@Autowired 
	private ContestsRepository repository;

	@GetMapping("/contests/{id}")  
	public Contests get(@PathVariable Integer id){  
		Optional<Contests> found = repository.findById(id);

		if (found.isEmpty())
			return null;

		Contests updatedContests = found.get();		
		return updatedContests;  
	}
}
