package com.luv2code.springAnnotation;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Value("${fortune.one}")
	String firstfortune;
	
	@Value("${fortune.two}")
	String secondFortune;
	
	@Value("${fortune.three}")
	String thirdFrotune;

	//create an array of strings
	private String [] data;
	
	@PostConstruct
	public void setupMyData() {
		data = new String[3];
		
		data[0]= firstfortune;
		data[1]= secondFortune;
		data[2]= thirdFrotune;
	}
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		return data[index];
	}
}
