package com.sf.springfw.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class GamingAppLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();

		} catch (BeansException e) {
			System.out.println("Error from AppGamingBasicSpringBeans");
			e.printStackTrace();
		}

	}

}
