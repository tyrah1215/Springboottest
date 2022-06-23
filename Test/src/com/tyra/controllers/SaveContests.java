package com.tyra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyra.objects.Contests;
import com.tyra.repository.ContestsRepository;


@RestController
public class SaveContests {
	
	@Autowired 
	private ContestsRepository repository;
	
	@PostMapping("/savecontests")
	public String savecontests(@RequestBody Contests newContest) {
		
		repository.save(newContest);
		return "New Contest was saved";
		
	}
}
//{"id":0, "contestName:Gumshdkfhskdfh", "startDate": "shdkhfksdhf", "endDate": "sghdjhsgfjhsd", "details":"dhfkjhsdfkhsdkfhkdfjhksjdhfkjsdhfkjhsdfkjh", "rules": "sjhdgfjhgdsjfhgfshjgdgfjhsdgfjhsgdfjhgsdfhj", "moneyReward":"$938498"}