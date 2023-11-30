package com.sf.springfw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record takes care of verbosity of getter, setter, accessor methods, constructor, equals, hashcode
record Person  (String name, int age) {};
record Address  (String firstLine, String city) {};
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Caleb";
	}
	
	@Bean
	public int age() {
		return 44;
	}
	
	@Bean
	public Person person() {
		return new Person("James", 20);
		
	}
	
	@Bean
	public Address address() {
		return new Address("12345 Road Dr.", "San Diego");
		
	}
}
