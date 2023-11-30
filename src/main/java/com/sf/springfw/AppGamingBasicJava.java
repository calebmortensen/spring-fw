package com.sf.springfw;

import com.sf.springfw.game.GameRunner;
import com.sf.springfw.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
