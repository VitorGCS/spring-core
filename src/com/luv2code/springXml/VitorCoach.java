package com.luv2code.springXml;

public class VitorCoach implements Coach {

	private FortuneService fortuneService;
	
	public VitorCoach() {}
	
	public VitorCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Vitor Coach called...";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
