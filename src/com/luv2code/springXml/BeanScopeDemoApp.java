package com.luv2code.springXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve first bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//retrieve second bean from spring container
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same 
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the samen object ?\n"+ result);
		System.out.println("\nMemory location for theCoach :"+theCoach);
		System.out.println("\nMemory location for alphaCoach :"+alphaCoach);
		
		
		//close the context
		context.close();
	}

}
