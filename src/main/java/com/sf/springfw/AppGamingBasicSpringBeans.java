package com.sf.springfw;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sf.springfw.game.GameRunner;
import com.sf.springfw.game.GamingConsole;
import com.sf.springfw.game.MarioGame;
import com.sf.springfw.game.PacManGame;
import com.sf.springfw.game.SuperContraGame;

public class AppGamingBasicSpringBeans {

	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext (GamingConfiguration.class)) {
			
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
			
		} catch (BeansException e) {
			System.out.println("Error from AppGamingBasicSpringBeans");
			e.printStackTrace();
		}

	}

}
