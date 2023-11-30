package com.sf.springfw.game;

public class GameRunner {
	
	MarioGame game;
	
	public GameRunner(MarioGame game) {
		
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game); //will change to LOGGING later
		game.up();
		game.down();
		game.left();
		game.right();
	}

}