package com.tyra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tyra.repository.ContestsRepository;


@RestController
public class DeleteContest {

	@Autowired 
	private ContestsRepository repository;

	@DeleteMapping("/contests/{id}")
	public String deleteContest(@PathVariable Integer id){
		repository.deleteById(id);
		return "Contest " + id + "was deleted";
	}
}


