package com.tyra.objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.tyra.repository.ContestsRepository;


@Entity 
public class Contests  {

	@Id
	@GeneratedValue
	private int id; 
	private String contestName; 
	private String description; 
	private String startDate;
	private String endDate;
	private String details; 
	private String rules; 
	private String moneyReward; 

	public Contests() {
		
	}
	
	public Contests(int id, String contestName,
			String description, String startDate, 
			String endDate, String details, String rules,
			String moneyReward){
		this.id = id;
		this.contestName = contestName;
		this.startDate = startDate;
		this.endDate = endDate; 
		this.details = details; 
		this.rules = rules; 
		this.moneyReward = moneyReward; 
	}
	
//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getContestName() {
		return contestName;
	}


	public void setContestName(String contestName) {
		this.contestName = contestName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public String getRules() {
		return rules;
	}


	public void setRules(String rules) {
		this.rules = rules;
	}


	public String getMoneyReward() {
		return moneyReward;
	}


	public void setMoneyReward(String moneyReward) {
		this.moneyReward = moneyReward;
	}


}
