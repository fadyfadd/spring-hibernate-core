package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {		 
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public TrackCoach(FortuneService fortuneService) {		 
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFotune() {
		return "just do it " + fortuneService.getFortune();
	}
	
	public void doMyStartupStuff() {
		System.out.println("Bean startup");
	}
	

	public void doMyCleanupStuff() {
		System.out.println("Bean cleanup");
	}
	
	
	
}
