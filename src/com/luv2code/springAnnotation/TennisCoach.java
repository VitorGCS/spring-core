package com.luv2code.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	//3º field injection
	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	/*
	//1º constructor injection
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	 */
	
	public TennisCoach() {
		super();
		System.out.println(">> TennisCoach: inside default constructor");
	}

	/*
	//2º setter injection
	@Autowired
	public void doSomeThings(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeThings() nethod");
		this.fortuneService = fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}


	@Override
	public String getDaylyFortune() {
		return fortuneService.getFortune();
	}

}
