package com.sf.springfw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record takes care of verbosity of getter, setter, accessor methods, constructor, equals, hashcode
record Person  (String name, int age, Address address) {};
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
		return new Person("James", 20, new Address ("Main St", "Charleston"));
		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
		
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) { //using parameters, not calling methods directly
		return new Person(name, age, address3);
		
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("12345 Road Dr.", "San Diego");
		
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("6789 Nowhere dr", "Seattle");
		
	}
}
