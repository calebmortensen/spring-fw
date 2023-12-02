package com.sf.springfw.game;

import org.springframework.stereotype.Component;

@Component
public class FroggerGame implements GamingConsole{

	public void up() {
		System.out.println("Frogger - Up Hop");
	}
	
	public void down() {
		System.out.println("Frogger - Down Hop");
	}
	
	public void left() {
		System.out.println("Frogger - Left Hop");
	}
	public void right() {
		System.out.println("Frogger - Right Hop");
	}
}
