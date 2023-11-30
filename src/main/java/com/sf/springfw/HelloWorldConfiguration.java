package com.sf.springfw;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record takes care of verbosity of getter, setter, accessor methods, constructor, equals, hashcode
record Person  (String name, int age, Address address) {};
record Address  (String firstLine, String city) {};
record Religion (String religion) {};
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
	public Religion religion() {
		return new Religion("atheist");
		
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("James", 20, new Address ("Main St", "Charleston"));
		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
		
	}
	
	@Bean
	public Person person3Parameters(String name, int age, @Qualifier("address3qualifier") Address address) { //using parameters, not calling methods directly
		return new Person("Using QUALIFIER " + name, age, address);
		
	}
	
	@Bean(name = "address2")
	@Primary   //If more than one Address is called in Address.class, this will fix error
	public Address address() {
		return new Address("12345 Road Dr.", "San Diego");
		
	}
	
	@Bean(name = "address4")
	@Qualifier("address4qualifier")
	public Address address4() {
		return new Address("666 Bart Dr.", "San Antonio");
		
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("6789 Nowhere dr", "Seattle");
		
	}
}
