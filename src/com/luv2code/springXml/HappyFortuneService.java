package com.luv2code.springXml;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Just do it: Today is your lucky day";
	}

}
