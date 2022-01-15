package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService = null; 
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Value("${foo.email}")
	private String email;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Value("${foo.team}")
	private String team;
		
	@Override
	public String getDailyWorkout() {
		 
		return "Swim 1000 m for a warmup"; 
	}

	@Override
	public String getDailyFortune() {
	 
		return fortuneService.getFortune();
	}

}
