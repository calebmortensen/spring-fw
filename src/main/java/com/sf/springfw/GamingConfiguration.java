package com.sf.springfw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sf.springfw.game.GameRunner;
import com.sf.springfw.game.GamingConsole;
import com.sf.springfw.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
