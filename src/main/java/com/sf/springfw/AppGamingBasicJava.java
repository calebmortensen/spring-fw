package com.sf.springfw;

import com.sf.springfw.game.GameRunner;
import com.sf.springfw.game.MarioGame;
import com.sf.springfw.game.PacManGame;
import com.sf.springfw.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var game = new PacManGame();
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
