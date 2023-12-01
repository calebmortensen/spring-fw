package com.sf.springfw.game.al;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
		
	//@Autowired  //Field Injection
	Dependency1 dependency1;
	
	Dependency2 dependency2;

	@Autowired  //Constructor Injections
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	/*
	 * @Autowired //Setting Injection public void setDependency1(Dependency1
	 * dependency1) { this.dependency1 = dependency1; }
	 * 
	 * @Autowired public void setDependency2(Dependency2 dependency2) {
	 * this.dependency2 = dependency2; }
	 */
	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}


@Configuration
@ComponentScan
public class DepInjectionAppLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DepInjectionAppLauncher.class)) {
			
			//List Beans using Functional Programming
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
			
			
		} catch (BeansException e) {
			System.out.println("Error from DepInjectionAppLauncher");
			e.printStackTrace();
		}

	}

}
