package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	
	public BaseballCoach(FortuneService theFortuneService) {		
		fortuneService =  theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min on batting practice";
	}

	@Override
	public String getDailyFotune() {		 
		return fortuneService.getFortune();
	}

}
