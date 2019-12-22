package com.luv2code.springJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config Java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		
		//retrieve bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get the daily fortune
		System.out.println(theCoach.getDaylyFortune());
		
		
		System.out.println("e-mail : "+theCoach.getEmail()+"\nteam : "+theCoach.getTeam());
		//close the context
		context.close();

	}

}
