package com.sf.springfw.game;

import org.springframework.stereotype.Component;

@Component
public class Zelda implements GamingConsole{

	public void up() {
		System.out.println("Zelda - Up");
	}
	
	public void down() {
		System.out.println("Zelda - Down");
	}
	
	public void left() {
		System.out.println("Zelda - Left");
	}
	public void right() {
		System.out.println("Zelda - Right");
	}
}
