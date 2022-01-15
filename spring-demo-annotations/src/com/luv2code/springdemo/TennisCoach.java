package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomeService")
	private FortuneService fortuneService;
	
	@PostConstruct
	private void onConstruct() {
		System.out.println("Construct");
	}
	
	@PreDestroy
	private void onDestruct() {
		System.out.println("Destruct");		
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	public TennisCoach() {
		
		
	}
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	*/
	
	/*
 	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {		
		fortuneService = theFortuneService;
	}
	
	*/
	
	 
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	 
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	} 
	

}
