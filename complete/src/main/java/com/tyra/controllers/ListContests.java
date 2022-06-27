package com.tyra.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyra.objects.Contests;
import com.tyra.repository.ContestsRepository;

@RestController
public class ListContests {
	
	@Autowired
	private ContestsRepository repository;
	
	@GetMapping("/listcontests")
	public List<Contests> listContests() {
		List<Contests> contests = new ArrayList<Contests>();
		
		Iterator<Contests> it = repository.findAll().iterator();
		
		while (it.hasNext())
			contests.add(it.next());
		
		return contests;
	}
}

	

