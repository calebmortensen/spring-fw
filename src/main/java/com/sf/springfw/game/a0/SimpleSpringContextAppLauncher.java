package com.sf.springfw.game.a0;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SimpleSpringContextAppLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextAppLauncher.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
		} catch (BeansException e) {
			System.out.println("Error from DepInjectionAppLauncher");
			e.printStackTrace();
		}

	}

}
