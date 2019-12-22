package com.luv2code.springJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


//Java configuration class to perform IoC and DI

@Configuration
//@ComponentScan("com.luv2code.springJava")
@PropertySource("classpath:sport.properties")
public class ApplicationContextConfig {

	//define bean for sad fortune service	
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define ban for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach (sadFortuneService());
	}


}
