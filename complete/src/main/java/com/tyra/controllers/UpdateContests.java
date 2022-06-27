package com.tyra.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyra.objects.Contests;
import com.tyra.repository.ContestsRepository;

@RestController
public class UpdateContests {
	
	@Autowired 
	private ContestsRepository repository;

	@PostMapping("/updatecontests/{id}")  
	public String update(@PathVariable Integer id, @RequestBody Contests contest){  
		Optional<Contests> found = repository.findById(id);
		
		if (found.isEmpty())
			return "contest not found";
		
		Contests updatedContests = found.get();
		
		updatedContests.setContestName(contest.getContestName());
		updatedContests.setDescription(contest.getDescription());
		updatedContests.setDetails(contest.getDetails());
		updatedContests.setEndDate(contest.getEndDate());
		updatedContests.setMoneyReward(contest.getMoneyReward());
		updatedContests.setRules(contest.getRules());
		updatedContests.setStartDate(contest.getStartDate());
		
		repository.save(updatedContests);
	return "Contests had been updated";  
}
}