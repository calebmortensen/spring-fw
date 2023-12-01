package com.sf.springfw.game;

public class PacManGame implements GamingConsole{

	public void up() {
		System.out.println("Pac Man - Up");
	}
	
	public void down() {
		System.out.println("Pac Man - Down");
	}
	
	public void left() {
		System.out.println("Pac Man - Left");
	}
	public void right() {
		System.out.println("Pac Man - Right");
	}
}
