package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService = null; 
	private String emailAddress = null;
	private String team = null; 
	 
	
	public CricketCoach() {		
		
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;		
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String tream) {
		this.team = tream;
	}

	@Override
	public String getDailyWorkout() {
		 return "Practice fast bowling for 15 min";  
	}
	

	@Override
	public String getDailyFotune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

